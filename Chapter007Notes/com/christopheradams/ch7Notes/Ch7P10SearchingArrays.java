package com.christopheradams.ch7Notes;

/**
	Christopher Adams
	5/11/2016
	Searhing an array for a specified value
*/

public class Ch7P10SearchingArrays
{
	public static void main(String[]args)
	{
		// Create Variables.
		// Our array.
		int[] tests = {87, 75, 98, 100, 82};

		// Variable to hold our result.
		int results;

		// Search the array for the value 100.
		results = sequentialSearch(tests, 100);

		// Determine whether 100 was found and dislay message.
		// If it is -1 then no it was not found.
		if(results == -1)
		{
			System.out.println("You did not earn 100 on any tests");
		}
		else
		{
			// Found one with 100 so display it and element it was found at.
			System.out.println("You earned 100 on test" + (results + 1));
		}
	}


	/**
		The sequentialSearch method searches an array for a value.
		@parm array The array to search.
		@parm value The value to search for.
		@return element The subscript of the value if found in the array,
				otherwise it is -1.
	*/
	public static int sequentialSearch(int[] array, int value)
	{
		// Create Variables:
		// The loop control variable, 0 is start element of our search.
		int index = 0;

		// The element where value is found, set to -1 to start.
		int element = -1;

		// Flag indicating we have search results, set to false to start.
		boolean found = false;

		// Search the array.
		// While we have not found it and go through the entire array.
		while(!found && index < array.length)
		{
			// If found at this point of counter, then set found to true
			// and store the current counter in element variable.
			// This tells us what array element number has a 100 in it.
			if(array[index] == value)
			{
				found = true;
				element = index;
			}

			// increment counter.
			index++;
		}

		// Return number of the array index where we found a 100.
		return element;
	}

}