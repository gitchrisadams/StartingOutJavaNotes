package com.christopheradams.num003CarpetCalculator;

public class RoomSize
{
	// Fields:
	private double length;
	private double width;

	/**
		Constructor
	*/
	public RoomSize(double len, double wid)
	{
		length = len;
		width = wid;
	}

	// Methods:
	public double calcArea()
	{
		return length * width;
	}

	public String toString()
	{
		String formattedString = String.format("%-15s%.1f%-15s%.1f", "Length: ", length, "Width: ", width);
		return formattedString;
	}
}