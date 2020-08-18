package edu.bradyreed.advjava.StockQuoteApp.service;

import edu.bradyreed.advjava.StockQuoteApp.service.DatabaseStockService;
import edu.bradyreed.advjava.StockQuoteApp.service.StockService;

/**
 * Returns a basic stock service instance
 */

public class StockServiceFactory {
	
	public static StockService getStockService() {
		return new DatabaseStockService();
	}
}
