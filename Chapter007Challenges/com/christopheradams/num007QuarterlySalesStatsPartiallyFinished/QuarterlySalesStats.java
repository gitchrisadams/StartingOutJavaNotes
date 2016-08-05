package com.christopheradams.num007QuarterlySalesStatsPartiallyFinished;

import java.util.*;			// For Scanner input and other utilities.

public class QuarterlySalesStats
{
	public static void main(String[]args)
	{
		// Variables:

		// Create a reference to an array.
		double[][] salesArray;

		// Create an array reference to store the sales by division:
		double[] salesByDivision;

		// Create an array reference to store the division's increase or decrease
		// from previous quarter.
		double[] increaseDecrease;

		// Create an array reference to store the quarterly totals.
		double[] quarterlyTotals;

		// Create an array reference to store total companies increase or decrease
		// from the previous quarter.
		double[] totalCompanyIncreaseDecrease;

		// Create an array reference to store the avg sales for all divisions
		// for each quarter.
		double[] avgSalesAllDivEachQuarter;

		// Call the method to get input from the user and store
		// the return array in the array reference.
		salesArray = salesInput();

		// Call the method to display sales figures by division.
		salesFiguresByDivision(salesArray);

		// Call method to calculate the total sales by division.
		salesByDivision = totalDivisionSales(salesArray);

		increaseDecrease = divChangeFromLastQtr(salesByDivision);

		quarterlyTotals = totalQuarterlySales(salesArray);

		totalCompanyIncreaseDecrease = increaseDecreaseLastQuarter(quarterlyTotals);

		//avgSalesAllDivEachQuarter =


		for(int i = 0; i < salesByDivision.length; i++)
		{
			System.out.println(salesByDivision[i]);
		}



	}

	/**
		The salesInput() method gets sales from the user.
		@return The quarterly sales from the user.
	*/
	public static double[][] salesInput()
	{
		// Constants:
		int QUARTERS = 2;				// The number of quarters in a year.
		int DIVISIONS = 2;				// The number of divisions in the company.

		// Create a Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Create a two dim array to store the quarterly sales.
		double[][] quarterlySales = new double[QUARTERS][DIVISIONS];

		// Loop through the array and get input from the user.
		for(int qtrs = 0; qtrs < quarterlySales.length; qtrs++)
		{
			System.out.println("Please enter sales for quarter " + (qtrs + 1) + ": ");

			for(int divs = 0; divs < quarterlySales[0].length; divs++)
			{
				System.out.print("Enters sales for division " + (divs + 1) + ": ");
				quarterlySales[qtrs][divs] = keyboard.nextDouble();
			}
		}

		return quarterlySales;
	}

	/**
		The salesFiguresByDivision() method lists sales by division.
		@param The array reference to display by division.
	*/
	public static void salesFiguresByDivision(double[][] arrayToDisplay)
	{
		// Loop through the array using column major processing.
		for(int divs = 0; divs < arrayToDisplay[0].length; divs++)
		{
			System.out.println("Division " + (divs + 1) + ":");

			for(int qtrs = 0; qtrs < arrayToDisplay.length; qtrs++)
			{
				System.out.println(arrayToDisplay[qtrs][divs]);
			}

			System.out.println();
		}
	}

	/**
		The totalDivisionSales method totals the sales by divison.
		@param arrayToProcess The array reference to process the total sales by div.
		@return The total sales by division.
	*/
	public static double[] totalDivisionSales(double[][] arrayToProcess)
	{
		// Create an array the length of the divisions:
		double[] divisions = new double[arrayToProcess[0].length];

		// Loop through the array using column major processing.
		for(int divs = 0; divs < arrayToProcess[0].length; divs++)
		{
			for(int qtrs = 0; qtrs < arrayToProcess.length; qtrs++)
			{
				// Accumulate the sales by division in an array to get the total by div.
				divisions[divs] += arrayToProcess[qtrs][divs];
			}
		}

		// Return the sales by division to the calling method.
		return divisions;
	}

	public static double[] divChangeFromLastQtr(double[] arrayToProcess)
	{
		// Create an array to store increase/decrease the length
		// of the array passed in minus 1 since there is no
		// increase/decrease for first quarter sales.
		double[] increaseDecrease = new double[arrayToProcess.length - 1];

		// subtract element[i+1] from element[i] to get change from previous quarter
		for(int i = 0; i < arrayToProcess.length - 1; i++)
		{
			increaseDecrease[i] = arrayToProcess[i + 1] - arrayToProcess[i];
		}

		return increaseDecrease;
	}


	public static double[] totalQuarterlySales(double[][] arrayToProcess)
	{
		// Create an array to store the quarterly totals.
		double[] quarterlyTotals = new double[arrayToProcess.length];

		// Loop through array to total the sales.
		for(int qtrs = 0; qtrs < arrayToProcess.length; qtrs++)
		{
			for(int divs = 0; divs < arrayToProcess[0].length; divs++)
			{
				// Accumulate the quarterly sales into the array.
				quarterlyTotals[qtrs] += arrayToProcess[qtrs][divs];
			}
		}

		return quarterlyTotals;
	}


	public static double[] increaseDecreaseLastQuarter(double[] arrayToProcess)
	{
		// Create an array to store increase/decrease the length
		// of the array passed in minus 1 since there is no
		// increase/decrease for first.
		double[] increaseDecrease = new double[arrayToProcess.length - 1];

		// subtract element[i+1] from element[i] to get change from previous quarter
		for(int i = 0; i < arrayToProcess.length - 1; i++)
		{
			increaseDecrease[i] = arrayToProcess[i + 1] - arrayToProcess[i];
		}

		return increaseDecrease;
	}

//	// Method to calculate the average sales for all divisions for each quarter.
//	public static double[] avgDivisions(double[] arrayToProcess)
//	{
//		// Total all the divisions:
//		for(int i = 0; i < arrayToProcess.length; i++)
//		{
//
//		}
//	}


}