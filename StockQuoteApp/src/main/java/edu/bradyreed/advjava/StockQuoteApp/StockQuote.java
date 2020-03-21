package edu.bradyreed.advjava.StockQuoteApp;

public final class StockQuote {
	private final double value;
	private final String tickerSymbol;
	
	//Default constructor parameters set to zero
	protected StockQuote() {
		this.value = 0.0;
		this.tickerSymbol = "none";
	}
	
	//Overloaded constructor for value and symbol input
	protected StockQuote (double p_value, String p_tickerSymbol) {
		this.value = p_value;
		this.tickerSymbol = p_tickerSymbol;
	}
	
	//Overloaded constructor with a complete StockQuote passed
	public StockQuote (StockQuote p_stockQuote) {
		this.value = p_stockQuote.getValue();
		this.tickerSymbol = p_stockQuote.getTickerSymbol();
	}
	

	public String getTickerSymbol() {
		return this.tickerSymbol;
	}
	
	public double getValue() {
		return this.value;
	}
	
	/*
	 * Appears to be unnecessary to have the getQuote method in this class,
	 *  but leaving it for now.
	 * 
	 * public StockQuote getQuote(String p_symbol) {
	 * 
	 * StockQuote m_quote = this;
	 * 
	 * if (this.tickerSymbol.equalsIgnoreCase(p_symbol)) return m_quote;
	 * 
	 * else m_quote = new StockQuote();
	 * 
	 * return m_quote; }
	 */
}
