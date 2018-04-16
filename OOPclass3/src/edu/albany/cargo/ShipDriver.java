package edu.albany.cargo;

import java.util.ArrayList;

import edu.albany.cruise.CruiseShip;

public class ShipDriver {

	public static void main(String[] args) {
		ArrayList<Ship> ships = new ArrayList<>();
		Ship defaultBoat = new Ship();
		Ship boat = new Ship("Boaty McBoatFace","1992");
		Ship defaultShipCruiser = new CruiseShip();
		CruiseShip actualCruiser = new CruiseShip("Bermuda","1990", 20000);
		CruiseShip defaultCruiser = new CruiseShip();
		Ship defaultCargoShip = new CargoShip();
		CargoShip actualCargoNoName = new CargoShip(1000);
		
		
		ships.add(boat);
		ships.add(defaultBoat);
		ships.add(defaultShipCruiser);
		ships.add(actualCruiser);
		ships.add(defaultCruiser);
		ships.add(defaultCargoShip);
		ships.add(actualCargoNoName);
		
		for(Ship ship : ships) {
			System.out.println(ship.toString());
		}
		
	}

}
