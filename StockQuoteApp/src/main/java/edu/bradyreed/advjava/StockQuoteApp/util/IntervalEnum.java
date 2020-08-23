package edu.bradyreed.advjava.StockQuoteApp.util;

public enum IntervalEnum { 
	DAILY(1440),
	HALF_DAY(770),
	HOURLY(60);
	
	/**
     * Create a new  Interval enumeration.
     * @param minutes the number of hours in the interval
     */
	private final int minutes;

	    IntervalEnum(int minutes) {
	        this.minutes = minutes;
	    }
	    
	    public int iterator() {
	        return this.minutes;
	    }
}

