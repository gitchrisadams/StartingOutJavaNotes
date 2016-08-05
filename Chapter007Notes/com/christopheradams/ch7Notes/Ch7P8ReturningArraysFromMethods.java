package com.christopheradams.ch7Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.

/*
	Christopher Adams
	5/9/2016
	Java Class - Returning Arrays from methods.
*/

public class Ch7P8ReturningArraysFromMethods
{
	public static void main(String[] args)
	{
		// Create a double array to store our returned array:
		double[] values;

		// Call our method that returns an array and assign to values.
		values = getArray();

		// Loop through our array with an enhanced loop to output our values.
		for(double num : values)
		{
			System.out.print(num + " ");
		}
	}


	/**
		The getArray method demonstrates returning an array.
		@return array The we are returning.
	*/
	// Notice return type is double[] because we are returning an array:
	public static double[] getArray()
	{
		// Create an array
		double[] array = {1.2, 2.3, 4.5, 6.7, 8.9};

		// Return the array to calling function:
		return array;
	}
}




