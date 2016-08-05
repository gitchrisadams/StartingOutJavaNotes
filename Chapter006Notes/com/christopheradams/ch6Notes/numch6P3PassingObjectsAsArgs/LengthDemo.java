package com.christopheradams.ch6Notes.numch6P3PassingObjectsAsArgs;

/*
	Christopher Adams
	5/03/2016
*/
/**
	Demonstrates our Rectangle Class and the setLength method.
*/


public class LengthDemo
{
	public static void main(String[] args)
	{
		// Create two constant:
		final int SHORT_LENGTH = 2;
		final int LONG_WIDTH = 30;

		// Create a rectangle passing in a shortLength and a longWidth.
		Rectangle myNewRect = new Rectangle(SHORT_LENGTH, LONG_WIDTH);

		// Create a new Rectangle using our constructor(Normal way for comparison):
		Rectangle myBoxWithConstructor = new Rectangle(15.0, 5.0);

		// Display the area of the box we created using the constructor that
		// initialized length to 15.0 and width to 5.0:
		System.out.println("The area the box we created with our " +
							" constructor is " + myBoxWithConstructor.getArea() + "\n");

		// Call the describeRect method passing in our Rectangle Object:
		myNewRect.describeRect(myNewRect);

	}
}