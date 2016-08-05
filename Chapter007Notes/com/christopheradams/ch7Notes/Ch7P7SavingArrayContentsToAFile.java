package com.christopheradams.ch7Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.
import java.io.*;						// Allows reading/writing from/to a file.

/*
	Christopher Adams
	05/09/2016
	Saving contents of an array to a file.
*/

// Must have throws IOException because we are reading/writing to/from a file.
public class Ch7P7SavingArrayContentsToAFile
{
	public static void main(String[] args) throws IOException
	{
		// Create array:
		int[] numbers = {8, 99, 3, 10, 4};

		/***** Uncomment and change array values to add more data to the file *******/
//		/***** Writing to a file from an array *****/
//		// Open a file:
//		PrintWriter outputFile = new PrintWriter("Values.txt");
//
//		// Write the array elements to the file
//		for(int index = 0; index < numbers.length; index++)
//		{
//			outputFile.println(numbers[index]);
//		}
//
//		// Done with file so close it:
//		outputFile.close();
//		/***** End Writing to a file from an array *****/


		/***** Reading from a file to an array ******/
		// Declare a final constant:
		final int SIZE = 8;

		// Create a new array which we will store our numbers in the file into:
		int[] numbers2 = new int[SIZE];

		// Loop control counter:
		int index = 0;

		// Open the file:
		File file = new File("Values.txt");
		Scanner inputFile = new Scanner(file);

		// Read the contents into the array:
		while(inputFile.hasNext() && index < numbers2.length)
		{
			// Read the next int in the file and store in the array.
			numbers2[index] = inputFile.nextInt();

			// Increment counter:
			index++;
		}

		// Output elements in the numbers2 array:
		for(int i=0; i < numbers2.length; i++)
		{
			System.out.println("The eight elements of our numbers2 array: " +
								numbers2[i] + "\n");
		}

		// Done with the inputFile so close it:
		inputFile.close();
		/***** End Reading from a file to an array ******/


	}

}