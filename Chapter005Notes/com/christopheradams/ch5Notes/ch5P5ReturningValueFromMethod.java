package com.christopheradams.ch5Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.
import java.io.*;						// Used for reading and writing to a file.
import java.util.Random;				// For generating random numbers.

/*
	Christopher Adams
	5/03/2016
	Returning a value from a method.
*/


public class ch5P5ReturningValueFromMethod
{
	// We add throws IOException since we are writing to a file and this is needed for error handling.
	public static void main(String[] args) throws IOException
	{
		/**************** Returning an int method calls ****************/
		// Create/initialize variables:
		int myInt1 = 5;
		int myInt2 = 6;
		int total;

		// Pass two int values or variables to our function to add them
		// and store the result in variable total.
		total = addMyInts(myInt1, myInt2);

		// We could also just call the method right from System.out.println():
		// Passing in int literals 10 and 10 instead of a variable:
		System.out.println("The total of your two numbers is " + addMyInts(10, 10) + ".\n");

		// Display our total:
		System.out.println("The value of " + myInt1 + " and " + myInt2 + " is " + total + ".\n");
		/**************** End Returning an int method calls ****************/



		/***** Returning a Boolean Value method call *****/
		// Create an int for our number to test:
		// Change to 1-100 range to produce true result. (Now set to out of range)
		int value = 101;

		// Pass value to function that tests if number is in range of 1 to 100:
		// If returned value is true do first statement else do second statement.
		if(isValid(value))
		{
			System.out.println("The value is within range\n");
		}
		else
		{
			System.out.println("The value is out of range.\n");
		}
		/***** Returning a Boolean Value method call *****/



		/***** Returning a String method call *****/
		// Create variables to pass in by reference:
		String customerName;

		// Call our string method passing in the full name and
		// storing it in variable customerName.
		customerName = fullName("Christopher", "Adams");

		// Print out our full name:
		System.out.println("Your full name is " + customerName + ".\n");
		/***** Returning a String method call *****/
	}



	/**************** Returning an int method definition ****************/
	// Notice we use the @parm and @return in the java doc comments.
	/**
		The displayStringValue returns the sum of two integers passed in.
		@param num1 The first int we will add.
		@param num2 The second int we will add.
		@return The sum of num1 and num2.
	*/
	// Notice the public static int. The int is our return type.
	public static int addMyInts(int num1, int num2)
	{
		// Create variable to store two numbers totaled:
		int result;

		// Assign the value of num1 + num2 to result:
		result = num1 + num2;

		// Return our result to calling function:
		return result;
	}
	/**************** End Returning an int method definition ****************/



	/***** Returning a Boolean Value method definition *****/
	/**
		The isValid returns whether our int value passed in is valid, true or false.
		@parm num1 The number to test for validity.
		@return The status as true or false.
	*/
	public static boolean isValid(int number)
	{
		// Create variable to hold our boolean value:
		boolean status;

		// If number is within range, then return true.
		if(number > 1 && number <= 100)
		{
			status = true;
		}
		else
		{
			status = false;
		}

		// Return status of either true or false.
		return status;
	}
	/***** Returning a Boolean Value method definition *****/



	/***** Returning a String reference method definition *****/
	/**
		The fullName accepts two strings for a person's first and last name.
		It concatenates them into a single String object.
		@parm first The first name.
		@parm last The last name.
		@return A reference to a String object containing the first and last names together.
	*/
	public static String fullName(String first, String last)
	{
		// Declare varibale to hold the full name:
		String name;

		// Concatenate the two names into one:
		name = first + " " + last;

		// Return the name to calling function:
		return name;
	}
}