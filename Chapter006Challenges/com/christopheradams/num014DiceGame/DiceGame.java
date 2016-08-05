package com.christopheradams.num014DiceGame;

public class DiceGame
{
	public static void main(String[]args)
	{
		// Constants:
		int DIE_SIDES = 6;

		// Variables:
		int playerScore = 0;
		int computerScore = 0;

		// Create two instances of the Die class:
		Die computer = new Die(DIE_SIDES);
		Die player = new Die(DIE_SIDES);

		// Loop 10 times and roll the dice:
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Roll number " + (i+1) + ": ");
			computer.roll();
			System.out.println("The computer's roll is: " + computer.getValue());
			System.out.println();
			player.roll();
			System.out.println("The player's roll is: " + player.getValue() + "\n");

			if(computer.getValue() > player.getValue())
			{
				System.out.println("Computer wins that roll.\n");
				computerScore++;
			}
			else if(computer.getValue() < player.getValue())
			{
				System.out.println("Player wins that roll.\n");
				playerScore++;
			}
			else
			{
				System.out.println("That roll was a draw!\n");
			}
		}

		// Decide who the grand winner is:
		if(playerScore > computerScore)
		{
			System.out.println("The player is the grand winner with a score of: " + playerScore);
		}
		else if(playerScore < computerScore)
		{
			System.out.println("The computer is the grand winner with a score of: " + computerScore);
		}
		else
		{
			System.out.println("Wow it's a draw!");
		}


	}
}