package com.christopheradams.num001RainfallClass;

import java.util.*;		// Scanner input and other utilities.

public class Rainfall
{
	public static void main(String[]args)
	{
		double rainfallYearlyTotal = 0.0;			// The total yearly rainfall.
		double rainfallAverage = 0.0;				// The average monthly rainfall.
		double highestRainfallInAMonth = 0.0;		// The highest rainfall amount in a month.
		double lowestRainfallInAMonth = 0.0;		// The lowest rainfall amount in a month.
		String monthMostRainFall = "";				// The month name with most rainfall.
		String monthLeastRainFall = "";				// The month name with the least rainfall.

		// Create an array to store the rainfall amounts for all 12 months.
		double[] rainfallMonthTotals = new double[12];

		// Create a new Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the total rainfall for each month.
		for(int i = 0; i < rainfallMonthTotals.length; i++)
		{
			System.out.print("Pleae enter the total rainfall for month " + (i+1) + ": ");
			rainfallMonthTotals[i] = keyboard.nextDouble();

			while(rainfallMonthTotals[i] < 0)
			{
				System.out.print("Number cannot be negative, please enter a positive value for month:" + (i+1) + ": ");
				rainfallMonthTotals[i] = keyboard.nextDouble();
			}


		}

		// Call the method to total the rainfall amounts for the year.
		rainfallYearlyTotal = totalRainfall(rainfallMonthTotals);

		// Call the method to calculate the average monthly rainfall.
		rainfallAverage = avgRainfall(rainfallMonthTotals, rainfallYearlyTotal);

		// Call method that calculates the most rainfall in a month.
		highestRainfallInAMonth = highestRainAmount(rainfallMonthTotals);

		// Call method that calculates the month name with the most rainfall.
		monthMostRainFall = monthWithMostRain(rainfallMonthTotals);

		// Call method that calculates the lowest rainfall amount in a month.
		lowestRainfallInAMonth = leastRainAmount(rainfallMonthTotals);

		// Call method that calculates the name of the month with lowest rainfall
		monthLeastRainFall = monthWithLeastRain(rainfallMonthTotals);

		// Output the total rainfall.
		System.out.println("\nThe total rainfall for the year is: " + rainfallYearlyTotal + ".\n");

		// Output the average rainfal.
		System.out.println("\nThe average monthly rainfall is: " + rainfallAverage + ".\n");

		// Output the month with the highest rainfall.
		System.out.println("The highest rainfall in a month was: " +
							monthMostRainFall + " with a total of " + highestRainfallInAMonth + ".\n");

		// Output the month with the lowest rainfall.
		System.out.println("The lowest rainfall in a month was: " +
							monthLeastRainFall + " with a total of " + lowestRainfallInAMonth + ".\n");

	}

	/**
		The totalRainfall() method totals the rainfall for the year.
		@param rainfallMonthTotals The monthly rainfall totals array reference.
		@return The total rainfall for the year.
	*/
	public static double totalRainfall(double[]rainfallMonthTotals)
	{
		double totalRainfall = 0.0;

		// Total the monthly rainfall using the accumulator.
		for(int i = 0; i < rainfallMonthTotals.length; i++)
		{
			totalRainfall += rainfallMonthTotals[i];
		}

		return totalRainfall;
	}

	/**
		The avgRainfall() method calculates the average monthly rainfall.
		@param rainfallMonthTotals The monthly rainfall totals as an array reference.
		@param rainfallYearlyTotal The yearly rainfall.
		@return The average rainfall for the year.
	*/
	public static double avgRainfall(double[] rainfallMonthTotals, double rainfallYearlyTotal)
	{
		double rainfallAverage = 0.0;

		// Ensure not dividing by zero.
		if(rainfallMonthTotals.length > 0)
		{
			// Calcuate the average.
			rainfallAverage = rainfallYearlyTotal / rainfallMonthTotals.length;
		}
		else
		{
			System.out.println("Sorry, cannot calculate an average with zero months.");
		}

		return rainfallAverage;
	}

	/**
		The highestRainAmount() method calculates the amount of
		rain for the month with most rainfall.
		@param rainfallMonthTotals The monthly rainfall totals as an array reference.
		@return highest The most amount of rainfall that fell in month with most rainfall.
	*/
	public static double highestRainAmount(double[] rainfallMonthTotals)
	{
		double highest;						// The highest number in the array.

		// Store the first element in the array as the highest value to start.
		highest = rainfallMonthTotals[0];

		// Loop through all array elements to see if element is the highest.
		for(int i = 1; i < rainfallMonthTotals.length; i++)
		{
			// If value at counter is higher than the highest variable, then store as highest.
			if(rainfallMonthTotals[i] > highest)
			{
				highest = rainfallMonthTotals[i];

			}
		}

		return highest;
	}

	/**
		The monthWithMostRain() calculates the name of the month with the most rainfall.
		@param rainfallMonthTotals The monthly rainfall totals as an array reference.
		@return The month with the most rainfal.
	*/
	public static String monthWithMostRain(double[] rainfallMonthTotals)
	{
		String monthWithMostRain = "";			// The month name with most rainfall.

		// Holds the month number with the most rainfall.
		// We start it at 0 so the first element starts as the highest element.
		int monthNumMostRain = 0;

		for(int i = 1; i < rainfallMonthTotals.length; i++)
		{
			// If value at counter is higher than the highest variable then store
			// the index of the current counter.
			if(rainfallMonthTotals[i] > monthNumMostRain)
			{
				monthNumMostRain = i;

			}
		}

		// Use switch to connect number of month with the actual name of the month.
		switch(monthNumMostRain)
		{
			case 0:
				monthWithMostRain = "January";
				break;
			case 1:
				monthWithMostRain = "February";
				break;
			case 2:
				monthWithMostRain = "March";
				break;
			case 3:
				monthWithMostRain = "April";
				break;
			case 4:
				monthWithMostRain = "May";
				break;
			case 5:
				monthWithMostRain = "June";
				break;
			case 6:
				monthWithMostRain = "July";
				break;
			case 7:
				monthWithMostRain = "August";
				break;
			case 8:
				monthWithMostRain = "September";
				break;
			case 9:
				monthWithMostRain = "October";
				break;
			case 10:
				monthWithMostRain = "November";
				break;
			case 11:
				monthWithMostRain = "December";
				break;
			default:
				monthWithMostRain = "You just went back in time!";
		}

		return monthWithMostRain;

	}
	/**
		The leastRainAmount() method calculates the amount of
		rain for the month with least rainfall.
		@param rainfallMonthTotals The monthly rainfall totals as an array reference.
		@return lowest The most amount of rainfall that fell in month with least rainfall.
	*/
	public static double leastRainAmount(double[] rainfallMonthTotals)
	{
		double lowest;						// The lowest number in the array.

		// Store the first element in the array as the lowest value to start.
		lowest = rainfallMonthTotals[0];

		// Loop through all array elements to see if element is the lowest.
		for(int i = 1; i < rainfallMonthTotals.length; i++)
		{
			// If value at counter is lower than the lowest variable, then store as lowest.
			if(rainfallMonthTotals[i] < lowest)
			{
				lowest = rainfallMonthTotals[i];

			}
		}

		return lowest;
	}

	/**
		The monthWithLeastRain() calculates the name of the month with the least rainfall.
		@param rainfallMonthTotals The monthly rainfall totals as an array reference.
		@return The month with the least rainfal.
	*/
	public static String monthWithLeastRain(double[] rainfallMonthTotals)
	{
		String monthWithLeastRain = "";			// The month name with least rainfall.

		// Holds the month number with the least rainfall.
		// We start it at 0 so the first element starts as the highest element.
		int monthNumLeastRain = 0;

		for(int i = 1; i < rainfallMonthTotals.length; i++)
		{
			// If value at counter is lower than the lowest variable then store
			// the index of the current counter.
			if(rainfallMonthTotals[i] < monthNumLeastRain)
			{
				monthNumLeastRain = i;

			}
		}

		// Use switch to connect number of month with the actual name of the month.
		switch(monthNumLeastRain)
		{
			case 0:
				monthWithLeastRain = "January";
				break;
			case 1:
				monthWithLeastRain = "February";
				break;
			case 2:
				monthWithLeastRain = "March";
				break;
			case 3:
				monthWithLeastRain = "April";
				break;
			case 4:
				monthWithLeastRain = "May";
				break;
			case 5:
				monthWithLeastRain = "June";
				break;
			case 6:
				monthWithLeastRain = "July";
				break;
			case 7:
				monthWithLeastRain = "August";
				break;
			case 8:
				monthWithLeastRain = "September";
				break;
			case 9:
				monthWithLeastRain = "October";
				break;
			case 10:
				monthWithLeastRain = "November";
				break;
			case 11:
				monthWithLeastRain = "December";
				break;
			default:
				monthWithLeastRain = "You just went back in time!";
		}

		return monthWithLeastRain;
	}

}


/********************************** OUTPUT ****************************
Pleae enter the total rainfall for month 1: 10
Pleae enter the total rainfall for month 2: -1
Number cannot be negative, please enter a positive value for month:2: 5
Pleae enter the total rainfall for month 3: 5
Pleae enter the total rainfall for month 4: -5
Number cannot be negative, please enter a positive value for month:4: -50
Number cannot be negative, please enter a positive value for month:4: 4
Pleae enter the total rainfall for month 5: 10
Pleae enter the total rainfall for month 6: 10
Pleae enter the total rainfall for month 7: 10
Pleae enter the total rainfall for month 8: 10
Pleae enter the total rainfall for month 9: 10
Pleae enter the total rainfall for month 10: 10
Pleae enter the total rainfall for month 11: 10
Pleae enter the total rainfall for month 12: 10

The total rainfall for the year is: 104.0.


The average monthly rainfall is: 8.666666666666666.

The highest rainfall in a month was: November with a total of 10.0.

The lowest rainfall in a month was: January with a total of 4.0.

Press any key to continue . . .

******************************************************************/