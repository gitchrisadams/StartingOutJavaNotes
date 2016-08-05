package com.christopheradams.ch3Challenges.num005MassAndWeight;


// Scanner input and other utilities.
import java.util.Scanner;

public class MassAndWeight
{
	public static void main(String[]args)
	{
		// Variables:
		int mass = 0;					// The mass of the object.
		double weight = 0.0;			// The weight of an object.

		mass = massInput();

		weight = calcWeight(mass);

		System.out.printf("The weight of your object is %,.2f newtons.%n", weight);


	}


	/**
		The massInput() method gets the input from the user.
		@return the mass of the object.
	*/
	public static int massInput()
	{
		// Variables:
		int mass = 0;			// The mass of the object from the user.
		double weight = 0.0;		// The weight of the object.

		// Create a Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Get the mass of the object from the user.
		System.out.println("Please enter the mass of the object in Kilogram whole numbers:");
		System.out.println("Enter a number between 10 and 1000 inclusive.");
		System.out.print("Enter the mass: ");
		mass = keyboard.nextInt();
		System.out.println();

		// If the mass is more than 1000 Kilos display that
		// the object is too heavy. Otherwise if less than 10
		// display it is too light. In both cases, prompt user for
		// input again.
		while(mass > 1000 || mass < 10)
		{
			if(mass > 1000)
			{
				System.out.println("The object is too heavy!");
				System.out.print("Please enter a valid mass: ");
				mass = keyboard.nextInt();
				System.out.println();
			}
			else if(mass < 10)
			{
				System.out.println("The object is too light!");
				System.out.print("Please enter a valid mass: ");
				mass = keyboard.nextInt();
				System.out.println();
			}
		}

		return mass;
	}


	/**
		The calcWeight() method calculates the weight based on the objects mass.
		@param mass The mass of the object.
		@return The weight of the object.
	*/
	public static double calcWeight(int mass)
	{
		// Variables:
		double weight = 0.0;			// The weight of the object.

		// Constants:
		double MASS_MULTIPLIER = 9.8;

		// Calculate the weight.
		weight = mass * MASS_MULTIPLIER;

		// Return the weight to calling method.
		return weight;
	}
}