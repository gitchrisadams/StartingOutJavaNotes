package com.christopheradams.ch2challenges.num001NameAnnualIncome;

/*
	Christopher Adams
	5/20/16
	Name, Age, and annual income. Challenge 1
	The program will store my age, name, and desired annual income.
	The program will then display the data similar to this:
	My name is Joe Mahoney, my age is 26 and I hope to earn $100000.0 per year.
*/

public class Challenge1NameAgeAnnualIncome
{
	public static void main(String[]Args)
	{
		// Declare and initialize variables:
		int age = 40;							// Holds my age.
		String myName = "Chris Adams";			// Holds my name.
		double desiredIncome = 300000;			// Holds the desired income.

		System.out.println("My name is " + myName + ", my age is " + age + " and \n" +
		"I hope to earn $"+ desiredIncome + " per year.");
	}
}

/**************** Output *****************
My name is Chris Adams, my age is 40 and
I hope to earn $300000.0 per year.
Press any key to continue . . .
*****************************************/








