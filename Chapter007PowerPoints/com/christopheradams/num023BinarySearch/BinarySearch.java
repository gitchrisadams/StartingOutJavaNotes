package com.christopheradams.num023BinarySearch;

public class BinarySearch
{
	public static void main(String[]args)
	{
		int[]myArray = {25, 26, 27, 28, 29, 30, 31};

		System.out.println(binarySearch(myArray, 26));
	}

	public static int binarySearch(int[]array, int value)
	{
		// Variables:
		int first;			// First array element.
		int last;			// Last array element.
		int middle; 		// Mid point of search.
		int position;		// The position of the search value.
		boolean found;		// Flag if the target array is found.

		// Set initital values.
		first = 0;						// Start at position 0.
		last = array.length - 1;		// Last position to search is length of the array minus 1.

		// When we start we have not found target so set to -1 until we have found it.
		// Same goes for boolean.
		position = -1;
		found = false;

		// Search for the value.
		// Keep searching as long as we have not found it and
		// the first element we are searching is less than the
		// last element we are searching.
		while(!found && first <= last)
		{
			// Calculate the midpoint of the array.
			// I.E. First element was 4 and last element was 8.
			// Then 4+8 = 12 / 2 middle would be 6.
			middle = (first + last) / 2;

			// If value is found at midpoint, then we found it.
			// Set boolean to true and record the position we found it.
			if(array[middle] == value)
			{
				found = true;
				position = middle;
			}
			// else if the value is in the lower half.
			// So if the value in the array in the middle postion is greater than
			// the value we are looking for then the value has to
			// be in a postion in array that is one less or lower than where we are.
			// I.E. array[middle] is 30 and we are looking for value 27.
			// 30 is greater than 27 so the value has to be in half with 1,2,3,4...25,26 so
			// set the new last value to the current middle postion minus 1. In this
			// example the new middle postion would be set to 30-1 a.k.a 29.
			else if(array[middle] > value)
				last = middle -1;
			else
				// It's in the upper half.
				// If it is not equal or greater than, it has to be less than the
				// the value we are looking for.
				// I.E. if we are looking for value 27. And middle is currently 25.
				// 25 is less than the number we are looking for 27.
				// So the number has to be in the half with 26,27,28,29...
				// So we set the starting point to the current middle position + 1.
				// In this example the new start point position would be set to 26.
				first = middle + 1;
		}

		// Done Looping so return the position of the item or -1 if not found
		return position;
	}
}