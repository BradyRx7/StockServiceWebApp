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
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.BasicStockService#getQuote(java.lang.String, java.util.Date,
	 *  java.util.Date, edu.bradyreed.advjava.StockQuoteApp.IntervalEnum)}.
	 * @throws ParseException 
	 */
	@Test
	public void testGetQuoteMonthlyDateRangeInterval() throws ParseException {
		StockService stockService = null;
		stockService = StockServiceFactory.getStockService();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date from = dateFormat.parse("03/20/2020");
		Date until = dateFormat.parse("12/27/2020");
		IntervalEnum interval = IntervalEnum.MONTHLY;
		String expectedDate = "07/18/2020";
		
		List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until, interval);
		assertEquals("Testing range of quotes failed - retrieval of 5th month quote, " + expectedDate,
				 testQuoteRange.get(4).getQuoteDate(), dateFormat.parse(expectedDate));
	}

	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.BasicStockService#getQuote(java.lang.String, java.util.Date,
	 *  java.util.Date, edu.bradyreed.advjava.StockQuoteApp.IntervalEnum)}.
	 * @throws ParseException 
	 */
	@Test
	public void testGetQuoteDailyDateRangeInterval() throws ParseException {
		StockService stockService = null;
		stockService = StockServiceFactory.getStockService();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date from = dateFormat.parse("03/20/2020");
		Date until = dateFormat.parse("3/27/2020");
		IntervalEnum interval = IntervalEnum.DAILY;
		String expectedDate = "03/25/2020";
		
		List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until, interval);
		assertEquals("Testing range of quotes failed - retrieval of 6th day quote, " + expectedDate,
				 testQuoteRange.get(5).getQuoteDate(), dateFormat.parse(expectedDate));
	}
	
	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.BasicStockService#getQuote(java.lang.String, java.util.Date,
	 *  java.util.Date, edu.bradyreed.advjava.StockQuoteApp.IntervalEnum)}.
	 * @throws ParseException 
	 */
	@Test
	public void testGetQuoteYearlyDateRangeInterval() throws ParseException {
		StockService stockService = null;
		stockService = StockServiceFactory.getStockService();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date from = dateFormat.parse("03/20/2014");
		Date until = dateFormat.parse("3/27/2020");
		IntervalEnum interval = IntervalEnum.YEARLY;
		String expectedDate = "03/19/2016";
		
		List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until, interval);
		assertEquals("Testing range of quotes failed - retrieval of 3rd year quote, " + expectedDate,
				 testQuoteRange.get(2).getQuoteDate(), dateFormat.parse(expectedDate));
	}
	
	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.BasicStockService#getQuote(java.lang.String, java.util.Date,
	 *  java.util.Date, edu.bradyreed.advjava.StockQuoteApp.IntervalEnum)}.
	 * @throws ParseException 
	 */
	@Test
	public void testGetQuoteQuarterlyDateRangeInterval() throws ParseException {
		StockService stockService = null;
		stockService = StockServiceFactory.getStockService();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date from = dateFormat.parse("03/20/2020");
		Date until = dateFormat.parse("12/27/2020");
		IntervalEnum interval = IntervalEnum.QUARTERLY;
		String expectedDate = "06/19/2020";
		
		List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until, interval);
		assertEquals("Testing range of quotes failed - retrieval of 2nd quarterly day quote, " + expectedDate,
				 testQuoteRange.get(1).getQuoteDate(), dateFormat.parse(expectedDate));
	}
	
	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.BasicStockService#getQuote(java.lang.String, java.util.Date,
	 *  java.util.Date, edu.bradyreed.advjava.StockQuoteApp.IntervalEnum)}.
	 * @throws ParseException 
	 */
	@Test
	public void testGetQuoteWeeklyDateRangeInterval() throws ParseException {
		StockService stockService = null;
		stockService = StockServiceFactory.getStockService();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date from = dateFormat.parse("03/20/2020");
		Date until = dateFormat.parse("6/27/2020");
		IntervalEnum interval = IntervalEnum.WEEKLY;
		String expectedDate = "05/08/2020";
		
		List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until, interval);
		assertEquals("Testing range of quotes failed - retrieval of 7th weekly day quote, " + expectedDate,
				 testQuoteRange.get(7).getQuoteDate(), dateFormat.parse(expectedDate));
	}
}
