package com.christopheradams.num016CoinTossSimulator;

import java.util.*;

public class Coin
{
	// Fields:
	private String sideUp;

	Random randNum = new Random();

	public Coin()
	{
		toss();
	}

	// Getters:
	public String getSideUp()
	{
		return sideUp;
	}

	// Methods:
	public void toss()
	{
		int randomNumber = randNum.nextInt(2) + 1;

		if(randomNumber == 1)
		{
			sideUp = "Heads";
		}
		else
		{
			sideUp = "Tails";
		}
	}









}