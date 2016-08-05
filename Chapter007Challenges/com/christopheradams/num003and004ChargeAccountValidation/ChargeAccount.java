package com.christopheradams.num003and004ChargeAccountValidation;

import java.util.*;			// For Scanner input and other utilities.
import java.io.*;			// For file input/output.

public class ChargeAccount
{
	public static void main(String[]args) throws IOException
	{
		// Variables:
		int chargeIndexPosition = -1;
		int accountNumber = 0;

		// Create a Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Create a reference to an ArrayList.
		ArrayList<Integer> myCharges;

		// Call the method to read data from the text file
		// into the ArrayList and store a reference to it in
		// an ArrayList reference.
		myCharges = readData();

		// Get the charge number from the user.
		System.out.print("Please enter the charge number: ");
		accountNumber = keyboard.nextInt();

		chargeIndexPosition = isChargeValid(myCharges, accountNumber);

	}

	/**
		The readData() method fills the array with data from a text file.
		@return A reference to an ArrayList.
	*/
	// Notice ArrayList<Integer> is used for return type.
	public static ArrayList<Integer> readData() throws IOException
	{
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
		}

		// Done with file so close it.
		inputFile.close();

		// Return the ArrayList to calling method:
		return charges;
	}

	/*
		The isChargeValid() method determines if a charge is valid.
		@param arrayList1 A reference to an ArrayList.
	*/
	public static int isChargeValid(ArrayList<Integer> arrayList1, int accountNum)
	{
		boolean isChargeFound = false;		// Boolean flag when charge is found.
		int index = 0;						// Count control variable.
		int indexPositionFound = -1;		// The index the charge is found at.

		// Search the ArrayList while the charge is not found and
		// we are not at the end of elements stored in the ArrayList.
		while(!isChargeFound && index < arrayList1.size())
		{
			// If item in ArrayList at current counter is equal to the
			// value we are looking for, then set boolean to true and store
			// the index the item is located at.
			if(arrayList1.get(index) == accountNum)
			{
				isChargeFound = true;
				indexPositionFound = index;
			}

			// Increment index counter:
			index++;
		}

		if(isChargeFound)
		{
			System.out.println("Charge is valid");
		}
		else
		{
			System.out.println("Charge not found!");
		}


		// Return the index where the charge was found or -1
		// if it was not found.
		return indexPositionFound;

	}
}