package edu.bradyreed.advjava.StockQuoteApp;

import edu.bradyreed.advjava.StockQuoteApp.BasicStockService;
import edu.bradyreed.advjava.StockQuoteApp.IStockService;

/**
 * Returns a basic stock service instance
 */

public class StockServiceFactory {
	
	public static IStockService getStockService() {
		return new BasicStockService();
	}
}
