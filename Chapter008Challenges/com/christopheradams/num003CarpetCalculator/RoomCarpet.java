package com.christopheradams.num003CarpetCalculator;

public class RoomCarpet
{
	// Fields:
	// RoomSize is example of aggregation because RoomCarpet
	// has another class (RoomSize) as a field.
	private RoomSize size;

	private double carpetCost;				// Cost of carpet per square foot.

	/**
		Constructor
	*/
	public RoomCarpet(RoomSize theRoomSize, double cost)
	{
		size = theRoomSize;
		carpetCost = cost;
	}

	// Methods:
	public double getTotalCost()
	{
		double totalCost = size.calcArea() * carpetCost;
		return totalCost;
	}

	public String toString()
	{
		String formattedString = String.format("%n%-20s$%.2f%n", "Total Cost: ", getTotalCost());

		return formattedString;
	}
}