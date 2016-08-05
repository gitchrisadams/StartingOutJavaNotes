package com.christopheradams.num032PassingA2DArray;

public class PassingA2DArray
{
	public static void main(String[]args)
	{
		// Create a 2D array.
		int[][] numbers = { { 1,  2,  3,  4 },
						    { 5,  6,  7,  8 },
						    { 9, 10, 11, 12 } };

		// Call method to display the array and pass in our 2D array.
		showArray(numbers);

		// Display the sum of the array's values:
		System.out.println();
		System.out.println("The sum of all values in the array is: " + arraySum(numbers));

	}

	/**
		The showArray method displays the contents of a 2D array.
		@param array The array to display.
	*/
	public static void showArray(int[][] array)
	{
		for(int row = 0; row < array.length; row++)
		{
			for(int col = 0; col < array[0].length; col++)
			{
				System.out.println(array[row][col]);
			}
		}
	}

	/**
		The arraySum method sums numbers in an array.
		@param array The array to sum.
		@return The summed values of the array.
	*/
	public static int arraySum(int[][] array)
	{
		// The accumulator to sum the values in the array.
		int total = 0;

		for(int row = 0; row < array.length; row++)
		{
			for(int col = 0; col < array[row].length; col++)
			{
				total += array[row][col];
			}
		}

		return total;
	}
}