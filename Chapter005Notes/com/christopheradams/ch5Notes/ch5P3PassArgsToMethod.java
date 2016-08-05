package com.christopheradams.ch5Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.
import java.io.*;						// Used for reading and writing to a file.
import java.util.Random;				// For generating random numbers.

/*
	Christopher Adams
	5/03/2016
	Passing Arguments to a method.
*/


public class ch5P3PassArgsToMethod
{
	// We add throws IOException since we are writing to a file and this is needed for error handling.
	public static void main(String[] args) throws IOException
	{
		// Create/initialize variables:
		int numToPass = 10;
		double doubleToPass = 20.0;
		String stringToPassIn = "Yayy I'm a string";

		// Display message that we are going to pass values to displayValue method:
		System.out.println("I am going to pass values to displayValue() method.\n");

		// Pass things to the method:
		displayValue(5);							// Pass a literal 5
		displayValue(numToPass);					// Pass our x variable which is 10
		displayValue(numToPass*4);					// Pass our variable 10 multiplied by 4
		displayValue(Integer.parseInt("700"));		// Pass String "700" parsed to an Int 700

		// Pass a value to our method with same name that accepts and int and a double:
		displayValue(numToPass, doubleToPass);
		System.out.println();

		// Pass a string value by reference to our String method:
		displayStringValue(stringToPassIn);

		// Display message to indicate being back in main:
		System.out.println("Now I am back in main");
	}



		/**
			The displayValue method displays the value that is passed to it.
		*/
		public static void displayValue(int num)
		{
			System.out.println("The value is " + num);
		}


		/**
			The displayValue method that accepts 2 parameters:
		*/
			public static void displayValue(int num, double num2)
			{
				System.out.println("The value is " + num + "\n");
				System.out.println("The value is " + num2 + "\n");
			}


		/**
			The displayStringValue method accepts a string by reference:
		*/
			public static void displayStringValue(String stringToDisplay)
			{
				System.out.println("The string you passed in is " + stringToDisplay + "\n");
			}


}