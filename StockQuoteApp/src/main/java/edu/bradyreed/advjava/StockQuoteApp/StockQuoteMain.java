package edu.bradyreed.advjava.StockQuoteApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class StockQuoteMain {

	//for testing purposes this program is successful if nothing throws an exception
	protected static boolean runSuccess = false;
	public static void main(String[] args) {
		
		//use system to take either a single argument of stock symbol, or 3 with a symbol and 2 dates
		System.out.print("Enter a stock symbol OR stock symbol, date range, and interval \n (e.g." 
				+ "APPL OR APPL 10/13/2008 10/22/2008 HOURLY) " + ": ");
		
		Scanner scanner = new Scanner(System.in);
		String commandArgs = scanner.nextLine();
		if (commandArgs == null) {
			System.out.println("Please correct your input: ");
			commandArgs = scanner.nextLine();
		}
		
		String[] vars = commandArgs.split(" ");
        String stockSymbol= vars[0];
        StockService fakeStockService = StockServiceFactory.getStockService();
        List<StockQuote> quotes = new LinkedList<StockQuote>();
        
        if (vars.length > 1) {
        	String from = vars[1];
        	String until = vars[2];
        	String intervalValue = vars[3];
        	IntervalEnum interval = IntervalEnum.DAILY; //Initialized to a default
        	
        	boolean loop = true;
        	while (loop)
        		try {
        			interval = IntervalEnum.valueOf(intervalValue.toUpperCase());
        			loop = false;
        		} catch (IllegalArgumentException e1) {
        			//Specified interval does not exist or was formatted incorrectly
        			System.out.println("Please enter a valid interval: ");
        			intervalValue = scanner.next();	
        		}
        	
        	SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    		Date fromDate = new Date();
    		Date untilDate = new Date();
    		try {
    			fromDate = dateFormat.parse(from);
    		} catch (ParseException e) {
    			e.printStackTrace();
    		}
    		
    		try {
    			untilDate = dateFormat.parse(until);
    		} catch (ParseException e) {
    			e.printStackTrace();
    		}
    		     	
        	quotes = fakeStockService.getQuote(stockSymbol, fromDate, untilDate, interval);
        	
        }else {
        	quotes.add(fakeStockService.getQuote(stockSymbol));
        }
		
        System.out.println("\n Based on your input, the service found " + quotes.size() 
        	+ " stock quote(s) in the database: \n");
        
        for (StockQuote tmp: quotes){
            System.out.println(tmp);
        }
        
        System.out.println("--End of Quote List--");
    
    runSuccess = true;
	scanner.close();
	}
}
		
