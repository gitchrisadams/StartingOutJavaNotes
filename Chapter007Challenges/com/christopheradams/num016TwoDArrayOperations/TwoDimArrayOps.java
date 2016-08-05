package com.christopheradams.num016TwoDArrayOperations;

/**
	Christopher Adams 7/14/16
	The 2D array operations program demonstrates 2D array operations.
*/
import java.util.*;

public class TwoDimArrayOps
{
	public static void main(String[]args)
	{
		// Variables:
		double total = 0.0;				// The total value of elements in an array.
		double average = 0.0;			// The average of all elements in an array.
		double rowTotal = 0.0;			// The total value in a specific row.
		double colTotal = 0.0;			// The total value in a specific column.
		double highestInRow = 0.0;		// The highest value in a specific row.
		double lowestInRow = 0.0;		// The lowest value in a specific row.
		int rowNum = 0;					// The row number to process.
		int colNum = 0; 				// The column number to process.

		// New Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Get the column and row number the user would like to process.
		System.out.print("Enter row number to process: ");
		rowNum = keyboard.nextInt();
		System.out.print("Enter column number to process: ");
		colNum = keyboard.nextInt();

		// Create a 2D array:
		double[][] twoDimArray = {{10.0, 20.0, 30.0, 60.0},
								  {10.0, 10.0, 10.0, 10.0},
								  {100.0, 200.0, 300.0, 400.0}};

		// Call the method to get the total value of the elements in the array.
		total = getTotal(twoDimArray);

		// Call the method to get the average of the value of the elements in the array.
		average = getAverage(twoDimArray);

		// Call method to calculate a row of the array.
		rowTotal = getRowTotal(twoDimArray, rowNum);

		colTotal = getColumnTotal(twoDimArray, colNum);

		highestInRow = getHighestInRow(twoDimArray, rowNum);

		lowestInRow = getLowestInRow(twoDimArray, rowNum);

		System.out.println("The total of all values in the 2D array is: " + total);

		System.out.println("The average of all values in the 2D array is: " + average);

		System.out.println("The total of row " + rowNum + " is " + rowTotal);

		System.out.println("The total of column " + colNum + " is " + colTotal);

		System.out.println("Highest in row  " + rowNum + " is " + highestInRow);

		System.out.println("Lowest in row  " + rowNum + " is " + lowestInRow);
	}

	/**
		The getTotal() method gets the total of all elements in the array.
		@param twoDimArray The reference to a two dimensional array.
		@return The total of the elements in the two dimensional array.
	*/
	public static double getTotal(double[][] twoDimArray)
	{
		// Variables:
		double total = 0.0;			// Total value of elements in array.

		// Loop through array and total the elements.
		for(int row = 0; row < twoDimArray.length; row++)
		{
			for(int col = 0; col < twoDimArray[0].length; col++)
			{
				total += twoDimArray[row][col];
			}
		}

		return total;
	}

	public static double getAverage(double[][] twoDimArray)
	{
		// Variables:
		double total = 0.0;			// The total value of the elements in the array.
		double average = 0.0;		// The average of the elements in the array.

		// Call method to get the total:
		total = getTotal(twoDimArray);

		// Calculate the average.
		// Ensure not dividing by zero.
		if((twoDimArray.length * twoDimArray[0].length) > 0)
		{
			average = total / (twoDimArray.length * twoDimArray[0].length);
		}

		return average;
	}

	/**
		The getRowTotal() method gets the total of the row specified.
		@param twoDimArray The reference to the array to process.
		@param rowNum The row number to total.
		@return The total value of the row specified.
	*/
	public static double getRowTotal(double[][] twoDimArray, int rowNum)
	{
		// Variables:
		double rowTotal = 0.0;

		// Loop through the specific row and total the elements in array.
		for(int i = 0; i < twoDimArray[rowNum].length; i++)
		{
			rowTotal += twoDimArray[rowNum][i];
		}

		return rowTotal;
	}


	public static double getColumnTotal(double[][] twoDimArray, int colNum)
	{
		double colTotal = 0.0;

		for(int i = 0; i < twoDimArray.length; i++)
		{
			colTotal += twoDimArray[i][colNum];
		}

		return colTotal;
	}

	public static double getHighestInRow(double[][] twoDimArray, int rowNum)
	{
		// Set the first element of the array as the highest.
		double highest = twoDimArray[rowNum][0];

		// Loop through the specified row:
		for(int i = 0; i < twoDimArray[rowNum].length; i++)
		{
			if(highest < twoDimArray[rowNum][i])
				highest = twoDimArray[rowNum][i];
		}

		return highest;
	}

	public static double getLowestInRow(double[][] twoDimArray, int rowNum)
	{
		// Set the first element of the array as the highest.
		double lowest = twoDimArray[rowNum][0];

		// Loop through the specified row:
		for(int i = 0; i < twoDimArray[rowNum].length; i++)
		{
			if(lowest > twoDimArray[rowNum][i])
				lowest = twoDimArray[rowNum][i];
		}

		return lowest;
	}
//			COLS
//		  0 1 2
//	ROWS0 5 5 6
//		1 5 6 7
//		2 8 9 3


}
















