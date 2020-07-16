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

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author brady
 *
 */
public class StockQuoteTest {

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
		StockQuote testQuote = new StockQuote();
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.StockQuote#StockQuote()}.
	 */
	@Test
	public void testStockQuote() {
		assertEquals("stock quote value is not initialized to 0.0", 0.0, testQuote.getValue(), 0.0001);
		assertEquals("stock quote ticker symbol is not the default symbol \"none\"", testQuote.getTickerSymbol(), "none");
		assertEquals("stock quote date is not the default of today's date", testQuote.getQuoteDate(), new Date());
	}
	
	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.StockQuote#StockQuote(double, java.lang.String, java.util.Date)}.
	 */
	@Test
	public void testStockQuoteDoubleStringDate() {
		assertEquals("stock quote value is not initialized to 0.0", 0.0, testQuote.getValue(), 0.0001);
		assertEquals("stock quote ticker symbol is not the default symbol \"none\"", testQuote.getTickerSymbol(), "none");
		assertEquals("stock quote date is not the default of today's date", testQuote.getQuoteDate(), new Date());
	}

	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.StockQuote#StockQuote(edu.bradyreed.advjava.StockQuoteApp.StockQuote)}.
	 */
	@Test
	public void testStockQuotePassedAStockQuote() {
		StockQuote passAQuote = new StockQuote(18.5, "APPL", new Date());
		assertEquals("stock quote value is not tested value of 18.5", 18.5, passAQuote.getValue(), 0.0001);
		assertEquals("stock quote ticker symbol is not the tested value of \"APPL\"", passAQuote.getTickerSymbol(), "APPL");
		assertEquals("stock quote date is not the tested value of today's date", passAQuote.getQuoteDate(), new Date());
	}

	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.StockQuote#getTickerSymbol()}.
	 */
	@Test
	public void testGetTickerSymbol() {
		assertEquals("stock quote ticker symbol is not the default symbol \"none\"", testQuote.getTickerSymbol(), "none");
	}

	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.StockQuote#getValue()}.
	 */
	@Test
	public void testGetValue() {
		assertEquals("stock quote value is not initialized to 0.0", 0.0, testQuote.getValue(), 0.0001);
	}

	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.StockQuote#getQuoteDate()}.
	 */
	@Test
	public void testGetQuoteDate() {
		assertEquals("stock quote date is not the default of today's date", testQuote.getQuoteDate(), new Date());
	}

	/**
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.StockQuote#toString()}.
	 */
	@Test
	public void testToString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy 'at' ha z");
		String expectedString = testQuote.getTickerSymbol() + " " + String.format("%.2f", testQuote.getValue()) + 
				" " + dateFormat.format(testQuote.getQuoteDate());
		
		assertEquals(expectedString, testQuote.toString());
	}

}
