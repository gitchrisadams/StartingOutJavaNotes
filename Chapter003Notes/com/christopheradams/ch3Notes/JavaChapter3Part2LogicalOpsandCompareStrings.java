package com.christopheradams.ch3Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	04/29/2016
	Java Chapter 3 Examples
*/

/**
	This is an example of a java doc comment that starts with /** and ents with * /
	This program explains concepts explained in chapter 3 of the text book.
*/

// Name Class same as the .java file name:
public class JavaChapter3Part2LogicalOpsandCompareStrings
{
	public static void main(String[] args)
	{
		/********************** Logical Operators **********************/
		// Declare/initialize some int variables we will test with if-else-if statements:
		int myGradeLogic1 = 96;
		int myGradeLogic2 = 90;
		int myGradeLogic3 = 100;

		// We used the and(&&) operator so both conditions must be true:
		if(myGradeLogic1 < 80 && myGradeLogic1 >= 70)
		{
			System.out.println("You got a \"C\", Not too bad...\n");
		}
		// We used the and(&&) operator so both conditions must be true:
		else if(myGradeLogic1 < 90 && myGradeLogic1 >= 80)
		{
			System.out.println("You got a \"B\", You should be proud!\n");
		}
		// Use or(||) so if score less or equal to 0 or more than 100 then display message:
		else if(myGradeLogic1 <= 0 || myGradeLogic1 > 100)
		{
			System.out.println("You either missed the test or cheated!\n");
		}
		// Special case if grade is over 95 but is not equal to 100 then display special message:
		else if(myGradeLogic1 > 95 && myGradeLogic1 != 100)
		{
			System.out.println("Wow, over a 95, but you didn't get 100...\n");
		}
		else if(myGradeLogic1 == 100)
		{
			System.out.println("100, yeah right, you probably cheated!\n");
		}

		else
		{
			System.out.println("You got a \"A\", Awesome sauce! You rock!\n");
		}
		/********************** Logical Operators **********************/


		/********************* Comparing Strings *********************/
		// Create string variables to compare:
		String myStringToCompare1 = "Mark";
		String myStringToCompare2 = "Mark";
		String myStringToCompare3 = "Christopher";
		String myStringToCompare4 = "Chris";

		// Compare the two strings and see if Mark is equal to Mary(In this case it is):
		if(myStringToCompare1.equals(myStringToCompare2))
		{
			System.out.println(myStringToCompare1 + " is equal to " + myStringToCompare2 + ".\n");
		}

		// You can also just compare a string literal like "Mark" versus a variable:
		if(myStringToCompare1.equals("Mark"))
		{
			System.out.println("Comparing a string literal and Yes it does equal \"Mark\".\n");
		}


		/********* Comparing if strings are equal, smaller or larger than another string w/ compareTo() *********/
		if(myStringToCompare3.compareTo(myStringToCompare4) == 0)
		{
			// If statement returned 0 so strings are equal:
			System.out.println("The Strings are equal.\n");
		}
		else if(myStringToCompare3.compareTo(myStringToCompare4) < 0)
		{
			// compareTo returned a -1 so myStringToCompare3 is smaller than myStringToCompare4:
			System.out.println("myStringToCompare3 is smaller than myStringToCompare4 see: " +
							   myStringToCompare3 + " is less than " + myStringToCompare4 + ".\n");
		}
		else if(myStringToCompare3.compareTo(myStringToCompare4) > 0)
		{
			// Not smaller or equal to so myStringToCompare3 must be larger:
			System.out.println("myStringToCompare3 is larger than myStringToCompare4 see: " +
							   myStringToCompare3 + " is more than " + myStringToCompare4 + ".\n");
		}
		/******* End Comparing if strings are equal, smaller or larger than another string w/ compareTo() *******/


		// The .equalsIgnoreCase and .compareToIgnoreCase:
		String strIgCase1 = "Mark";
		String strIgCase2 = "mark";
		if(myStringToCompare1.equalsIgnoreCase(myStringToCompare2))
				{
					System.out.println(strIgCase1 + " is equal to " + strIgCase2 +
									   " even though they are differnet cases.\n");
		}


		/********************* End Comparing Strings *********************/


		/***** SubStrings *****/
		// Create some test string variables:
		String A = "hello";
		String B = "java";

		// This will Capitalize the first letter of a string.
		// Print out the two strings separated by a space and first letter capitalized:
		// It starts at the first element 0, and ends at element 1 for capitalizing it.
		// Then it starts at element(1) and goes to end of string to print out the rest of it(Not capitalized).
		System.out.println(A.substring(0,1).toUpperCase() + A.substring(1)  + " " +
						   B.substring(0,1).toUpperCase() + B.substring(1));


		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);

	}
}