package edu.bradyreed.advjava.StockQuoteApp;

public enum IntervalEnum {
	DAILY (1), 
	WEEKLY (7), 
	MONTHLY (30), 
	QUARTERLY (91), 
	YEARLY (365);
	
	private final int iteration;

	    IntervalEnum(int iteration) {
	        this.iteration = iteration;
	    }
	    
	    public int iterator() {
	        return this.iteration;
	    }
	    
}

