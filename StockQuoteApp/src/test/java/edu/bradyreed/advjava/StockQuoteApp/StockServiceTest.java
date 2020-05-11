package edu.bradyreed.advjava.StockQuoteApp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.bradyreed.advjava.StockQuoteApp.BasicStockService;
import edu.bradyreed.advjava.StockQuoteApp.StockService;
import edu.bradyreed.advjava.StockQuoteApp.StockServiceFactory;

/**
 * Unit test StockServiceFactory.java
 */
public class StockServiceTest 
{
  
    @Test
    public void stockServiceTest() 
    {
    	
        StockService sampleStockService = StockServiceFactory.getStockService();
        
        double testStockValue = sampleStockService.getQuote("UML").getValue();
        
        assertTrue("getStockService returned a BasicStockService", sampleStockService instanceof BasicStockService);
        assertEquals("Check ticker price", testStockValue, 22.56, 0.01);
    }
}
