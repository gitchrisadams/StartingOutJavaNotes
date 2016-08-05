package com.christopheradams.num012ArraysAndFiles;

import java.util.*;
import java.io.*;

public class SavingArrayContentsToFile
{
	public static void main(String[]args) throws IOException
	{
		// Create a new array:
		int[] numbers = {10, 20, 30, 40, 50};

		// Create a new print writer.
		PrintWriter outputFile = new PrintWriter("Values.txt");

		for(int i = 0; i < numbers.length; i++)
		{
			// Loop through array and store it in our file.
			outputFile.println(numbers[i]);
		}

		outputFile.close();
	}
}