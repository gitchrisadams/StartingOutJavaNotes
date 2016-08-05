package com.christopheradams.ch4Challenges.num004PenniesForPay;

import java.util.*;			// For Scanner input and other utility tasks.

/*
	Christopher Adams
	5/15/2016
	Pennies for Pay.
	Program will calculate the pay in dollars if a person
	is paid 1 penny for the first day and then doubles 
	each day. So first day 1 penny, second 2 pennies, etc...
	Get number of days worked from the user but do not
	accept anything less than 1 for days worked.
	Display output in a table displaying salary for
	each day and then a total pay at the end.
*/

public class ch4p2PenniesForPay
{
	public static void main(String[]args)
	{
		// Create variables.
		int daysWorked = 0;				// Number of days worked input.
		double dailySalary = 0.01;		// Salary earned per day.
		double totalSalary = 0.0;		// Total Salary earned.
		
		// Create scanner for input.
		Scanner keyboard = new Scanner(System.in);
		
		// Get daysWorked from the user.
		System.out.print("How many days have you worked? ");
		daysWorked = keyboard.nextInt();
		
		System.out.println("*********************");
		System.out.printf("%8s", "Day 1:");
		
		// Output the first day of .01:
		System.out.printf("$%.2f\n",dailySalary);
		
		// Loop through days worked:
		for(int i = 2; i <= daysWorked; i++)
		{
			dailySalary = dailySalary * 2;
			totalSalary += dailySalary;
			System.out.print("Day " + i +":");
			System.out.printf("$%5.2f\n",dailySalary);
		}
		System.out.print("Total Salary:");
		System.out.printf("$%.2f\n",totalSalary);
		System.out.println("*********************");
	}
}



















