package edu.bradyreed.advjava.StockQuoteApp;

public class BasicStockService implements IStockService {

	//Hard-coded stock service to return a StockQuote instance.
	//Normally this would be a connection to a StockQuote service.
	protected BasicStockService() {}
	
	public StockQuote getQuote(String symbol) {
		String demoTickerSymbol = "UML";
		double demoValue = 22.58;
		
		return new StockQuote(demoValue, demoTickerSymbol);
	}
}
