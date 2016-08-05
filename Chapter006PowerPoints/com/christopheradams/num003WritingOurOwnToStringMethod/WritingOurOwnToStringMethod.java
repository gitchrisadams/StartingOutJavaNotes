package com.christopheradams.num003WritingOurOwnToStringMethod;

/*
	Christopher Adams
	5/03/2016
*/
/**
	Demonstrates our Rectangle Class and the setLength method.
*/


public class WritingOurOwnToStringMethod
{
	public static void main(String[] args)
	{
		// Create two constant:
		final int SHORT_LENGTH = 2;
		final int LONG_WIDTH = 30;

		// Create a rectangle passing in a shortLength and a longWidth.
		Rectangle myNewRect = new Rectangle(SHORT_LENGTH, LONG_WIDTH);

		// Display the Rectangle using our toString method we created in
		// the Rectangle class.
		System.out.println(myNewRect.toString());

	}
}