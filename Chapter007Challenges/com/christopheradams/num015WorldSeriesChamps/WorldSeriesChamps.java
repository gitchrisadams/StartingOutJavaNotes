package com.christopheradams.num015WorldSeriesChamps;

import java.util.*;			// Scanner input and other utilities.
import java.io.*;			// File input/output.

public class WorldSeriesChamps
{
	public static void main(String[]args) throws IOException
	{
		// Variables:
		String team = "";			// The name of the team entered by the user.
		int numTeamWon = 0;			// Number of times team won the World Series.
		int year = 1903;			// Year of first World Series.

		// Constants:
		final String FILENAME = "WorldSeriesWinners.txt";			// The name of the file to read from.

		// Create a new File object:
		File myFile = new File(FILENAME);

		// If file does not exist, then display error and exit program.
		if(!myFile.exists())
		{
			System.out.println("File does not exist, exiting program....");
			System.exit(0);
		}

		// File exists so create a Scanner object to be able to read from the file.
		Scanner inputFile = new Scanner(myFile);

		// Create a Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Get the name of the team from the user.
		System.out.println("Enter baseball team to display the number " +
			"of times they won the World Series.");
		System.out.print("Enter your team: ");
		team = keyboard.nextLine();




		// Loop through the file and count how many times the
		// name of the team appears in the file.
		while(inputFile.hasNext())
		{
			if(inputFile.nextLine().equals(team))
			{


				System.out.println(team + " won in " + year);
				numTeamWon +=1;


			}
			// Skip the years where no World Series was played.
			if(year == 1903 || year == 1994)
				year+=2;
			else
				year++;
		}

		System.out.println("The " + team + " won the world Series " + numTeamWon + " times \n" +
			"from 1903 to 2009.");


	}
}
