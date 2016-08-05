package com.christopheradams.ch4Notes;
// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	5/03/2016
	While Loops
*/


public class ch4P2ForLoops
{
	public static void main(String[] args)
	{
		/***** For Loop *****/
		for (int count = 1; count <=5; count++)
		{
			System.out.println("Hello " + count);
		}
		/***** End For Loop *****/



		/***** User Controlled For Loop *****/
		// Count control variable.
		int number;

		// Max value we will loop up to.
		int maxValue;

		// Create scanner object for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Prompt user and get input of how high we should loop:
		System.out.println("How high Should I go?");
		maxValue = keyboard.nextInt();

		// Display heading of the table:
		System.out.println("Number Number Squared");
		System.out.println("----------------------");

		// Loop to maxValue starting at 1:
		for(number = 1; number <= maxValue; number++)
		{
			// Print out number and number mult by number separated by a tab:
			System.out.println(number + "\t\t" + number * number);
		}
		System.out.println("");
		System.out.println("");
		/***** User Controlled For Loop *****/


		/***** Multiple Statements in Update and Initialize in a for loop *****/
		// Declare 2 int variables:
		int x, y;

		for(x = 1, y = 1; x <=5; x++, y++)
		{
			// x and y are both incremented so we can add 1 plus 1 and 2 plus 2 etc...
			System.out.println(x + " plus " + y + " equals " + (x + y));
		}


		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);
	}

}