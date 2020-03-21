package edu.bradyreed.advjava.Week3;

import edu.bradyreed.advjava.Week3.BasicStockService;
import edu.bradyreed.advjava.Week3.IStockService;

/**
 * Returns a basic stock service instance
 */

public class StockServiceFactory {
	
	public static IStockService getStockService() {
		return new BasicStockService();
	}
}
