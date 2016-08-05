package com.christopheradams.num021PrintArraysThenNewLineBoilerPlate;

import java.util.Random;		// Generating random numbers.

public class SequentialSearch
{
	public static void main(String[]args)
	{
		// Constants:
		final int LINES_TO_PRINT = 10;

		// Create a new array of ints:
		int[] tests = new int[100];

		// Display the array:
		for(int i = 0; i < tests.length; i++)
		{
			System.out.print(tests[i] + " ");

			// Print new line every so many lines.
			// Change LINES_TO_PRINT to however many lines to display before a \n.
			if((i+1) % LINES_TO_PRINT == 0)
				System.out.println();
		}
	}
}