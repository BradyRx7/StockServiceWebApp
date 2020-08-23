package edu.bradyreed.advjava.DiDemo;

public enum HullEnum {
		BOWRIDER("BOWRIDER"), 
		OPEN("OPEN"),
		CABIN("CABIN"),
		DECK("DECK"),
		PONTOON("PONTOON");
	
	private String hullString;
	
	private HullEnum (String hullString) {
		this.hullString = hullString;
	}
	
	public String getHullString() {
		return this.hullString;
	}
}
