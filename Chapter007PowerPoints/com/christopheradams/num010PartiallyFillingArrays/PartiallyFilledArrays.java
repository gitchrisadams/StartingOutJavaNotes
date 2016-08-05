package com.christopheradams.num010PartiallyFillingArrays;

/**
	Christopher Adams
	Partially filled arrays.
*/

import java.util.*;

public class PartiallyFilledArrays
{
	public static void main(String[]args)
	{
		// Create a new array.
		int[] array = new int[100];

		// Create variable for a counter.
		int count = 0;

		// Variable to hold user input for the number they are entering.
		int number = 0;

		// Create a Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Priming read:
		// Display prompt and get the first number.
		System.out.print("Enter a numer or -1 to quit: ");
		number = keyboard.nextInt();

		// Loop and get input until sential is entered.
		while(count < array.length && number != -1)
		{
			// Store the number the user entered into the array.
			array[count] = number;

			// Increment counter.
			count ++;

			// Display prompt and get another number.
			System.out.print("Enter a numer or -1 to quit: ");
			number = keyboard.nextInt();

		}
	}
}