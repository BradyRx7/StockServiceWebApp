package edu.bradyreed.advjava.StockQuoteApp.service;

import edu.bradyreed.advjava.StockQuoteApp.Person;
import java.util.List;


public class DatabaseUserService implements UserStockService {
 	
	@Override
	public List<Person> readUsers() {
		List<Person> userList = null;
	
		return userList;
	}

	@Override
	public List<Person> readUsersListofStocks() {
		List<Person> userStocks = null;
	
		return userStocks;
	}

}
