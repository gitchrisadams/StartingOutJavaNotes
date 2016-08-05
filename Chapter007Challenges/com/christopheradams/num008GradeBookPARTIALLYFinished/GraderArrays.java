package com.christopheradams.num008GradeBookPARTIALLYFinished;

public class GraderArrays
{
	// Create an array to hold five student names:
	String[] studentNames = new String[5];

	// Create an array to hold the five student letter grades:
	char[] studentLetterGrades = new char[5];

	// Create array to hold the student Test scores.
	double[] studentTestScores = new double[4];

	// Constructor:
	public GraderArrays(String[] theNames, double[] theTestScores)
	{
		studentNames = theNames;
		studentTestScores = theTestScores;
	}

	public int getStudentName(String theName)
	{
		int positionFound = -1;			// Position where String is found.

		// Loop through array and see if name passed in matches
		// the name stored in the array.
		for(int i = 0; i < studentNames.length; i++)
		{
			if(theName.equals(studentNames[i]))
			{
				// Store the index of the position where name is found.
				positionFound = i;
			}
		}

		if(positionFound < 0)
			System.out.println("Name not found!");
		else
			System.out.println("Found name at position: " + positionFound);
		return positionFound;
	}

	/**
		The avgTestScore method averages the test scores.
	*/
	public double avgTestScore()
	{
		double totalTestScores = 0.0;		// Hold the total of all test scores for the student.
		double avgTestScore = 0.0;			// Hold the average of the test score.

		// Loop through and total the scores.
		for(int i = 0; i < studentTestScores.length; i++)
		{
			totalTestScores += studentTestScores[i];
		}

		// Prevent dividing by zero.
		if(studentTestScores.length > 0)
		{
			// Calculate the average.
			avgTestScore = totalTestScores / studentTestScores.length;
		}

		// Return the average test score:
		return avgTestScore;
	}

	public char calcAverageLetterGrade(double theAverageScore)
	{
		char theLetterGrade;				// The average letter grade.

		if(theAverageScore >= 90 && theAverageScore <= 100)
		{
			theLetterGrade = 'A';
		}
		else if(theAverageScore >= 80 && theAverageScore <= 89)
		{
			theLetterGrade = 'B';
		}
		else if(theAverageScore >= 70 && theAverageScore <= 79)
		{
			theLetterGrade = 'C';
		}
		else if(theAverageScore >= 60 && theAverageScore <= 69)
		{
			theLetterGrade = 'D';
		}
		else if(theAverageScore <= 59)
		{
			theLetterGrade = 'F';
		}
		else
		{
			theLetterGrade = 'N';
		}

		return theLetterGrade;
	}





}