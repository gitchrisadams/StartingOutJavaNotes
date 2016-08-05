package com.christopheradams.num011ArrayOperations;

public class ArrayOperations
{
	public static void main(String[]args)
	{
		// Initialize an array with test data.
		int[] myTestData = {5, 10, 15, 20, 25, 30, 35, 50, 85, 90, 100};

		// Display the total of all our test data.
		System.out.println("Total of all items in array: " + getTotal(myTestData));

		// Display the average:
		System.out.printf("%nThe average of all the numbers in array is: %.2f%n",
			getAverage(myTestData));

		// Display the highest value.
		System.out.printf("%nThe highest value in the array is: %d%n", getHighest(myTestData));

		// Display the lowest value.
		System.out.printf("%nThe lowest value in the array is: %d%n", getLowest(myTestData));


	}

	/**
		The getTotal() method totals the elements passed to it.
		@param arrayToProcess The array to process.
		@return The total of the items in the array.
	*/
	public static int getTotal(int[] arrayToProcess)
	{
		int total = 0;			// The accumulator for totalling items in array.

		// Loop through the array.
		for(int i = 0; i < arrayToProcess.length; i++)
		{
			// Accumulate the totals of the items in the array.
			total += arrayToProcess[i];
		}

		return total;
	}


	public static double getAverage(int[] arrayToProcess)
	{
		double average = 0.0;			// The average of items in the array.

		// Call the get total method to get the total:
		int total = getTotal(arrayToProcess);

		average = (double)total / arrayToProcess.length;

		return average;
	}


	public static int getHighest(int[] arrayToProcess)
	{
		int highest = 0;

		// Set the highest to the first element in the array;
		highest = arrayToProcess[0];

		// Loop through the array:
		for(int i = 0; i < arrayToProcess.length; i++)
		{
			if(arrayToProcess[i] > highest)
			{
				// Then store the current array element at counter in highest.
				highest = arrayToProcess[i];
			}
		}

		// Return the highest value.
		return highest;
	}


	public static int getLowest(int[]arrayToProcess)
	{
		int lowest = 0;

		// Store the first element in array as the lowest.
		lowest = arrayToProcess[0];

		// Loop through array:
		for(int i = 0; i < arrayToProcess.length; i++)
		{
			if(arrayToProcess[i] < lowest)
			{
				lowest = arrayToProcess[i];
			}
		}

		return lowest;
	}
}