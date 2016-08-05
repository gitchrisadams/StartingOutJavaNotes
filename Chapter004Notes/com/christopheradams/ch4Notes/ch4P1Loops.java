package com.christopheradams.ch4Notes;
// Import statements:
import java.util.Scanner;			// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	5/03/2016
	While Loops
*/


public class ch4P1Loops
{
	public static void main(String[] args)
	{
		/**** While Loop: ****/
		// Declare a counters:
		int number = 1;

		while(number <= 5)
		{
			System.out.println("Hello " + number);
			// Increment counter: (post increment) but could use either in this case.
			number++;
		}
		System.out.println("");
		/**** End While Loop ****/


		/***** Using While Loop for Input Validation *****/
		// Get input via gui dialog:
		String input = JOptionPane.showInputDialog("Enter a number in the range of 1 through 100.");

		// Convert String input to an integer:
		number = Integer.parseInt(input);

		// While number is less than 1 and greater than 100(Out of range),
		// keep getting the number:
		while(number < 1 || number > 100)
		{
			input = JOptionPane.showInputDialog("Invalid input. Enter a number in the range of " +
												"1 through 100.");

			// Convert String number to an integer:
			number = Integer.parseInt(input);
		}
		/***** End Using While Loop for Input Validation *****/



		/***** Do While Loop Example *****/
		int x = 1;

		// do while loop will always execute at least once:
		do
		{
			System.out.println("The Do while loop printed this at least once: " + x);
		} while (x < 0);



		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);
	}

}