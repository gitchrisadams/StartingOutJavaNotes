package com.christopheradams.ch4Notes;
// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	5/03/2016
	Running Totals and Sentinels
*/


public class ch4P3RunningTotalsandSentinels
{
	public static void main(String[] args)
	{
		/***** Running Totals or Accumulators *****/
		// Create Variables:
		// Accumulator/running total:
		double totalSales;

		// Hold number of days of sales:
		int days = 5;

		// One day's worth of sales:
		double sales;

		// Hold input from the user:
		String input;

		// Set our accumulator to 0:
		totalSales = 0.0;

		// For loop: Notice it is less than or equal to so we get the full 5 days.
		for(int count = 1; count <= days; count++)
		{
			// Get input from user:
			input = JOptionPane.showInputDialog("Enter the sales for day" + count + ": ");

			// Store the input as a double:
			sales = Double.parseDouble(input);

			// Add to our running total or Accumulator:
			totalSales += sales;	// a.k.a totalSales = totalSales + sales
		}

		// Display our total Sales:
		JOptionPane.showMessageDialog(null, String.format("The total sales are $%,.2f", totalSales));
		/***** End Running Totals or Accumulators *****/


		/***** Sentinels *****/
		// Variables:
		// Store the number to add:
		int numToAdd;

		// Accumulator initialized to 0:
		int totalNumsToAdd = 0;

		// Setup our scanner object for user input:
		Scanner keyboard = new Scanner(System.in);


		// Get the priming read of input before the loop:
		System.out.println("Enter numbers to add, type -1 to quit\n");
		numToAdd = keyboard.nextInt();

		// -1 is the Sentinel value where we will exit loop. != -1
		while(numToAdd !=-1)
		{
			// Accumulator: Add current item to the totalItems:
			totalNumsToAdd += numToAdd;

			// Get the next item from inside our while loop, -1 will exit the loop:
			System.out.println("Enter numbers to add, type -1 to quit\n");
			numToAdd = keyboard.nextInt();
		}

		//Display our total:
		System.out.println("The total of all your numbers added together is: " + totalNumsToAdd);



		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);
	}

}