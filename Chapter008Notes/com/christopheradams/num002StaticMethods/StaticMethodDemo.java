package com.christopheradams.num002StaticMethods;

public class StaticMethodDemo
{
	public static void main(String[]args)
	{
		// Create variables to be converted and to convert to:
		double milesToConvert = 150;
		double kilosToConvert = 500;
		double miles;
		double kilos;

		// Call the static methods.
		// Notice we call it based off the class name itself
		// StaticMethods.miles...
		miles = StaticMethods.milesToKilometers(milesToConvert);
		kilos = StaticMethods.kilometersToMiles(kilosToConvert);

		System.out.println(miles);
		System.out.println(kilos);


	}
}