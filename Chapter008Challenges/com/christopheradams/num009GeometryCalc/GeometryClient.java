package com.christopheradams.num009GeometryCalc;

import java.util.*;

public class GeometryClient
{
	public static void main(String[]args)
	{
		// Variables:
		int userChoice = 0;
		double radius = 0.0;
		double width = 0.0;
		double length = 0.0;
		double base = 0.0;
		double height = 0.0;

		double areaCircle = 0.0;
		double areaRect = 0.0;
		double areaTri = 0.0;

		// Create a Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Geometry Calculator");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Quit\n");

		System.out.print("Enter your choice (1-4): ");
		userChoice = keyboard.nextInt();
		System.out.println();

		while(userChoice < 1 || userChoice > 4)
		{
			System.out.print("Invalid choice, please re-enter: ");
			userChoice = keyboard.nextInt();
		}

		while(userChoice >= 1 && userChoice < 4)
		{

			switch(userChoice)
			{
				case 1:
					System.out.print("Enter the radius of the Circle:");
					radius = keyboard.nextDouble();

					// Call the method to calculate the radius of the circle:
					areaCircle = Geometry.circleArea(radius);
					System.out.println("\nThe area of the Circle is: " + areaCircle);
					System.out.println();
					break;
				case 2:
					System.out.print("Enter the length of the Rectangle:");
					length = keyboard.nextDouble();

					System.out.print("Enter the width of the Rectangle:");
					width = keyboard.nextDouble();

					// Call the method to calculate the radius of the circle:
					areaRect = Geometry.rectArea(length, width);
					System.out.println("\nThe area of the Rectangle is: " + areaRect);
					System.out.println();
					break;
				case 3:
					System.out.print("Enter the base of the Triangle:");
					base = keyboard.nextDouble();

					System.out.print("Enter the height of the Triangle:");
					height = keyboard.nextDouble();

					// Call the method to calculate the radius of the circle:
					areaTri = Geometry.triArea(base, height);
					System.out.println();

					System.out.println("\nThe area of the Triangle is: " + areaTri);
					break;
			}

			System.out.println("Geometry Calculator");
			System.out.println("1. Calculate the Area of a Circle");
			System.out.println("2. Calculate the Area of a Rectangle");
			System.out.println("3. Calculate the Area of a Triangle");
			System.out.println("4. Quit\n");

			System.out.print("Enter your choice (1-4): ");
			userChoice = keyboard.nextInt();
			System.out.println();

			while(userChoice < 1 || userChoice > 4)
			{
				System.out.print("Invalid choice, please re-enter: ");
				userChoice = keyboard.nextInt();
			}

		}
	}
}