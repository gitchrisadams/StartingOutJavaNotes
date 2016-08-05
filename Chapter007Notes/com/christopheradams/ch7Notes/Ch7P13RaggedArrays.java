package com.christopheradams.ch7Notes;

/*
	Christopher Adams
	5/13/2016
	Ragged Arrays are arrays with rows that have different lengths.
*/


public class Ch7P13RaggedArrays
{
	public static void main(String[]args)
	{
		// Create an array with just the rows specified but no columns.
		int[][] ragged = new int[4][];

		// Set the columns for array row 0 to have 3 columns.
		ragged[0] = new int[3];

		// Set the columns for array row 1 to have 4 columns.
		ragged[1] = new int[4];

		// Set the columns for array row 2 to have 5 columns.
		ragged[2] = new int[5];

		// Set the columns for array row 3 to have 6 columns.
		ragged[3] = new int[6];

		// Display the number of columns in each row.
		for(int index = 0; index < ragged.length; index++)
		{
			System.out.println("The number of columns in row " + index + " is " +
								ragged[index].length);
		}

	}
}