package com.christopheradams.num002WritingOurOwnDotEqualsMethodForRectClass;

/*
	Christopher Adams
	5/03/2016
*/
/**
	Demonstrates our Rectangle Class and the setLength method.
*/


public class WritingOurOwnDotEqualsMethodForRectClassDemo
{
	public static void main(String[] args)
	{
		// Create a new Rectangle using our constructor:
		Rectangle box1 = new Rectangle(15.0, 5.0);

		// Create another Rectangle we will use to see if
		// this and above Rectangle are equal using our new .equals method
		// in the Rectangle class.
		Rectangle box2 = new Rectangle(15.0, 5.0);

		if(box1.equals(box2))
			System.out.println("Yes they are equal.");
		else
			System.out.println("Nope, not equal.");


	}
}