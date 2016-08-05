package com.christopheradams.ch4Notes;
// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.
import java.io.*;						// Used for reading and writing to a file.
import java.util.Random;				// For generating random numbers.

/*
	Christopher Adams
	5/03/2016
	Generating Random Numbers
*/


public class ch4P6RandomNumbers
{
	// We add throws IOException since we are writing to a file and this is needed for error handling.
	public static void main(String[] args) throws IOException
	{

	/***** Generate Random Number *****/
	// Declare and int variable:
	int number;

	// Create Random object:
	// This creates a reference to a random object that we can then use
	// to generate a random number.
	// You only want one of these in your program.
	// To create as many random numbers as you want.
	Random randomNumber = new Random();

	// This generates a random number between -2,147,483,648 and +2,147,483,647
	// The random number is stored in the int variable number.
	number = randomNumber.nextInt();

	// Output randon number:
	System.out.println("The Random number between -2,147,483,648 and +2,147,483,647 is" + number);
	System.out.println();
	/***** End Generate Random Number *****/



	/***** To generate a number between 0 and 99: *****/
	// Assign random number between 0 and 99 to variable number1To99
	// To make this from 1 to 100 do this: randomNumbers.nextInt(100) + 1;
	int number1To99 = randomNumber.nextInt(100);

	// Output the random number:
	System.out.println("The random number between 0 and 99 is: " + number1To99);
	System.out.println();
	/***** End To generate a number between 0 and 99: *****/

	/******** Generate a random number between 1 and 6 *******/
	int num1to6 = randomNumber.nextInt(6) + 1;

	System.out.println("The random Num 1 to 6 is: " + num1to6 + "\n");
	/******** End Generate a random number between 1 and 6 *******/


	/***** Generate random number between -50 and +49 *****/
	// Assign random number to 100 but subtract -50 so the range is
	// -50 to +49.
	int numNegToPos = randomNumber.nextInt(100)- 50;

	// Output the random number:
	System.out.println("The random number between -50 and +49 is: " + numNegToPos);
	System.out.println();
	/***** End Generate random number between -50 and +49 *****/



	/***** Create a random number that is a double: *****/
	// Assign the next random number to our double variable:
	double doubleNumNegToPos = randomNumber.nextDouble();

	// Output our random as a double:
	// Will be in range of between 0.0 and 1.0:
	System.out.println("The random Double 0.0 and 1.0: " + doubleNumNegToPos);
	System.out.println();
	/***** Create a random number that is a double: *****/

	// Causes program to properly end. Required if use JOptionPane class:
	System.exit(0);
	}

}