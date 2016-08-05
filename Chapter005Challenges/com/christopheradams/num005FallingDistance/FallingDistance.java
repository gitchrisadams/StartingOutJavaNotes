package com.christopheradams.num005FallingDistance;

public class FallingDistance
{
	public static void main(String[]args)
	{
		// Variables:
		double distance = 0.0;			// Storing the distance object has fallen.

		// Loop and display distance object falls.
		for(int i = 1; i <= 60; i++)
		{
			System.out.printf("In %d seconds, the object has fallen %.2f meters.%n", i, fallingDistance(i));
			System.out.printf("That's %.1f feet!%n", fallingDistance(i) * 3.28084);
			System.out.printf("That's %.1f yards!%n", fallingDistance(i) * 3.28084 / 3);
			System.out.printf("That's %.2f foot ball fields!%n", fallingDistance(i) * 3.28084 / 3 / 100);
			System.out.printf("That's %.2f empire state buildings!%n", fallingDistance(i) * 3.28084 / 1250);
			System.out.printf("That's %.2f Mount Everest peaks!%n%n", fallingDistance(i) * 3.28084 / 29029);
		}
	}

	// FORMULA: d = 1/2 g * t ^2    d is distance, t is time in seconds, g is gravity.
	public static double fallingDistance(double t)
	{
		// Constants:
		final double G = 9.8;			// Gravity in the formula.


		// Variables:
		double d = 0.0;					// Distance object will fall in formula.

		// Calculate the distance object has fallen based on formula.
		d = .5 * G * Math.pow(t, 2.0);

		// return the distance.
		return d;
	}
}