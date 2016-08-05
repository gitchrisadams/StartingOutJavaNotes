package com.christopheradams.ch7Notes;

/*
	Christopher Adams
	5/13/2016
*/

public class Ch7P15SortingAlgorithms
{
	public static void main(String[]args)
	{
		// Create some int variables:
		int startScan, index, minIndex, minValue;

		// Create an array:
		int[] array = {5, 6, 8, 12, 77, 99, 22};

		/***** Sorting an array from lowest to highest w/ a selection sort *****/
		// Loop throu array and sort:
		// Keep looping to the length of the array minus 1.
		for(startScan = 0; startScan < (array.length-1); startScan++)
		{
			// The minimum index is set to current counter.
			minIndex = startScan;

			// The minimum value is set to array element at current counter.
			minValue = array[startScan];

			// Start loop at current counter + 1 and loop to the end of the array.
			for(index = startScan + 1; index < array.length; index++)
			{
				// If array element at current counter is less than the minimum value.
				// Then store array at counter and current counter/index in
				// minValue and minIndex.
				if(array[index] < minValue)
				{
					minValue = array[index];
					minIndex = index;
				}
			}

			// Set array at the minimum index to the array at current counter in outter loop.
			// Set array at current counter to the minimum value.
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}

		// Output heading:
		System.out.println("The array sorted with a selection sort, lowest to highest: ");

		// Output the array.
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println();
		/***** End Sorting an array from lowest to highest w/ a selection sort *****/



		/***** The Binary Search Algorith, faster if have lots of items *****/
		/*
			Binary Search requirement is that array must be in order from
			lowest to highest. You could do this with the selection sort above.
		*/
		// Create new array.
		int[]arrayBinSearch = {1, 2, 3, 8, 9, 10, 11, 12};

		int value = 3;		// Value to search for.
		int first; 			// First array element.
		int last; 			// Last array element.
		int middle;			// Midpoint of search.
		int position;		// Position of search value.
		boolean found;		// Flag.

		// Set initial values:
		first = 0;							// Low boundry: The array's first element.
		last = arrayBinSearch.length - 1;	// High boundry: The array's last element.
		position = -1;
		found = false;

		// Search for the value:
		while(!found && first <= last)
		{
			// Calculate the midpoint of our array.
			// In this case in 1st itteration 0 + (6-1) = 5 then 5 divided by 2 = 2.
			// arrayBinSearch[2] is the middle element.
			// Every time loop through, cut the size of the array to search by half.
			middle = (first + last) / 2;

			// If value is found at midpoint.
			// Set found to true, so stop looping, and indicate position it was found.
			if(arrayBinSearch[middle] == value)
			{
				found = true;
				position = middle;
			}
			// Data in array in at middle position is more than value
			// so our value is
			else if(arrayBinSearch[middle] > value)
			{
				// Data in array is more than the search value so our
				// search value must be in the lower/start portion of our array.
				// So set last or our end bounds to the middle -1 or so we
				// only are searching from beginning of array to the middle.
				last = middle - 1;
			}
			// Data in array is less than the search value so our
			// search value must be in the higher/end portion of our array.
			// So set the start bounds to start at the middle of the array + 1 so
			// we are only searching from the middle of the array to the end.
			else
			{
				first = middle + 1;
			}
		}

		// Output the position of where the search value was found:
		System.out.println("Search value " + value + " was found at position " +
							position + ". In other words it was in element number " +
							(position + 1) + " of the array.\n");


		/***** End The Binary Search Algorith, faster if have lots of items *****/



	}
}