package com.christopheradams.num010ShipCruiseShipCargo;

public class CargoShip extends Ship
{
	/***** Fields *****/
	private int cargoCapacity;			// In tons.

	/**
		Constructor
	*/
	public CargoShip(String shipName, String yearBuilt, int cargoCapacity)
	{
		super(shipName, yearBuilt);

		this.cargoCapacity = cargoCapacity;
	}

	/***** Getters *****/
	public int getCargoCapacity()
	{
		return cargoCapacity;
	}

	/***** Setters *****/
	public void setCargoCapacity(int cargoCapacity)
	{
		this.cargoCapacity = cargoCapacity;
	}

	/***** Methods *****/
	@Override
	public String toString()
	{
		String formattedString = "\nShip Name: " + getShipName() + "\n" +
			"Cargo Capacity: " + cargoCapacity + "\n";

		return formattedString;
	}
}