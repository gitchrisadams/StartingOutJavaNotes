package com.christopheradams.num008CopyingArrays;

import java.util.*;

public class CopyingArrays008
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		// Create and initialize a new array with an init list:
		int[] firstArray = {5, 10, 15, 20, 25};

		// Loop through the first array:
		for(int i = 0; i < firstArray.length; i++)
		{
			System.out.println("firstArray[" + i + "]: " + firstArray[i]);
		}

		// Create a new array the length of the first Array:
		int[] secondArray = new int[firstArray.length];

		// Loop through array and copy each item in array to other array.
		for(int i = 0; i < firstArray.length; i++)
		{
			secondArray[i] = firstArray[i];
		}

		System.out.println();

		// Loop through the second array we coppied the first array to.
		for(int i = 0; i < secondArray.length; i++)
		{
			System.out.println("secondArray[" + i + "]: " + secondArray[i]);
		}


	}
}