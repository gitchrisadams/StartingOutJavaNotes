package com.christopheradams.num005EnhancedForLoopForArrays;

import java.util.*;

public class EnhancedForLoopForArrays005
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		// Delcare constant to use for index in array.
		final int ARRAY_SIZE = 3;

		// Create a new array.
		int[] numbers = new int[ARRAY_SIZE];

		// Loop through an array and initialize values with
		// what user enters and know when to stop by using the array length property.
		for(int index = 0; index < numbers.length; index++)
		{
			System.out.print("Employee " + (index + 1) + ": ");

			numbers[index] = keyboard.nextInt();
		}

		// The enhanced For loop to display the values in an array.
		for(int val : numbers)
		{
			System.out.println("The next value is: " + val);
		}

	}
}