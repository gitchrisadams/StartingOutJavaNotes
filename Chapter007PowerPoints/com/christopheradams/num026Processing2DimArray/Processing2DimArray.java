package com.christopheradams.num026Processing2DimArray;

import java.util.*;

public class Processing2DimArray
{
	public static void main(String[]args)
	{
		// Create a 2Dim array with 3 rows and 4 columns. Rows:(0, 1, 2) and Col:(0, 1, 2, 3)
		double[][] scores = new double[3][4];

		// Create a new Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		for(int row = 0; row < 3; row++)
		{
			for(int col = 0; col < 4; col++)
			{
				System.out.print("Enter a score: ");
				scores[row][col] = keyboard.nextDouble();
				System.out.println("Putting the score in row["+row+"] and col["+col+"].\n");
				System.out.println("The Data in there is scores["+scores[row][col]+"]\n");
			}
		}
	}
}