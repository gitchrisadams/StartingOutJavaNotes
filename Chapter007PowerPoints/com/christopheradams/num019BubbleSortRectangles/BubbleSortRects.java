package com.christopheradams.num019BubbleSortRectangles;

import java.util.*;		// For Scanner class.

public class BubbleSortRects
{
	public static void main(String[]args)
	{
		// Variables:
		double rLength = 0.0;
		double rWidth = 0.0;

		// Constant for Rectangle array size:
		final int ARRAY_SIZE = 5;

		// Create Scanner for keyboard input:
		Scanner keyboard = new Scanner(System.in);

		// Create a Rectangle array:
		Rectangle[] rArray = new Rectangle[ARRAY_SIZE];

		// Create 5 Rectangles:
		for(int i = 0; i < rArray.length; i++)
		{
			// Get the width and length of the rect from user.
			System.out.println("Enter length: \n");
			rLength = keyboard.nextDouble();
			System.out.println("Enter width: \n");
			rWidth = keyboard.nextDouble();

			// Create new Rectable objects with user's width and length:
			rArray[i] = new Rectangle(rLength, rWidth);
		}

		// Call method to bubble sort the rectangles:
		bubbleSort(rArray);

		// Display the Rectangles:
		for(int i = 0; i < rArray.length; i++)
		{
			System.out.println("\nRectangle " + (i+1) + ":\n" + rArray[i].toString()
								+ "\nArea: " + String.format("%.1f", rArray[i].getArea()));
		}
	}

	/**
		The bubbleSort() method sorts and array of rectangles from largest to smallest area.
		@param rect The array to be sorted.
	*/
	public static void bubbleSort(Rectangle[] rect)
	{
		boolean swap;					// Tells us if rectangle has been swapped.
		Rectangle temp;					// Temp variable to hold Rectangle before swapping it.
		int last = rect.length - 1;		// Controls the number of iterations.

		// Outter loop to loop through each pass of all our Rectangles.
		// Loop once then keep looping while boolean is true.
		do
		{
			// Start swap as being false, and set it to true if we do in fact swap.
			swap = false;

			// Inner loop to loop through each rectangle.
			for(int i = 0; i < last; i++)
			{
				// If statement to compare the area of each rectangle.
				// *************  The > will sort in ascending order. ****************
				// ************** The < will sort in descending order. ***************
				if(rect[i].getArea() < rect[i+1].getArea())
				{
					// Then swap them:
					// Assign the the first rect to temp variable.
					temp = rect[i];

					// Assign the next rect to the first rect.
					rect[i] = rect[i+1];

					// Assign the temp variable to the next rect.
					rect[i+1] = temp;

					// We swapped them so set boolean to true.
					swap = true;

				}
			}
			// Out of the inner loop so decrement the last counter
			// so we don't search through entire array each pass.
			last--;

		} while(swap);
	}
}