package com.christopheradams.chapter2notes;

// Import needed to be able to use Scanner class and get input from user:
import java.util.Scanner;

// Import allows us to have access to gui dialog messages and prompts:
import javax.swing.JOptionPane;

/*
	Christopher Adams
 	04/29/2016
 	Java examples in Chapter 2
*/

/**
	This is an example of a java doc comment that starts with /** and ents with * /
	This program explains concepts explained in chapter 2 of the text book.
*/

// Name the class the same as the .java filename:
public class JavaChapter2Part2StoringVariables
{
	public static void main(String[] args)
	{
		/************************** Storing Variables: *********************************/
		// Declare and initialize different types of variables:
		char myChar = 'a';
		int value = 5;
		double myDouble = 10.0567;
		float myFloat = 23.5F;
		int month = 2, days = 28;	// Can initialize like this too if all are integers.

		//Also common to declare multiple variables and comment them like below:
		int fahrenheit,		// To hold fahrenheit temp.
			celsius, 		// To hold celsius temp.
			kelvin;			// To hold Kelvin temp.

		System.out.println("Example of printing out a char: " + myChar);
		System.out.println("Example of printing out a int: " + value);
		System.out.println("Example of printing out a double: " + myDouble);
		System.out.println("Example of printing out a float: " + myFloat);
		System.out.println("");
		/************************** End Storing Variables: *********************************/

	}


}