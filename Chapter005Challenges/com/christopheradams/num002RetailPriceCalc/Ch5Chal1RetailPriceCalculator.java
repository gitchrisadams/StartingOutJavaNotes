package com.christopheradams.num002RetailPriceCalc;

/*
	2. Retail price calculator
	Write a program that asks the user to enter an item’s wholesale cost and its markup percent- age.
	It should then display the item’s retail price. For example:
	•	If an item’s wholesale cost is 5.00 and its markup percentage is 100 percent,
	then the item’s retail price is 10.00.
	• If an item’s wholesale cost is 5.00 and its markup percentage is 50 percent,
	then the item’s retail price is 7.50.
	The program should have a method named calculateRetail that receives the wholesale cost and
	the markup percentage as arguments, and returns the retail price of the item.
*/

import java.util.*;		// For Scanner input and other utility tasks.

public class Ch5Chal1RetailPriceCalculator
{
	public static void main(String[]args)
	{
		// Variables:
		double retailPrice = 0.0;		// The retail price of an item.
		double wholesalePrice = 0.0;	// The wholesale price of an item(price before markup).
		double markup = 0.0;

		// Create a new Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get wholesale cost from the user.
		// Display prompt to user.
		System.out.print("Please enter the wholesale price of the item: ");

		// Get keyboard input.
		wholesalePrice = keyboard.nextDouble();

		// Get markup percentage from the user.
		// Display prompt to the user.
		System.out.println("\nPlease enter the amount in decimal format, Example: for 10% enter .10");
		System.out.print("Markup percentage as decimal: ");

		// Get keyboard input.
		markup = keyboard.nextDouble();

		// Call method that calculates retail cost.
		retailPrice = calculateRetail(wholesalePrice, markup);

		// Display retail price.
		System.out.printf("%nThe retail price is: $%.2f%n", retailPrice);
	}

	/**
		The calculateRetail method calculates the retail price of an item.
		@param wholesaleCost The wholesale cost of an item before the mark up is applied.
		@param markup The percentage the wholesale cost will be marked up.
		@return The retail price of an item.
	*/
	public static double calculateRetail(double wholesaleCost, double markUpPercent)
	{
		// Declare/intitialize variable to hold the retail cost we will be returning.
		double retailPrice = 0.0;

		// Calculate retail price by formula wholeSaleCost * markupPercentage + wholesaleCost
		retailPrice = wholesaleCost * markUpPercent + wholesaleCost;

		// Return the retail price to the calling method.
		return retailPrice;

	}
}