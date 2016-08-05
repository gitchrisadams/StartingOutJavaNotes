package com.christopheradams.ch3Challenges.num006TimeCalculator;

/*
	Christopher Adams
	5/13/2016
	Time Calculator
	Get the number of seconds as input from the user.
	If the number of seconds entered is greater than or equal to 60 then display
	how many minutes total are in that many seconds.
	If the number of seconds entered is greater than or equal to 3600(seconds in an hour)
	then the program will display the number of hours in that many seconds.
	If the seconds are greater than or equal to 86,400(seconds in a day), then
	display how many days.
*/

import java.util.*;						// For using Scanner and other utility tasks.

public class ch3p3TimeCalculator
{
	public static void main(String[]args)
	{
		// Create variable to hold seconds that user will enter.
		// Also create variables for minutes, hours, and days for our conversions.
		double seconds = 0;
		double minutes = 0;
		double hours = 0;
		double days = 1;

		// Create a new scanner for input:
		Scanner keyboard = new Scanner(System.in);

		// Prompt the user for input:
		System.out.println("This Program will convert seconds to minutes, hours, and days\nbased " +
							"on the amount of seconds you enter.");
		System.out.println("Example, if you enter 30 seconds it will display 30, \nif you enter 60 " +
							"seconds, then it will display 1 minute. \nThen 1 hour, 1 day etc...\n");
		System.out.print("Please enter the seconds to convert:");
		seconds = keyboard.nextDouble();

		// If seconds are within these ranges, then divide to get appropriate time
		// and display.
		if(seconds >= 60 && seconds < 3600)
		{
			minutes = seconds / 60;
			System.out.println("Your time converted to minutes is: " + minutes + " minutes.");
		}
		else if(seconds >= 3600 && seconds < 86400)
		{
			hours = seconds / 3600;
			System.out.println("Your time converted to hours is: " + hours + " hours.");
		}
		// Anything greater than or equal to 86400 displays in days.
		else if(seconds >= 86400)
		{
			days = seconds / 86400;
			System.out.println("Your time converted to days is: " + days + " days.");
		}
		else
		{
			System.out.println("Out of range Will Robinson!");
		}
	}
}