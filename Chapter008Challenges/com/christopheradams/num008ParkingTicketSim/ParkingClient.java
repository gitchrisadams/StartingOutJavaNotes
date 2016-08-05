package com.christopheradams.num008ParkingTicketSim;

/**
	Christopher Adams
	7/26/16
	The ParkingClient program simulates a parked car,
	a meter, and a police officer that can issue a ticket
	for expired meters.
*/

import java.io.*;

public class ParkingClient
{
	public static void main(String[]args) throws IOException
	{
		// Create a new ParkingMeter object, passing in 60 minutes of
		// time into the parking meter.
		ParkingMeter meter1 = new ParkingMeter(60);

		// Create a ParkedCar object passing in information about the car.
		// The last argument 240 is the actual time the car has been parked.
		ParkedCar car1 = new ParkedCar("Subaru", "Imprezza", "Gold", 794567, 240);

		// Create a new police officer so he/she can decide whether
		// a ticket should be issued.
		// Pass in their name, id number, and the car and meter objects.
		PoliceOfficer officer1 = new PoliceOfficer
			("Officer Johnson", 123456, car1, meter1);

		// Call method that calculates and prints out a ticket to a file
		// if a ticket is warranted.
		officer1.calcGivesTicket();
	}
}