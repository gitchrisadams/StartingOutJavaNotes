package com.christopheradams.ch3Challenges.num009ShippingCharges;

import java.util.*;

public class ShippingChargesClient
{
	public static void main(String[]args)
	{
		// Variables:
		double packageWeight = 0.0;
		double shippingCharges = 0.0;

		// Create a new Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the weight of the package from the user.
		System.out.println("Welcome to FedUP! Shipping, where you are fed up and so are we!");
		System.out.println("Please enter the weight of your package in pounds.");
		System.out.print("Enter the package weight: ");
		packageWeight = keyboard.nextDouble();

		// Create a new Shipping object:
		ShippingCharges package1 = new ShippingCharges(packageWeight);

		shippingCharges = package1.calcShippingCharges();

		System.out.printf("%n%-36s%-25s%n", "Weight of Package", "Rate per 500 Miles Shipped");
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%-45s%.2f%n", "2 pounds or less", package1.getTwoPoundRate());
		System.out.printf("%-45s%.2f%n", "Over 2 pounds, no more than 6", package1.getOverTwoRate());
		System.out.printf("%-45s%.2f%n", "Over 6 pounds, no more than 10", package1.getOverSixRate());
		System.out.printf("%-45s%.2f%n", "Over 10 pounds", package1.getOverTenRate());

		System.out.printf("%nShipping Charges: $%.2f%n", shippingCharges);


	}
}