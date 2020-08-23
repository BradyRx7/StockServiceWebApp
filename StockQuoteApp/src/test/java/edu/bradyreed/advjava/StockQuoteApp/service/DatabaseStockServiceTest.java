package edu.bradyreed.advjava.StockQuoteApp.service;
import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.bradyreed.advjava.StockQuoteApp.StockDateFormat;
import edu.bradyreed.advjava.StockQuoteApp.StockQuote;
import edu.bradyreed.advjava.StockQuoteApp.util.DatabaseUtils;
import edu.bradyreed.advjava.StockQuoteApp.util.IntervalEnum;

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
	public void testGetQuoteWithinRangeNoInterval() throws Exception {
		 
		StockService stockService = null; 
		stockService = StockServiceFactory.getStockService(); 
		SimpleDateFormat dateFormat = StockDateFormat.getDateFormat();
		java.util.Date from = dateFormat.parse("2020-03-15 00:00:01 EDT");
		java.util.Date until = dateFormat.parse("2020-03-20 00:00:01 EDT");
		IntervalEnum interval = IntervalEnum.DAILY; 
		SimpleDateFormat expectedDateFormat = StockDateFormat.getDateFormat(); 
		String expectedDate = "2020-03-17 00:00:01 EDT";
		  
		List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until, interval);
		  
		assertEquals("Testing range of quotes failed - retrieval of 3rd day quote, "
		  + expectedDate, expectedDateFormat.parse(expectedDate), testQuoteRange.get(2).getQuoteDate()); 
		 
	}
	
	@Test
	public void testGetQuoteWithRangeAndInterval() throws Exception {
		StockService stockService = null; 
		stockService = StockServiceFactory.getStockService(); 
		SimpleDateFormat dateFormat = StockDateFormat.getDateFormat();
		java.util.Date from = dateFormat.parse("2020-04-10 00:00:00 EDT");
		java.util.Date until = dateFormat.parse("2020-04-10 03:00:02 EDT");
		IntervalEnum interval = IntervalEnum.HOURLY; 
		int expectedSize = 4;
		
		List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until, interval);
		  
		assertEquals("Returned correct number of quotes", expectedSize, testQuoteRange.size());
	}
}