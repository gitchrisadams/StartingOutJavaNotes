package com.christopheradams.num018TriviaGame;

import java.util.*;

public class QuestionsClient
{
	public static void main(String[]args)
	{
		// Variables:
		int player1Total = 0;
		int player2Total = 0;

		// Create an array of 10 answers:
		int[] answers = new int[10];

		// Create an array of 10 question objects:
		Questions[] firstTenQuestions = new Questions[10];

		// Create a Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Create 10 questions and multiple choice answers and correct answers:
		firstTenQuestions[0] = new Questions("Is the world flat?",
			"yes", "no", "maybe so", "Columbus what?", "0");
		firstTenQuestions[1] = new Questions("What is the formula for splitting an atom?",
			"Boom", "Say what?", "x = y / 2 + 9.2 x pie", "none of the above", "3");
		firstTenQuestions[2] = new Questions("Who discovered pie?",
			"James T. Pie", "Dr. Apal Pie", "Yo momma!", "none of the above", "3");
		firstTenQuestions[3] = new Questions("What goes up must....?",
			"go all around", "must stay up unless acted on by an equal and opposite force",
			"must come down!", "none of the above", "2");
		firstTenQuestions[4] = new Questions("Two trains are heading east, a biker is headed north, who is headed west?",
			"Batman", "The Wizard of oz", "Not enough information", "The girl from Ipanema", "2");
		firstTenQuestions[5] = new Questions("Complete the jingle, What would you do for a ...?",
			"good burger!", "Say what?", "Whaddu talking about Willis?", "Klondike bar.", "3");
		firstTenQuestions[6] = new Questions("Complete this line from the movie Tommy boy: Luke, I am your...?",
			"Mamma", "Daddy", "Sister", "Father", "3");
		firstTenQuestions[7] = new Questions("Capital of Utah?",
			"Salty pond", "Utah City", "Salt Lake City", "Boise", "2");
		firstTenQuestions[8] = new Questions("Just answer yes! Trust me?",
			"yes", "Hey, I told you the answer!", "Shirly I'm serious", "And don't call me Shirly", "0");
		firstTenQuestions[9] = new Questions("From a movie. I feel the need, the need for ...?",
			"Watching Top Gun", "Playing a racing video game", "speed", "driving slow", "2");

		// Loop through the questions array.
		for(int i = 0; i < firstTenQuestions.length; i++)
		{
			// Alternate between player 1 and player 2's turn.
			// Get each question and answer from the user.
			if(i % 2 == 0)
			{
				// Display questions and get answers for player 1:
				System.out.println("It is player 1's turn:");
				System.out.println("--------------------------");
				System.out.println("Question " + (i+1) + ": " + firstTenQuestions[i].getQuestions());
				System.out.println("1: " + firstTenQuestions[i].getAnswer0());
				System.out.println("2: " + firstTenQuestions[i].getAnswer1());
				System.out.println("3: " + firstTenQuestions[i].getAnswer2());
				System.out.println("4: " + firstTenQuestions[i].getAnswer3());
				System.out.print("Enter answer 1, 2, 3, or 4: ");
				answers[i] = keyboard.nextInt() - 1;
				System.out.println();

				// If player 1 got it right, then add one to total.
				// Must parse the String to an int first.
				if(answers[i] == Integer.parseInt(firstTenQuestions[i].getCorrectAnswer()))
					player1Total += 1;


			}
			else
			{
				// Display questions and get answers for player 2:
				System.out.println("It is player 2's turn:");
				System.out.println("--------------------------");
				System.out.println("Question " + (i+1) + ": " + firstTenQuestions[i].getQuestions() + "\n\n");
				System.out.println("1: " + firstTenQuestions[i].getAnswer0());
				System.out.println("2: " + firstTenQuestions[i].getAnswer1());
				System.out.println("3: " + firstTenQuestions[i].getAnswer2());
				System.out.println("4: " + firstTenQuestions[i].getAnswer3());
				System.out.print("Enter answer 1, 2, 3, or 4: ");
				answers[i] = keyboard.nextInt() - 1;
				System.out.println();

				// If player 2 got it right, then add one to total.
				// Must parse the String to an int first.
				if(answers[i] == Integer.parseInt(firstTenQuestions[i].getCorrectAnswer()))
					player2Total += 1;
			}
		}

		// Output the player's total scores:
		System.out.println("\nPlayer 1's score: " + player1Total + "\n");

		System.out.println("\nPlayer 2's score: " + player2Total + "\n");

		// Display the winner.
		if(player1Total > player2Total)
			System.out.println("\nPlayer 1 is the winner!");
		else
			System.out.println("\nPlayer 2 is the winner!");
	}
}