package com.christopheradams.ch3Challenges.num004TestScoresAndGrade;

// For Scanner input and other utilities.
import java.util.Scanner;

public class TestScoresAndGrade
{
	public static void main(String[]args)
	{
		// Variables:
		double averageNumGrade = 0.0;			// The average grade as a number.
		int totalTestScores = 0;
		double totalAverage = 0.0;
		char averageLetterGrade = 'I';


		// Constants:
		final int NUM_SCORES = 3;

		// Array to hold three test scores.
		int[] testScores = new int[NUM_SCORES];

		// Array to hold the letter grades.
		char[] letterGrade = new char[NUM_SCORES];

		// Create a Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the test scores from the user:
		// Use a loop to store scores in the array.
		for(int i = 0; i < testScores.length; i++)
		{
			System.out.print("Please enter test score number " + (i+1) + ": ");
			testScores[i] = keyboard.nextInt();
		}

		// Call the method that calculates the letter grade and store in a char array.
		letterGrade = letterGrade(testScores, letterGrade);

		// Call method to total the test scores.
		totalTestScores = totalTheTestScores(testScores);

		// Call method to calculate the average:
		// Pass in the number of scores and the total of our test scores.
		totalAverage = calcAvg(NUM_SCORES, totalTestScores);

		// Call method to calculate the average letter Grade:
		averageLetterGrade = averageLetter(totalAverage, NUM_SCORES);

		// Output the grades along with the letter grade:
		for(int i = 0; i < testScores.length; i++)
		{
			System.out.println("Grade " + (i+1) + " score: " + testScores[i]);
			System.out.println("Grade " + (i+1) + " letter grade: " + letterGrade[i] + "\n");
		}

		System.out.println("Total test scores: " + totalTestScores);

		System.out.printf("\nThe average is : %.2f", totalAverage);

		System.out.println("\nThe average letter grade is: " + averageLetterGrade);

	}

	// Methods:
	public static char[] letterGrade(int[] testScores, char[] letterGrade)
	{
		// Determine the letter grade for each test score.
		for(int i = 0; i < testScores.length; i++)
		{
			// Assign letter grade based on range of values for each letter grade.
			if(testScores[i] >= 90 && testScores[i] <= 100)
				letterGrade[i] = 'A';
			else if(testScores[i] >= 80 && testScores[i]<= 89)
				letterGrade[i] = 'B';
			else if(testScores[i] >= 70 && testScores[i]<= 79)
				letterGrade[i] = 'C';
			else if(testScores[i] >= 60 && testScores[i]<= 69)
				letterGrade[i] = 'D';
			else if(testScores[i] < 60)
				letterGrade[i] = 'B';
			else
				letterGrade[i] = 'I';
		}

		return letterGrade;
	}

	// Calculate the average letter grade:
	public static char averageLetter(double totalAverage, int numScores)
	{
		char letterGrade = 'I';


		if(totalAverage >= 90 && totalAverage<= 100)
			letterGrade = 'A';
		else if(totalAverage >=80 && totalAverage <= 89)
			letterGrade = 'B';
		else if(totalAverage >=70 && totalAverage <= 79)
			letterGrade = 'C';
		else if(totalAverage >=60 && totalAverage <= 69)
			letterGrade = 'D';
		else if(totalAverage < 60)
			letterGrade = 'F';

		return letterGrade;
	}

	// Total the test scores:
	public static int totalTheTestScores(int[] testScores)
	{
		// Holds the total testScores.
		int totalTestScores = 0;

		for(int i = 0; i < testScores.length; i++)
		{
			// Accumulate the total test scores.
			totalTestScores += testScores[i];
		}

		// Return the total test scores to calling function.
		return totalTestScores;

	}

	public static double calcAvg(int testScoreCount, int totalTestScores)
	{
		// Variable to hold the average.
		double average = 0.0;

		// Calculate the average casting as a double so getting correct calculation.
		average = (double)totalTestScores / testScoreCount;

		// Return average to the calling function.
		return average;
	}
}