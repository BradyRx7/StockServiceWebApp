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
	public void testMainDateRangeStockLookup() {
		String input = "UML" + " 03/21/2020" + " 03/29/2020\n";
	    InputStream in = new ByteArrayInputStream(input.getBytes());
	    System.setIn(in);
	    
		StockQuoteMain.main(new String[] {});
		
	    assertTrue(StockQuoteMain.runSuccess);
	}

}
