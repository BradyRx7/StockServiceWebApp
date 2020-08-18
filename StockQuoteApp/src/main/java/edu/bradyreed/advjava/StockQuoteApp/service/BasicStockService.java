package edu.bradyreed.advjava.StockQuoteApp.service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import edu.bradyreed.advjava.StockQuoteApp.StockQuote;
import edu.bradyreed.advjava.StockQuoteApp.util.IntervalEnum;

import java.util.LinkedList;


public class BasicStockService implements StockService {
	//Hard-coded stock service to return a StockQuote instance.
	//Normally this would be a connection to a StockQuote service.
	/*
	 * String demoTickerSymbol = "UML"; double demoValue = 22.58; Calendar
	 * demoDate.set(1, 2);
	 */
	
	protected BasicStockService() {}
	
	public StockQuote getQuote(@NotNull String symbol) {
		
		//Temporary hard coded variables, can be swapped with a service later
		return new StockQuote(22.56, symbol, new Date());
	}

	@Override
	public List<StockQuote> getQuote(@NotNull String symbol, @NotNull Date from, @NotNull Date until, IntervalEnum interval) {
		
		//**TEMPORARY NOTE** moved implementation to notepad++ file in scraps folder to try to redo a more elegant implementation	
		List<StockQuote> quoteList = new LinkedList<StockQuote>();
		
		Calendar start = Calendar.getInstance();
		start.setTime(from);
		Calendar end = Calendar.getInstance();
		end.setTime(until);
		int dateInterval = interval.iterator();

		for (Date loopDate = start.getTime(); start.before(end); start.add(Calendar.DATE, dateInterval), loopDate = start.getTime()) {
		
		//The stock value is hard coded and will be replaced with a call a real stock database later	
		StockQuote historicalQuote = new StockQuote(22.50, symbol, loopDate);
		  
		quoteList.add(historicalQuote);
		} 
			
		return quoteList;
	}
}