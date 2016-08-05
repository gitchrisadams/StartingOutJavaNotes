package com.christopheradams.num028TotalingRowsVersusAllElementsArray;

import java.util.*;

public class TotalRowsInArray
{
	public static void main(String[]args)
	{
		// Constants:
		final int ROWS = 3;		// Number of rows in our array.
		final int COLS = 4;		// Number of columns in our array.

		// Variables:
		double total = 0.0;		// Accumulator for running total of the scores.

		// Create a 2Dim array with 3 rows and 4 columns. Rows:(0, 1, 2) and Col:(0, 1, 2, 3)
		double[][] scores = new double[ROWS][COLS];

		// Create a new Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the scores and put the in a 2D array.
		for(int row = 0; row < ROWS; row++)
		{
			for(int col = 0; col < COLS; col++)
			{
				System.out.print("Enter a score: ");
				scores[row][col] = keyboard.nextDouble();
				System.out.println("Putting the score in row["+row+"] and col["+col+"].\n");
				System.out.println("The Data in there is scores["+scores[row][col]+"]\n");
			}
		}

		// Total the row of scores, not every score.
		for(int row = 0; row < ROWS; row++)
		{
			// Set total to 0 so it only accumulates the row not everything.
			total = 0.0;

			for(int col = 0; col < COLS; col++)
			{
				// Accumulate the total.
				total += scores[row][col];
			}

			// Output the total for the row:
			System.out.println("The total of the scores for row " + row + ": " + total);
		}
	}
}