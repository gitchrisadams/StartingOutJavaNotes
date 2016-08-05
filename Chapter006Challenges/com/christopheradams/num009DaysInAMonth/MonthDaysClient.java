package com.christopheradams.num009DaysInAMonth;

import java.util.*;

public class MonthDaysClient
{
	public static void main(String[]args)
	{
		int monthNum = 0;
		int year = 0;

		// Create a Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the month number: ");
		monthNum = keyboard.nextInt();
		System.out.println();

		System.out.print("Enter the year: ");
		year = keyboard.nextInt();

		// Create a new MonthDays object:
		MonthDays birthday1 = new MonthDays(monthNum, year);

		System.out.println("\nNumber of days in the month: " + birthday1.getNumberOfDays());
		System.out.println();





	}
}