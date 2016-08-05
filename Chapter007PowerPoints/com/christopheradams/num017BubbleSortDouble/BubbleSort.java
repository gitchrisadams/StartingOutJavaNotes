package com.christopheradams.num017BubbleSortDouble;

public class BubbleSort
{
	public static void main(String[]args)
	{
		// Create array to test:
		// NOTE: we changed this from int to double.
		double[] array1 = {50, 3, 77, 88, 99, 14, 65};

		final int ARRAY_SIZE = 7;

		// Print out array before sort:
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println("Array " + i + ": " + array1[i]);
		}

		// Call method to sort array:
		bubbleSort(array1, ARRAY_SIZE);

		// Print out array after sort:
		System.out.println("\nAfter being sorted:");
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println("Array " + i + ": " + array1[i]);
		}
	}

	// Methods:
	/**
		The bubbleSort() method sorts an array passed in.
		@param arrayToSort A reference to an array.
	*/
	//NOTE: We changed the arrayToSort from an int to a double.
	public static void bubbleSort(double[] arrayToSort, int sizeOfArray)
	{
		// Variables:
		boolean swap;								// To keep track if we swapped or not

		// NOTE: we changed temp from int to a double.
		double temp;								// Temp variable to hold before we switch values.
		int last = sizeOfArray - 1;	// The size of the array minus 1.

		// Loop through array once and then while swap is true.
		do
		{
			// Set swap to false by default.
			swap = false;

			// Loop through the array and stop at the size of the array minus 1 which
			// we will decrement through each iteration of the do while loop(outter loop).
			for(int i = 0; i < last; i++)
			{
				// If statement to handle swapping of numbers.
				// *************  The > will sort in ascending order. ****************
				// ************** The < will sort in descending order. ***************
				if(arrayToSort[i] > arrayToSort[i+1])
				{
					// Then swap it:
					// Assign current value of smaller value to temp.
					temp = arrayToSort[i];

					// Assign the larger value to replace the smaller value.
					arrayToSort[i] = arrayToSort[i+1];

					// Assign the smaller value we saved temporarily before we changed it
					// to replace the larger value.
					arrayToSort[i+1] = temp;

					// We made a swap so set boolean to true.
					swap = true;
				}
			}
			// Out of the inner loop so decrement the size of array minus 1 by 1.
			last--;

		} while(swap);

	}
}