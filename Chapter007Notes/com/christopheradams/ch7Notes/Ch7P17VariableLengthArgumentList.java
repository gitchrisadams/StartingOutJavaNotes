package com.christopheradams.ch7Notes;

/*
	Christopher Adams
	5/13/2016
	Variable Length Argument lists.
*/


public class Ch7P17VariableLengthArgumentList
{
	public static void main(String[]args)
	{
		// Call method to sum numbers, changing how many arguments
		// we are passing into the method to sum.
		// Varargs must be last so first arg passed in is what we
		// want to multiply by. In this case the double 100.
		// The last params passed in are numbers to sum. 5, 10, 15, 50 etc...
		System.out.println("5 + 10 = " + sum(100, 5, 10) + ".\n");
		System.out.println("5 + 10 + 15 = " + sum(100, 5, 10, 15) + ".\n");
		System.out.println("5 + 10 + + 15 + 50 = " + sum(100, 5, 10, 15, 50) + ".\n");
	}



	/**
		The sum method totals any number of arguments sent to it.
		@parm numbers The variable length array of numbers to sum.
		@return total The total of all numbers summed.
	*/
	// Notice the ... which means we can pass in any number of int numbers:
	// We also accept a regular double argument multiplier.
	// Note when mixing regular params and variable arg params
	// the Vararg must be the last one. i.e. int... numbers is last.
	public static int sum(double multiplier, int... numbers)
	{
		int total = 0;		// Accumulator
		double totalMult = 0.0;	// Our total of numbers multiplied

		// Add all the values in the numbers array.
		for(int val : numbers)
		{
			total += val;
			totalMult = val * multiplier;

			// Output our numbers multiplied
			System.out.println("Total multiplied is: " + totalMult);

		}

		// Return the total of numbers summed.
		return total;
	}
}