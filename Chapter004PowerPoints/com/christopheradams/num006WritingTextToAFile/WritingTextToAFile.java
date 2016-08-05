package com.christopheradams.num006WritingTextToAFile;

import java.io.*;		// For reading and writing to a file.

public class WritingTextToAFile
{
	// Needs throws IOException because we are doing file output.
	public static void main(String[]args)throws IOException
	{
		// Open a new file for text output:
		PrintWriter outputFile = new PrintWriter("StudentData.txt");

		// Print to our output file.
		outputFile.println("Chris");
		outputFile.println("Kathryn");
		outputFile.println("Jean");

		// Done with outputFile so close it:
		outputFile.close();
	}
}