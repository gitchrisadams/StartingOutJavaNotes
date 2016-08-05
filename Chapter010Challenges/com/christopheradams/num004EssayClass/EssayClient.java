package com.christopheradams.num004EssayClass;

public class EssayClient
{
	public static void main(String[]args)
	{
		// Variables:
		double grammarPoints = 20;
		double spellingPoints = 35;
		double correctLengthPoints = 20;
		double contentPoints = 20;

		// Create a new Essay object:
		Essay essay1 = new Essay(grammarPoints, spellingPoints,
			correctLengthPoints, contentPoints);

		// Set the score in the GradedActivity class with the score
		// in the total score in the field in the Essay class.
		essay1.setScore(essay1.getTotalScore());

		// Get the letter grade from the GradedActivity class:
		System.out.println("Your grade on the essay: " + essay1.getGrade());




	}
}