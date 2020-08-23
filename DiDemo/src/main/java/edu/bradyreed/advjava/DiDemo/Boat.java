package edu.bradyreed.advjava.DiDemo;

import java.util.List;

/**
 * This class represents an boat
 *
 */
public class Boat
{
    /**
     * This class is an example to showcase Dependency injection
     * 
     * It requires several parameters at compile time and hides implementation from client code
     * 
     * @param engine - a list of one or more Engines on a boat
     * @param hull - type of hull (bowrider, open, cabin, deck, pontoon)
     * @param color - color of hull
     */
	private List<Engine> engines;
	private HullEnum hull;
	private Color color;
	
	
	public Boat (List<Engine> engines, HullEnum hull, Color color) {
		this.engines = engines;
		this.hull = hull;
		this.color = color;
		
	}
	
}


