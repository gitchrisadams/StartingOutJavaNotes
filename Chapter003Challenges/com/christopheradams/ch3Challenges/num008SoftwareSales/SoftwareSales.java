package com.christopheradams.ch3Challenges.num008SoftwareSales;

import java.util.*;			// Scanner input and other utilities.

public class SoftwareSales
{
	// Declare new Scanner for keyboard input as field
	// so available to all methods in class.
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[]args)
	{
		// Variables:
		int numPackages = 0;			// The number of packages the user is purchasing.
		double discount = 0.0;			// The bulk purchasing discount.
		double discountedPrice = 0.0;	// The discounted price per package.
		double totalPrice = 0.0;		// The total price after discounts are applied.

		// Call method to display the welcome message to the user.
		displayWelcome();

		// Call method to get the number of packages purchased from the user.
		numPackages = inputPackagesPurchased();

		// Call method to calculate the bulk purchasing discount.
		discount = calcDiscount(numPackages);

		// Call method to calculate the discounted price per package.
		discountedPrice = calcDiscountPrice(discount);

		// Call method to calculate the total after discount is applied.
		totalPrice = calcTotal(numPackages, discountedPrice);

		// Call method to display the data on the total sale.
		displaySale(discount, discountedPrice, totalPrice);
	}

	/**
		The displayWelcome() method displays the opening welcome message to the user.
	*/
	public static void displayWelcome()
	{
		System.out.println("Welecome to the Software Sales program");
		System.out.println("This program will allow you to purchase our wonderful" +
			" sales program. It retails for $99 per package.\n");
		System.out.println("But wait!! You get the folowing bulk purchas discounts!\n");
		System.out.printf("%-15s%-15s", "Quantity", "Discount");
		System.out.println("---------------------------------");
		System.out.printf("%-17s%-15s%n", "10-19", "20%");
		System.out.printf("%-17s%-15s%n", "20-49", "30%");
		System.out.printf("%-17s%-15s%n", "50-99", "40%");
		System.out.printf("%-17s%-15s%n", "100+", "50%");
		System.out.println();
	}

	/**
		The inputPackagesPurchased() method gets the number of packages the user
		is purchasing from the user.
		@return The number of packages the user is purchasing.
	*/
	public static int inputPackagesPurchased()
	{
		// Variables:
		int numPackages = 0;

		// Constants:
		final double PRICE = 99.00;			// The price of the software package.

		// Get the number of packages from the user.
		System.out.print("How many packages are you purchasing: ");
		numPackages = keyboard.nextInt();

		// return the number of packages to the calling method.
		return numPackages;
	}

	/**
		The calcDiscount() method calculates the bulk purchasing
		discount.
		@param numPackages The number of packages being purchased.
		@return The the bulk purchasing discount.
	*/
	public static double calcDiscount(int numPackages)
	{
		// Variables:
		double discount = 0.0;

		// Calculate the discount.
		if(numPackages >=10 && numPackages <=19)
			discount = .20;
		else if(numPackages >=20 && numPackages <=49)
			discount = .30;
		else if(numPackages >=50 && numPackages <=99)
			discount = .40;
		else if(numPackages >= 100)
			discount = .50;

		// Return the discount to calling method.
		return discount;
	}

	public static double calcDiscountPrice(double discount)
	{
		// Variables:
		double discountedPrice = 0.00;

		// Constants:
		double PRICE = 99.00;

		// Multiply the full price by the discount percent to get the
		// discounted price.
		discountedPrice = PRICE * discount;

		// Return the discounted price to calling method.
		return discountedPrice;
	}

	public static double calcTotal(int numPackages, double discountedPrice)
	{
		// Variables:
		double totalPrice = 0.0;			// The total price after discounts are applied.

		// Calculate the total price after discounts applied.
		totalPrice = numPackages * discountedPrice;

		// Return the total price to the calling function.
		return totalPrice;
	}

	/**
		The displaySale() method displays information about the sale.
		@param discount The discounted price per package.
		@param discountedPrice The price price per package after discount applied.
		@param totalPrice The total price after discounts are applied.
	*/
	public static void displaySale(double discount, double discountedPrice, double totalPrice)
	{
		System.out.printf("%nYou received a discout of %.0f%% per package.%n%n", discount * 100);
		System.out.printf("You are paying $%.2f per package.%n%n", discountedPrice);
		System.out.printf("The total sale is: $%.2f" + ".%n%n%n", totalPrice);
	}
}