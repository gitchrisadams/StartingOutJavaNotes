package com.christopheradams.num022SequentialSearchOnlyPartOfArray;

import java.util.Random;		// Generating random numbers.

public class SequentialSearchOnlyPartOfArray
{
	public static void main(String[]args)
	{
		// Constants:
		final int LINES_TO_PRINT = 10;

		// Variables:
		int results;		// Store our results.

		// Create a new array of ints:
		int[] tests = new int[50];

		// Create a new Random object.
		Random gen = new Random();

		// Fill the array with random numbers that range from 1 to 100 inclusive.
		for(int i = 0; i < tests.length; i++)
		{
			tests[i] = gen.nextInt(100) + 1;
		}

		// Search for the value 100 by passing in our array and the value to search for.
		//results = sequentialSearch(tests, 100);
		/******************* NOTE: Above line commented out, we now have to pass it *************************/
		/******************* a third param, the size to only search through part of *************************/
		/******************* of the array. 											*************************/
		// Search through only the 3 elements of the array.
		results = sequentialSearch(tests, 100, 3);

		// Determine if 100 was found and display appropriate message.
		if(results == -1)
			System.out.println("Not found");
		else
			System.out.println("The value 100 was found in position" + results);

		// Display the array:
		for(int i = 0; i < tests.length; i++)
		{
			System.out.print(tests[i] + " ");

			// Print new line every so many lines.
			// Change LINES_TO_PRINT to however many lines to display before a \n.
			if((i+1) % LINES_TO_PRINT == 0)
				System.out.println();
		}
	}

	/**
		The sequentialSearch method searches for an array value.
		@param array The array to search for.
		@param value The value to search for.
		@param size The size the array to search through.
		@return The subescript of the value if found in the array, otherwise -1
	*/
	// ***** NOTE: We added int size so that we can *****
	// ***** use this to only search through 	    *****
	// ***** part of the array. 					*****
	public static int sequentialSearch(int[] array, int value, int size)
	{
		int index;		// Loop control variable.
		int element;	// Element the value is found at.(The subcsript of the array found).
		boolean found;	// Flag indicating we found what we are searching for.

		// Element 0 is starting point of the search.
		index = 0;

		// Store default starting values of element being -1 and found false
		// since we have not found it yet.
		element = -1;
		found = false;

		// Search the array.
		// While we have not found it and we are not at the end of the array.
		//while(!found && index < array.length)
		// ************** NOTE: Above line commented out, we changed it to size so  *********************
		// ************** we could search through only part of the array. 			*********************
		while(!found && index < size)
		{
			// If the spot we are at in the loop is equal to the value.
			if(array[index] == value)
			{
				// We found it so set it to true;
				found = true;

				// Store index so we know what index the found value is located.(The subcript of the array)
				element = index;
			}

			// Increment the count control variable:
			index++;
		}

		// Done looping, return the found element or -1 if not found.
		return element;
	}
}