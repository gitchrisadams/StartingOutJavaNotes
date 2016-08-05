package com.christopheradams.ch7Notes;

/**
	Christopher Adams
	5/11/2016
	Passing Two Dim arrays to Methods.
*/

public class Ch7P12PassingTwoDimArrayToMeth
{
	public static void main(String[]args)
	{
		// Create an array:
		int[][]numbers = { {1, 2, 3, 4},
						   {5, 6, 7, 8},
						   {9, 10, 11, 12} };

		// Create int to store our returned value.
		int totalReturned = 0;

		// Call our array that totals our two dim array, passing in our two dim array.
		// It also prints out each element.
		totalReturned = arraySum(numbers);

		// Display our total that was returned:
		System.out.println("Our total of all elements in the array is " + totalReturned);
	}



	/**
		The arraySum method returns the sum of values
		in a two dimensional array.
		@param array The array to sum.
		@return total The sum of the array elements.
	*/
	public static int arraySum(int[][] array)
	{
		// Variable for accumulator.
		int total = 0;

		// Loop through array totaling each element.
		for(int row = 0; row < array.length; row++)
		{
			for(int col = 0; col < array[row].length; col++)
			{
				total += array[row][col];
				System.out.println(array[row][col] + " ");
			}
			System.out.println();
		}
		return total;
	}
}