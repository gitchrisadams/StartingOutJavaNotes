package com.christopheradams.num001ShowChar;

/*
	1. showChar Method
	Write a method named showChar. The method should accept two arguments:
	a reference to a String object and an integer. The integer argument is
	a character position within the String, with the first character being at
	position 0. When the method executes, it should display the character at
	that character position. Here is an example of a call to the method:
	showChar("New York", 2); In this call, the method will display the character
	w because it is in position 2. Demonstrate
	the method in a complete program.
*/

public class Ch5Chal1ShowChar
{
	public static void main(String[]args)
	{
		// Call our method and pass in a String and the character position
		// that we want to get the character out and display the character
		// to the screen.
		System.out.println(showChar("Chris", 3));
	}

	/**
	The showChar method displays what character is at a given position passed in.
	@param strToFindChar The string to look for the character in.
	@param positionToGetChar The position within the String to get the character at.
	@return The character at the position passed in.
	*/
	public static char showChar(String strToFindChar, int positionToGetChar)
	{
		// Declare a char to hold the char we find.
		char charInTheString = 'a';

		// Store the character at position passed in, in the char variable.
		charInTheString = strToFindChar.charAt(positionToGetChar);

		// Return the char to the calling function.
		return charInTheString;
	}
}


