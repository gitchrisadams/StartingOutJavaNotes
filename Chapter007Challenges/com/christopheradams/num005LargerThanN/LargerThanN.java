package com.christopheradams.num005LargerThanN;

/**
	Christopher Adams 7/10/2016
	The LargerThanN program will use a method to process
	an array and tell the user all the numbers in the
	array that are larger than that number.
*/

public class LargerThanN
{
	public static void main(String[]args)
	{
		// Create a new array with some values to test:
		int[] myTestArray = {4, 5, 10, 50, 99, 10, 11, 200, 60, 77, 54, 12,
					   		 11, 90, 200, 400, 499, 576, 10, 430, 20, 21,
					  		 55, 99, 42, 54, 90, 1, 3, 6, 9, 44, 12, 64, 1000,
					   		 44, 30, 65, 3, 23, 98, 44, 26, 29, 49, 29, 22, 55, 34};

		// Call method to display items in the array that
		// are larger than the int param we pass in.
		displayLarger(999, myTestArray);

	}

	/**
		The displayLarger() method displays items in an array that are larger
		than an specific value passed in.
		@param numN The number to test to see what numbers in array are larger.
		@param arrayToCheck The array reference to check for larger values.
	*/
	public static void displayLarger(int numN, int[] arrayToCheck)
	{
		for(int i = 0; i < arrayToCheck.length; i++)
		{
			if(numN > arrayToCheck[i])
			{
				System.out.println("The number " + numN + " is greater than " + arrayToCheck[i] + ".\n");
			}
		}
	}
}