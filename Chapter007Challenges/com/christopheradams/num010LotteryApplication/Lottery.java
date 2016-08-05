package com.christopheradams.num010LotteryApplication;

/**
	Christopher Adams 7/11/16
	The Lottery class simulates the drawing of a lottery.
*/

import java.util.*;			// For random number and other utilities.

public class Lottery
{
	// Create an array for the winning numbers:
	int[] winningLotteryNumbers = new int[6];

	/**
		Constructor
	*/
	public Lottery()
	{
		// Generate a new Random number object:
		Random randomNum = new Random();

		// Loop through winning numbers array and store a
		// random number in each array element.
		for(int i = 0; i < winningLotteryNumbers.length; i++)
		{
			winningLotteryNumbers[i] = randomNum.nextInt(10);
		}
	}

	/**
		The lotteryDrawing() method compars the user's picks to the winning numbers.
		@param lotteryPicks An array reference to the user's lottery picks.
		@return The numbers that match the winning lottery numbers.
	*/
	public int lotteryDrawing(int[] lotteryPicks)
	{
		int matchingNumbers = 0;			// The matching numbers.

		// Loop through the array of lottery picks.
		for(int i = 0; i < lotteryPicks.length; i++)
		{
			// Compare picks to the winning numbers.
			if(lotteryPicks[i] == winningLotteryNumbers[i])
			{
				// Matched a number so increment counter.
				matchingNumbers += 1;
			}
		}

		// Return the number of matching numbers.
		return matchingNumbers;
	}


	/**
		The getWinningLotteryNumbers() gets the winning lottery numbers.
		@return A reference to an array of the winning lottery numbers.
	*/
	public int[] getWinningLotteryNumbers()
	{
		return winningLotteryNumbers;
	}
}