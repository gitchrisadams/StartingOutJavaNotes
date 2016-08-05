package com.christopheradams.num006DriversLicenseExam;

import java.util.*;

public class DriverExampClient
{
	public static void main(String[]args)
	{
		// Variables:
		int totalCorrectAnswers;			// The total number of correct answers.
		int totalIncorrectAnswers;			// The total number of incorrect answers.
		boolean hasPassed;					// Whether person has passed the test.

		// Constants:
		final int NUM_ANSWERS = 20;			// The number of answers in the array.

// Uncomment for testing with data.
//		// Create an array with exam answers:
//		char[] exam1Answers = {'B', 'D', 'A', 'A', 'C',
//							   'A', 'B', 'A', 'C', 'D',
//							   'B', 'C', 'C', 'C', 'C',
//							   'C', 'C', 'C', 'C', 'A'};

		// Create an array for the exam answers:
		char[] exam1Answers = new char[NUM_ANSWERS];

		// Create a new Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Initial prompt to user.
		System.out.println("Please enter only A, B, C, or D.");

		// A char for the raw input from the user.
		char rawChar;

		// Get the test scores from the user.
		for(int i = 0; i < exam1Answers.length; i++)
		{
			// Prompt the user.
			System.out.print("Answer to question " + (i + 1) + ": ");

			// Get the keyboard input.
			rawChar = keyboard.next().charAt(0);

			// Convert the char to uppercase then store it in the array.
			rawChar = Character.toUpperCase(rawChar);
			exam1Answers[i] = rawChar;

			// While the answer is not A, B, C, or D, keep prompting for input.
			while(exam1Answers[i] != 'A' && exam1Answers[i] != 'B' && exam1Answers[i] != 'C' && exam1Answers[i] != 'D')
			{
				System.out.println("Invalid entry, please only enter A, B, C, or D:");
				System.out.print("Answer to question " + (i + 1) + ": ");

				// Get input from the user.
				rawChar = keyboard.next().charAt(0);

				// Covert to uppercase then store in the array.
				rawChar = Character.toUpperCase(rawChar);
				exam1Answers[i] = rawChar;
			}
		}

		// Create an array reference for the wrong answers.
		int[] answersMissedArray;

		// Create an array to store the wrong answers:
		int[] incorrectNumbers = new int[exam1Answers.length];

		// Create a Driver Exam object.
		DriverExam exam1 = new DriverExam();

		/************ Make calculations and process data: *****************/
		// Calulate the total correct answers.
		totalCorrectAnswers = exam1.checkAnswers(exam1Answers);

		// Calculate the total incorrect answers.
		totalIncorrectAnswers = exam1.totalIncorrect(exam1Answers);

		// Find out if the person has passed.
		hasPassed = exam1.passed(totalCorrectAnswers);

		// Calculate what numbers the person got wrong.
		answersMissedArray = exam1.questionsMissed(exam1Answers);

		/*********************** Display Output: *************************/
		// Display whether the person passed the test or not.
		if(hasPassed)
			System.out.println("\nYou passed! Congrats!\n");
		else
			System.out.println("\nYou failed! Better luck next time. :(\n");

		// Display how many the person got right and wrong.
		System.out.println("You got " + totalCorrectAnswers + " right!\n");
		System.out.println("You got " + totalIncorrectAnswers + " wrong.\n");

		// Display the numbers the person got wrong.
		System.out.println("\nQuestion numbers that you missed:");
		for(int i = 0; i < answersMissedArray.length; i++)
			System.out.println(answersMissedArray[i]);
	}
}