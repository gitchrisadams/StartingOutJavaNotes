package com.christopheradams.num013ReadingContentsOfFileInToArray;

import java.util.*;
import java.io.*;

public class ReadIntoArray
{
	public static void main(String[]args) throws IOException
	{
		// Create a final for the size.
		final int SIZE = 10;

		// Create an int array using the constant.
		int[] numsToReadIn = new int[SIZE];

		// Variable for a counter:
		int counter = 0;

		// Create a new File object.
		File file = new File("Values.txt");

		// Create a new Scanner using the file object we created.
		Scanner inputFile = new Scanner(file);

		// Loop while the file has data and the counter is less than the length of the array.
		while(inputFile.hasNext() && counter < numsToReadIn.length)
		{
			// Store the next integer from the input file in the array.
			numsToReadIn[counter] = inputFile.nextInt();

			// Increment the counter.
			counter++;
		}

		// Done so close the input file.
		inputFile.close();

		// Display the array.
		for(int i = 0; i < numsToReadIn.length; i++)
		{
			System.out.println("The number in array["+i+"] is: " + numsToReadIn[i]);
		}


	}
}