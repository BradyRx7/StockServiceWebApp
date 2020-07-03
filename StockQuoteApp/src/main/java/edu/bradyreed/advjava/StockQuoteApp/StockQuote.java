package edu.bradyreed.advjava.StockQuoteApp;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.annotation.Immutable;

/**
 * @author brady
 *
 */

@Immutable
public final class StockQuote {
	private final double value;
	private final String tickerSymbol;
	private final Date quoteDate;
	
	//Default constructor parameters set to zero
	protected StockQuote() {
		this.value = 0.00;
		this.tickerSymbol = "none";
		this.quoteDate = new Date();
	}
	
	//Overloaded constructor for value, symbol, and date input
	protected StockQuote (double p_value, String p_tickerSymbol, Date p_Date) {
		this.value = p_value;
		this.tickerSymbol = p_tickerSymbol;
		this.quoteDate = p_Date;
	}
	
	//Overloaded constructor with a complete StockQuote passed
	public StockQuote (StockQuote p_stockQuote) {
		this.value = p_stockQuote.getValue();
		this.tickerSymbol = p_stockQuote.getTickerSymbol();
		this.quoteDate = p_stockQuote.getQuoteDate();
	}
	

	public String getTickerSymbol() {
		return this.tickerSymbol;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public Date getQuoteDate() {
//		This code can be used to debug and convert a date to a string in an unused variable
//		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//		String stringDate = dateFormat.format(this.quoteDate);
		return this.quoteDate;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		return this.tickerSymbol + " " + String.format("%.2f", this.value) + " " + dateFormat.format(this.quoteDate);
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
