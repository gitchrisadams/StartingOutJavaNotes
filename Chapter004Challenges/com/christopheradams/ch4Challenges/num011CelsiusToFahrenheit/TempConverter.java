package com.christopheradams.ch4Challenges.num011CelsiusToFahrenheit;

public class TempConverter
{
	public static void main(String[]args)
	{
		displayTemps();
	}

	public static void displayTemps()
	{
		// Heading:
		System.out.printf("%-25s%-25s%n", "Celsius Temperature", "Fahrenheit Temperature");
		System.out.println("_________________________________________________\n");

		// Loop and display temp and covert to Fahrenheit.
		for(int i = 0; i <= 100; i++)
		{
			System.out.printf("%-23d%15.2f%n", i, 9.0/5 * i + 32);
		}
	}
}