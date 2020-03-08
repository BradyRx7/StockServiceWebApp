package edu.bradyreed.advjava.Week3.interfaces;

import edu.bradyreed.advjava.Week3.classes.StockQuote;

public interface IStockService {
	
	StockQuote getQuote(String symbol);
	void StockQuote(String tickerSymbol);
}
