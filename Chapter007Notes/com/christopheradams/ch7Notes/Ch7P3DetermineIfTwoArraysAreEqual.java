package com.christopheradams.ch7Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	05/09/2016
	Determine if two arrays are equal.
*/


public class Ch7P3DetermineIfTwoArraysAreEqual
{
	public static void main(String[] args)
	{
		// Create two arrays:
		// Change elements to make them equal or not equal.
		int[] numbers = {6, 10, 15, 20, 25, 30, 35, 40};
		int[]numbers2 = {5, 10, 15, 20, 25, 30, 35, 40};

		/***** Comparing if two arrays are equal *****/
		// Comparing two arrays like this won't work:
		// if(numbers == numbers2)

		// Create a boolean as a flag:
		boolean arraysEqual = true;

		// Create a loop control variable:
		int index = 0;

		// First determine whether the arrays are the same size.
		if(numbers.length != numbers2.length)
		{
			// Set our boolean flag to false, they are not the same size.
			arraysEqual = false;
		}

		// Determine whether the elements contain the same data.
		// While array boolean is true and go through entire array.
		while(arraysEqual && index < numbers.length)
		{
			if(numbers[index] != numbers2[index])
			{

				// They are not equal so set our flag to false.
				arraysEqual = false;
			}

			// Increment the counter.
			index++;
		}

		// Output equal or not equal messages:
		if(arraysEqual)
		{
			System.out.println("The arrays are equal.");
		}
		else
		{
			System.out.println("The arrays are not equal!");
		}
	}

}