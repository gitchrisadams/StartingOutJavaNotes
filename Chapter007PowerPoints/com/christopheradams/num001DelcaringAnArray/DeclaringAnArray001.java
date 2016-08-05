package com.christopheradams.num001DelcaringAnArray;

import java.util.*;

public class DeclaringAnArray001
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		// Delcare constant to use for index in array.
		final int ARRAY_SIZE = 3;

		// Create a new array.
		int[] numbers = new int[ARRAY_SIZE];

		// Loop through an array and initialize values with
		// what user enteres.
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