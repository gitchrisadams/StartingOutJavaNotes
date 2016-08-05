package com.christopheradams.num004LandTractClass;

public class LandTract
{
	// Fields:
	private double length;
	private double width;

	/**
		Constructor
	*/
	public LandTract(double len, double wid)
	{
		length = len;
		width = wid;
	}

	// Methods:
	public double calcArea()
	{
		return length * width;
	}

	public boolean equals(LandTract objectToCompare)
	{
		boolean status;

		if(length == objectToCompare.length && width == objectToCompare.width)
			status = true;
		else
			status = false;

		return status;

	}

	public String toString()
	{
		String formattedString = String.format("%-20s%.1f%10s%n", "Area of the land: ", calcArea(), " Square feet");
		return formattedString;
	}
}