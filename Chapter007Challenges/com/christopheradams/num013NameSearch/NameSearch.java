package com.christopheradams.num013NameSearch;

import java.util.*;
import java.io.*;

public class NameSearch
{
	public static void main(String[]args) throws IOException
	{
		// Variables:
		int boyCount = 0;					// Used for counting boy names in file.
		int girlCount = 0;					// Used for counting girl names in file.
		int boyIndex = 0;					// Used for counter when storing names in array.
		int girlIndex = 0;					// Used for counter when storing names in array.
		String boysName = "";				// The boy's name to search for from the user.
		String girlsName = "";				// The girl's name to search for from the user.
		int boysNamePosition = -1;			// The index number the name being searched for is located at for a boy.
		int girlNamePosition = -1;			// The index number the name being searched for is located at for a girl.


		// Constants:
		final String BOY_FILE = "BoyNames.txt";
		final String GIRL_FILE = "GirlNames.txt";

		// Create a new File object:
		File boysFile = new File(BOY_FILE);
		File girlsFile = new File(GIRL_FILE);

		// If files exist then create the Scanners for them,
		// otherwise exit the program.
		if(!boysFile.exists() || !girlsFile.exists())
		{
			System.out.println("File does not exist, exiting the program...");
			System.exit(0);
		}

		// Create a separate Scanner so we can loop through the items
		// and count how many names are in each file.
		Scanner boyCountScanner = new Scanner(boysFile);
		Scanner girlCountScanner = new Scanner(girlsFile);

		// Loop through the file and count how many items are in it:
		while(boyCountScanner.hasNext())
		{
			boyCount++;
			boyCountScanner.nextLine();
		}
		while(girlCountScanner.hasNext())
		{
			girlCount++;
			girlCountScanner.nextLine();
		}

		// Done with file for count Scanner so close it:
		boyCountScanner.close();
		girlCountScanner.close();

		// Create arrays the size of the data items inside the files:
		String[] girlNames = new String[girlCount];
		String[] boyNames = new String[boyCount];

		// They exist so create new Scanners for input into an array.
		Scanner boyScanner = new Scanner(boysFile);
		Scanner girlScanner = new Scanner(girlsFile);

		// Loop through the file and store the names in our array.
		while(boyScanner.hasNext())
		{
			boyNames[boyIndex] = boyScanner.nextLine();
			boyIndex++;
		}
		while(girlScanner.hasNext())
		{
			int i = 0;
			girlNames[girlIndex] = girlScanner.nextLine();
			girlIndex++;
		}

		// Done with girl Scanner so close the file:
		boyScanner.close();
		girlScanner.close();

		// Create a new Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Ask user to enter a boy's name:
		System.out.print("Enter a boy's name or leave blank and hit enter if none: ");
		boysName = keyboard.nextLine();
		System.out.print("Enter a girl's name or leave blank and hit enter if none: ");
		girlsName = keyboard.nextLine();

		// Call method to find the index of a specific name:
		boysNamePosition = findName(boysName, boyNames);
		girlNamePosition = findName(girlsName, girlNames);

		if(boysNamePosition >= 0)
			System.out.println("The boy's name " + boyNames[boysNamePosition] +
				" is the number " + (boysNamePosition + 1) + " in the list.");
		else
			System.out.println("Boy name not found, or none entered.");

		if(girlNamePosition >= 0)
			System.out.println("The girl's name " + girlNames[girlNamePosition] +
				" is the number " + (girlNamePosition + 1) + " in the list.");
		else
			System.out.println("Girl name not found, or none entered.");



	}

	public static int findName(String theName, String[] namesList)
	{
		// Find the name in the array:
		int loopControl = 0;			// Loop Control variable.
		int element= -1;				// The array subscript where the element is found otherwise -1.
		boolean found = false;			// Flag if our item was found or not.

		// Search the array:
		while(!found && loopControl < namesList.length)
		{
			if(namesList[loopControl].equalsIgnoreCase(theName))
			{
				found = true;
				element = loopControl;
			}

			loopControl++;
		}

		return element;

	}
}