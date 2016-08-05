package com.christopheradams.ch4Challenges.num012BarChart;

public class BarChart
{
	// Fields:
	double[] starArray;
	String[] starPattern;
	double numStars;
	String starsString = "";

	/**
		Constructor
	*/
	public BarChart(double[] arrayToStar)
	{
		// Copy reference of array passed in to the array field.
		starArray = arrayToStar;
	}

	// Methods:
	public String[] calcStars()
	{
		// Create the array object the size of array in field.
		starPattern = new String[starArray.length];

		for(int i = 0; i < starArray.length; i++)
		{
			// Get the number of stars to display.
			// This will display one star per 100 of value in the array element.
			numStars = starArray[i] / 100;

			// Reset the starsString back to zero before starting
			// the next inner loop.
			starsString = "";

			// Loop through the array and concatenate a star
			// and add it to the stars String.
			for(int j = 0; j < (int)numStars; j++)
			{
				starsString += "*";
			}

			// Store the value in the stars String in element of
			// the array corresponding to outter loop counter.
			starPattern[i] = starsString;
		}

		// Return the string of stars to the calling method.
		return starPattern;
	}
}