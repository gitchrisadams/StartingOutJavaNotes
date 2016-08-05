package com.christopheradams.num008ReadingDataFromAFile;

import java.io.*;		// For reading and writing to a file.
import java.util.*;		// For Scanner input and other utilities.

public class ReadingDataFromAFile
{
	// Needs throws IOException because we are doing file output.
	public static void main(String[]args)throws IOException
	{
		// Create a File object:
		File myFile = new File("StudentData.txt");

		// Create a new scanner with the File object we just created.
		Scanner inputFile = new Scanner(myFile);

		// Read a line from the file.
		String str = inputFile.nextLine();

		// Display the line from the file that we stored in str:
		System.out.println(str);

		// Close the file.
		inputFile.close();
	}
}