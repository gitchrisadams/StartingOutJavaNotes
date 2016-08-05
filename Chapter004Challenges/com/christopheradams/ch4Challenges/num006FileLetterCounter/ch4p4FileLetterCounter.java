package com.christopheradams.ch4Challenges.num006FileLetterCounter;

import java.util.*;		// For Scanner input and other utility tasks.
import java.io.*;		// For file input/output.

/*
	Christopher Adams
	5/17/2016
	File Letter Counter
	Ask the user to enter the name of a file and then the name
	of a file. The program will count and display the number
	of times the character appears in the file. 
*/

public class ch4p4FileLetterCounter
{
	// Need throws IOException when using file input/output.
	public static void main(String[]args) throws IOException
	{
		// Create a String to store filename and char.
		String filename = "";
		char letter = 'a';
		
		// Create a String to store data from file.
		String lineRead = "";
		
		// Create int to accumulate times letter appears.
		int letterCount = 0;
		
		// Create a Scanner to get input from keyboard:
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt and get the file name and character from the user.
		System.out.println("Please enter a name of a file then enter a " +
							"chacter to search for in the file.");
		System.out.print("Please enter the file name: ");
		filename = keyboard.nextLine();
		
		System.out.print("Please enter a character to search for: ");
		letter = keyboard.next().charAt(0);
		System.out.println();
		
		// Create an instance of the File class for input.
		// Pass in our filename we received from the user.
		File inputFile = new File(filename);
		
		// Create a new Scanner to get input from a file.
		Scanner fileScanner = new Scanner(inputFile);
		
		// While loop to loop through our file:
		while(fileScanner.hasNext())
		{
			lineRead  += fileScanner.nextLine();
			
		}
		
		// Create a string to store lineRead as lower case:
		// This way we get a count of both Upper and lower case chars.
		String lineReadLower = lineRead.toLowerCase();
		
		// Convert the String to a charArray:
		char[]lineReadCharArray = lineReadLower.toCharArray();
		

		
		// Loop through the char Array:
		for(int i = 0; i<lineRead.length();i++)
		{
			// If statement to compare char entered by user to
			// the chare at current counter.
			// If they are equal, add one to the accumulator.
			if(lineReadCharArray[i] == letter)
			{
				letterCount += 1;
			}
		}
		
		System.out.println("The letter " + letter + " appears " + letterCount +
							" times in the string: ");
		System.out.println(lineRead);
		
		// Done reading file so close it.
		fileScanner.close();
		
	}
}










