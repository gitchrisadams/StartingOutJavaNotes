package com.christopheradams.num010LotteryApplication;

/**
	Christopher Adams 7/11/16
	The Lottery Client demonstrates the Lottery class and simulates a lottery drawing.
*/

import java.util.*;

public class LotteryClient
{
	public static void main(String[]args)
	{
		// Variables:
		int numbersHit = 0;				// The number of winning numbers that were hit.
		int count = 0;					// Counter to keey track of number of drawings.

		// Create a Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Create an array to hold our lottery picks:
		int[] lotteryPicks = new int[6];

		// Get the lottery numbers from the user:
		System.out.println("Please enter your lottery number picks:");
		System.out.println("Enter 6 numbers in the range of 0 to 9 inclusive.");

		for(int i = 0; i < lotteryPicks.length; i++)
		{
			System.out.print("Enter pick number " + (i+1) + ": ");
			lotteryPicks[i] = keyboard.nextInt();
		}

		// Clear the output buffer:
		keyboard.nextLine();

		// Output message to user what the program will do.
		System.out.println("\nThis program will play the lottery until it hits all six numbers");
		System.out.println("When you hit the lottery it will tell you how many drawings it took to win.");
		System.out.println("This could take awhile! Hit enter when ready to start");
		keyboard.nextLine();

		// While the number is not the winning number, keep looping.
		while(numbersHit != 6)
		{
			// Create a new drawing object, which creates a new random number/drawing.
			Lottery drawing1 = new Lottery();

			// Increment the drawing counter.
			count += 1;

			// Variable to store the numbers hit in the drawing.
			numbersHit = drawing1.lotteryDrawing(lotteryPicks);

			// Display the numbers that we hit:
			System.out.println("You hit: " + numbersHit);

			// If we hit all 6 numbers, display message:
			if(numbersHit == 6)
			{
				System.out.println("\nYou won the Lottery! You know how rare that is?");
				System.out.printf("You went through %,d lottery drawings to hit it big.%n", count);
				System.out.println();
				System.out.printf("If you would have picked numbers once per day every day it would%n" +
					"have taken you %,d years to win the lottery in real life!.%n", (count / 365));

			}
		}
	}
}

/************************* Output **************************************
You hit: 1
You hit: 0
You hit: 1
You hit: 0
You hit: 2
You hit: 0
You hit: 0
You hit: 2
You hit: 0
You hit: 1
You hit: 0
You hit: 0
You hit: 1
You hit: 1
You hit: 0
You hit: 1
You hit: 1
You hit: 1
You hit: 0
You hit: 0
You hit: 0
You hit: 0
You hit: 2
You hit: 0
You hit: 1
You hit: 1
You hit: 1
You hit: 2
You hit: 0
You hit: 0
You hit: 6

You won the Lottery! You know how rare that is?
You went through 448,252 lottery drawings to hit it big.

If you would have picked numbers once per day every day it would
have taken you 1,228 years to win the lottery in real life!.
Press any key to continue . . .
************************************************************************/