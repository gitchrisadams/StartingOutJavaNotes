package com.christopheradams.num011FirstToOneGame;

public class Player
{
	// Fields:
	private int points;
	private Die dice;
	private boolean isWinner;

	// Constants:
	private final int STARTING_POINTS = 50;

	/**
		Constructor
	*/
	public Player(Die theDice)
	{
		points = STARTING_POINTS;
		dice = theDice;
		isWinner = false;
	}

	// Getters:
	public int getPoints()
	{
		return points;
	}

	public boolean getIsWinner()
	{
		return isWinner;
	}

	// Methods:
	public void subtractPoints()
	{
		if(points < 1 && points != 1)
		{
			points += dice.getValue();
			if(points == 1)
				isWinner = true;
		}
		else if(points == 1)
			isWinner = true;
		else if(points > 1 && points != 1)
			points -= dice.getValue();
			if(points == 1)
				isWinner = true;
	}
}