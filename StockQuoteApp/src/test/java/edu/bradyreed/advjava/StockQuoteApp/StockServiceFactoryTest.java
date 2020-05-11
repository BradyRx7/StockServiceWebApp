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

/**
 * @author brady
 *
 */
public class StockServiceFactoryTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
		StockService testStockService = new BasicStockService();
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
	 * Test method for {@link edu.bradyreed.advjava.StockQuoteApp.StockServiceFactory#getStockService()}.
	 */
	@Test
	public void testGetStockService() {
		assertTrue(testStockService instanceof BasicStockService);
	}

}
