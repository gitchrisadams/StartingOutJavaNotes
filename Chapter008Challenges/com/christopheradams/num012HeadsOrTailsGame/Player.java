package com.christopheradams.num012HeadsOrTailsGame;

public class Player
{
	// Fields:
	private String guess;			// Player's guess of heads or tails.
	private int points;				// The player's points.
	private boolean isGuessRight;	// True if player's guess is right.

	private Coin theCoin;			// A reference to a Coin object.

	/**
		Constructor
	*/
	public Player(Coin coin)
	{
		theCoin = coin;

	}

	// Getters:
	public boolean getIsGuessCorrect()
	{
		return isGuessRight;
	}

	public int getPoints()
	{
		return points;
	}

	// Setters:
	public void setGuess(String guess)
	{
		this.guess = guess;
	}

	public void setCoin(Coin coin)
	{
		coin = theCoin;
	}

	// Methods:
	public void isGuessCorrect()
	{
		if(guess.equals(theCoin.getSideUp()))
		{
			isGuessRight = true;
		}
		else
		{
			isGuessRight = false;
		}
	}

	public void addPoint()
	{
		points++;
	}

	public void subtractPoint()
	{
		points--;
	}
}








