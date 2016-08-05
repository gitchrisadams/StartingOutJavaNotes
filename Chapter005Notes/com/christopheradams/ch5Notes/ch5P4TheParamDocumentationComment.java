package com.christopheradams.ch5Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.
import java.io.*;						// Used for reading and writing to a file.
import java.util.Random;				// For generating random numbers.

/*
	Christopher Adams
	5/03/2016
	The @param comment
*/


public class ch5P4TheParamDocumentationComment
{
	// We add throws IOException since we are writing to a file and this is needed for error handling.
	public static void main(String[] args) throws IOException
	{
		// Create/initialize variables:
		String stringToPassIn1 = "Yayy I'm a string";
		String stringToPassIn2 = "Great, another one";

		// Pass a string value by reference to the String method:
		displayStringValue(stringToPassIn1, stringToPassIn2);
	}

		/**************** Notice we used the @param doc comment ****************/
		/**
			The displayStringValue method accepts a string by reference:
			@param stringToDisplay1 The first number we will display.
			@param stringToDisplay2 The second number we will display.
		*/
			public static void displayStringValue(String stringToDisplay1, String stringToDisplay2)
			{
				System.out.println("The string you passed in is: " + stringToDisplay1 + "\n");
				System.out.println("The string you passed in is: " + stringToDisplay2 + "\n");
			}

		/**************** End Notice we used the @parm doc comment ****************/
}