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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author brady
 *
 */
public class BasicStockServiceTest {

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
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.BasicStockService#BasicStockService()}.
	 */
	@Test
	public void testBasicStockService() {
		StockService stockService = null;
		stockService = StockServiceFactory.getStockService();
		assertTrue(stockService instanceof BasicStockService);
	}

	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.BasicStockService#getQuote(java.lang.String)}.
	 */
	@Test
	public void testGetQuoteString() {
		StockService stockService = null;
		stockService = StockServiceFactory.getStockService();
		StockQuote testQuote = stockService.getQuote("APPL");
		assertEquals("Tested stock service did not return \"APPL\" and thus may have not retrieved quote correctly",
				testQuote.getTickerSymbol(), "APPL");
	}

	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.BasicStockService#getQuote(java.lang.String, java.util.Date, java.util.Date)}.
	 * @throws ParseException 
	 */
	@Test
	public void testGetQuoteStringDateDate() throws ParseException {
		StockService stockService = null;
		stockService = StockServiceFactory.getStockService();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date from = dateFormat.parse("03/20/2020");
		Date until = dateFormat.parse("03/27/2020");
		
		List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until);
		assertEquals("Testing range of quotes failed - retrieval of 6th day, 3/25/2020 failed",
				 testQuoteRange.get(5).getQuoteDate(), dateFormat.parse("03/25/2020"));
	}

}
