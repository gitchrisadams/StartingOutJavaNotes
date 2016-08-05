package com.christopheradams.ch7Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	05/09/2016
	Getting Average of numbers in an array.
*/


public class Ch7P5GettingAverageInAnArray
{
	public static void main(String[] args)
	{
		// Create array:
		int[] numbers = {10, 10, 10, 10, 10, 10, 10, 10};

		// Accumulator to accumulate our total:
		double total = 0;

		// Double to store our average:
		double average = 0.0;

		// Loop through our array accumulating total:
		for(int index = 0; index < numbers.length; index++)
		{
			// Add current element at counter index to our total.
			total += numbers[index];
		}

		// Get the average of values in our array.
		average = total / numbers.length;

		// Output our total:
		System.out.println("Our total of all numbers in our numbers array is: " +
							total + "\n");

		//Output the average:
		System.out.println("The average of all our numbers in the array is:" +
							average + "\n");
	}

}