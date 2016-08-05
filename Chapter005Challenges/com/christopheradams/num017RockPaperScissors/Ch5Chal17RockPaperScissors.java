package com.christopheradams.num017RockPaperScissors;

/*
	17. Rock, paper, scissors game
	Write a program that lets the user play the game of Rock, Paper, Scissors against
	the com- puter. The program should work as follows.
	1. When the program begins, a random number in the range of 1 through 3 is generated.
	If the number is 1, then the computer has chosen rock. If the number is 2, then the
	com- puter has chosen paper. If the number is 3, then the computer has chosen scissors.
	(Don’t display the computer’s choice yet.)
	2. The user enters his or her choice of “rock”, “paper”, or “scissors” at the keyboard.
	(You can use a menu if you prefer.)
	3. The computer’s choice is displayed. 4. A winner is selected according to the following
	rules:
	•	If one player chooses rock and the other player chooses scissors, then rock wins.
	(The rock smashes the scissors.)
	•	If one player chooses scissors and the other player chooses paper, then scissors
	wins. (Scissors cuts paper.)
	•	If one player chooses paper and the other player chooses rock, then paper wins.
	(Paper wraps rock.)
	• If both players make the same choice, the game must be played again to determine the
	winner.
	Be sure to divide the program into methods that perform each major task.
*/

import java.util.*;		// For Scanner, Random number and other utility tasks.

public class Ch5Chal17RockPaperScissors
{
	public static void main(String[]args)
	{
		// Declare/initialize variables.
		int handGesture = 0;				// The user's choice of rock, paper, or scissors.
		int computersGesture = 0;			// The computer's choice of rock, paper, or scissors.

		// Call method that generates a random number between 1 and 3.
		// This will be the computer player's selection of rock, paper, or scissors.
		computersGesture = genRandOneToThree();

		// Call method to get the user's selection of rock, paper, or scissors.
		handGesture = handGestureInput();

		// Call method to display both the user's and computer's choice and calculate and display
		// who won the game.
		whoWonResults(handGesture, computersGesture);

	}

	/**
		The genRandOneToThree method generates a random number between 1 and 3 inclusive.
		@return The random number generated.
	*/
	public static int genRandOneToThree()
	{
		// Create an int to store the random number.
		int randOneToThree = 0;

		// Create a reference to a random number object for ability to generate random numbers.
		Random randomNum = new Random();

		// Generate a random number between 1 and 3 inclusive.
		randOneToThree = randomNum.nextInt(3) + 1;

		// Return the random number to the calling method.
		return randOneToThree;

	}

	/**
		The handGestureInput method gets the user's choice of rock, paper, or scissors.
		@return The user's choice of rock, paper, or scissors.
	*/
	public static int handGestureInput()
	{
		// The user's choice.
		int handGesture = 0;

		// Create Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Display menu to the user.
		System.out.println("Please select from the folling options:");
		System.out.printf("%-10s%3s%n", "Rock", "1");
		System.out.printf("%-10s%3s%n", "Paper", "2");
		System.out.printf("%-10s%3s%n", "Scissors", "3");
		System.out.print("Please enter either 1, 2, or 3: ");

		// Get the handGesture from the user:
		handGesture = keyboard.nextInt();

		return handGesture;
	}

	/**
		The whoWonResults displays choices selected and who won the game.
		@param handGesture The user's selection of rock, paper, or scissors.
		@param computersGesture The computer's selection of rock, paper, or scissors.
	*/
	public static void whoWonResults(int handGesture, int computersGesture)
	{
		// Variable to hold the winner:
		String winningPlayer = "";

		// If statement to determine who won:
		// User's Rock beats computer's scissors. User's 1 beats computer's 3.
		if(handGesture == 1 && computersGesture == 3)
		{
			winningPlayer = "User";
			System.out.println("\nThe User chose Rock.");
			System.out.println("The Computer chose Scissors.");
			System.out.println("Rock smashes scissors! The User won!\n");
		}
		// Computer's Rock beats user's scissors. Computer's 1 beats user's 3.
		else if (computersGesture == 1 && handGesture == 3)
		{
			winningPlayer = "Computer";
			System.out.println("\nThe Computer chose Rock.");
			System.out.println("The User chose Scissors.");
			System.out.println("Rock smashes scissors! The Computer won!\n");
		}
		// User's Scissors beats computer's paper. User's 3 beats computer's 2.
		else if(handGesture == 3 && computersGesture == 2)
		{
			winningPlayer = "User";
			System.out.println("\nThe User chose Scissors.");
			System.out.println("The Computer chose Paper.");
			System.out.println("Scissors shreds paper! The User won!\n");
		}
		// Computer's Scissors beats user's paper. Computer's 3 beats user's 2.
		else if(computersGesture == 3 && handGesture == 2)
		{
			winningPlayer = "Computer";
			System.out.println("\nThe Computer chose Scissors.");
			System.out.println("The User chose Paper.");
			System.out.println("Scissors shreds paper! The Computer won!\n");
		}
		// User's Paper beats computer's rock. User's 2 beats computer's 1.
		else if(handGesture == 2 && computersGesture == 1)
		{
			winningPlayer = "User";
			System.out.println("\nThe User chose Paper.");
			System.out.println("The Computer chose Rock.");
			System.out.println("Paper wraps rock! The User won!\n");

		}
		// Computers Paper beats user's rock. Computers 2 beats user's 1.
		else if(computersGesture == 2 && handGesture ==	1)
		{
			winningPlayer = "Computer";
			System.out.println("\nThe Computer chose Paper.");
			System.out.println("The User chose Rock.");
			System.out.println("Paper wraps rock! The Computer won!\n");
		}
		else
		{
			winningPlayer = "Tie";
			System.out.println("\nIt's a tie, Time for a re-match!\n");
		}



	}


}