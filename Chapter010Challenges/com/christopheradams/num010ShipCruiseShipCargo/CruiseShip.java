package com.christopheradams.num010ShipCruiseShipCargo;

public class CruiseShip extends Ship
{
	/***** Fields *****/
	private int maxPassengers;

	/**
		Constructor
	*/
	public CruiseShip(String shipName, String yearBuilt, int maxPassengers)
	{
		// Call the Ship class passing in name and year Built.
		super(shipName, yearBuilt);

		this.maxPassengers = maxPassengers;
	}

	/***** Getters *****/
	public int getMaxPassengers()
	{
		return maxPassengers;
	}

	/***** Methods *****/
	@Override
	public String toString()
	{
		String formattedString = "\nShip Name: " + getShipName() + "\n" +
			"Maximum passengers: " + maxPassengers + "\n";

		return formattedString;
	}

}