package com.christopheradams.ch7Notes;

import java.util.ArrayList;		// Needed for ArrayList class.
/*
	Christopher Adams
	5/13/2016
	Creating ArrayLists of objects. Using our Rectangle class example.
*/


public class Ch7P19CreatingArrayListsOfObjectsRectangle
{
	public static void main(String[]args)
	{
		// Create an ArrayList to hold the Rectangle objects.
		ArrayList<Rectangle> list = new ArrayList<Rectangle>();

		// Add three Rectangle objects to the ArrayList:
		list.add(new Rectangle(40.0, 30.0));
		list.add(new Rectangle(20.0, 20.0));
		list.add(new Rectangle(10.0, 10.0));

		// Display our Rectangle objects:
		for(int index = 0; index < list.size(); index++)
		{
			Rectangle myRect = list.get(index);
			System.out.println("Rectangle at index " + index + "\nLength: " +
								myRect.getLength());
			System.out.println("Width: " + myRect.getLength() + "\n");
		}

	}
}