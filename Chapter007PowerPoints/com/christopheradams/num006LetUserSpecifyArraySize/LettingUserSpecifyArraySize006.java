package com.christopheradams.num006LetUserSpecifyArraySize;

import java.util.*;

public class LettingUserSpecifyArraySize006
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		// Int to hold the number of tests from the user.
		int numTests;

		// Delcare an array.
		int[] tests;

		// Get the number of test scores the user has.
		System.out.println("How many tests do you have?");
		numTests = keyboard.nextInt();

		// Now that we have the number of tests from the user,
		// create the array with that many elements.
		tests = new int[numTests];

		// Loop through an array and initialize values with
		// what user enters and know when to stop by using the array length property.
		for(int index = 0; index < tests.length; index++)
		{
			System.out.print("Test " + (index + 1) + ": ");

			tests[index] = keyboard.nextInt();
		}

		// Loop through the array and output the items.
		for(int index = 0; index < tests.length; index++)
		{
			System.out.println("Test number " + (index+1) + ":" + tests[index]);
		}
	}
}