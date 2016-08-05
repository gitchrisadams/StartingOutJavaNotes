package com.christopheradams.num010CarInstrumentSim;

public class Odometer
{
	// Fields:
	int currentMileage;					// The current mileage.
	FuelGauge theFuelGauge;				// A FuelGauge object.

	// Constants:
	final int MPG = 24;			// The miles per gallon of the vehicle.

	/**
		Constructor
	*/
	public Odometer(FuelGauge gauge)
	{
		theFuelGauge = gauge;
	}

	// Getters:
	public int getcurrentMileage()
	{
		return currentMileage;
	}

	// Methods:
	public void addMileage()
	{
		if(currentMileage < 999999)
		{
			currentMileage++;
			if(currentMileage % MPG == 0)
			{
				System.out.println("Hit " + currentMileage + " miles.");
				System.out.println("Fuel Gauge going down");
				theFuelGauge.burnFuel();
			}
		}
		else
		{
			// Car went over 1million miles so rest mileage to 0
			currentMileage = 0;
		}
	}
}