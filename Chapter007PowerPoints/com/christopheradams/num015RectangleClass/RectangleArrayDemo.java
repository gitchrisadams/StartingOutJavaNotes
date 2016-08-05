package com.christopheradams.num015RectangleClass;

import java.util.*;

public class RectangleArrayDemo
{
	public static void main(String[]args)
	{
		// Variables:
		double rLength;		// Length of rectangle.
		double rWidth;		// Length of rectangle.
		int num;			// Position of rectangle to change.

		// Constants:
		final int SIZE = 5;		// Size of our array.

		// Create a scanner.
		Scanner keyboard = new Scanner(System.in);

		// Create array with 5 elements using our constant of type Rectangle.
		// NOTE: Our rectangles are not actually in array yet until we
		// do a Rectangle new = new Rectangle....
		Rectangle[] rArray = new Rectangle[SIZE];

		// Loop to create the 5 Rectangles.
		for(int i = 0; i < rArray.length; i++)
		{
			// Get the length and width of rectangle from the user.
			System.out.println("\nRectangle " + (i+1) + " length: ");
			rLength = keyboard.nextDouble();
			System.out.println("\nRectangle " + (i+1) + " width: ");
			rWidth = keyboard.nextDouble();

			// Create the rectangle based on the user's size of length and width:
			rArray[i] = new Rectangle(rLength, rWidth);
		}

		// Loop to display the 5 rectangles.
		for(int i = 0; i < rArray.length; i++)
		{
			System.out.println("\nRectangle " + (i+1) + ":\n" + rArray[i].toString());
		}

		// Loop to change the values using a priming read organiation.
		// Get the priming read.
		System.out.print("\nChange which rectangle? (Enter -1 to quit): ");
		num = keyboard.nextInt();

		// Loop as long as user does not enter -1:
		while(num != -1)
		{
			// Numbers has to be greater than one and
			// less than the length of the array to be valid.
			if(num >= 1 && num <= rArray.length)
			{
				// Rectangle to change is valid so allow user to enter new dimensions.
				System.out.print("New Length: ");
				rLength = keyboard.nextDouble();
				System.out.print("New Width: ");
				rWidth = keyboard.nextDouble();

				// Change rectangle number num - 1 because the user selected
				// the number rectangle to change but array starts counting at zero.
				rArray[num - 1].setLength(rLength);
				rArray[num - 1].setWidth(rWidth);

			}
			else
			{
				// Invalid entry so reminder user of valid entries.
				System.out.println("Please choose a number from 1 to " + rArray.length);
			}

			// Prompt for what rectangle to change:
			System.out.print("\nChange which rectangle? (Enter -1 to quit): ");
			num = keyboard.nextInt();
		}

		// Display rectangles after changes are made.
		for(int i = 0; i < rArray.length; i++)
		{
			System.out.println("\nRectangle " + (i+1) + ":\n" + rArray[i].toString());
		}

	}
}