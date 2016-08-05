package com.christopheradams.ch7Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	05/09/2016
	Summing values in an array.
*/


public class Ch7P4SummingValuesInArray
{
	public static void main(String[] args)
	{
		// Create array:
		int[] numbers = {10, 10, 10, 20, 10, 10, 10, 10};

		// Accumulator to accumulate our total:
		int total = 0;

		// Loop through our array accumulating total:
		for(int index = 0; index < numbers.length; index++)
		{
			// Add current element at counter index to our total.
			total += numbers[index];
		}

		//Output our total:
		System.out.println("Our total of all numbers in our numbers array is: " +
							total + "\n");
	}

}