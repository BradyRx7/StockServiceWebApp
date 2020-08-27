/**
 * 
 */
package edu.bradyreed.advjava.StockQuoteApp.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.bradyreed.advjava.StockQuoteApp.StockQuote;
import edu.bradyreed.advjava.StockQuoteApp.service.BasicStockService;
import edu.bradyreed.advjava.StockQuoteApp.service.StockService;
import edu.bradyreed.advjava.StockQuoteApp.service.UserAndStockServiceFactory;
import edu.bradyreed.advjava.StockQuoteApp.util.IntervalEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author brady
 * Commented this out instead of deleting it as a test. May re-institute testing this
 * if it is necessary. Redirected StockServiceFactory to produce DatabaseStockService(s)
 * instead of BasicStockServices so that class and this test are not useful anymore
 */
public class BasicStockServiceTest {

	/**
	 * @throws java.lang.Exception
	 */
	/*
	 * @BeforeClass public static void setUpBeforeClass() throws Exception {
	 * 
	 * }
	 * 
	 *//**
		 * @throws java.lang.Exception
		 */
	/*
	 * @AfterClass public static void tearDownAfterClass() throws Exception { }
	 * 
	 *//**
		 * @throws java.lang.Exception
		 */
	/*
	 * @Before public void setUp() throws Exception {
	 * 
	 * }
	 * 
	 *//**
		 * @throws java.lang.Exception
		 */
	/*
	 * @After public void tearDown() throws Exception { }
	 * 
	 *//**
		 * Test method for
		 * {@link edu.bradyreed.advjava.StockQuoteApp.service.BasicStockService#BasicStockService()}.
		 */
	/*
	 * @Test public void testBasicStockService() { StockService stockService = null;
	 * stockService = StockServiceFactory.getStockService(); assertTrue(stockService
	 * instanceof BasicStockService); }
	 * 
	 *//**
		 * Test method for
		 * {@link edu.bradyreed.advjava.StockQuoteApp.service.BasicStockService#getQuote(java.lang.String)}.
		 */
	/*
	 * @Test public void testGetQuoteString() { StockService stockService = null;
	 * stockService = StockServiceFactory.getStockService(); StockQuote testQuote =
	 * stockService.getQuote("APPL");
	 * assertEquals("Tested stock service did not return \"APPL\" and thus may have not retrieved quote correctly"
	 * , testQuote.getTickerSymbol(), "APPL"); }
	 * 
	 *//**
		 * Test method for
		 * {@link edu.bradyreed.advjava.StockQuoteApp.service.BasicStockService#getQuote(java.lang.String, java.util.Date, java.util.Date, edu.bradyreed.advjava.StockQuoteApp.util.IntervalEnum)}.
		 * 
		 * @throws ParseException
		 */
	/*
	 * @Test public void testGetQuoteHalfDayDateRangeInterval() throws
	 * ParseException { StockService stockService = null; stockService =
	 * StockServiceFactory.getStockService(); SimpleDateFormat dateFormat = new
	 * SimpleDateFormat("MM/dd/yyyy"); Date from = dateFormat.parse("03/20/2020");
	 * Date until = dateFormat.parse("03/27/2020"); IntervalEnum interval =
	 * IntervalEnum.HALF_DAY; SimpleDateFormat expectedDateFormat = new
	 * SimpleDateFormat("MM/dd/yyyy 'at' hha z"); String expectedDate =
	 * "03/23/2020 at 12AM EDT";
	 * 
	 * List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until,
	 * interval);
	 * assertEquals("Testing range of quotes failed - retrieval of 7th half day quote, "
	 * + expectedDate, testQuoteRange.get(6).getQuoteDate(),
	 * expectedDateFormat.parse(expectedDate)); }
	 * 
	 *//**
		 * Test method for
		 * {@link edu.bradyreed.advjava.StockQuoteApp.service.BasicStockService#getQuote(java.lang.String, java.util.Date, java.util.Date, edu.bradyreed.advjava.StockQuoteApp.util.IntervalEnum)}.
		 * 
		 * @throws ParseException
		 */
	/*
	 * @Test public void testGetQuoteDailyDateRangeInterval() throws ParseException
	 * { StockService stockService = null; stockService =
	 * StockServiceFactory.getStockService(); SimpleDateFormat dateFormat = new
	 * SimpleDateFormat("MM/dd/yyyy"); Date from = dateFormat.parse("03/20/2020");
	 * Date until = dateFormat.parse("3/27/2020"); IntervalEnum interval =
	 * IntervalEnum.DAILY; SimpleDateFormat expectedDateFormat = new
	 * SimpleDateFormat("MM/dd/yyyy 'at' hha z"); String expectedDate =
	 * "03/25/2020 at 12AM EDT";
	 * 
	 * List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until,
	 * interval);
	 * assertEquals("Testing range of quotes failed - retrieval of 5th half day quote, "
	 * + expectedDate, testQuoteRange.get(5).getQuoteDate(),
	 * expectedDateFormat.parse(expectedDate)); }
	 * 
	 *//**
		 * Test method for
		 * {@link edu.bradyreed.advjava.StockQuoteApp.service.BasicStockService#getQuote(java.lang.String, java.util.Date, java.util.Date, edu.bradyreed.advjava.StockQuoteApp.util.IntervalEnum)}.
		 * 
		 * @throws ParseException
		 */
	/*
	 * @Test public void testGetQuoteHourlyDateRangeInterval() throws ParseException
	 * { StockService stockService = null; stockService =
	 * StockServiceFactory.getStockService(); SimpleDateFormat dateFormat = new
	 * SimpleDateFormat("MM/dd/yyyy"); Date from = dateFormat.parse("03/20/2018");
	 * Date until = dateFormat.parse("3/22/2018"); IntervalEnum interval =
	 * IntervalEnum.HOURLY; SimpleDateFormat expectedDateFormat = new
	 * SimpleDateFormat("MM/dd/yyyy 'at' hha z"); String expectedDate =
	 * "03/21/2018 at 8AM EDT";
	 * 
	 * List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until,
	 * interval);
	 * assertEquals("Testing range of quotes failed - retrieval of 32nd Hourly Quote, "
	 * + expectedDate, testQuoteRange.get(32).getQuoteDate(),
	 * expectedDateFormat.parse(expectedDate)); }
	 * 
	 *//**
		 * Test method for
		 * {@link edu.bradyreed.advjava.StockQuoteApp.BasicStockService#getQuote(java.lang.String, java.util.Date, java.util.Date, edu.bradyreed.advjava.StockQuoteApp.IntervalEnum)}.
		 * 
		 * @throws ParseException
		 */
	/*
	 * 
	 * 
	 * @Test public void testGetQuoteQuarterlyDateRangeInterval() throws
	 * ParseException { StockService stockService = null; stockService =
	 * StockServiceFactory.getStockService(); SimpleDateFormat dateFormat = new
	 * SimpleDateFormat("MM/dd/yyyy"); Date from = dateFormat.parse("03/20/2020");
	 * Date until = dateFormat.parse("12/27/2020"); IntervalEnum interval =
	 * IntervalEnum.QUARTERLY; String expectedDate = "06/19/2020";
	 * 
	 * List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until,
	 * interval);
	 * assertEquals("Testing range of quotes failed - retrieval of 2nd quarterly day quote, "
	 * + expectedDate, testQuoteRange.get(1).getQuoteDate(),
	 * dateFormat.parse(expectedDate)); }
	 * 
	 * 
	 *//**
		 * Test method for
		 * {@link edu.bradyreed.advjava.StockQuoteApp.BasicStockService#getQuote(java.lang.String, java.util.Date, java.util.Date, edu.bradyreed.advjava.StockQuoteApp.IntervalEnum)}.
		 * 
		 * @throws ParseException
		 *//*
			 * 
			 * @Test public void testGetQuoteWeeklyDateRangeInterval() throws ParseException
			 * { StockService stockService = null; stockService =
			 * StockServiceFactory.getStockService(); SimpleDateFormat dateFormat = new
			 * SimpleDateFormat("MM/dd/yyyy"); Date from = dateFormat.parse("03/20/2020");
			 * Date until = dateFormat.parse("6/27/2020"); IntervalEnum interval =
			 * IntervalEnum.WEEKLY; String expectedDate = "05/08/2020";
			 * 
			 * List<StockQuote> testQuoteRange = stockService.getQuote("UML", from, until,
			 * interval);
			 * assertEquals("Testing range of quotes failed - retrieval of 7th weekly day quote, "
			 * + expectedDate, testQuoteRange.get(7).getQuoteDate(),
			 * dateFormat.parse(expectedDate)); }
			 */
}
