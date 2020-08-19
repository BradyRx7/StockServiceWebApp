package edu.bradyreed.advjava.StockQuoteApp.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Date;

import edu.bradyreed.advjava.StockQuoteApp.StockDateFormat;
import edu.bradyreed.advjava.StockQuoteApp.StockQuote;
import edu.bradyreed.advjava.StockQuoteApp.util.DatabaseConnectionException;
import edu.bradyreed.advjava.StockQuoteApp.util.DatabaseUtils;
import edu.bradyreed.advjava.StockQuoteApp.util.IntervalEnum;

/**
 * An implementation of the StockService interface that gets
 * stock data from a database.
 */
public class DatabaseStockService implements StockService {

    /**
     * Return the current price for a share of stock  for the given symbol
     *
     * @param symbol the stock symbol of the company you want a quote for.
     *               e.g. APPL for APPLE
     * @return a  <CODE>BigDecimal</CODE> instance
     * @throws StockServiceException if using the service generates an exception.
     *                               If this happens, trying the service may work, depending on the actual cause of the
     *                               error.
     */
    @Override
    public StockQuote getQuote(String symbol) throws StockServiceException {
        // todo - this is a pretty lame implementation why?
        List<StockQuote> stockQuotes = null;
        try {
            Connection connection = DatabaseUtils.getConnection();
            Statement statement = connection.createStatement();
            String queryString = "select * from quotes where symbol = '" + symbol + "'";

            ResultSet resultSet = statement.executeQuery(queryString);
            stockQuotes = new ArrayList<>(resultSet.getFetchSize());
            while(resultSet.next()) {
                String symbolValue = resultSet.getString("symbol");
                java.sql.Date time = resultSet.getDate("time");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(time);
                // oops!
                double price = resultSet.getDouble("price");
                stockQuotes.add(new StockQuote(price, symbolValue, calendar.getTime()));
            }

        } catch (DatabaseConnectionException | SQLException exception) {
            throw new StockServiceException(exception.getMessage(), exception);
        }
        if (stockQuotes.isEmpty()) {
            throw new StockServiceException("There is no stock data for:" + symbol);
        }
        return stockQuotes.get(0);
    }

    /**
     * Get a historical list of stock quotes for the provide symbol
     *
     * @param symbol the stock symbol to search for
     * @param start   the date of the first stock quote
     * @param end  the date of the last stock quote
     * @param interval cadence
     * @return a list of StockQuote instances
     * @throws   StockServiceException if using the service generates an exception.
     */

	@Override
	public List<StockQuote> getQuote(String symbol, Date from, Date until, IntervalEnum interval) throws StockServiceException {
		List<StockQuote> stockQuotes = null;
		try {
            Connection dbConnection = DatabaseUtils.getConnection();
            Statement slqStatement = dbConnection.createStatement();
            SimpleDateFormat stockDateFormat = StockDateFormat.getDateFormat();

            String fromString = stockDateFormat.format(from.getTime());
            String untilString = stockDateFormat.format(until.getTime());

            /*String queryString = "select * from quotes where symbol = '" + symbol + "'"
                    + "and time BETWEEN '" + fromString + "' and '" + untilString + "'";*/
            
            String sqlStringFilter = "SELECT * FROM quotes WHERE symbol = '"
            		+ symbol + "'" + "and time BETWEEN '" + fromString + "' and '" 
            		+ untilString + "'";
            
            //Possibly have SQL filter with interval as well (incomplete):
            // DATEPART(HH, time) >= '" + interval + "'" + "ORDER BY time";
            
            ResultSet dbResultSet = slqStatement.executeQuery(sqlStringFilter);
            stockQuotes = new ArrayList<>();
            
            java.util.Date dbStockDate = new Date();
            StockQuote previousQuote = null;
            
            while (dbResultSet.next()) {
            	String dbStockSymbol =  dbResultSet.getString("symbol");
            	Timestamp stockTimeStamp = dbResultSet.getTimestamp("time");
                dbStockDate.setTime(stockTimeStamp.getTime());
                double dbStockPrice = dbResultSet.getDouble("price");
                StockQuote workingQuote = new StockQuote(dbStockPrice, dbStockSymbol, dbStockDate);
                
                if (previousQuote == null) {
                   stockQuotes.add(workingQuote);
                } else if (intervalCheck(workingQuote.getQuoteDate(), interval,
                        previousQuote.getQuoteDate())) {

                    stockQuotes.add(workingQuote);
                }

                previousQuote = workingQuote;
                stockQuotes.add(new StockQuote(dbStockPrice, dbStockSymbol, dbStockDate));
            }
		 
		} catch (DatabaseConnectionException | SQLException exception) {
                throw new StockServiceException(exception.getMessage(), exception);
		}   
		if (stockQuotes.isEmpty()) {
            throw new StockServiceException("There is no stock data for:" + symbol);
		}    
        
		return stockQuotes;
		
	}
	
	
	/**
	 * Interval check method. Checks if two dates are intervals of each other
	 */
	
	private boolean intervalCheck(java.util.Date startDate, IntervalEnum interval, java.util.Date endDate) {
		Calendar startPlusInterval = Calendar.getInstance();
        startPlusInterval.setTime(startDate);
        startPlusInterval.add(Calendar.HOUR, interval.iterator());
        return endDate.after(startPlusInterval.getTime());
	}
	
	
}
