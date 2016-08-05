package com.christopheradams.ch7Notes;

// Import statements:
import java.util.*;			// Used for scanner input and other utility tasks.

/**
	Christopher Adams
	5/11/2016
	Two dimensional arrays.
*/



public class Ch7P11TwoDimArrays
{
	public static void main(String[]args)
	{
		/***** Create a two dim array. *****/
		double [][] scores = new double[3][4];

		// Assign element scores[0][0] and [0][1] some values:
		scores[0][0] = 0.0;
		scores[0][1] = 1.0;


		// Output two of the scores in our two dimensional array.
		System.out.println("The value of scores[0][0] is " + scores[0][0] + ".\n");
		System.out.println("The value of scores[0][1] is " + scores[0][1] + ".\n");
		/***** End Create a two dim array. *****/


		/***** Filling and displaying a two dim array *****/
		// Create finals for the number of rows and columns:
		final int ROWS = 3;
		final int COLS = 4;

		// Create a new two dim array:
		double[][] values = new double[ROWS][COLS];

		// Create scanner for input:
		Scanner keyboard = new Scanner(System.in);

		// Loop through our array adding user input into our array elements.
		// Outter loop loops through our rows, and inner loops through columns.
		for(int row = 0; row < ROWS; row++)
		{
			for(int col = 0; col < COLS; col++)
			{
				System.out.print("Enter a value: ");
				values[row][col] = keyboard.nextDouble();
			}
		}
		/***** End Filling and displaying a two dim array *****/



		/***** Loop through the entire array displaying its values: *****/
		for(int row = 0; row < ROWS; row++)
		{
			for(int col = 0; col < COLS; col++)
			{
				System.out.println("The value in array values[" + row + "]" +
									"[" + col + "] is: " + values[row][col] +
									".\n");
			}
		}
		/***** End Loop through the entire array displaying its values: *****/


		/***** Initializing a Two-Dimensional Array *****/
		// 1,2,3 are first row, 4,5,6 are second row, 7,8,9 third row.
		// 1 is column 0, 2 is column 1. 4 is column 0 etc...
		int[][]myTwoDimArray = { {1,2,3}, {4,5,6}, {7,8,9} };

		// Could also be written like this for better clarity:
		//                                C0 C1 C2
		int[][]myTwoDimBetterClarity = { {1, 2, 3},		// Row 1
										 {4, 5, 6},		// Row 2
										 {7, 8, 9} };	// Row 3


		/***** End Initializing a Two-Dimensional Array *****/


		/***** Displaying the length of rows and cols in two dim array *****/
		// Loop through each row getting number of columns in each:
		for(int index = 0; index < myTwoDimArray.length; index++)
		{
			// Output number of columns in this row.
			System.out.println("The number of columns in row " + index + " is " +
								myTwoDimArray[index].length);
		}
		System.out.println();
		/***** End Displaying the length of rows and cols in two dim array *****/



		/***** A better way to display all elements in a two dim array *****/
		// Loop through each row in outter loop:
		for(int row = 0; row < myTwoDimArray.length; row++)
		{
			// In inner loop loop through the length of the columns.
			for(int col = 0; col < myTwoDimArray[row].length; col++)
			{
				System.out.println(myTwoDimArray[row][col]);
			}
		}
		System.out.println();
		/***** A better way to display all elements in a two dim array *****/



		/***** Summing All elements in a two-dim array *****/
		// Create a new two dim array:
		int[][] numbersToSum = { {1,2,3,4},
								 {5,6,7,8},
								 {9,10,11,12} };

		// Variable to use as accumulator:
		int total = 0;

		// Sum the array elements.
		for(int row = 0; row < numbersToSum.length; row++)
		{
			for(int col = 0; col < numbersToSum[row].length; col++)
			{
				// Accumulate the total.
				total += numbersToSum[row][col];
			}
		}

		// Display the sum of all elements in our array.
		System.out.println("The sum of all elements in the array is: " + total + ".\n");
		/***** Summing All elements in a two-dim array *****/



		/***** Summing only a row of a two dim array *****/
		for(int row = 0; row < numbersToSum.length; row++)
		{
			// Set accumulator to zero so it only totals the row.
			total = 0;

			for(int col = 0; col < numbersToSum[row].length; col++)
			{
				// Accumulate the total of only the row.
				total += numbersToSum[row][col];
			}

			// Display the rows total inside the outter loop:
			System.out.println("The total of the row " + row + " is " + total);
		}
		/***** End Summing only a row of a two dim array *****/



		/***** Summing only a column of a two dim array *****/
		// Loop starting at 0 to the length of the first row of columns or elements.
		// We have 4 elements or columns in row 0.
		for(int col = 0; col < numbersToSum[0].length; col++)
		{
			// Set accumulator to zero so it only totals the column.
			total = 0;

			// Loop starting at row 0 to the length of our numbersToSum array.
			// In this case that is 3 because we have 3 rows of columns or elements.
			for(int row = 0; row < numbersToSum.length; row++)
			{
				// Accumulate the total of only the column.
				total += numbersToSum[row][col];
			}

			// Display the rows total inside the outter loop to display our column.
			System.out.println("The total of the column " + col + " is " + total);
		}
		/***** End Summing only a column of a two dim array *****/




	}
}