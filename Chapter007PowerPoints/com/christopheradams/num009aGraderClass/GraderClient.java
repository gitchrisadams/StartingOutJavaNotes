package com.christopheradams.num009aGraderClass;

import java.util.*;

public class GraderClient
{
	public static void main(String[]args)
	{
		int numScores = 0;		// Holds the number of scores.

		// Create Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get number of scores.
		System.out.print("How many scores do you have? ");
		numScores = keyboard.nextInt();

		// Create an array to hold the test scores with number
		// that we received from the user as the number of array elements.
		double[] studentScores = new double[numScores];

		// Get the test scores from the user and store them in the studentScores array.
		for(int i = 0; i < studentScores.length; i++)
		{
			System.out.print("Please enter score " + (i+1) + ": ");
			studentScores[i] = keyboard.nextDouble();
		}

		// Create a new Grader object passing in our scores array to the Constructor.
		Grader myStud1 = new Grader(studentScores);

		// Display the average without the lowest score dropped off.
		System.out.println("Your adjusted average is: " + myStud1.getAverage());

		// Display the lowest score.
		System.out.println("Your lowest score we dropped of is: " + myStud1.getLowestScore());


	}
}


/************************** Output ****************************
How many scores do you have? 3
Please enter score 1: 100
Please enter score 2: 200
Please enter score 3: 300
Press any key to continue . . .
****************************************************************/