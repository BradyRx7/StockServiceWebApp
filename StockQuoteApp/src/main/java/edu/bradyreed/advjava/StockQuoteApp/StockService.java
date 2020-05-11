package edu.bradyreed.advjava.StockQuoteApp;

import java.util.List;
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
	List<StockQuote> getQuote(String symbol, Date from, Date until);
	
}
