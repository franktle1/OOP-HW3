package edu.albany.cargo;

public class CargoShip extends Ship{
	/** cargo measured in tonnes*/
	private int cargoCapacity;
	public CargoShip(String name, String year, int cargoCapacity) {
		super(name, year);
		this.cargoCapacity = cargoCapacity;
	}
	// Defaults to super(), name = default name, year = XXXX
	/** Name= default, year XXXX, CargoCap = 0*/
	public CargoShip() {
		cargoCapacity = 0;
	}
	
	public CargoShip(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	/** Cargo toString*/
	public String toString() {
		return "Name: "+getName()+" Cargo Capacity: "+cargoCapacity;
	}
	
	
}
