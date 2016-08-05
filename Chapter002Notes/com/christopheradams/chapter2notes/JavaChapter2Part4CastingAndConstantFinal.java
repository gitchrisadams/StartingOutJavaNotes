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
public class JavaChapter2Part4CastingAndConstantFinal
{
	public static void main(String[] args)
	{
		/******************** Casting data types to another type: ************************/
		// Create a float:
		float myFloatToConvert = 12.0F;

		// Display float before conversion:
		System.out.println("My float before conversion is: " + myFloatToConvert);

		// Convert to an int:
		int myFloatConvertedToInt = (int)myFloatToConvert;

		// Display after conversion:
		System.out.println("My float converted to an int is: " + myFloatConvertedToInt);
		System.out.println("");
		/******************** End Casting data types to another type: ************************/


		/********************* Method for converting Strings to numbers *********************/
		String myDialogInput = "10099";

		// Converts string to an int and stores in new int variable:
		int numForCovertedStr = Integer.parseInt(myDialogInput);

		// To converted number is an int, we add one to it and output result:
		System.out.println("Your number + 1 = " + (numForCovertedStr + 1) + "\n");
		/********************* End Method for converting Strings to numbers *********************/


		/*********** Coverting an Integer to a String ***********/
		int myIntToConvToString = 115;
		String myStringConvFromInt = Integer.toString(myIntToConvToString);
		System.out.println("My int is now converted to a string:" + myStringConvFromInt + "\n");
		/*********** End Coverting an Integer to a String ***********/


		// Creating Constants with final:
		final double INTEREST_RATE = .069;
		System.out.println("Constant example with final keyword: " + INTEREST_RATE);
		System.out.println("");

		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);

	}


}