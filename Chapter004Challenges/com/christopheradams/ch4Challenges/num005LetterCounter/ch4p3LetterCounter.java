package com.christopheradams.ch4Challenges.num005LetterCounter;

import java.util.*;		// For Scanner input and other utility tasks.

/*
	Christopher Adams
	5/16/2016
	Letter counter
	This program asks the user to enter a word. 
	Then it asks the user to enter a character.
	The program will count and display how many
	times the letter appears in the String entered.
*/

public class ch4p3LetterCounter
{
	public static void main(String[]args)
	{
		// Create variable to hold the user's word and letter.
		String word = "";
		char letter = 'a';
		
		// Create variable for totaling times number appears.
		int total = 0;
		
		// Create Scanner object for input.
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt user for the word and the letter.
		System.out.println("Please enter a word and a letter and we will tell\n" + 
							"you how many times the character appears in the word. ");
		System.out.print("Please enter the word: ");
		word = keyboard.nextLine();
		
		// Covert our word to an array of chars.
		char[]myCharArray = word.toCharArray();
		
		// Get input as a char by using charAt to get the first char.
		System.out.print("Please enter the letter: ");
		letter = keyboard.next().charAt(0);
		
		// Calculate how many times letter appears in word.
		// Loop through String array.
		for(int i = 0; i<word.length(); i++)
		{
			if(myCharArray[i] == letter)
			{
				total +=1;
			}
		}
		
		System.out.println("The letter " + letter + " appears " + total + 
							" times in the word " + word + ".\n");
		
		
	}
}