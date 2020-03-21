package edu.bradyreed.advjava.Week3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test StockServiceFactory.java
 */
public class StockServiceTest 
{
  
    @Test
    public void stockServiceTest() 
    {
    	
        IStockService sampleStockService = StockServiceFactory.getStockService();
        
        double testStockValue = sampleStockService.getQuote("UML").getValue();
        
        assertTrue("getStockService returned a BasicStockService", sampleStockService instanceof BasicStockService);
        assertEquals("Check ticker price", testStockValue, 22.58, 0.01);
    }
}
