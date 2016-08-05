package com.christopheradams.num015RouletteWheelColors;

import java.util.*;

public class WheelColorsClient
{
	public static void main(String[]args)
	{
		// Variables:
		int colorNum = 0;
		String pocketColor = "";

		// Create Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Get color number from user:
		System.out.print("Please enter a color number 0-36 inclusive: ");
		colorNum = keyboard.nextInt();

		// Loop while invalid input:
		while(colorNum < 0 || colorNum > 36)
		{
			System.out.println("Invalid number, please a valid number.");
			System.out.print("Please enter a color number 0-36 inclusive: ");
			colorNum = keyboard.nextInt();
		}

		// Create a new WheelColors object:
		WheelColors wheelColors1 = new WheelColors(colorNum);

		pocketColor = wheelColors1.getPocketColor();

		System.out.println("\nThe color of that pocket on the wheel is "
			+ pocketColor + ".\n");


	}
}