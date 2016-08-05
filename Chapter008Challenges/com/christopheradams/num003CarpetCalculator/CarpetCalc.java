package com.christopheradams.num003CarpetCalculator;

public class CarpetCalc
{
	public static void main(String[]args)
	{
		double cost = 10.0;			// The cost per square foot of the carpet.

		// Create a new RoomSize object:
		RoomSize myRoom1 = new RoomSize(10.0, 10.0);

		// Create a new RoomCarpet object:
		// We pass in the RoomSize object we created above along with the cost.
		RoomCarpet myRoomCarpet1 = new RoomCarpet(myRoom1, cost);

		// Output the cost using our toString method. (No need to state toString())
		System.out.println(myRoomCarpet1);

	}
}