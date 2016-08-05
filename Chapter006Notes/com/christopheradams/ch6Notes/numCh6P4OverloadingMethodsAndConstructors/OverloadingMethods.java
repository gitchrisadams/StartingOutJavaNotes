package com.christopheradams.ch6Notes.numCh6P4OverloadingMethodsAndConstructors;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	05/09/2016
	Overloading methods examples.
*/


public class OverloadingMethods
{
	public static void main(String[] args)
	{
		// Call our method that adds two integers:
		int myAddedNums = add(5,6);

		// Call our method with same name that is overloaded that
		// concatenates two strings passed in.
		String myConcatenatedString = add("This String is added", " to this string");

		System.out.println("The integer added by add(5,6) call is: " + myAddedNums + "\n");

		System.out.println("The String concatenated by add(string1,string2) is: "
							+ myConcatenatedString + "\n");

		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);
	}

	/********* Examples of two overloaded methods *********/
	/**
		The add method adds two integer values passed in.
		@parm num1 The first number to add.
		@parm num2 The second number to add.
		@return sum The total sum.
	*/
	public static int add(int num1, int num2)
	{
		int sum = num1 + num2;
		return sum;
	}

	// Notice the below method has same method name but now we are
	// passing in strings, so this method is overloaded.
	/**
		The add method concatenates two strings.
		@parm str1 The first string to concatenate.
		@parm str2 The second string to concatenate.
		@return combined The combined string.
	*/
	public static String add(String str1, String str2)
	{
		String combined = str1 + str2;
		return combined;
	}

}