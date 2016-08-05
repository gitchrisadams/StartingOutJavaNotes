package com.christopheradams.num011FreezingAndBoilingPoints;

import java.util.*;

public class FreezingBoilingClient
{
	public static void main(String[]args)
	{
		// Variables:
		int temp = 0;

		// Create a Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Get the temperature from the user.
		System.out.print("Enter the temperature: ");
		temp = keyboard.nextInt();

		// Create a new FreezingBoiling object:
		FreezingBoiling temp1 = new FreezingBoiling(temp);

		System.out.println("The following are freezing or boiling at " + temp1.getTemp() + " degrees: \n");
		if(temp1.isEthylFreezing())
			System.out.println("Ehtyl Alcohol is freezing.\n");
		if(temp1.isEthylBoiling())
			System.out.println("Ehtyl Alcohol is boiling.\n");
		if(temp1.isOxygenFreezing())
			System.out.println("Oxygen is freezing.\n");
		if(temp1.isOxygenBoiling())
			System.out.println("Oxygen is boiling.\n");
		if(temp1.isWaterFreezing())
			System.out.println("Water is freezing.\n");
		if(temp1.isWaterBoiling())
			System.out.println("Water is boiling.\n");
	}
}