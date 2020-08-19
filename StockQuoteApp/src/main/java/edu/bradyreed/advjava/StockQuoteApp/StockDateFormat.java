package edu.bradyreed.advjava.StockQuoteApp;

import java.text.SimpleDateFormat;

/**
 * Static class to provide a common simple date format for the whole app
 * Provides common code for such classes including date formatting.
 */
public final class StockDateFormat {
	
	//Date format for entire app
	 public static final String dateFormatString = "yyyy-MM-dd HH:mm:ss";
	 protected static final SimpleDateFormat stockDateFormat = new SimpleDateFormat(dateFormatString);
	
	 /*
	 * protected StockDateFormat() { stockDateFormat = new
	 * SimpleDateFormat(dateFormatString); }
	 */
	 
	 public static SimpleDateFormat getDateFormat() {
	    	return stockDateFormat;
	    }
	 
	 public static String getDateString() {
	    	return dateFormatString;
	    }
}

