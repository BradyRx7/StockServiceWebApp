package edu.bradyreed.advjava.StockQuoteApp.util;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DatabaseUtilsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
    public void testInitFile() throws Exception {
        DatabaseUtils.initializeDatabase(DatabaseUtils.initializationFile);
    }
	
	@Test (expected = DatabaseInitializationException.class)
	public void testBadInitFile() throws Exception {
        DatabaseUtils.initializeDatabase("databasewillfailtoINIT");
	}
	
	@Test
	public void testGetConnection() throws DatabaseConnectionException {
		Connection connection = DatabaseUtils.getConnection();
        assertNotNull("checking that connection is successfull",connection);
	}
	
	public void testExecuteStatement() throws DatabaseConnectionException, SQLException {
		Connection connection = DatabaseUtils.getConnection();
        Statement statement = connection.createStatement();
        boolean execute = statement.execute("select * from quotes");
        assertTrue("statement is executed", execute);
	}
}
