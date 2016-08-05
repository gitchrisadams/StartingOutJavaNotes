package com.christopheradams.num005CombiningSentinelWithInputValidation;

import java.util.*;		// Keyboard input and other utilities.

public class CombiningSentinelWithInputValidation
{
	public static void main(String[]args)
	{
		int score;			// Test score.
		int total = 0;		// Accumulator.
		int count = 0;		// Count of scores entered.
		double average; 	// The average of test scores.

		// Create a Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Priming read, get the first score.
		System.out.print("Please enter the score and -1 to quit: ");
		score = keyboard.nextInt();

		// Continue to get gets scores while they are not equal to the sentinel.
		while(score != -1)
		{
			// Invalid range so get score again.
			if(score < 0 || score > 100)
			{
				System.out.print("Invalid score: " + score);
				System.out.println("Please enter value 0 - 100.");
			}
			else
			{
				// It was valid so add the score.
				total += score;

				// Increment count to keep track of number of scores.
				count++;
			}

			// Get the next score.
			System.out.print("Please enter the score and -1 to quit: ");
			score = keyboard.nextInt();
		}

		// Calculate and display the average test score.
		// Ensure not dividing by 0.
		if(count != 0)
		{
			average = (double)total / count;
			System.out.printf("The average is %.2f%n", average);
		}
		else
		{
			System.out.println("No scores entered.");
		}
	}
}