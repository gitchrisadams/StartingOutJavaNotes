package com.christopheradams.num010CarInstrumentSim;

public class FuelGauge
{
	// Fields:
	private int fuelAmount;

	// Constants:
	private final int TANK_CAPACITY = 15;


	// Getters:
	public int getFuelAmount()
	{
		return fuelAmount;
	}

	// Methods:
	public void addFuel()
	{
		if(fuelAmount < TANK_CAPACITY)
		{
			fuelAmount++;
		}
		else
		{
			System.out.println("\nClick...Tank is full.\n");
		}
	}

	public void burnFuel()
	{
		if(fuelAmount > 0)
		{
			fuelAmount--;
		}
		else
		{
			System.out.println("\nTank is already empty.\n");
		}
	}
}