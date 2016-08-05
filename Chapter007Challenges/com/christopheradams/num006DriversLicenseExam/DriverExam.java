package com.christopheradams.num006DriversLicenseExam;

public class DriverExam
{
	// Fields:
	// Create an array that holds the correct answers to
	// a drivers license exam test.
	private char[] correctAnswers = {'B', 'D', 'A', 'A', 'C',
							 		 'A', 'B', 'A', 'C', 'D',
							 		 'B', 'C', 'D', 'A', 'D',
							 		 'C', 'C', 'B', 'D', 'A'};

	// Create an array to store the students answers the length of the
	// correct answers array.
	private char[] studentAnswers = new char[correctAnswers.length];


	/**
		The passed() method calculates if the Driver has passed the test.
		@param totalCorrect The total number of correct answers.
		@return The flag of whether the person has passed the test or not.
	*/
	public boolean passed(int totalCorrect)
	{
		// Boolean to tell whether Driver passed or not.
		boolean hasPassed = false;

		if(totalCorrect >= 15)
			hasPassed = true;

		// Return the boolean to calling method.
		return hasPassed;
	}

	/**
		The checkAnswers() method calculates the total correct answers.
		@param answersToCheck A reference to an array of the answers to check.
		@return The total number of correct answers.
	*/
	public int checkAnswers(char[] answersToCheck)
	{
		// Validate the questions length and answers length are the same.
		if(answersToCheck.length != correctAnswers.length)
		{
			System.out.println("Sorry, more questions than answers! Check your questions length." +
				" Exiting the program");
			System.exit(0);
		}

		// For storing the total correct answers.
		int totalCorrectAns = 0;

		// Loop through the array and compare the answer to the correct one.
		for(int i = 0; i < answersToCheck.length; i++)
		{
			if(answersToCheck[i] == correctAnswers[i])
			{
				// Accumulate the total of the correct answers.
				totalCorrectAns += 1;
			}
		}

		// Return the number of correct answers.
		return totalCorrectAns;
	}

	/**
		The totalIncorrect() method calculates the total incorrect answers.
		@param answersToCheck A reference to an array of the answers to check.
		@return The total number of incorrect answers.
	*/
	public int totalIncorrect(char[] answersToCheck)
	{
		// Validate the questions length and answers length are the same.
		if(answersToCheck.length != correctAnswers.length)
		{
			System.out.println("Sorry, more questions than answers! Check your questions length." +
				" Exiting the program");
			System.exit(0);
		}

		// For storing the total incorrect answers.
		int totalincorrectAns = 0;

		// Loop through the array and compare the answer to the correct one.
		for(int i = 0; i < answersToCheck.length; i++)
		{
			if(answersToCheck[i] != correctAnswers[i])
			{
				// Accumulate the total of the incorrect answers.
				totalincorrectAns += 1;
			}
		}

		// Return the number of incorrect answers.
		return totalincorrectAns;
	}


	public int[] questionsMissed(char[] answersToCheck)
	{
		// Validate the questions length and answers length are the same.
		if(answersToCheck.length != correctAnswers.length)
		{
			System.out.println("Sorry, more questions than answers! Check your questions length." +
				" Exiting the program");
			System.exit(0);
		}

		// For storing the total incorrect answers.
		int totalincorrectAns = 0;

		// Loop through the array and compare the answer to the correct one.
		for(int i = 0; i < answersToCheck.length; i++)
		{
			if(answersToCheck[i] != correctAnswers[i])
			{
				// Accumulate the total of the incorrect answers.
				totalincorrectAns += 1;
			}
		}

		// Create an array the length of the incorrect answers:
		int[] incorrectNumsArray = new int[totalincorrectAns];

		// Counter to keep track of incorrect index.
		int inCorrectCounter = 0;

		// Loop through the array and compare the answer to the correct one again.
		// This time storing the number that was wrong in an array.
		for(int i = 0; i < answersToCheck.length; i++)
		{
			if(answersToCheck[i] != correctAnswers[i])
			{
				// Add 1 because we want question number not array number.
				incorrectNumsArray[inCorrectCounter] = i + 1;
				inCorrectCounter++;
			}
		}

		return incorrectNumsArray;
	}
}