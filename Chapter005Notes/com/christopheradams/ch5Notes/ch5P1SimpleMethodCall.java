package com.christopheradams.ch5Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.
import java.io.*;						// Used for reading and writing to a file.
import java.util.Random;				// For generating random numbers.

/*
	Christopher Adams
	5/03/2016
	Methods
*/


public class ch5P1SimpleMethodCall
{
	/***** Example of a Simple Method call *****/
	// We add throws IOException since we are writing to a file and this is needed for error handling.
	public static void main(String[] args) throws IOException
	{
		// Display Hello from the main method:
		System.out.println("Hello from the main() method. I'll be back!");

		// Call function to displayMessage():
		displayMessage();

		// Display Hello from the main method:
		System.out.println("Hello from the main() method, we are back!.");


	// Causes program to properly end. Required if use JOptionPane class:
	System.exit(0);
	}

	/**
		The displayMessage method displays a greeting.
	*/
	public static void displayMessage()
	{
		System.out.println("Hello from inside the displayMessage() method.");
	}

}