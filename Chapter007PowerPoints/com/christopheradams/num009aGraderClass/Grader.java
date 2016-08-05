package com.christopheradams.num009aGraderClass;

public class Grader
{
	// Fields:
	private double[] testScores;		// Array as a field for the test scores.

	// Constructor:
	public Grader(double[] scoreArray)
	{
		// Initialize our testScores array to be same size as scoreArray.
		testScores = new double[scoreArray.length];

		// Copy the array passed to the constructor to the array field.
		for(int i = 0; i < scoreArray.length; i++)
		{
			testScores[i] = scoreArray[i];
		}
	}

	// Methods:
	public double getLowestScore()
	{
		// Store first element in array to the lowest variable.
		double lowest = testScores[0];

		// Loop through array starting at element 1
		for(int i = 1; i < testScores.length; i++)
		{
			// If the element at the current loop is lower than our lowest variable
			// then store the value in that element in variable lowest.
			if(testScores[i] < lowest)
			{
				lowest = testScores[i];
			}
		}

		return lowest;
	}

	public double getAverage()
	{
		double totalScore = 0;		// For the total score.
		double average = 0;			// For the average.
		double lowestScore;			// Holds the lowest test score.

		// If we don't have at least two scores, then display an error.
		if(testScores.length < 2)
		{
			System.out.println("Must have a least two test scores.");
		}
		// We have at least two scores so go ahead and calculate the average
		// minus the lowest score.
		else
		{
			// Get the total.
			for(int i = 0; i < testScores.length; i++)
			{
				totalScore += testScores[i];
			}

			// Get the lowest score
			lowestScore = getLowestScore();

			// Subtract the lowest score from the total;
			totalScore -= lowestScore;

			// Calculate the average by dividing the total by the length of the array minus 1
			// Since we are not counting the lowest score.
			average = totalScore / (testScores.length -1);
		}

		return average;





	}
}