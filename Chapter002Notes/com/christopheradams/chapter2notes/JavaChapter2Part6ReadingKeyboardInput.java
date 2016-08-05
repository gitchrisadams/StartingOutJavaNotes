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
public class JavaChapter2Part6ReadingKeyboardInput
{
	public static void main(String[] args)
	{
		/*********************** Reading Keyboard input ***********************/
		// Create a new scanner object called keyboard
		Scanner keyboard = new Scanner(System.in);

		// Prompt user:
		System.out.print("Enter an integer value: ");

		// Store the input in an int:
		int number = keyboard.nextInt();
		System.out.println("");

		// Prompt user:
		System.out.print("Enter a Double value: ");

		// Store the input in a Double:
		double doubNumber = keyboard.nextDouble();
		System.out.println("");

		// Prompt user:
		System.out.print("Enter a String Value: ");


		// We prompted for primitive(nextDouble/nextInt) previously so we have to
		// consume the extra return so the nextLine actually works. We use an empty nextLine(); call
		// We have to do this when we read a int/double/primitive then want to read in a String.
		keyboard.nextLine();

		// Store the input in a String:
		String myStringInput = keyboard.nextLine();


		// Storing input as a char:
		char myCharInput = keyboard.next().charAt(0);

		// Display Output:
		System.out.println("The Integer you entered is: " + number);
		System.out.println("");
		System.out.println("The Double you entered is: " + doubNumber);
		System.out.println("");
		System.out.println("The String you entered is: " + myStringInput);
		System.out.println("");
		/*********************** End Reading Keyboard input ***********************/

		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);

	}


}