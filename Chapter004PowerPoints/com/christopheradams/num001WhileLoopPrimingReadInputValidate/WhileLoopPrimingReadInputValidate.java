package com.christopheradams.num001WhileLoopPrimingReadInputValidate;

import java.util.*;		// For scanner and other utilities.

public class WhileLoopPrimingReadInputValidate
{
	public static void main(String[]args)
	{
		// Create scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Variables:
		int userNum = 0;

		// Get the priming read input from the user before entering the loop.
		System.out.print("Please enter a number between 1 and 100: ");
		userNum = keyboard.nextInt();

		while(userNum < 1 || userNum > 100)
		{
			// Not in the range so prompt for input again.
			System.out.print("Please enter a number between 1 and 100: ");
			userNum = keyboard.nextInt();
		}

		System.out.println("\nYou chose " + userNum + ".");
	}
}