package com.christopheradams.ch4Challenges.num007HotelOccupancy;

/**
	Christopher Adams
	Hotel Occupancy program.
	This program calculates and displays hotel occupancy rates.
*/

import java.util.*;			// For Scanner input and other utilities.

public class HotelOccupancy
{
	public static void main(String[]args)
	{
		// Variables:
		int numFloors = 0;				// The number of floors in the hotel.
		int totalRooms = 0;				// The total number of rooms.
		int totalFilledRooms = 0;		// The total number of filled rooms.
		int availableRooms = 0;			// The number of available rooms.
		double occupancyRate = 0.0;		// The occupancy rate of the hotel.

		// Create an array to store the number of rooms per floor.
		int[] floorRooms;

		// Create an array to store how many rooms are filled.
		int[] filledRooms;

		// Create a Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the number of floors:
		System.out.print("Please enter the number of floors in the hotel: ");
		numFloors = keyboard.nextInt();

		// Validation for the number of floors:
		while(numFloors <= 0)
		{
			System.out.print("Floors can't be less than 1, please enter valid number: ");
			numFloors = keyboard.nextInt();
		}

		// Create the array with the number of floors from the user.
		floorRooms = new int[numFloors];

		// Create array to store the number of filled rooms.
		filledRooms = new int[numFloors];

		// Loop through the array getting the number of rooms per floor
		// from the user.
		for(int i = 0; i < floorRooms.length; i++)
		{
			System.out.print("\nHow many rooms on floor " + (i+1) + ": ");
			floorRooms[i] = keyboard.nextInt();

			// Validation, number of rooms can't be less than 10.
			while(floorRooms[i] < 10)
			{
				System.out.print("\nRooms cannot be less than 10, please enter a valid number: ");
				floorRooms[i] = keyboard.nextInt();
			}

			// Accumulate the total rooms:
			totalRooms += floorRooms[i];

			// Get the number of occupied rooms.
			System.out.print("How many rooms are occupied on floor " + (i+1) + ": ");
			filledRooms[i] = keyboard.nextInt();

			// Validation that occupied rooms are not more than total rooms and
			// filled rooms cannot be negative.
			while(filledRooms[i] > floorRooms[i] || filledRooms[i] < 0)
			{
				System.out.print("Rooms occupied can't be more or less than number of rooms, " +
					"enter valid number: ");
				filledRooms[i] = keyboard.nextInt();
			}

			// Accumulate the number of filled rooms:
			totalFilledRooms += filledRooms[i];

			// Calculate the number of available rooms:
			availableRooms = totalRooms - totalFilledRooms;

			// Calculate the occupancy rate, cast total filled rooms to a double
			// so we get accurate rate.
			if(totalRooms > 0)
			{
				occupancyRate = (double)totalFilledRooms / totalRooms * 100;
			}
		}

		// The spacing for printf.
		// S1, S2 etc... are constants for adjusting the spacing of the output.
		final int S1 = 18;
		final int S2 = 9;

		// Display the Data:
		System.out.printf("%n%-"+S1+"s%-"+S1+"s%-"+S1+"s%-"+S1+"s%n",
			"Number of rooms", "Rooms occupied", "Rooms available", "Occupancy Rate");
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%"+S2+"d%"+S1+"d%"+S1+"d%"+S1+".0f%%%n",
			totalRooms, totalFilledRooms, availableRooms, occupancyRate);
		System.out.println();
	}
}

/**************************** Output ***************************
Please enter the number of floors in the hotel: -1
Floors can't be less than 1, please enter valid number: 0
Floors can't be less than 1, please enter valid number: 6

How many rooms on floor 1: 0

Rooms cannot be less than 10, please enter a valid number: 10
How many rooms are occupied on floor 1: -1
Rooms occupied can't be more or less than number of rooms, enter valid number: 11
Rooms occupied can't be more or less than number of rooms, enter valid number: 10

How many rooms on floor 2: 10
How many rooms are occupied on floor 2: 5

How many rooms on floor 3: 10
How many rooms are occupied on floor 3: 5

How many rooms on floor 4: 10
How many rooms are occupied on floor 4: 1

How many rooms on floor 5: 10
How many rooms are occupied on floor 5: 5

How many rooms on floor 6: 10
How many rooms are occupied on floor 6: 5

Number of rooms   Rooms occupied    Rooms available   Occupancy Rate
--------------------------------------------------------------------
       60                31                29                52%

***********************************************************************************/