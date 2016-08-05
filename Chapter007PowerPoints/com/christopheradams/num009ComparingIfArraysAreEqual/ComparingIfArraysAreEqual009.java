package com.christopheradams.num009ComparingIfArraysAreEqual;

import java.util.*;

public class ComparingIfArraysAreEqual009
{
	public static void main(String[]args)
	{
		boolean arrayIsEqual = false;
		int i = 0;

		// Create two arrays.
		int[] array1 = {50, 110, 55, 77, 100, 44, 11};
		int[] array2 = {50, 110, 55, 77, 100, 44, 11, 22};

		// Test if they are equal length, if so set boolean to true.
		if(array1.length == array2.length)
		{
			arrayIsEqual = true;
		}

		// While arrayIsEqual boolean is true and i is less than length of array, loop.
		while(arrayIsEqual && i < array1.length)
		{
			// If the elements at the i index in array are not equal set boolean to false.
			if(array1[i] != array2[i])
			{
				arrayIsEqual = false;
			}

			// Increment counter.
			i++;
		}

		// Output whether they are equal or not.
		if(arrayIsEqual)
		{
			System.out.println("Yes they are equal.");
		}
		else
		{
			System.out.println("No, they are not equal.");
		}
	}
}