package com.christopheradams.ch7Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	05/09/2016
	Finding the Highest and Lowest numbers in an array.
*/


public class Ch7P6FindingHighestAndLowestInArray
{
	public static void main(String[] args)
	{
		// Create array:
		int[] numbers = {8, 99, 3, 10, 4, 54, 6, 7};

		/***** Finding the highest and lowest number in an array *****/
		// Set our highest and lowest variable to first element in array.
		int highest = numbers[0];
		int lowest = numbers[0];

		// Loop through array adding the highest number in each
		// element to our hightest variable.
		for(int index = 1; index < numbers.length; index++)
		{
			// Test to see if the number is the highest:
			if(numbers[index] > highest)
			{
				highest = numbers[index];
			}

			// Test to see if the number is the lowest:
			if(numbers[index] < lowest)
			{
				lowest = numbers[index];
			}
		}

		System.out.println("The lowest number in the array is: " + lowest + "\n");
		System.out.println("The highest number in the array is: " + highest + "\n");
		/***** End Finding the highest and lowest number in an array *****/


	}

}