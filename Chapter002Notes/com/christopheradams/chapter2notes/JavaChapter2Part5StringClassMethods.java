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
public class JavaChapter2Part5StringClassMethods
{
	public static void main(String[] args)
	{
		/***************** String Class Methods: *****************/
		// Declare/init a string variable:
		String myTestString = "aBcDeFgHiJkLmNoPqRsTuVwXyZ";


		// Output the length of our string containing the alphabet:
		System.out.println(myTestString.length());
		System.out.println("");


		// Get the char at a specific location: (In this case displays the 'b' char)
		System.out.println(myTestString.charAt(1));
		System.out.println("");


		// toLowerCase() and toUpperCase():
		System.out.println("Before converting to lowercase:\n" + myTestString + "\n");
		System.out.println("After Converting to lowercase: \n" + myTestString.toLowerCase() + "\n");
		System.out.println("After Converting to Uppercase: \n" + myTestString.toUpperCase() + "\n");
		System.out.println("");
		/***************** End String Class Methods: *****************/

		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);

	}


}