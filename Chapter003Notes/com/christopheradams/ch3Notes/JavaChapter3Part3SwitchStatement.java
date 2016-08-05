package com.christopheradams.ch3Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	04/29/2016
	Java Chapter 3 Examples
*/

/**
	This is an example of a java doc comment that starts with /** and ents with * /
	This program explains concepts explained in chapter 3 of the text book.
*/

// Name Class same as the .java file name:
public class JavaChapter3Part3SwitchStatement
{
	public static void main(String[] args)
	{
		/********************************* The Switch Statement *********************************/
		//Create variables:(Uncomment other months to use different data)
		//String month = "January";
		//String month = "Whatever month";
		String month = "April";

		// Decision is based on the string month:
		switch(month)
		{
			// Is the month "April"?
			case "April":
				System.out.println("The month is April.\n");
				break;

			// Is the month "January"?
			case "January":
				System.out.println("The month is January.\n");
				break;

			// If month is anything else Besides April or January, print default statement.
			default:
				System.out.println("Not sure what month it is to be honest");
				break;
		}

		/********************************* End The Switch Statement *********************************/

		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);

	}
}