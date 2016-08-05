package com.christopheradams.ch4Challenges.num001SumOfNumbers;

import java.util.*;			// For Scanner input and other utility tasks.

/* 
	Christopher Adams
	5/15/2016
	Sum of Numbers
	Ask user for a positive nonzero integer.
	Use a loop to get the sum of all integers from 1 up to
	the number entered. Example: 50 is entered, the program
	should loop and add 1,2,3,4,...50.
*/

public class ch4p1sumOfNumbers
{
	public static void main(String[]args)
	{
		// Create variables.
		int numToSum = 0;		// Number to sum to.
		int total = 0;			// Accumulator
		
		// Create a Scanner for user input:
		Scanner keyboard = new Scanner(System.in);
		
		// Get the number to add up to from the user.
		System.out.println("Please enter a number to sum up to.");
		System.out.println("Example, if you enter 50 we will sum" +
							" all numbers up to and including 50.");
		System.out.println("Enter your number: ");
		numToSum = keyboard.nextInt();
		System.out.println();
		
		// Sum the numbers by looping and adding total to accumulator.
		for(int i = 1; i<=numToSum; i++)
		{
			total += i;
		}
		
		// Output results.
		System.out.println("The total of all numbers summed up to " + 
							numToSum + " is " + total + ".");
	}
}














