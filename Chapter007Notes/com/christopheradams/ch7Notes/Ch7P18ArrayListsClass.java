package com.christopheradams.ch7Notes;

import java.util.ArrayList;		// Needed for ArrayList class.

/*
	Christopher Adams
	5/13/2016
	Array List Classes
*/


public class Ch7P18ArrayListsClass
{
	public static void main(String[]args)
	{
		/***** Creating, adding, and displaying an ArrayList *****/
		// Creating an arrayList.
		ArrayList<String> nameList = new ArrayList<String>();

		// Adding elements to our arrayList:
		nameList.add("Chris");
		nameList.add("Ann-Marie");
		nameList.add("Kenzie");

		// Printing out the size of our ArrayList.
		System.out.println("The ArrayList has " + nameList.size() + " items in it.\n");

		// Print out the first and second item in our ArrayList:
		System.out.println("The first two items in our arrayList are: " + nameList.get(0) +
							" and " + nameList.get(1));
		/***** End Creating, adding, and displaying an ArrayList *****/



		/***** Using an enhanced for loop with an ArrayList *****/
		System.out.println();
		System.out.println("Our Array list displayed using an enhanced for loop: ");
		for(String name : nameList)
		{
			System.out.println(name);
		}
		// Could also just print out the nameList like below,
		// but it prints out with brackets around the names.
		System.out.println();
		System.out.println(nameList);
		/***** End Using an enhanced for loop with an ArrayList *****/



		/***** Removing an item from an ArrayList *****/
		// We remove the 3rd element of the list which is at index 2:
		// This removes Kenzie from the list.
		nameList.remove(2);

		// Display the whole list again to confirm Kenzie is not there.
		System.out.println();
		System.out.println("Kenzie is gone: \n" + nameList);
		/***** End Removing an item from an ArrayList *****/



		/***** Inserting an item into an ArrayList *****/
		// Insert Kenzie to item at index 1 So now it will be after
		// Chris and before Ann-Marie. Ann-Marie will be last.
		nameList.add(1, "Kenzie");

		// Output list to confirm Kenzie is back.
		System.out.println();
		System.out.println("See Kenzie is back!\n" + nameList);
		/***** End Inserting an item into an ArrayList *****/



		/***** Replacing an Item in an ArrayList *****/
		// The item at index 0 is replaced. So "Chris" is replaced with
		// the name "Kenzie".
		nameList.set(0, "Kenzie");

		// Output ArrayList to confirm.
		System.out.println();
		System.out.println("Now Kenzie replaced Chris!\n" + nameList);
		/***** End Replacing an Item in an ArrayList *****/



		/**** ArrayList Capacity *****
		/*
			When an ArrayList is created it stores 10 items by default
			without having to increase its size.
			When an 11th item is added it increases its size.
			You can specify a starting capacity when creating an ArrayList.
		*/
		// Creates an ArrayList with capacity of 100 items.
		ArrayList<String> list = new ArrayList<String>(100);
		/**** End ArrayList Capacity *****



		/***** Another way to create ArrayLists without typing type twice *****/
		/*
			Usual way to declare array list is like this:
			ArrayList<String>list = newArrayList<String>();
			Notice <String> is typed twice. With Java 7 and higher you can
			just type the <> like below:
		*/
		// Notice there is not String between the second <>
		ArrayList<String>myNewArrayList = new ArrayList<>();

		// Can also be used with objects:
		ArrayList<Rectangle> myRectArrayList = new ArrayList<>();
		/***** Another way to create ArrayLists without typing type twice *****/

	}
}