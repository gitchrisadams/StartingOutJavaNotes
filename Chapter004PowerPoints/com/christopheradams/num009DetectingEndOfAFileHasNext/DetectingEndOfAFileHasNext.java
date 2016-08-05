package com.christopheradams.num009DetectingEndOfAFileHasNext;

import java.io.*;		// For reading and writing to a file.
import java.util.*;		// For Scanner input and other utilities.

public class DetectingEndOfAFileHasNext
{
	// Needs throws IOException because we are doing file output.
	public static void main(String[]args)throws IOException
	{
		// String to store data from the file.
		String fromFile = "";

		// Create a File object:
		File myFile = new File("StudentData.txt");

		// Create a new scanner with the File object we just created.
		Scanner inputFile = new Scanner(myFile);

		// Loop through file as long as hasNext() is true.
		// And concatenate to our fromFile String, whatever is at that line in the file.
		while(inputFile.hasNext())
		{
			fromFile += inputFile.nextLine() + "\n";
		}

		// Output:
		System.out.println(fromFile);

		// Close the file.
		inputFile.close();
	}
}