package com.christopheradams.num012HeadsOrTailsGame;

import java.util.*;

public class HeadsTailsClient
{
	public static void main(String[]args)
	{
		String userChoice = "";
		int playerCounter = 0;

		Scanner keyboard = new Scanner(System.in);
		// Create new Coin object:
		Coin myCoin = new Coin();

		// Create Player objects:
		Player player1 = new Player(myCoin);
		Player player2 = new Player(myCoin);

		// Player 1's Turn:
		// While the points are less than 5 or value to win the game.
		// Keep tossing the coin and getting guesses.
		while(player1.getPoints() < 5 && player1.getPoints() < 5)
		{
			// Toss the coin and pass the coin toss to the player object
			myCoin.toss();
			player1.setCoin(myCoin);

			// Get the coin guess from player1:
			System.out.println("Player 1's turn:");
			System.out.print("Heads or Tails? ");
			userChoice = keyboard.nextLine();

			userChoice = convertHeadsTails(userChoice);

			// Validation for Heads and Tails:
			while(userChoice.equals("Invalid"))
			{
				// Get the coin guess from player1:
				System.out.println("\nInvalid entry Still Player 1's turn:");
				System.out.print("Heads or Tails? ");
				userChoice = keyboard.nextLine();

				// Validation for heads and tails:
				userChoice = convertHeadsTails(userChoice);
			}

			// Pass in the user's guess to set the user's guess.
			player1.setGuess(userChoice);

			// Determine if the user's guess is correct:
			player1.isGuessCorrect();

			// If guess is correct add a point and display total score.
			if(player1.getIsGuessCorrect())
			{
				System.out.println("\nYes, it is " + userChoice + ".\nYou earned a point!");
				player1.addPoint();
				System.out.println("Your total points: " + player1.getPoints());
				System.out.println();
			}
			// If the guess is wrong, subtract a point and display the score.
			else
			{
				System.out.println("\nNo, it is " + myCoin.getSideUp());
				player1.subtractPoint();
				System.out.println("Your total points: " + player1.getPoints());
				System.out.println();

			}

			// Player 2's Turn:
			if(player1.getPoints() != 5)
			{
				// Toss the coin and pass the coin toss to the player object
				myCoin.toss();
				player2.setCoin(myCoin);

				// Get the coin guess from player2:
				System.out.println("Player 2's turn:");
				System.out.print("Heads or Tails? ");
				userChoice = keyboard.nextLine();

				// Validation for heads and tails:
				userChoice = convertHeadsTails(userChoice);

				// Validation for Heads and Tails:
				while(userChoice.equals("Invalid"))
				{
					// Get the coin guess from player1:
					System.out.println("\nInvalid entry Still Player 1's turn:");
					System.out.print("Heads or Tails? ");
					userChoice = keyboard.nextLine();

					userChoice = convertHeadsTails(userChoice);
				}

				// Pass in the user's guess to set the user's guess.
				player2.setGuess(userChoice);
				player2.isGuessCorrect();

				// If guess is correct add a point and display total score.
				if(player2.getIsGuessCorrect())
				{
					System.out.println("\nYes, it is " + userChoice + ".\nYou earned a point!");
					player2.addPoint();
					System.out.println("Your total points: " + player2.getPoints());
					System.out.println();
				}
				// If the guess is wrong, subtract a point and display the score.
				else
				{
					System.out.println("\nNo, it is " + myCoin.getSideUp());
					player2.subtractPoint();
					System.out.println("Your total points: " + player2.getPoints());
					System.out.println();

				}

			}
		}

		// Display who won the game:
		if(player1.getPoints() == 5)
			System.out.println("\nPlayer 1 is the winner!\n");
		else
			System.out.println("\nPlayer 2 is the winner!\n");

	}

	// Method to convert the user's choice to Heads or tails
	// regardless of how they enter it otherwise set to "invalid".
	public static String convertHeadsTails(String userChoice)
	{
		switch(userChoice)
		{
			case "Heads": case "heads": case "h": case "H":
				userChoice = "Heads";
				break;
			case "Tails": case "tails": case "t": case "T":
				userChoice = "Tails";
				break;
			default:
				userChoice = "Invalid";
		}

		return userChoice;
	}
}