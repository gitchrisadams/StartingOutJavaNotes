package com.christopheradams.ch3Challenges.num003BodyMassIndex;

import java.util.Scanner;

public class ch3p2BBodyMassIndex
{
	public static void main(String[]args)
	{
		// Variables:
		double height = 0;
		double weight = 0.0;
		double bodyMassIndex = 0.0;

		// Create a scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the users's height and weight:
		System.out.print("Please enter your height in inches: ");
		height = keyboard.nextDouble();

		System.out.print("\nPlease enter your weight in pounds: ");
		weight = keyboard.nextDouble();

		// Calculate the BMI of the user:
		// Ensure not div by zero.
		if(height > 0)
		{
			bodyMassIndex = weight * 700 / Math.pow(height, 2.0);
		}
		else
		{
			System.out.println("Your height cannot be, " + height);
		}

		System.out.printf("Your BMI is: %.2f%n", bodyMassIndex);

		// If statement to tell if person is optimal, skinny, or overweight:
		if(bodyMassIndex >= 18.5 && bodyMassIndex <= 25)
		{
			System.out.println("\nYou are optimal weight. Way to go! Keep eating kale!");
		}
		else if(bodyMassIndex < 18.5)
		{
			System.out.println("\nDude, you're skinny! Start eating some meat!");
		}
		else
		{
			System.out.println("\nWow, you've really put on the pounds, lay off the doughnuts!");
		}
	}
}








