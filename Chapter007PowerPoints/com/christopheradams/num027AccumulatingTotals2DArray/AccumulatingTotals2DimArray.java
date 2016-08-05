package com.christopheradams.num027AccumulatingTotals2DArray;

import java.util.*;

public class AccumulatingTotals2DimArray
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

		// Total the scores in an accumulator.
		for(int row = 0; row < ROWS; row++)
		{
			for(int col = 0; col < COLS; col++)
			{
				// Accumulate current value of 2D array element at counter in the accumulator.
				total += scores[row][col];
			}
		}

		System.out.println("\nThe total value of all the scores in the 2D array is: " + total);


	}
}

/******************* Output ************************
Enter a score: 10
Putting the score in row[0] and col[0].

The Data in there is scores[10.0]

Enter a score: 10
Putting the score in row[0] and col[1].

The Data in there is scores[10.0]

Enter a score: 10
Putting the score in row[0] and col[2].

The Data in there is scores[10.0]

Enter a score: 10
Putting the score in row[0] and col[3].

The Data in there is scores[10.0]

Enter a score: 10
Putting the score in row[1] and col[0].

The Data in there is scores[10.0]

Enter a score: 10
Putting the score in row[1] and col[1].

The Data in there is scores[10.0]

Enter a score: 10
Putting the score in row[1] and col[2].

The Data in there is scores[10.0]

Enter a score: 10
Putting the score in row[1] and col[3].

The Data in there is scores[10.0]

Enter a score: 10
Putting the score in row[2] and col[0].

The Data in there is scores[10.0]

Enter a score: 10
Putting the score in row[2] and col[1].

The Data in there is scores[10.0]

Enter a score: 10
Putting the score in row[2] and col[2].

The Data in there is scores[10.0]

Enter a score: 10
Putting the score in row[2] and col[3].

The Data in there is scores[10.0]


The total value of all the scores in the 2D array is: 120.0
Press any key to continue . . .


******************* Output ************************/