package com.christopheradams.ch3Challenges.num001RomanNumerals;

import java.util.*;			// For scanner input and other utility tasks.

/*
	Christopher Adams
	5/13/2016
	Roman Numberals
*/

/*
	Promt the user to enter values within the range 1 through 10.
	Display the roman numeral for that number.
	If number is outside range of 1 through 10 then display an error.
*/

public class ch3p1RomanNumberals
{
	public static void main(String[]args)
	{
		// Create variable to hold the number from user.
		int romanNum = 1;

		// Create a new scanner for input:
		Scanner keyboard = new Scanner(System.in);

		// Prompt the user to enter a number:
		System.out.print("Please enter a number in the range of 1 through 10: ");
		romanNum = keyboard.nextInt();

		// If input is within range then display the roman numbera.
		if(romanNum >= 1 && romanNum <= 10)
		{
			// Switch statement is based on the number entered from user.
			// It displays proper roman number based on its value.
			switch(romanNum)
			{
				case 1:
				System.out.println("Your number as a Roman Numeral is: I");
				break;

				case 2:
				System.out.println("Your number as a Roman Numeral is: II");
				break;

				case 3:
				System.out.println("Your number as a Roman Numeral is: III");
				break;

				case 4:
				System.out.println("Your number as a Roman Numeral is: IV");
				break;

				case 5:
				System.out.println("Your number as a Roman Numeral is: V");
				break;

				case 6:
				System.out.println("Your number as a Roman Numeral is: VI");
				break;

				case 7:
				System.out.println("Your number as a Roman Numeral is: VII");
				break;

				case 8:
				System.out.println("Your number as a Roman Numeral is: VIII");
				break;

				case 9:
				System.out.println("Your number as a Roman Numeral is: IX");
				break;

				case 10:
				System.out.println("Your number as a Roman Numeral is: X");
				break;

				default:
				System.out.println("What the heck did you enter??!?");
			}
		}
		else
		{
			System.out.println("Invalid data, Goodbye!");
		}

	}
}