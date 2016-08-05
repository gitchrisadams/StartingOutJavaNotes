package com.christopheradams.num007AppendingTextToAFile;

import java.io.*;		// For reading and writing to a file.

public class AppendingTextToAFile
{
	// Needs throws IOException because we are doing file output.
	public static void main(String[]args)throws IOException
	{
		// To append text we need to start with a FileWriter,
		// true means we want to open to append to it.
		// If file does not exist an empty file will be created.
		FileWriter fw = new FileWriter("StudentData.txt", true);

		// Create a PrintWriter object using the FileWriter:
		PrintWriter outputFile = new PrintWriter(fw);

		outputFile.println("Bob");
		outputFile.println("Marley");

		outputFile.close();

	}
}