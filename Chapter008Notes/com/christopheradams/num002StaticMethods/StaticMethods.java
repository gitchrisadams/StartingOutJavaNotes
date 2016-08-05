package com.christopheradams.num002StaticMethods;

public class StaticMethods
{
	// Create a static method:
	public static double milesToKilometers(double m)
	{
		// Convert milels to kilos:
		return m * 1.609;
	}

	// Static method to conver kilos to miles.
	public static double kilometersToMiles(double k)
	{
		return k / 1.609;
	}
}