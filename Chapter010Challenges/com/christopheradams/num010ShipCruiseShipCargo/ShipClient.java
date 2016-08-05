package com.christopheradams.num010ShipCruiseShipCargo;

public class ShipClient
{
	public static void main(String[]args)
	{
		/***** Variables *****/
		// For ship1:
		String shipName = "The Santa Marie Xmas";
		String yearBuilt = "1965";

		// For a cargo ship:
		String cargoShipName = "Big Hall";
		String cargoYearBuilt = "1956";
		int cargoCapacity = 5000;

		// For a cruise ship:
		String cruiseShipName = "The Love Boot";
		String cruiseYearBuilt = "1985";
		int maxPassengers = 1500;

		// Create an array of Ships:
		Ship[] shipArray = new Ship[3];

		// Create ship objects:
		// Create a regular ship:
		Ship ship1 = new Ship(shipName, yearBuilt);

		// Create a cargo ship:
		CargoShip cargoShip1 = new CargoShip(cargoShipName, cargoYearBuilt, cargoCapacity);

		// Create a cruise ship:
		CruiseShip cruiseShip1 = new CruiseShip(cruiseShipName, cruiseYearBuilt, maxPassengers);

		// Store the ships in the array:
		shipArray[0] = ship1;
		shipArray[1] = cargoShip1;
		shipArray[2] = cruiseShip1;

		// Loop through array and output the ship information:
		for(int i = 0; i < shipArray.length; i++)
		{
			System.out.println(shipArray[i]);
		}

	}
}