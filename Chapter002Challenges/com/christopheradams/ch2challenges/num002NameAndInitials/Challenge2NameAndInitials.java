package com.christopheradams.ch2challenges.num002NameAndInitials;

/*
	Christopher Adams
	5/21/16
	Name and Intials Challenge number 2
	The program will store my first, middle and last name as type String.
	The program will store first, middle, and last name initials as type char.
	Display the contents these variables on the screen.
*/


public class Challenge2NameAndInitials
{
	public static void main(String[]args)
	{
		// Create variables:
		String firstStr = "Christopher";			// Store my first name.
		String middleStr = "Michael";				// Store my middle name.
		String lastStr = "Adams";					// Store my last name.
		char firstChar = 'C';						// Store first name initial.
		char middleChar = 'M';						// Store middle name initial.
		char lastChar = 'A';						// Store last name initial.

		// Output my full name and my initials.
		System.out.println("My name is " + firstStr + " " + middleStr + " " + lastStr + ".");
		System.out.println("My initials are " + firstChar + "" + middleChar + "" + lastChar + ".");
	}
}
/******************** OUTPUT **********************
My name is Christopher Michael Adams.
My initials are CMA.
Press any key to continue . . .
***************************************************/










