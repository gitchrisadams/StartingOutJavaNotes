package com.christopheradams.ch7Notes;

import java.util.*;			// For Scanner input and other utilities.
import java.io.*;			// For file input/output.

public class Ch7P20ArrayListOfIntegersAndPassingReturning
{
	public static void main(String[]args) throws IOException
	{
		// Create a reference to an ArrayList.
		ArrayList<Integer> myCharges;

		// Call the readData() method to fill an array with values
		// from a text file and assign it to our ArrayList reference.
		myCharges = readData();

		// Output the charge from main.
		System.out.println(myCharges);

	}

	public static ArrayList<Integer> readData() throws IOException
	{
		// Variables:
		int currentCharge = 0;						// Counter to count number of charges.

		// Constant to hold the file name that has
		// the charges to be read into an ArrayList.
		final String FILENAME = "validCharges.txt";

		// Create a new ArrayList:
		ArrayList<Integer> charges = new ArrayList<Integer>();

		// Create a new File object with the filename.
		File myFile = new File(FILENAME);

		// Check that file exists before creating Scanner.
		if(!myFile.exists())
		{
			System.out.println("File does not exist, exiting program.");
			System.exit(0);
		}

		// Create a new scanner for reading the file.
		Scanner inputFile = new Scanner(myFile);

		// Go through the file and store each int into an ArrayList.
		while(inputFile.hasNext())
		{
			charges.add(inputFile.nextInt());
			System.out.println(charges.get(currentCharge));

			currentCharge++;
		}

		// Done with file so close it.
		inputFile.close();

		// Return the ArrayList to calling method:
		return charges;
	}
}