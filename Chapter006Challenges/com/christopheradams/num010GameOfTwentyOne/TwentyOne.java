package com.christopheradams.num010GameOfTwentyOne;

import java.util.*;

public class TwentyOne
{
	public static void main(String[]args)
	{
		// Variables:
		char hitStand = 'n';
		boolean isPlayerBust = false;
		int cardNum = 0;

		// Create ArrayList tol hold the dealer's cards:
		ArrayList<String> dealerCards = new ArrayList<String>();

		DealerPlayer myDealer = new DealerPlayer();
		DealerPlayer player1 = new DealerPlayer();

		for(int i = 0; i < 2; i++)
		{
			myDealer.deal();
		}

		// Store the player's cards in ArrayList reference:
		dealerCards = myDealer.getCardFace();

		System.out.println("The Dealer:");
		System.out.println("HOLE CARD UNKNOWN");
		System.out.println("Card Showing: " + dealerCards.get(1));

		System.out.println("\nPlayer 1:");
		for(cardNum = 0; cardNum < 2; cardNum++)
		{
			player1.deal();
			System.out.println("Card " + (cardNum+1) + ": ");
			System.out.println("Face Values: " + player1.getCardFace());
			System.out.println("Hand Total: " + player1.gethandTotal());
			System.out.println();
		}

		// Create Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Ask user if they want to hit or stand:
		System.out.print("\nEnter h for hit or s for stand: ");
		hitStand = keyboard.nextLine().charAt(0);

		// Loop as long as player keeps answer hit and player is not over 21.
		while(!isPlayerBust && hitStand == 'h' || hitStand == 'H')
			if(hitStand == 'h' || hitStand == 'H')
			{
				player1.deal();
				System.out.println("Card " + (cardNum+1) + ": ");
				System.out.println("Face Values: " + player1.getCardFace());
				System.out.println("Hand Total: " + player1.gethandTotal());
				System.out.println();
				cardNum++;

				if(player1.gethandTotal() > 21)
				{
					isPlayerBust = true;
					System.out.println("Face Value: " + player1.getCardFace());
					System.out.println("Hand Total: " + player1.gethandTotal());
					System.out.println("Busted! You lose!");
				}
				else
				{
					System.out.print("\nEnter h for hit or s for stand: ");
					hitStand = keyboard.nextLine().charAt(0);
				}
			}

		while(myDealer.gethandTotal() < 17 && !isPlayerBust)
		{
			int dealerCounter = 2;

			myDealer.deal();

			dealerCounter++;

			System.out.println();
			System.out.println("The Dealers Cards:");
			System.out.println("Card " + (dealerCounter) + ": ");
			System.out.println("Face Values: " + myDealer.getCardFace());
			System.out.println("Hand Total: " + myDealer.gethandTotal());
			System.out.println();
		}

		if(!isPlayerBust)
		{
			if(player1.gethandTotal() > myDealer.gethandTotal() && player1.gethandTotal() <= 21)
			{
				if(player1.gethandTotal() == 21)
					System.out.println("\nThe player wins with BlackJack!!!!!!");
				else
					System.out.println("\nThe player wins!!!!!");
			}
			else if(myDealer.gethandTotal() > player1.gethandTotal() && myDealer.gethandTotal() <= 21)
			{
				if(myDealer.gethandTotal() == 21)
					System.out.println("\nThe dealer wins yet again with BlackJack!!!!!!");
				else
					System.out.println("\nThe dealer wins yet again....");
			}
			else if(myDealer.gethandTotal() > 21 && player1.gethandTotal() <= 21)
			{
				System.out.println("\nThe player wins!!!!!");
			}
			else if(player1.gethandTotal() > 21 && myDealer.gethandTotal() <= 21)
			{
				System.out.println("\nThe dealer wins yet again!");
			}
			else
			{
				System.out.println("It's a tie!");
			}

		}
		else
		{
			System.out.println("\nPlayer busted!, Dealer wins yet again...");
		}





	}

}