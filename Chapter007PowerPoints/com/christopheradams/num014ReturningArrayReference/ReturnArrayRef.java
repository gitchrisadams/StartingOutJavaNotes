package com.christopheradams.num014ReturningArrayReference;

public class ReturnArrayRef
{
	public static void main(String[]args)
	{
		// Create a double array reference.
		double[] myDoubleReturned;

		// Call the getArray method and store the array the myDoubleReturned array.
		myDoubleReturned = getArray();

		// Output the array values.
		for(double num : myDoubleReturned)
		{
			System.out.println(num + " ");
		}

	}

	// Methods:
	// Notice the return type is double[]
	public static double[] getArray()
	{
		// Create an array and initialize it with some values.
		double[] myArrayToReturn = {1, 2, 3, 4, 5, 6};

		// Return the array to the calling function.
		return myArrayToReturn;
	}
}