package com.christopheradams.ch6Notes.numch6P1RectangleClassAndDemo;

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
		// Create a Rectangle object called box and assign its address to box.
		Rectangle box = new Rectangle();

		// We can create as many different objects from the Rectangle calss as we want.
		// Create another object from the Rectangle class:
		Rectangle bedroom = new Rectangle();

		// Output what we are doing in our program:
		System.out.println("Sending the value 10.0 to the setLength method.\n");

		// Call our box object's setLength method to set our length to 10.0:
		box.setLength(10.0);

		// Call our bedroom object's setLength method to set our length to 50.0:
		bedroom.setLength(50.0);

		// Set the width of our box object to 20.0:
		box.setWidth(20.0);

		// Set the width of our bedroom object to 80.0:
		bedroom.setWidth(80.0);

		// Display the length of our box object:
		System.out.println("The box's length is " + box.getLength() + ".\n");

		// Display the width of our box object:
		System.out.println("The box's width is " + box.getWidth() + ".\n");

		// Display the area of our box rectangle:
		System.out.println("The area of our box rectangle is " + box.getArea() + "\n");

		// Display the area of our bedroom rectangle:
		System.out.println("The area of our bedroom rectangle is " + bedroom.getArea() + "\n");

	}
}