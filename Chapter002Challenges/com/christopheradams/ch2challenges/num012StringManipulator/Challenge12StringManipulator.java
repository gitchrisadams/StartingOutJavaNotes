package com.christopheradams.ch2challenges.num012StringManipulator;

// Used for getting input and other utility tasks.
import java.util.Scanner;

/*
	Christopher Adams
	5/13/2016
	String Manipulator:
*/

/*
	This program gets input from the user for their favorite city.
	The program will then display the following:
	1. Number of characters in the city name.
	2. The name of the city in all uppercase letters.
	3. The name of the city in all lowercase letters.
	4. The first character in the name of the city.
*/


public class Challenge12StringManipulator
{
	public static void main(String[]args)
	{
		//String variable to hold favorite city.
		String favCity = "";

		// Create a scanner for input:
		Scanner keyboard = new Scanner(System.in);

		// Prompt the user for input:
		System.out.print("What is your favorite city? >>>");
		favCity = keyboard.nextLine();

		// Print out the number of characters in the city.
		System.out.println("Your favorite city has " + favCity.length() +
							" characters in its name.\n");

		// Print out the name of the city in all uppercase.
		System.out.println("The name of the city in all upper case is: " +
							favCity.toUpperCase() + "\n");

		// Print out the name of the city in lowercase.
		System.out.println("The name of the city in all lowercase is: " +
							favCity.toLowerCase() + "\n");

		// Print out the first character in the name of the city.
		System.out.println("The first character in your city is: " +
							favCity.charAt(0) + "\n");
	}
}