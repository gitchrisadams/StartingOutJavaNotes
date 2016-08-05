package com.christopheradams.num008ParkingTicketSim;

import java.io.*;

public class ParkingTicket
{
	// Fields:
	private ParkedCar carTicketed;
	private ParkingMeter carsMeter;
	private String officerName;
	private int officerBadgeNum;
	private boolean isTicketed;

	/**
		Constructor
	*/
	public ParkingTicket(ParkedCar car, ParkingMeter meter, String name,
		int badgeNum, boolean getsTicket)
	{
		carTicketed = car;
		carsMeter = meter;
		officerName = name;
		officerBadgeNum = badgeNum;
		isTicketed = getsTicket;

	}

	// Methods:
	/**
		The reportsFine() method displays the fine to a text
		file when a ticket is being issued.
	*/
	public void reportFine() throws IOException
	{
		double fine = 0.0;			// Fine to be issued.
		int overTime;				// Time over meter time purchased.

		// Constants:
		final double FEE_HOUR1 = 25;
		final double FEE_BEYOND1 = 10;

		// Calculate the fine:
		if(isTicketed)
		{
			// Calculate the time over the time in the meter.
			overTime = carTicketed.getNumMinParked() - carsMeter.getParkingTime();

			// Add the fine for the first hour.
			fine += FEE_HOUR1;

			// Subtract 60 minutes since we already added the fine
			// for the first hour.
			overTime -=60;

			// If we have overtime to calculate, get the fine for the time
			// after the first hour. Like for hour 2, hour 3 etc...
			if(overTime > 0)
				fine += overTime / 60 * FEE_BEYOND1;

			// Create a new PrintWriter object for writing the ticket
			// to a text file.
			PrintWriter outputFile = new PrintWriter("Ticket.txt");

			// Output the ticket to a text file:
			outputFile.printf("%-20s%n", "Automobile Information:");
			outputFile.printf("%-20s%-20s%n", "Make: ", carTicketed.getMake());
			outputFile.printf("%-20s%-20s%n", "Model: ", carTicketed.getModel());
			outputFile.printf("%-20s%-20s%n", "Color: ", carTicketed.getColor());
			outputFile.printf("%-20s%-10d%n", "License #: ", carTicketed.getLicNum());
			outputFile.printf("%-20s$%10.2f%n", "Fine: ", fine);
			outputFile.printf("%-20s%-20s%n", "Officer Name: ", officerName);
			outputFile.printf("%-20s%-20s%n", "Officer Badge #: ", officerBadgeNum);

			// Done with the file so close it.
			outputFile.close();

			// Output message to screen that the ticket has been printed.
			System.out.println("Ticket printed to file");
		}
		else
		{
			// If for some reason a ticket is not issued.
			System.out.println("No ticket given.");
		}
	}
}