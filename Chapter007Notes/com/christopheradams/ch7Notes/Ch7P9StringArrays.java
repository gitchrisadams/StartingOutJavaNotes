package com.christopheradams.ch7Notes;

import java.util.Scanner;		// So we can get input from the user.

/*
	Christopher Adams
	5/9/2016
	String Arrays.
*/

public class Ch7P9StringArrays
{
	public static void main(String[] ars)
	{
		// Create String arrays:
		String[] names = {"Chris", "Ann-marie", "Kenzie"};

		// Can also create a String array without initializing but
		// you need to add the new word, just like other datatypes.
		final int SIZE = 4;
		String[] names2 = new String[SIZE];

		// You must initialize a String array before it can be used:
		names2[0] = "Christopher";
		names2[1] = "Christonator";
		names2[2] = "CHrisORama";
		names2[3] = "Chrisssss";

		// Output example
		System.out.println("The names2[0] element contains: " + names2[0] + "\n");


		/***** The toUpper String array method *****/
		System.out.println("The names2[1] element output with toUppercase is: " +
							names2[1].toUpperCase() + "\n");
		/***** End The toUpper String array method *****/


		/**** The charAt String array method *****/
		// Declare a char variable:
		char letter1;

		// Assign first character in names2[3] array to char variable letter.
		letter1 = names2[3].charAt(0);
		System.out.println("The first letter stored in names2[3] array is: " +
							letter1 + "\n");
		/**** End The charAt String array method *****/


	}
}