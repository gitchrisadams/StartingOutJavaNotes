package com.christopheradams.ch4Challenges.num003DistanceFile;

/**
	This program calculates the distance a vehicle
	has traveled.
*/

import java.util.*;		// For Scanner input and other utilities.
import java.io.*;		// For file input/outpu.

public class ch4p1ADistanceTraveled
{
	public static void main(String[]args) throws IOException
	{
		// Variables:
		double carSpeed = 0.0;										// The speed of the car.
		int hours = 0;												// The number of hours it has traveled.
		final String MY_OUTPUT_FILE = "CarDistanceOutput.txt";		// The name of the Distance file.

		// Create a Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Priming read:
		// Get the speed from the user.
		System.out.print("How fast are you traveling?");
		carSpeed = keyboard.nextDouble();

		// Keep getting input while speed is negative.
		while(carSpeed < 0)
		{
			System.out.print("Please enter a non-negative number for speed!");
			carSpeed = keyboard.nextDouble();
		}

		// Priming read:
		// Get the number of hours traveled.
		System.out.print("How many hours have you been traveling?");
		hours = keyboard.nextInt();


		// Keep getting input while hours traveled is less than 1.
		while(hours < 1)
		{
			System.out.print("Hours cannot be less than 1, please enter valid value:");
			hours = keyboard.nextInt();
		}

		// Create a new PrinterWriter for writing our output to a file:
		PrintWriter outputFile = new PrintWriter(MY_OUTPUT_FILE);

		// Display heading to our file:
		outputFile.printf("%-20s%-20s%n", "Hour", "Distance Traveled");
		outputFile.printf("-------------------------------------\n");

		// Use a loop to display the distance traveled to the file.
		for(int i = 1; i <= hours; i++)
		{
			// The distance traveled.
			double distanceTraveled = 0.0;

			// Calculate the distance traveled.
			distanceTraveled = carSpeed * i;

			// Output the distance traveled to the file.
			outputFile.printf("%n%-20d%10.2f%n", i, distanceTraveled);
		}
		System.out.println();

		outputFile.close();


	}
}
