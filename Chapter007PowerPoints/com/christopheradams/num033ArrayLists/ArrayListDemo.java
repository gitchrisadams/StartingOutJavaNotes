package com.christopheradams.num033ArrayLists;

// Need this import when working with ArrayLists: (Or just java.util.*;
import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String[]args)
	{
		// Create a new ArrayList to hold some names.
		ArrayList<String> nameList = new ArrayList<String>();

		// Add some names to the ArrayList:
		nameList.add("James");
		nameList.add("Catherine");
		nameList.add("Bill");

		// Display the size of the ArrayList:
		// size() is how many elements we are actually using of the ArrayList. (NOT the length).
		System.out.println("The ArrayList has " + nameList.size() + " objects in it.");

		// Display the ArrayList using its default toString:
		// It prints out like this:[James, Catherine, Bill]
		System.out.println(nameList);

		// Now display the items in the nameList:
		// size() is how many elements we are actually using of the ArrayList. (NOT the length).
		for(int i = 0; i < nameList.size(); i++)
		{
			// Display each item in the ArrayList:
			System.out.println(nameList.get(i));


		}

		// Removing an item from an ArrayList:
		// This removes element 1 from the ArrayList.
		nameList.remove(1);

		System.out.println("nameList after removing item 1: " + nameList);

		// Adding an ArrayList item to a specific spot in the ArrayList:
		// This inserts "Mary" at element 1 and moves Bill to position 2.
		nameList.add(1, "Mary");

		System.out.println(nameList);
	}
}