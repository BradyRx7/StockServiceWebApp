package edu.bradyreed.advjava.StockQuoteApp;

import edu.bradyreed.advjava.StockQuoteApp.BasicStockService;
import edu.bradyreed.advjava.StockQuoteApp.StockService;

/**
 * Returns a basic stock service instance
 */

public class StockServiceFactory {
	
	public static StockService getStockService() {
		return new BasicStockService();
	}
}
