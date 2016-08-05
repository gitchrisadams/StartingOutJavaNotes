package com.christopheradams.num011ArrayOfTemps;

import java.util.Scanner;

public class ArrayOfTemps
{
	public static void main(String[]args)
	{
		// Variables.
		double sum = 0.0;		// Accumulator to add up the sum of temps.
		int index = 0;			// Counter variable.
		double value = 0.0;		// Stores the values from the user.
		int size = 0;			// Size of the array from the user.
		double average = 0.0;	// The average of all the temps.

		// Create a Scanner object.
		Scanner keyboard = new Scanner(System.in);

		// Ask user how large they want the array.
		System.out.print("Please enter how large you would like your database of temps: ");
		size = keyboard.nextInt();

		// Create a new Double array the size we got from the user.
		double[] temps = new double[size];

		// Priming read:
		System.out.print("Enter at most " + temps.length + " temperatures and 999 to end:");
		value = keyboard.nextInt();

		// While loop to get values while not at end of array or
		// 999 not entered.
		while(index < temps.length && value != 999)
		{
			// Store the value entered by user in the array.
			temps[index] = value;

			// Increment the index counter.
			index++;

			// Use accumulator sum to keep running total of the values.
			sum += value;

			// Now that we incremented index, make sure we are not at the end of array.
			if(index < temps.length)
			{
				// Get user input again.
				System.out.print("Enter at most " + temps.length + " temperatures and 999 to end:");
				value = keyboard.nextInt();
			}
		}

		// Compute the average.
		if(index != 0)
		{
			average = sum / index;
		}
		else
		{
			System.out.println("Error, can't divide by zero to get average");
		}

		// Display the results.
		System.out.println("\nArray Capacity: " + temps.length);
		System.out.println("\nElements used: " + index);
		System.out.println("\nThe average temp is " + average);

		// Display each temp in relation to the average.
		System.out.println("\nThe temperatures are:");

		// Only loop through the elements used, not the whole array.
		for(int i = 0; i < index; i++)
		{
			if(temps[i] < average)
			{
				System.out.println(temps[i] + " is below the average.");
			}
			else if(temps[i] > average)
			{
				System.out.println(temps[i] + " is above the average.");
			}
			else
			{
				System.out.println(temps[i] + " is at the average.");
			}
		}

	}
}