package edu.bradyreed.advjava.StockQuoteApp.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.bradyreed.advjava.StockQuoteApp.service.BasicStockService;
import edu.bradyreed.advjava.StockQuoteApp.service.StockService;
import edu.bradyreed.advjava.StockQuoteApp.service.StockServiceFactory;

/**
 * Unit test StockServiceFactory.java
 */
public class StockServiceTest 
{
  
    @Test
    public void stockServiceTest() 
    {
    	
        StockService sampleStockService = StockServiceFactory.getStockService();
        
        double testStockValue = 100.001;
		try {
			testStockValue = sampleStockService.getQuote("UML").getValue();
		} catch (StockServiceException e) {
			e.printStackTrace();
		}
        
        assertTrue("getStockService returned a DatabaseStockService", sampleStockService instanceof DatabaseStockService);
        assertEquals("Check ticker price", 128.15, testStockValue, 0.01);
    }
}
