package com.christopheradams.ch7Notes.ch7p8ArraysOfObjects;

/*
	Christopher Adams
	5/09/2016
*/
/**
	Demonstrates creating arrays of objects.
*/


public class LengthDemo
{
	public static void main(String[] args)
	{
		// Final to hold the number of rectanges we will create.
		final int NUM_OF_RECTANGLES = 5;

		// Create 5 new rectangle array objects with null values:
		Rectangle[] myRects = new Rectangle[NUM_OF_RECTANGLES];

		// Example output of one of our rects being set to null:
		System.out.println(myRects[0]);

		// Now loop through our array objects and create new rectangles:
		for(int index = 0; index < myRects.length; index++)
		{
			myRects[index] = new Rectangle();
		}

		// Get the width of the myRects[0] element.
		System.out.println(myRects[0].getWidth() + "\n");

		// Get the length of myRects[1] element.
		System.out.println(myRects[1].getLength() + "\n");

		// Set the width of of one of the rectangles in the array.
		myRects[0].setWidth(40.0);

		// Display rect width after setting to 40.0.
		System.out.println("\nThe width of rect after setting to 40: " + myRects[0].getWidth());

	}
}