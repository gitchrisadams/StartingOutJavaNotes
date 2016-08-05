package com.christopheradams.num009bSummingandAvgingArrayElements;

public class SummingAndAveraging
{
	public static void main(String[]args)
	{
		// Summing values in an array:
		// Variables:
		int total = 0;			// The total of the elements in an array.
		double average;			// The average of the elements in an array.

		// Create a new array:
		int[] myIntArray = {10, 20, 30, 40, 50};

		// Loop and add elements in an array.
		for(int i = 0; i < myIntArray.length; i++)
		{
			total += myIntArray[i];
		}

		System.out.println("The total of all values in array is: " + total);


		// Averaging the elements:
		average = total / myIntArray.length;

		System.out.println("\nThe average of all values in the array is: " + average);
	}
}