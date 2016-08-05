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
public class JavaChapter3Part1IfElse
{
	public static void main(String[] args)
	{
		/********************** The If and Else Statement **********************/
		double score1 = 12.0;
		double score2 = 15.0;
		double score3 = 25.0;

		// If Statement, only one statement so no {} are needed:
		if(score1 > score2)
			System.out.println("Score1 is greater than Score2");

		// If Statement that is one line can also be written like this, No indenting:
		// Stylewise, indenting is better.
		if(score2 > score1) System.out.println("Score2 is greater than Score1\n");

		// Example of writing multiple lines executed in an if statement with {}
		if(score3 > score2)
		{
			System.out.println("Score3 was greater than Score2\n");
			System.out.println("But we don't know if Score3 is greater than score 1 yet...\n");
		}


		/************ Setting a flag: ************/
		// First we declare and initialize our boolean variable to false:
		boolean highscore = false;

		// If score3 is higher than score1 we set our highscore boolean flag to true:
		if(score3 > score1)
		{
			// We set boolean flag variable to true
			highscore = true;
		}

		// If highscore is set to true then display message:
		if(highscore)
		{
			System.out.println("That's a highscore!\n");
		}
		/************ Setting a flag: ************/


		// Comparing Characters:
		char charA = 'A';

		if(charA == 'A')
		{
			System.out.println("The Char letter is an A!\n");
	 	}

	 	// if else example:
	 	if(score2 <= score3)
		{
			System.out.println("score2 is less than or equal to score\n3");
		}
		else
		{
			System.out.println("score2 is more than score 3\n");
		}

		// Nested If statements:
		if(score2 <= score3)
		{
			// Made it past first if so display message:
			System.out.println("Made it past first test, score2 is <= score3.\n");

			// Now see if we run the nested if:
			if(score2 >= score1)
			{
				System.out.println("Made it to nested if. This will only print if score " +
								   "2 <= score3 and score2 >= score1\n");
			}
		}
		else
		{
			System.out.println("We didn't even make it to the second nested if, denied!!");
		}


		/********************* Conditional Operator *********************/
		// You can also use a conditional operator that is a kind of shorthand for
		// writing out an if else statment like this:
		// Create some variables:
		int y;
		int x = 10;

		// Condional operator: If x is greater than 9 then store 11 in y else store 20 in y:
		// In this case x is greater than 10 so store 11 in y:
		y = x > 9 ? 11:20;

		System.out.println("The value of y is: " + y + "\n");
		/********************* Conditional Operator *********************/

		/********************** End The If and Else Statement **********************/


		/********************** The if-else-if statement **********************/
		// Declare/initialize some int variables we will test with if-else-if statements:
		int myGrade1 = 99;
		int myGrade2 = 90;
		int myGrade3 = 100;

		if(myGrade1 < 80)
		{
			System.out.println("You got a \"C\", Not too bad...\n");
		}
		else if(myGrade1 < 90)
		{
			System.out.println("You got a \"B\", You should be proud!\n");
		}
		else
		{
			System.out.println("You got a \"A\", Awesome sauce! You rock!\n");
		}
		/********************** End The if-else-if statement **********************/


		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);

	}
}