package com.christopheradams.num008TemperatureClass;

import java.util.*;

public class TempConvertClient
{
	public static void main(String args[])
	{
		double ftemp = 0.0;				// The temperature in Fahrenheit.
		double ctemp = 0.0;				// The temperature in Celsius.
		double ktemp = 0.0;				// The temperature in Kelvin.

		// Create a Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Get the fahrenheit temp from the user.
		System.out.print("Enter the temp in Fahrenheit: ");
		ftemp = keyboard.nextDouble();

		// Create new TempConvert object:
		TempConvert temp1 = new TempConvert(ftemp);

		// Get the temps in Celsius and Kelvin.
		ctemp = temp1.getCelsTemp();
		ktemp = temp1.getKelvinTemp();

		// Output the different temps:
		System.out.printf("The temp %.2fF degrees is %.2fC degrees %nand %.2fKelvin degrees.%n",
			ftemp, ctemp, ktemp);





	}
}