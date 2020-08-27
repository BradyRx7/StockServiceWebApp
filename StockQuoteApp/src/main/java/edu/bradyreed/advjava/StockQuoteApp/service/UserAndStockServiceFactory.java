package edu.bradyreed.advjava.StockQuoteApp.service;

import edu.bradyreed.advjava.StockQuoteApp.service.DatabaseStockService;
import edu.bradyreed.advjava.StockQuoteApp.service.StockService;

/**
 * Returns a Database stock service instance or a Database
 *  User Service 
 */

public class UserAndStockServiceFactory {
	
	private UserAndStockServiceFactory() {};
	
	
	public static StockService getStockService() {
		return new DatabaseStockService();
	}
	
	public static UserStockService getUserStockService() {
		return new DatabaseUserService();
	}
}
