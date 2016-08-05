package com.christopheradams.num026aProcessingARagged2DArray;

/**
	Processing a ragged 2D array
*/

public class ProcessRagged2DArray
{
	public static void main(String[]args)
	{
		// Create a 2D array:
		int[][] myArray = {{50, 60, 33},
						   {77, 21, 79},
						   {89, 22, 43, 63}};

		// Loop through the rows.
		for(int row = 0; row < myArray.length; row++)
		{
			// Loop through columns using the length of the row at current counter
			// as the place to stop.
			for(int col = 0; col < myArray[row].length; col++)
			{
				System.out.print(myArray[row][col] + " ");
			}
			System.out.println();
		}

	}
}