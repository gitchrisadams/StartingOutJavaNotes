package com.christopheradams.ch2challenges.num006LandCalculation;

/**
	Christopher Adams
	This program calculates the number of acres in a tract of land.
*/

// Scanner input and other utilities.
import java.util.Scanner;

public class Challenge6LandCalculation
{
	public static void main(String[]args)
	{
		// Constants:
		final int ACRE = 43560;

		// Variables:
		double landSize = 0.0;
		double totalAcres = 0.0;

		// Create Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Get the size of the land.
		System.out.print("Please enter the size in square feet of your land: ");
		landSize = keyboard.nextDouble();

		// Calculate the number of acres in the land:
		if(landSize > 0)
		{
			totalAcres = landSize / ACRE;
		}

		// Output the number of acres of land.
		System.out.printf("You have %.2f acres of land.%n", totalAcres);
	}
}