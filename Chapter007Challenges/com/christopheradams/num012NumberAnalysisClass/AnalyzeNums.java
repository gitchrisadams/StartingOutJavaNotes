package com.christopheradams.num012NumberAnalysisClass;

import java.util.*;			// Scanner input and other utilities.
import java.io.*;			// File input/output.

public class AnalyzeNums
{
	// Fields:
	// Array reference to hold the file contents:
	private int[] fileArray;			// Array to hold the input file contents.
	private int arrayCount = 0;			// Count of the array elements.

	public AnalyzeNums(String filename) throws IOException
	{
		// Create a new file object:
		File myFile = new File(filename);

		// Display error and exit program if file does not exist.
		if(!myFile.exists())
		{
			System.out.println("File does not exist, exiting program...");
			System.exit(0);
		}

		// File exists if got to here so create a new Scanner for input of the file.
		Scanner inputFile = new Scanner(myFile);


		// Create a new file object:
		File myFile2 = new File(filename);

		// Display error and exit program if file does not exist.
		if(!myFile2.exists())
		{
			System.out.println("File does not exist, exiting program...");
			System.exit(0);
		}

		// File exists if got to here so create a new Scanner for input of the file.
		Scanner inputFile2 = new Scanner(myFile2);


		// Loop through the file and count how many items.
		while(inputFile.hasNext())
		{
			inputFile.nextInt();
			arrayCount++;
		}

		// Create a new array the size of the elements in the file:
		fileArray = new int[arrayCount];

		inputFile.close();

		arrayCount = 0;

		// Fill the array with file contents:
		while(inputFile2.hasNext())
		{
			fileArray[arrayCount] = inputFile2.nextInt();
			arrayCount++;
		}

		for(int i = 0; i < fileArray.length; i++)
		{
			System.out.println("Element " + (i+1) + ": " + fileArray[i]);
		}


		inputFile2.close();
	}


	public int calcLowest()
	{
		// Set first element of the array as the lowest.
		int lowest = fileArray[0];

		// Loop through the array:
		for(int i = 0; i < fileArray.length; i++)
		{
			if(fileArray[i] < lowest)
			{
				// Store the lowest value.
				lowest = fileArray[i];
			}
		}

		return lowest;
	}

	public int calcHighest()
	{
		// Set the first element of array as the highest.
		int highest = fileArray[0];

		// Loop through the array:
		for(int i = 0; i < fileArray.length; i++)
		{
			if(fileArray[i] > highest)
			{
				highest = fileArray[i];
			}
		}

		return highest;
	}

	public int totalNums()
	{
		int total = 0;		// The total of the values of the numbers in the array.

		// Loop through the array:
		for(int i = 0; i < fileArray.length; i++)
		{
			total += fileArray[i];
		}

		// Return the total.
		return total;
	}

	public double calcAvg()
	{
		// Get the total.
		int total = totalNums();

		// Calculate the average.
		double average = (double)total / fileArray.length;

		return average;
	}



}