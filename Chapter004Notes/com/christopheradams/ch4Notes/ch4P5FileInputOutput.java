package com.christopheradams.ch4Notes;
// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.
import java.io.*;						// Used for reading and writing to a file.

/*
	Christopher Adams
	5/03/2016
	File Input and Output
*/


public class ch4P5FileInputOutput
{
	// We add throws IOException since we are writing to a file and this is needed for error handling.
	public static void main(String[] args) throws IOException
	{
		/***** Writing Data to a file *****/
//		// You can hard code file name like PrintWriter("StudentData.txt") or pass in a variable:
//		// Create a Variable to store our filename:
//		String filename = JOptionPane.showInputDialog("Enter the filename.");
//
//		// Create a new object of type PrintWriter named outputFile and pass in our filename:
//		/*********** WARNING, If file already exists it will be erased/replaced WARNING ************/
//		PrintWriter outputFile = new PrintWriter(filename);
//
//		// Write data to a new file:
//		outputFile.println("Chris");
//		outputFile.println("Was here 2016 written with a prinln");
//
//		// You can also use the print not just the prinln to a file:
//		outputFile.print("Line1 written with print versus println");
//		outputFile.print("Line2 written with print versus println too!");
//
//		// Done writing data so close the file:
//		outputFile.close();
//		/***** End Writing Data to a file *****/


		/***** Appending data to a File *****/
		// Create a FileWriter object and pass in a file name:
		// If file exists it will append data to it, if not it will create the new file.
		// Notice we also told it to save it to the root of C:
		// You could also add C:/myFriendListFolder/MyFriends.txt
		// You must have permission to write to drive and folder must exist.
		// You can also use Windows backslashes but must use to like this:
		// c:\\myFriendFolder\\MyFriends.txt
		FileWriter fwriter = new FileWriter("E:/MyFriends.txt", true);

		// Create a PrinterWriter object passing in the fwriter object we just created:
		PrintWriter myFriendsOutputFile = new PrintWriter(fwriter);

		// Uncomment and change Friend name to append things to file:
//		myFriendsOutputFile.println("Friend1");
//		myFriendsOutputFile.println("Friend2");
//		myFriendsOutputFile.println("Friend1");
//		myFriendsOutputFile.println("Friend2");
//		myFriendsOutputFile.println("Friend1");
//		myFriendsOutputFile.println("Friend2");


		myFriendsOutputFile.close();
		/***** End Appending data to a File *****/



		/***** Reading Data from a File with Validation: *****/
		// When reading data from a file be sure to include IOException in header of method reading data.
		// In this case after the main()
		// Create instance of the File class:
		File myFileToGetInput = new File("E:/myFriends.txt");

		// Pass reference to the file object as an argument to the Scanner object:
		Scanner inputFile = new Scanner(myFileToGetInput);

		// While there is data in the file to read:
		while(inputFile.hasNext())
		{
			// Assign whatever is the next line in the file to variable lineRead:
			String lineRead = inputFile.nextLine();

			// Display the line we just read:
			System.out.println("The line we just read is " + lineRead);
		}

		// Done reading so close the file:
		inputFile.close();
		/***** End Reading Data from a File with Validation *****/



		/***** Reading Double values from a file and accumulating *****/
		// Create an accumulator variable to show how numbers can be processed:
		double myAccumulator = 0.0;

		// Create a File writer to open Doubles.txt for writing:
		FileWriter doubleWriter = new FileWriter("E:/Doubles.txt", true);

		// Create a PrinterWriter object passing in the file writer object we just created:
		PrintWriter myDoubleFileWriter = new PrintWriter(doubleWriter);

//		// Uncomment to add sample data:
//		// Add some sample data with numbers:
//		myDoubleFileWriter.println(23.0);
//		myDoubleFileWriter.println(44.0);
//		myDoubleFileWriter.println(55);
//		myDoubleFileWriter.println(127);

		// Done writing to file so close it:
		myDoubleFileWriter.close();

		// Open a file for reading input:
		File myFileToGetDoubles = new File("E:/Doubles.txt");

		// Check that Doubles.txt file exists before we write to it.
		// Display error message and exit the program if it doesn't exist:
		if(!myFileToGetDoubles.exists())
		{
			// Display error message:
			System.out.println("The file Doubles.txt does not exist!");

			// Exit the program:
			System.exit(0);
		}

		// Pass reference to the file object as an argument to the Scanner object
		// so we can read input:
		Scanner inputDoubles = new Scanner(myFileToGetDoubles);

		// Keep getting doubles until reach end of the file:
		while(inputDoubles.hasNext())
		{
			// Add the next Double to our variable myNextDouble:
			double myNextDoubleRead = inputDoubles.nextDouble();

			// Use accumulator to total our doubles:
			myAccumulator += myNextDoubleRead;

			// Display the total of our Accumulator:
			System.out.println("Our accumulator is equal to " + myAccumulator);
		}

		// Done reading input so close file:
		inputDoubles.close();
		/***** End Reading Double values from a file and accumulating *****/




		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);
	}

}