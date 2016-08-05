package com.christopheradams.num035ArrayListStoringNumberPrimitives;

import java.util.ArrayList;

public class ArrayListStoringNumberPrimitives
{
	public static void main(String[]args)
	{
		// Create an ArrayList to hold some integers.
		// Notice we use the word Integer, this is the wrapper class
		// that allows use to store numbers in ArrayLists.
		// Wrapper classes:
		// Int:<Integer> double:<Double> boolean:<Boolean> char:<character>
		ArrayList<Integer> intList = new ArrayList<Integer>();

		// Now that we used the <Integer> wrapper class we can
		// just add ints to the ArrayList like we would normally add
		// things to an ArrayList.
		intList.add(12);
		intList.add(4);
		intList.add(-7);

		// Print out the numbers.
		for(int i = 0; i < intList.size(); i++)
		{
			System.out.println(intList.get(i));
		}

		// Add up the numbers in the ArrayList.
		int total = 0;

		// Use the enhanced for loop.
		for(int x : intList)
		{
			total+= x;
		}

		// Print out the total.
		System.out.println("The total is: " + total);
	}
}