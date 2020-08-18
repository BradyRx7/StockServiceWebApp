/**
 * 
 */
package edu.bradyreed.advjava.StockQuoteApp;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * @author brady
 *
 */
public class StockQuoteMainTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
		
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}
		
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.StockQuoteMain#main(java.lang.String[])}.
	 */
	@Test
	public void testMainOneStockLookup() {
		String input = "UML\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    StockQuoteMain.main(new String[] {});
		
	    assertTrue(StockQuoteMain.runSuccess);
	}
	
	@Test
	public void testMainHourlyDateRangeStockLookup() {
		String input = "UML" + " 03/11/2020" + " 03/29/2020" + " HOURLY";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    StockQuoteMain.main(new String[] {});
		
	    assertTrue(StockQuoteMain.runSuccess);
	}

	/*
	 * @Test public void testMainQuarterlyDateRangeStockLookup() { String input =
	 * "UML" + " 03/11/2020" + " 03/29/2021" + " QUARTERLY"; InputStream in = new
	 * ByteArrayInputStream(input.getBytes()); System.setIn(in);
	 * 
	 * StockQuoteMain.main(new String[] {});
	 * 
	 * assertTrue(StockQuoteMain.runSuccess); }
	 */
	
	@Test
	public void testMainHalfDayDateRangeStockLookup() {
		String input = "UML" + " 03/11/2008" + " 03/29/2020" + " HALF_DAY";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    StockQuoteMain.main(new String[] {});
		
	    assertTrue(StockQuoteMain.runSuccess);
	}
	
	@Test
	public void testMainDailyDateRangeStockLookup() {
		String input = "UML" + " 03/11/2020" + " 03/29/2020" + " DAILY";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
	    StockQuoteMain.main(new String[] {});
		
	    assertTrue(StockQuoteMain.runSuccess);
	}
}
