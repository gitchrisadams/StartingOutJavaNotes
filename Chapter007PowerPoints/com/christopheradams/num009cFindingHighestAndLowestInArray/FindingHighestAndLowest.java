package com.christopheradams.num009cFindingHighestAndLowestInArray;

public class FindingHighestAndLowest
{
	public static void main(String[]args)
	{
		// Finding the highest and lowest value.
		// Create an array.
		int[] myIntArray = {20, 10, 80, 25, 35};

		// Variables:
		// Set lowest and highest to the first element of array to start.
		int highest = myIntArray[0];
		int lowest = myIntArray[0];

		// If item at current counter in array is lower or higher then store in
		// appropriate variable.
		// Start counting at 1 because already processed element 0.
		for(int i = 1; i < myIntArray.length; i++)
		{
			if(myIntArray[i] > highest)
				highest = myIntArray[i];

			if(myIntArray[i]< lowest)
				lowest = myIntArray[i];
		}

		System.out.println("The highest number in the array is: " + highest + ".\n");
		System.out.println("The lowest number in the array is: " + lowest + ".\n");

	}
}