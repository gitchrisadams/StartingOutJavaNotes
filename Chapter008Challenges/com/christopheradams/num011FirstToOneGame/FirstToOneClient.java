package com.christopheradams.num011FirstToOneGame;

public class FirstToOneClient
{
	public static void main(String[]args)
	{
		// Create two Die objects:
		Die die1 = new Die(6);
		Die die2 = new Die(6);

		// Create players:
		Player player1 = new Player(die1);
		Player player2 = new Player(die2);

		while(player1.getPoints() != 1 && player2.getPoints() != 1)
		{
			die1.roll();
			player1.subtractPoints();
			System.out.println("Player 1 rolled: " + die1.getValue());
			System.out.println("Player 1's total is: " + player1.getPoints());
			System.out.println();

			if(player1.getPoints() != 1)
			{
				die2.roll();
				player2.subtractPoints();
				System.out.println("Player 2 rolled: " + die2.getValue());
				System.out.println("Player 2's total is: " + player2.getPoints());
				System.out.println();
			}
		}

		if(player1.getIsWinner())
			System.out.println("Player one is the winner!");
		else if(player2.getIsWinner())
			System.out.println("Player two is the winner!");
	}
}