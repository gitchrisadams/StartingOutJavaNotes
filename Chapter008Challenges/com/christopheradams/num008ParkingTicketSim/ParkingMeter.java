package com.christopheradams.num008ParkingTicketSim;

public class ParkingMeter
{
	// Fields:
	private int parkingTimePurchased;

	/**
		Constructor
	*/
	public ParkingMeter(int parkingTime)
	{
		parkingTimePurchased = parkingTime;
	}

	// Getters:
	public int getParkingTime()
	{
		return parkingTimePurchased;
	}
}