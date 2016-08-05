package com.christopheradams.ch6Notes.numch6P1RectangleClassAndDemo;

/**
	Rectangle Class, phase 1
	Under construction.
*/


public class Rectangle
{
	private double length;
	private double width;


	/**
		The setLength method stores a value in the length field.
		@param len The value to store in the length.
	*/
	public void setLength(double len)
	{
		// Store the len value passed to setLength, in the class field length.
		length = len;
	}


	/**
		The setWidth method stores a value in the width field.
		@parm w The value to store in width.
	*/
	public void setWidth(double w)
	{
		// Set the width field in the Rectangle class to w passed in:
		width = w;
	}


	/**
		The getLength method returns a Rectangle object's length.
		@return The value in this Class's length field.
	*/
	public double getLength()
	{
		// Return the Rectangle Class length field to calling function
		return length;
	}


	/**
		The getWidth method returns a Rectangle object's width.
		@return The value in this Class's width field.
	*/
	public double getWidth()
	{
		// Return the Rectangle Class width field to calling function
		return width;
	}


	/**
			The getArea method returns a Rectangle object's area.
			@return The product of length times width.
		*/
		public double getArea()
		{
			// Return the length * the width.
			return length * width;
	}
}