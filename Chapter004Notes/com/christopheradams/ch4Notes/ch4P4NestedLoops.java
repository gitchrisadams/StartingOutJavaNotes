package com.christopheradams.ch4Notes;
// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	5/03/2016
	Nested For Loops
*/


public class ch4P4NestedLoops
{
	public static void main(String[] args)
	{
//		/***** Nested Loop example: A clock *****/
//		Scanner keyboard = new Scanner(System.in);
//
//		for (int hours = 1; hours <= 1; hours++)
//		{
//			System.out.println("Inside the first/Hours for loop\n");
//
//			for(int minutes = 0; minutes <= 59; minutes++)
//			{
//				System.out.println("Inside the second/minutes for loop\n");
//
//				for(int seconds = 0; seconds <= 59; seconds++)
//				{
//					System.out.println("Inside the third/seconds for loop\n");
//					System.out.printf("%2d:%02d:%02d \n", hours, minutes, seconds);
//
//					// Uncomment the below to make it so you have to hit enter each time
//					// that the time is displayed. So you can see output better.
//					// Warning, it takes a long time!!
//					//keyboard.nextLine();
//
//				}
//			}
//		}
//		/***** Nested Loop example: A clock *****/



		/***** Printing out patterns with Nested Loops *****/
		// Printing out a series of asterisks ******
		final int COLS = 6;
		for(int col = 0; col < COLS; col++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.println();


		/***** Printing out a rectangle of asterisks: *****/
		final int ROWS = 8;
		for (int row = 0; row < ROWS; row++)
		{
			for(int col = 0; col < COLS; col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}


		/***** Triangle Pattern *****/
		// Base of our Triangle:
		final int BASE_SIZE = 8;

		// Start at 0 and loop while r is less than 8:
		for(int r = 0; r < BASE_SIZE; r++)
		{
			// Inner Loop while c is less than outter Loop counter plus 1:
			for(int c = 0; c < (r+1); c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}


		/***** Printing a StairStepPattern *****/
		final int NUM_STEPS = 6;

		// Outter for loop while r is less than NUM_STEP(In this case 6):
		for (int r = 0; r < NUM_STEPS; r++)
		{
			// Inner Loop while c less than r counter from outter loop.
			// Print an empty space.
			for(int c = 0; c < r; c++)
			{
				System.out.print(" ");
			}
			// Back to outter loop print a # character:
			System.out.println("#");
		}
		/***** Printing a StairStepPattern *****/


		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);
	}

}