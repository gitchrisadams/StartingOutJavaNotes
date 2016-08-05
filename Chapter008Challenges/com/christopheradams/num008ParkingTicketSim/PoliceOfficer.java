package com.christopheradams.num008ParkingTicketSim;

import java.io.*;

public class PoliceOfficer
{
	// Fields:
	private String officerName;
	private int badgeNum;
	private ParkedCar car;
	private ParkingMeter meter;
	private boolean givesTicket;

	/**
		Constructor
	*/
	public PoliceOfficer(String name, int badge, ParkedCar theCar, ParkingMeter theMeter)
	{
		officerName = name;
		badgeNum = badge;
		car = theCar;
		meter = theMeter;

	}

	// Getters:
	public String getOfficerName()
	{
		return officerName;
	}

	public int getBadge()
	{
		return badgeNum;
	}

	/**
		The calcGivesTicket() method calculates if a ticket
		is warranted.
		@return True if a ticket should be issued.
	*/
	public boolean calcGivesTicket() throws IOException
	{
		// If the number of minutes the car is parked is greater
		// than the time in the meter, then issue a parking ticket.
		if(car.getNumMinParked() > meter.getParkingTime())
		{
			givesTicket = true;

			// Create the new ParkingTicket object.
			ParkingTicket ticket = new ParkingTicket
				(car, meter, officerName, badgeNum, givesTicket);

			// Call the method that prints out the fine to a text file.
			ticket.reportFine();
		}
		else
		{
			givesTicket = false;
		}


		return givesTicket;
	}

}