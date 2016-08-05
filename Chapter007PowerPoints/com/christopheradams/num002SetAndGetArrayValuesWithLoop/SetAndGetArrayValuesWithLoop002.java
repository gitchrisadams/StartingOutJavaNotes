package com.christopheradams.num002SetAndGetArrayValuesWithLoop;

import java.util.*;

public class SetAndGetArrayValuesWithLoop002
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		// Delcare constant to use for index in array.
		final int ARRAY_SIZE = 3;

		// Create a new array.
		int[] numbers = new int[ARRAY_SIZE];

		// Can also declare multiple arrays like this:
		int[] numbers2, codes, scores;

		// Loop through an array and initialize values with
		// what user enters.
		for(int index = 0; index < ARRAY_SIZE; index++)
		{
			System.out.print("Employee " + (index + 1) + ": ");

			numbers[index] = keyboard.nextInt();
		}

		// Now loop through and display what is in the array:
		for(int index = 0; index < ARRAY_SIZE; index++)
		{
			System.out.println(numbers[index]);
		}

	}
}