package com.christopheradams.ch4Challenges.num008AverageRainFall;

import java.util.*;				// Scanner input and other utilities.

public class AverageRainfall
{
	public static void main(String[]args)
	{
		processRainfall();
	}

	// Get rainfall totals and display:
	public static void processRainfall()
	{
		// Variables:
		int years = 0;				// The number of years of rainfall data.
		int  monthlyRainfall = 0;	// The monthly rainfall from the user.
		int totalRainfall = 0;		// The grand total of rainfall.

		// Constants:
		final int MONTHS = 12;		// Months in a year.

		// Create a Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the number of years from the user.
		System.out.print("Enter the number of years of data to collect: ");
		years = keyboard.nextInt();

		// Validate input:
		while(years < 1)
		{
			// Get the number of years from the user.
			System.out.print("Years must be more than 0, Enter valid years: ");
			years = keyboard.nextInt();
		}

		// Loop through the years and collect rainfall for each month:
		for(int i = 0; i < years; i++)
		{
			System.out.println("\nEnter Rainfall for year " + (i+1) + ": ");

			for(int j = 0; j < MONTHS; j++)
			{
				// Get the rainFall for each month from the user.
				System.out.print("Enter rainfall in inches for month " + (j+1) + ": ");
				monthlyRainfall = keyboard.nextInt();

				// Validate input:
				while(monthlyRainfall < 0)
				{
					// Get the rainFall for each month from the user.
					System.out.println("Rainfall can't be a negative value.");
					System.out.print("Enter rainfall in inches for month " + (j+1) + ": ");
					monthlyRainfall = keyboard.nextInt();
				}

				// Accumulate the total rainFall:
				totalRainfall += monthlyRainfall;
			}
		}

		// Output restults:
		System.out.println("\nRainfall data displayed for " + (years * MONTHS) + " months.\n");
		System.out.println("\nThe grand total of rain fall over all years is " + totalRainfall + " inches.\n");
		System.out.println(calcAverageRainfall(totalRainfall, MONTHS * years));
	}


	/**
		The calcAverageRainfall() calculates the average rainfall.
		@param totalRainfall The total rainfall.
		@param years The total number of years.
		@return The average rainfall.
	*/
	public static double calcAverageRainfall(int totalRainfall, int months)
	{
		// Variables:
		double averageRainfall = 0;

		averageRainfall = (double)totalRainfall / months;

		return averageRainfall;
	}
}









