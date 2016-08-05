package com.christopheradams.num003SetArraysWithInitializationListOfValues;

import java.util.*;

public class SetArraysWithInitializationListOfValues003
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		// Create a new array with initialization list.
		int[]days = {31, 28, 31, 30, 31, 30, 31};

		// Loop through the 7 elements in the array. days[0] to days[6]
		for(int index = 0; index < 7; index++)
		{
			// Notice the Month number is index + 1, because array first index is 0.
			System.out.println("Month " + (index + 1) + " has " + days[index] + " days.");
		}

	}
}