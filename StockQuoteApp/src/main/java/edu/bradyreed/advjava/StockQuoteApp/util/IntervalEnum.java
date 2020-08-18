package edu.bradyreed.advjava.StockQuoteApp.util;

public enum IntervalEnum { 
	DAILY(24),
	HALF_DAY(12),
	HOURLY(1);
	
	/**
     * Create a new  Interval enumeration.
     * @param hours the number of hours in the interval
     */
	private final int hours;

	    IntervalEnum(int hours) {
	        this.hours = hours;
	    }
	    
	    public int iterator() {
	        return this.hours;
	    }
}

