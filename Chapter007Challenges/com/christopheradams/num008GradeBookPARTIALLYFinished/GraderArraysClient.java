package com.christopheradams.num008GradeBookPARTIALLYFinished;

import java.util.*;

public class GraderArraysClient
{
	public static void main(String[]args)
	{
		// Variables:
		int positionNameFound = -1;				// Position in array name is found.
		double averageTestScore = 0.0;			// The average of the test scores.
		char letterGrade;						// Letter grade based on the average.

		// Create a Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Create an array for holding the student names.
		String[] studentNames = new String[5];

		// Create a new array with test scores:
		double[] testScores = new double[4];

		// Get the student names from the user and store in an array:
		for(int i = 0; i < studentNames.length; i++)
		{
			System.out.print("Enter the name of student " + (i+1) + ": ");
			studentNames[i] = keyboard.nextLine();
		}

		// Get the test scores for each student:
		for(int i = 0; i < studentNames.length; i++)
		{
			System.out.println("Enter 4 scores for " + studentNames[i] + ": ");
			for(int j = 0; j < testScores.length; j++)
			{
				System.out.print("Enter score " + (j+1) + ": ");
				testScores[j] = keyboard.nextDouble();
			}
			System.out.println();
		}

		// Create a new GraderArray object:
		GraderArrays student1 = new GraderArrays(studentNames, testScores);

		// Find the index number a name is located at:
		positionNameFound = student1.getStudentName("Chris");

		averageTestScore = student1.avgTestScore();

		letterGrade = student1.calcAverageLetterGrade(averageTestScore);

		System.out.println("The average test scores:" + averageTestScore);

		System.out.println("The letter grade: " + letterGrade);




	}
}