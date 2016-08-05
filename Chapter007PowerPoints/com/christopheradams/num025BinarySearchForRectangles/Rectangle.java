package com.christopheradams.num025BinarySearchForRectangles;

public class Rectangle
{
	// Fields:
	private double length;
	private double width;

	// Constructor:
	public Rectangle(double len, double wid)
	{
		setLength(len);
		setWidth(wid);
	}

	// Setters:
	public void setLength(double len)
	{
		if(len >= 0)
			length = len;
	}

	public void setWidth(double wid)
	{
		if(wid >= 0)
			width = wid;
	}

	// Getters:
	public double getLength()
	{
		return length;
	}

	public double getWidth()
	{
		return width;
	}

	// Methods:
	public double getArea()
	{
		return length * width;
	}

	public String toString()
	{
		String temp;

		temp = String.format("Length = %.1f \nWidth = %.1f", length, width);

		return temp;
	}
}