package edu.bradyreed.advjava.Week3.services;

import edu.bradyreed.advjava.Week3.classes.StockQuote;
import edu.bradyreed.advjava.Week3.interfaces.IStockService;

public class BasicStockService implements IStockService {

	@Override
	public StockQuote getQuote(String symbol) {
		String demoTickerSymbol = "UMLMA";
		double demoValue = 22.58;
		
		StockQuote demoSQ;
		demoSQ = new StockQuote(demoValue, demoTickerSymbol);
		
		return demoSQ;
	}

	//Hard-coded stock service to return a StockQuote instance.
	//Normally this would be a connection to a StockQuote service.
	public BasicStockService() {
		
		
	}
}
