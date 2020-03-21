package edu.bradyreed.advjava.Week3;

// Implemented by BasicStockService.java

public interface IStockService {
	
	//Returns the value for a specified stock symbol
	StockQuote getQuote(String symbol);
}
