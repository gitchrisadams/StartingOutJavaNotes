package com.christopheradams.num036VariableLengthArgumentsVararg;

public class VariableLengthArgumentsVararg
{
	public static void main(String[]args)
	{
		int result;		// To hold the result of calculations.

		// Create an array.
		int[] values = {1, 2, 3, 4, 5};

		System.out.println("The sum of 4 5's is: " + sum(5, 5, 5, 5));

		System.out.println("The sum of 4 10's is: " + sum(10, 10, 10, 10));

		// You can also pass in an array, not just regular ints like this:
		System.out.println("The sum of values in array 1,2,3,4,5: " + sum(values));
	}

	// Notice sum() has a (int... numbers) as the argument.
	// This is a vararg and you can pass it any number of ints.
	// Numbers is actually passed as an array.
	public static int sum(int... numbers)
	{
		int total = 0; 		// Accumulator.

		for(int i = 0; i < numbers.length; i++)
		{
			total += numbers[i];
		}

		return total;
	}

	// We can mix regular arguments with varags.
	// But only one vararg and the vararg has to come last.
	public static void justDemonstrateMixingArgsWithVarArgs(String s, double d, int... list)
	{

	}
}