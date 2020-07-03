package edu.bradyreed.advjava.StockQuoteApp;

import java.util.List;
import edu.bradyreed.advjava.StockQuoteApp.IntervalEnum;
import javax.validation.constraints.NotNull;

import java.util.Date;

// Implemented by BasicStockService.java

public interface StockService {
	
	//Returns the value for a specified stock symbol
	StockQuote getQuote(String symbol);
	
	//Get a historical list of stock quotes for the provided symbol
	//@param symbol, the stock symbol in question
	//@param from, beginning date in range
	//@param until, ending date in range
	//@return, List of stock quote instances, one per day
	List<StockQuote> getQuote(@NotNull String symbol, @NotNull Date from, @NotNull Date until, IntervalEnum interval);
	
}
