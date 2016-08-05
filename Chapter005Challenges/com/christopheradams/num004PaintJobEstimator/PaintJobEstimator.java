package com.christopheradams.num004PaintJobEstimator;

/**
	Christopher Adams 7/13/2016
	Paint Estimator - Estimates paint and costs necessary when hiring
	someone to paint the inside of your house.
*/

import java.util.*;			// Scanner input and other utilities.

public class PaintJobEstimator
{
	// Scanner field for input throughout our methods.
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[]args)
	{
		// Variables:
		int numRooms = 0;					// The number of rooms to paint.
		double paintPrice = 0.0;			// The price per gallon of paint.
		double wallSpace = 0.0;				// The square feet of wall space to be painted.
		double paintNeeded = 0.0;			// The gallons of paint needed.
		double hours = 0.0;					// The number of hours required to paint the area.
		double totalCostOfPaint = 0.0;		// The total cost of the paint.
		double totalLabor = 0.0;			// The total labor charged by the painters.
		double totalForJob = 0.0;			// The total cost of the painting job.

		// Call method to get the number of rooms to paint.
		numRooms = inputNumRooms();

		// Call method to get the price per gallon of paint.
		paintPrice = inputPaintPrice();

		// Call method to get the square feet to be painted from the user.
		wallSpace = inputWallSpace();

		// Call method to calculate the paint necessary.
		paintNeeded = calcPaintNeeded(wallSpace);

		// Call method to calculate the hours needed to complete the job.
		hours = calcHours(wallSpace);

		// Call method to calculate the cost of the paint.
		totalCostOfPaint = calcPaintCost(paintNeeded, paintPrice);

		// Call method to calculate the total labor.
		totalLabor = calcLaborCharges(hours);

		// Call method to calculate the total cost of the job.
		totalForJob = calcTotalCost(totalCostOfPaint, totalLabor);

		// Call method to output the data:
		displayData(numRooms, wallSpace, paintNeeded, totalCostOfPaint,
			hours, totalLabor, totalForJob);
	}

	/**
		The inputNumRooms() method gets the number of rooms to be painted from the user.
	*/
	public static int inputNumRooms()
	{
		// Variables:
		int numRooms = 0;			// The number of rooms to paint from the user.

		// Get the number of rooms from the user.
		System.out.print("Enter number of rooms to paint: ");
		numRooms = keyboard.nextInt();

		return numRooms;
	}

	public static double inputPaintPrice()
	{
		// Variables:
		double paintPrice;			// The price of the paint.

		// Get the price per gallon from the user.
		System.out.print("\nEnter the price per gallon of paint: ");
		paintPrice = keyboard.nextDouble();

		return paintPrice;
	}

	public static double inputWallSpace()
	{
		// Variables:
		double wallSpace = 0.0;

		// Get the wall space from the user.
		System.out.print("\nEnter the square feet of wall space: ");
		wallSpace = keyboard.nextDouble();

		return wallSpace;
	}

	/**
		The calcPaintNeeded() method calculates the gallons of paint needed
		based on the square feet of wall space.
		@param wallSpace The square feet of wall space to be painted.
		@return The gallons of paint necessary to cover space.
	*/
	public static double calcPaintNeeded(double wallSpace)
	{
		// Variables:
		double paintNeeded = 0.0;

		// Constants:
		final int SQ_FT_PER_GAL = 115;

		// Calculate the paint needed by dividing the space to cover by
		// the number of square feet one gallon will cover.
		paintNeeded = wallSpace / SQ_FT_PER_GAL;

		return paintNeeded;
	}

	/**
		The calcHours() method calculates the number of hours necessary
		to complete the paint job.
		@param wallSpace The square feet of wall space.
		@return The number of hours to complete the paint job.
	*/
	public static double calcHours(double wallSpace)
	{
		// Variables:
		double hours = 0;			// The number of hours of labor necessary.

		// Constants:
		final int SQ_FT_IN_HOURS = 115;			// Square feet in 8 hours of labor.
		final int HOURS_IN_SQ_FT = 8;			// How many hours it takes to paint specified square feet of area.

		// Calculate the hours of labor needed:
		// For every 115 square feet 8 hours will be required.
		hours = wallSpace / SQ_FT_IN_HOURS * HOURS_IN_SQ_FT;

		return hours;

	}

	/**
		The calcPaintCost() method calculates the paint cost.
		@param paintNeeded The amount of paint needed.
		@param paintPrice The price per gallon of paint.
		@return The total paint cost.
	*/
	public static double calcPaintCost(double paintNeeded, double paintPrice)
	{
		// Variables:
		double totalPaintCost = 0.0;

		// Calculate the paint cost:
		totalPaintCost = paintNeeded * paintPrice;

		return totalPaintCost;
	}

	/**
		The calcLaborCharges() method calculates the labor charges for the paint job.
		@param hours The hours to complete the paint job.
		@return The total labor charges.
	*/
	public static double calcLaborCharges(double hours)
	{
		// Variables:
		double laborCharges = 0.0;			// The labor charges charged by painters.

		// Constants:
		final double RATE = 18.00;			// The hourly rate charged by painters.

		// Calculate the labor charges.
		laborCharges = hours * RATE;

		return laborCharges;
	}

	/**
		The calcTotalCost() method calculates the total cost of the paint job.
		@param paintCost The cost of the paint.
		@param laborCharges The total charges for labor.
		@return The total charges for the paint job.
	*/
	public static double calcTotalCost(double paintCost, double laborCharges)
	{
		// Return the cost of the total job.
		return paintCost + laborCharges;
	}

	/**
		The displayData() method displays the paint job data.
	*/
	public static void displayData(int numRooms, double wallSpace, double paintNeeded,
		double totalCostOfPaint, double hours, double totalLabor, double totalForJob)
	{
		// Output the data:
		System.out.printf("%nYou will be painting %d total rooms with a total square footage of %.2f square feet.%n",
			numRooms, wallSpace);
		System.out.printf("%nYou will need %.1f gallons of paint.%n", paintNeeded);
		System.out.printf("%nThe cost of paint is: $%.2f%n", totalCostOfPaint);
		System.out.printf("%nHours of labor needed is: %.1f total hours.%n", hours);
		System.out.printf("%nThe total in labor costs is: $%.2f%n", totalLabor);
		System.out.printf("%nThe total cost of the job is: $%.2f%n%n", totalForJob);
	}
}