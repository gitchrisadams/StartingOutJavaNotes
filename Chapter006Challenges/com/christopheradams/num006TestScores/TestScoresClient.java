package com.christopheradams.num006TestScores;

import java.util.*;

public class TestScoresClient
{
	public static void main(String[]args)
	{
		// Variables:
		int testScore1 = 0;
		int testScore2 = 0;
		int testScore3 = 0;
		int total = 0;
		double average = 0.0;

		// Constants:
		final int NUM_SCORES = 3;

		// Create a Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Get the scores from the user:
		System.out.println("Enter three test scores:");
		System.out.print("Enter score 1: ");
		testScore1 = keyboard.nextInt();
		System.out.print("Enter score 2: ");
		testScore2 = keyboard.nextInt();
		System.out.print("Enter score 3: ");
		testScore3 = keyboard.nextInt();

		// Create a new test scores object.
		TestScores test1 = new TestScores(testScore1, testScore2, testScore3);

		total = test1.calcTotal(testScore1, testScore2, testScore3);

		average = test1.calcAvg(total, NUM_SCORES);

		System.out.println("\nThe total of all scores is: " + total);
		System.out.println("\nThe average of all the scores is: " + average);


	}
}