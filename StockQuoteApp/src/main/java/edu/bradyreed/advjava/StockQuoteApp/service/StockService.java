package edu.bradyreed.advjava.StockQuoteApp.service;

import java.util.List;

import javax.validation.constraints.NotNull;

import edu.bradyreed.advjava.StockQuoteApp.StockQuote;
import edu.bradyreed.advjava.StockQuoteApp.util.IntervalEnum;

import java.util.Date;

//Implemented by BasicStockService.java and DatabaseStockService.java

public interface StockService {
	
	//Returns the value for a specified stock symbol
	StockQuote getQuote(String symbol) throws StockServiceException;
	
	//Get a historical list of stock quotes for the provided symbol
	//@param symbol, the stock symbol in question
	//@param from, beginning date in range
	//@param until, ending date in range
	//@return, List of stock quote instances, one per day
	List<StockQuote> getQuote(@NotNull String symbol, @NotNull Date from, 
				@NotNull Date until, IntervalEnum interval) throws StockServiceException;
	
}
