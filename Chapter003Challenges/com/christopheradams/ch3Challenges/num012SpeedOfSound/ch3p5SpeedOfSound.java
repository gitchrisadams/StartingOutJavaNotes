package com.christopheradams.ch3Challenges.num012SpeedOfSound;

import java.util.*;			// For Scanner input and other utility tasks.
/*
	Christopher Adams
	5/14/2016
	The speed of sound.
	Ask the user to enter either the words "Air", "Steel",
	or "Water" as well as the distance that a sound wave
	will travel through that medium.
	This program will then calculate and display the time it takes
	for sound to travel through either air, steel, or water.
	Formulas for calculations:
	Air: Time = Distance / 1100
	Water: Time = Distance / 4900
	Steel: Time = Distance / 16400
*/


public class ch3p5SpeedOfSound
{
	public static void main(String[]args)
	{
		// Create final variables for Air, Water, and Steel.
		final double AIR = 1100;
		final double WATER = 4900;
		final double STEEL = 16400;

		// Create variables:
		double distanceInput = 0;				// Time input from user.
		String soundConduit = "";				// Medium sound travels through.
		double airTime = 0;						// Time for sounds through air.
		double waterTime = 0;					// Time for sounds through water.
		double steelTime = 0;					// Time for sounds through steel.

		// Create scanner object to get time from user.
		Scanner keyboard = new Scanner(System.in);

		// Get the item sound is traveling through from the user.
		System.out.println("What material is the sound going to" +
							" be traveling through.");
		System.out.print("Enter air, water, or steel: ");
		soundConduit = keyboard.nextLine();
		System.out.println();

		// Get the distance the sound is traveling from the user.
		System.out.println("How far is the sound traveling in feet?");
		System.out.print("Enter the number only: ");
		distanceInput = keyboard.nextDouble();

		switch(soundConduit)
		{
			case "air":
			case "AIR":
			case "Air":
				// Calculate airTime using formula.
				airTime = distanceInput / AIR;
				System.out.println("The time it takes sound to get through" +
				" air \nat a distance of " + distanceInput + " feet is " + airTime +
				" seconds.");
				break;

			case "steel":
			case "STEEL":
			case "Steel":
				steelTime = distanceInput / STEEL;
				System.out.println("The time it takes sound to get through" +
				" steel \nat a distance of " + distanceInput + " feet is " + steelTime +
				" seconds.");
				break;

			case "water":
			case "Water":
			case "WATER":
				waterTime = distanceInput / WATER;
				System.out.println("The time it takes sound to get through" +
				" water \nat a distance of " + distanceInput + " feet is " + waterTime +
				" seconds.");
				break;
		}


	}
}
















