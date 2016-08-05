package com.christopheradams.num010CarInstrumentSim;

public class CarSimClient
{
	public static void main(String[]args)
	{
		// Create new objects:
		FuelGauge myFuelGauge = new FuelGauge();
		Odometer  myOdometer = new Odometer(myFuelGauge);

		// Fill the car with fuel till clicker goes off, and displays,
		// "tank is full".
		for(int i = 0; i <= 15; i++)
		{
			myFuelGauge.addFuel();
		}

		while(myFuelGauge.getFuelAmount() > 0)
		{
			System.out.println("Current milage: " + myOdometer.getcurrentMileage());
			System.out.println("Amount of fuel: " + myFuelGauge.getFuelAmount());
			System.out.println();
			myOdometer.addMileage();
		}

		if(myFuelGauge.getFuelAmount() == 0)
			System.out.println("\nTank is empty!");

	}

}