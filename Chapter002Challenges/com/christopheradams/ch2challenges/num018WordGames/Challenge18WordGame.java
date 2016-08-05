package com.christopheradams.ch2challenges.num018WordGames;

// For user input and other utility tasks.
import java.util.Scanner;

/*
	Christopher Adams
	5/13/2016
	Word Game
*/

/*
	This program gets input from the user for:
	1. His/Her name.
	2. His/Her age.
	3. Name of city they live in.
	4. Name of college they attend.
	5. What they do for a job.
	6. What type of animal they have.
	7. Their pet's name.
	Once this data is entered, the program will output it in a funny manner.
*/



public class Challenge18WordGame
{
	public static void main(String[]args)
	{
		/***** Create variables to store user input *****/
		String name = "";			// Name of the user.
		int age = 0;				// Age of the user.
		String city = "";			// City where user lives.
		String college = "";		// College the user attends.
		String job = "";			// Job the user does.
		String animal = ""; 		// Type of animal the user owns.
		String petName = "";		// The pet's name.

		// Create a new Scanner for input:
		Scanner keyboard = new Scanner(System.in);

		// Prompt user for input:
		System.out.println("We will be asking you a series of questions and " +
							"then reading you back the story of your life!\n");
		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();

		System.out.print("Please enter your age: ");
		age = keyboard.nextInt();

		// We got int input above, so consume the next line so it prompts for city next.
		keyboard.nextLine();

		System.out.print("What city do you live in? ");
		city = keyboard.nextLine();

		System.out.print("What college do/did you attend? ");
		college = keyboard.nextLine();

		System.out.print("What do you do for a job/occupation? ");
		job = keyboard.nextLine();

		System.out.print("What type of animal do you own? ");
		animal = keyboard.nextLine();

		System.out.print("What is your pet's name? ");
		petName = keyboard.nextLine();

		// Display a funny story about the user:
		System.out.println("There once was a person named " + name + "-o-Rama who lived in " +
							city + ". At the ripe young age of " + age + ", " + name +
							" went to college at " + college + ". " + name + " graduated and " +
							"went to work as a " + job + " star. Then, " +name+ " adopted a(n) " +
							animal + " named " + petName + "-pie. They both lived happily ever" +
							" after!");

	}
}


























