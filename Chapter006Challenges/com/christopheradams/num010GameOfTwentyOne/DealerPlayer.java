package com.christopheradams.num010GameOfTwentyOne;

import java.util.*;

public class DealerPlayer
{
	// Fields:
	private ArrayList<Integer> cards = new ArrayList<Integer>();					// The dealer's cards.
	private ArrayList<String> cardFace = new ArrayList<String>();					// Number, J, Q, K, or Ace
	private int randomFaceValue;
	private int handTotal;
	private boolean aceInHand = false;

	// Create a random number object.
	private Random randomNum = new Random();

	// Constants:
	private final int HIT_VALUE = 16;
	private final int BUST = 22;
	private final int TWENTY_ONE = 21;

	// Getters:
	public ArrayList<Integer> getCards()
	{
		return cards;
	}

	public ArrayList<String> getCardFace()
	{
		return cardFace;
	}

	public int gethandTotal()
	{
		return handTotal;
	}

	// Methods:
	public void deal()
	{
		int cardNum;				// The temp int to store the random card number.

		// Generate a random number between 1 and 21 inclusive for
		// the number of the card. Numbers 1-10 and 11 for the Ace
		cardNum = randomNum.nextInt(10) + 2;

		// If card is less tha 10, store face value as its number:
		if(cardNum > 1 && cardNum < 10)
		{
			cardFace.add(Integer.toString(cardNum));

			if(aceInHand && cardNum + handTotal > 21)
			{
				handTotal += cardNum - 10;
				aceInHand = false;
			}
			else
			{
				handTotal += cardNum;
			}
		}
		// Generate a random number for the the face card if
		// the card comes up as 10. So it mixes up between
		// 10, Jack, Queen, King.
		else if(cardNum == 10)
		{
			// Generate random number between 1 and 4 inclusive.
			// For the 10, Jack, Queen, or King.
			randomFaceValue = randomNum.nextInt(4) + 1;
			if(randomFaceValue == 1)
				cardFace.add("10");
			else if(randomFaceValue == 2)
				cardFace.add("Jack");
			else if(randomFaceValue == 3)
				cardFace.add("Queen");
			else
				cardFace.add("King");

			if(aceInHand && cardNum + handTotal > 21)
			{
				handTotal += cardNum - 10;
				aceInHand = false;
			}
			else
			{
				handTotal += cardNum;
			}
		}
		// Card number is an Ace.
		else if(cardNum == 11)
		{
			// Set the boolean for an ace in the hand to true:
			aceInHand = true;

			// If adding 11 would result in bust, just add one instead.
			cardFace.add("Ace");

			if(aceInHand && cardNum + handTotal > 21)
			{
				handTotal += cardNum - 10;
				aceInHand = false;
			}
			else
			{
				handTotal += cardNum;
			}

		}

		// Add the card number value to our cards ArrayList.
		cards.add(cardNum);
	}
}