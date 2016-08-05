package com.christopheradams.num016CoinTossSimulator;

public class CoinTossClient
{
	public static void main(String[]args)
	{
		int numTimes = 100;
		int numHeads = 0;
		int numTails = 0;
		double percentHeads = 0.0;
		double percentTails = 0.0;

		// Create an instance of the Coin class:
		Coin myCoin = new Coin();

		System.out.println("The side of the coin facing up to start is: " +
			myCoin.getSideUp() + "\n");

		System.out.println("\nNow tossing the coin " + numTimes + " times.\n");

		for(int i = 0; i < numTimes; i++)
		{
			myCoin.toss();
			System.out.println("Tossing coin....");
			System.out.println("Coin is now: " + myCoin.getSideUp() + "\n");
			if(myCoin.getSideUp().equals("Heads"))
			{
				numHeads++;
			}
			else
			{
				numTails++;
			}
		}

		// Calculate percentage of heads and tails:
		percentHeads = (double)numHeads / numTimes * 100;
		percentTails = (double)numTails / numTimes * 100;

		System.out.println("\nTotal Heads: " + numHeads);

		System.out.println("\nTotal Tails: " + numTails);

		System.out.printf("%nThat's %.0f%% heads.%n", percentHeads);
		System.out.printf("%nThat's %.0f%% tails.%n%n", percentTails);

		System.out.println("Remember, heads always dreads, and tails never fails...");
		System.out.println("Or was it tails always fails... You be the judge!");



	}

}