package com.christopheradams.ch4Challenges.num012BarChart;

public class BarChartClient
{
	public static void main(String[]args)
	{
		// Create an array of sales figures to test:
		double[] salesFigures = {1000, 1200, 1800, 800, 1900};

		// Create an array of Strings:
		String[] starPatterns = new String[salesFigures.length];

		// Create a new BarChart Object:
		BarChart sales1 = new BarChart(salesFigures);

		// Call method to calculate the number of stars to display.
		starPatterns = sales1.calcStars();

		// Output the Sales Bar Chart:
		System.out.println("SALES BAR CHART");
		System.out.println("----------------");
		for(int i = 0; i < salesFigures.length; i++)
		{
			System.out.println("Store " + (i+1) + ": " + starPatterns[i]);
		}
	}
}