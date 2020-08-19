package edu.bradyreed.advjava.StockQuoteApp.service;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.bradyreed.advjava.StockQuoteApp.StockQuote;
import edu.bradyreed.advjava.StockQuoteApp.util.DatabaseUtils;

public class DatabaseStockServiceTest {
	
	private StockService stockService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		DatabaseUtils.initializeDatabase(DatabaseUtils.initializationFile);
		stockService = StockServiceFactory.getStockService();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetQuoteString() throws StockServiceException {
		StockService stockService = null;
		stockService = StockServiceFactory.getStockService();
		StockQuote testQuote = stockService.getQuote("APPL");
		assertEquals("Tested stock service did not return \"APPL\" and thus may have not retrieved quote correctly",
				testQuote.getTickerSymbol(), "APPL");
	}

	@Test
	public void testGetQuoteStringDateDateIntervalEnum() {
		fail("Not yet implemented"); // TODO
	}

}
