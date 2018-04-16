package edu.albany.cruise;
import edu.albany.cargo.Ship;

public class CruiseShip extends Ship{
	private int maxCapacity;
	public CruiseShip() {
		maxCapacity = 0;
	}
	
	/**
	 * @param name = name of the ship
	 * @param year = year it was made it
	 * @param cap = max Capacity of passengers*/
	public CruiseShip(String name, String year, int cap) {
		super(name, year);
		maxCapacity = cap;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int cap) {
		maxCapacity = cap;
	}
	public String toString() {
		return "Name: "+getName() + " Max Passengers: "+maxCapacity;
	}
	
}
