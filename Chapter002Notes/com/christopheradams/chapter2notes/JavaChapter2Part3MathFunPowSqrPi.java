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
public class JavaChapter2Part3MathFunPowSqrPi
{
	public static void main(String[] args)
	{
		/************************ Math Functions: Exponent, Square root, PI ************************/
		// Calculating the power of a number with Math.pow:
		// It returns the result as a double:
		double myNumPow = Math.pow(4.0, 2.0);
		System.out.println("4 to a power of 2 is: " + myNumPow);
		System.out.println("");


		// Calculating square root, Can also just print out like this:
		System.out.println("The Square root of 25 is: " + Math.sqrt(25.0));
		System.out.println("");


		//Calculating PI with the Math.PI named constant:
		double myPI = Math.PI * 10 * 10;
		System.out.println("Example of calculating pi * 10 * 10 is: " + myPI);
		System.out.println("");

		/************************ End Math Functions: Exponent, Square root, PI ************************/

		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);

	}


}