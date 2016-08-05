package com.christopheradams.num010ShipCruiseShipCargo;

public class Ship
{
	/***** Fields *****/
	private String shipName;
	private String yearBuilt;

	/**
		Constructor
	*/
	public Ship(String shipName, String yearBuilt)
	{
		this.shipName = shipName;
		this.yearBuilt = yearBuilt;
	}

	/***** Getters *****/
	public String getShipName()
	{
		return shipName;
	}

	public String getYearBuilt()
	{
		return yearBuilt;
	}

	/***** Setters *****/
	public void setShipName(String shipName)
	{
		this.shipName = shipName;
	}

	/***** Methods *****/
	public String toString()
	{
		String formattedString = "Ship Name: " + shipName +
			"\nYear built: " + yearBuilt + "\n";

		return formattedString;
	}
}