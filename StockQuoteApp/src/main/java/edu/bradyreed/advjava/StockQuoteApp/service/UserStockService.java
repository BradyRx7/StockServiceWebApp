package edu.bradyreed.advjava.StockQuoteApp.service;

import edu.bradyreed.advjava.StockQuoteApp.Person;
import java.util.List;


public interface UserStockService {
		
		public List<Person> readUsers();
		
		public List<Person> readUsersListofStocks();
		
}
