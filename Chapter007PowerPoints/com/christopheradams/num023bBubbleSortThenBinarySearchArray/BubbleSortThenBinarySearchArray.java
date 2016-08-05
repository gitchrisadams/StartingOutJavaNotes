package com.christopheradams.num023bBubbleSortThenBinarySearchArray;

public class BubbleSortThenBinarySearchArray
{
	public static void main(String[]args)
	{
		// Sort an array ascending order then use binary search to find value.

		// Create an array:
		int[] myArray = {10, 40, 20, 14, 22, 50, 75, 33};

		// Variables:
		int last = myArray.length - 1;		// The last element in array to search minus 1.
		boolean swap;						// Flag if we swapped values.
		int temp;							// Temp storage location to store before swap.

		// Display Before sort:
		for(int i = 0; i < myArray.length; i++)
			System.out.println("Before sort: " + myArray[i]);

		// Loop through array and sort them in ascending order.
		do
		{
			swap = false;

			for(int i = 0; i < last; i++)
			{
				if(myArray[i] > myArray[i+1])
				{
					temp = myArray[i];
					myArray[i] = myArray[i+1];
					myArray[i+1] = temp;

					swap = true;
				}
			}

			// Decrement last:
			last--;

		} while(swap);

		// Display them in order:
		for(int i = 0; i < myArray.length; i++)
			System.out.println("\nAfter the sort: " + myArray[i]);


		// Now that in ascending order we can search them using Binary search:
		// Variables:
		int value = 14; 				// Arbitrary value to search for.
		int first = 0;					// First array element.
		int middle;						// The mid point of search.
		last = myArray.length - 1;		// Last array element.
		int position = -1;				// Position of search value.
		boolean found = false;			// Flag if we find value.

		// Search for value while it is not found and first element subscript is less
		// than or equal to the last element in the array.
		while(!found && first <= last)
		{
			// Calculate the midpoint.
			middle = (first + last) / 2;

			// See if value is found at the midpoint:
			if(myArray[middle] == value)
			{
				found = true;
				position = middle;
			}

			// See if value is in the lower half.
			// If the value stored in the array at the middle index
			// is greater than the value we are looking for, then the value we are looking
			// for must be in the lower half.
			if(myArray[middle] > value)
			{
				// Set the last element to be searched to the middle - 1 since
				// we know the value is in the lower half.
				last = middle - 1;
			}

			// See if value is in the upper half.
			// If the value stored in the array at the middle index
			// is less than the value we are looking for, then the value we are looking
			// for must be in the upper half.
			if(myArray[middle] < value)
			{
				// Set the first element to be searched to middle + 1 since
				// we know the value is in the upper half.
				first = middle + 1;
			}
		}
		System.out.println();

		// Output where position is found, otherwise that it was not found.
		if(position >= 0)
			System.out.println(value + " found at position: " + position);
		else
			System.out.println(value + " not found!");


	}
}