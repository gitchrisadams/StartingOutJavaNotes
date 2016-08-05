package com.christopheradams.num031UsingDotLengthIn2DArrays;

public class UsingDotLengthIn2DArrays
{
	public static void main(String[]args)
	{
		// Initializing a 2D array with an initialization list:
		// Notice we need to use two sets of braces.
		// numbers[0] is the 1st row of {1, 2, 3}
		// numbers[1] is the 2nd row of {4, 5, 6}
		// numbers[0] is the 3rd row of {7, 8, 9}
		int[][] numbers = {{1, 2, 3},
						   {4, 5, 6},
						   {7, 8, 9},
						   {4, 5, 6}};

		// Using the .length in a 2D array.
		// The numbers.length is the number of rows in the array.
		for(int row = 0; row < numbers.length; row++)
		{
			System.out.println("Row "+ row + ":");
			// The numbers[row].length is the number of columns in the row.
			for(int col = 0; col < numbers[row].length; col++)
			{

				System.out.println(numbers[row][col]);
			}
		}
		System.out.println();

		// Using the .length in a 2D array with columns.
		// Notice we just pick the first column and use numbers[0].length
		// We could pick any column because they are all same length.
		for(int col = 0; col < numbers[0].length; col++)
		{
			System.out.println("Column "+ col + ":");
			for(int row = 0; row < numbers.length; row++)
			{
				System.out.println(numbers[row][col]);
			}
		}

		// Display the number of columns in each row:
		System.out.println("\nThe number of rows is " + numbers.length);
		for(int row = 0; row < numbers.length; row++)
		{
			System.out.println("The number of  columns in row " + row + " is: " +
								numbers[row].length);
		}

	}
}