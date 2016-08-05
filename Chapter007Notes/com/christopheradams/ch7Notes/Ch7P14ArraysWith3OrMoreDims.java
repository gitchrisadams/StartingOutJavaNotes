package com.christopheradams.ch7Notes;

/*
	Christopher Adams
	5/13/2016
	Arrays with three or more dimensions.
*/


public class Ch7P14ArraysWith3OrMoreDims
{
	public static void main(String[]args)
	{
		// Create an array with 3 dimensions:
		// Can be thought of as 3 sets or pages of 5 rows and 8 columns
		// on each page or set.
		double[][][] seats = new double[3][5][8];

		// Put something in page 0 in row 0 and col 0, the first element.
		seats[0][0][0] = 0.0;

		// Put something in page 0 row 0 col 1:
		seats[0][0][1] = 1.0;

		// Put something on page 1 in the first element:
		seats[1][0][0] = 2.0;

		// Put something on page 2 in the first element(The last page).
		seats[2][0][0] = 3.0;

		// Output.
		System.out.println("seats[0][0][0] value is " + seats[0][0][0] + ".\n");
		System.out.println("seats[0][0][1] value is " + seats[0][0][1] + ".\n");
		System.out.println("seats[1][0][0] value is " + seats[1][0][0] + ".\n");
		System.out.println("seats[2][0][0] value is " + seats[2][0][0] + ".\n");
	}
}