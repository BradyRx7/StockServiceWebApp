package edu.bradyreed.advjava.StockQuoteApp;

// Implemented by BasicStockService.java

public interface IStockService {
	
	//Returns the value for a specified stock symbol
	StockQuote getQuote(String symbol);
}
