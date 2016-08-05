package com.christopheradams.ch3Challenges.num002MagicDates;

// For Scanner input and other utility tasks.
import java.util.Scanner;

/*
	Christopher Adams
	5/13/2016
	Magic Dates
*/

/*
	A magic date is a number where the month * day = the year.
	Like 6 * 10 = 60 for 6/10/60.
	The program will prompt the user to enter in numberic form
	a month, day and two digit year.
	Example: month: 06 day: 10 year: 60
	The program will determine if month * day equals the year
	and display a message as to whether the date is magic or not.
*/

public class ch3p2MagicDates
{
	public static void main(String[]args)
	{
		// Variables for month, day, year:
		int month = 0;
		int day = 0;
		int year = 0;

		// Create a scanner for input:
		Scanner keyboard = new Scanner(System.in);

		// Prompt user for month, day, year:
		System.out.println("We want to determine your date is a magic date or not.");
		System.out.println("Please enter a date in numberic form.");
		System.out.println("So if you date is January 11, 1960 you would type in " +
							"01 for the month, 11 for the day, and 60 for the year.");
		System.out.println("If date was 2002 you would just type in 02");
		System.out.print("Please enter the numberic two digit value for the month: ");
		month = keyboard.nextInt();

		System.out.print("Please enter the two digit value for the day: ");
		day = keyboard.nextInt();

		System.out.print("Please enter the two digit value for the year: ");
		year = keyboard.nextInt();

		if(month * day == year)
		{
			System.out.println("Yes, " + month + "/" + day + "/" + year + " is a magic date!\n");
		}
		else
		{
			System.out.println("No, " + month + "/" + day + "/" + year + " is NOT a magic date.\n");
		}

	}
}

