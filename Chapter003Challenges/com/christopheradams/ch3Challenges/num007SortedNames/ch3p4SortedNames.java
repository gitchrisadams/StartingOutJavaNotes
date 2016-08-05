package com.christopheradams.ch3Challenges.num007SortedNames;

/*
	Christopher Adams
	5/13/2016
	Sorted Names
	Get three names from the user and display the names in ascending order.
	Like Andy, Charlie, Leslie.
*/

// For getting Scanner input and other utility tasks.
import java.util.Scanner;

public class ch3p4SortedNames
{
	public static void main(String[]args)
	{
		String name1 = "";
		String name2 = "";
		String name3 = "";
		String temp = "";

		// Create a new scanner for user input:
		Scanner keyboard = new Scanner(System.in);

		// Prompt user.
		System.out.println("Please enter three names, and we will sort them in ascending order: ");
		System.out.println("Enter name one: ");
		name1 = keyboard.nextLine();

		System.out.println("Enter name two: ");
		name2 = keyboard.nextLine();

		System.out.println("Enter name three: ");
		name3 = keyboard.nextLine();

		// Sort the names:
		// If name1 is greater than name2 then swap name 1 and name 2:
		if(name1.compareTo(name2)> 0)
		{
			temp = name1;	// Set name 1 to the temp.
			name1 = name2;	// Replace name1 with name2.
			name2 = temp;	// Set old value of name1 to name2 by using temp var.
			System.out.println("Swapping name1 and name2.");
		}

		// If name2 is greater than name 3 then swap name2 and name3.
		if(name2.compareTo(name3) > 0)
		{
			temp = name2;	// Set name2 to temp.
			name2 = name3;	// Replace name2 with name 3.
			name3 = temp;	// Set old value of name2 to name3 buy using temp var.
			System.out.println("Swapping name2 and name3.");
		}

		// Check name1 and name 2 one more time:
		// If name1 is greater than name2 then swap name 1 and name 2:
		if(name1.compareTo(name2)> 0)
		{
			temp = name1;	// Set name 1 to the temp.
			name1 = name2;	// Replace name1 with name2.
			name2 = temp;	// Set old value of name1 to name2 by using temp var.
			System.out.println("Swapping name1 and name2.");
		}

		// Output starting with name1, name2, then name3.
		System.out.println();
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

	}
}