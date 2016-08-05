package com.christopheradams.num011MakingSureFileDoesExistBefWriting;

import java.io.*;		// For reading and writing to a file.
import java.util.*;		// For Scanner input and other utilities.

public class MakeSureFileExistsBeforeWriting
{
	// Needs throws IOException because we are doing file output.
	public static void main(String[]args)throws IOException
	{
		String filename = "StudentData.txt";

		// Create a file:
		File myFile = new File(filename);

		// Don't open the file for writing if it does exist.
		if(myFile.exists())
		{
			System.out.println("The file " + filename + " already exists.");
			System.exit(0);
		}

		// Otherwise if it does not exist then go ahead and open it for writing.
		PrintWriter outputFile = new PrintWriter(myFile);
	}
}