package com.christopheradams.ch3Notes;

public class JavaChapter3Part6UsingCompareTo
{
	public static void main(String[]args)
	{
		String name1 = "Mark";
		String name2 = "Bob";

		// If less compareTo returns number less than 0.
		if(name1.compareTo(name2) < 0)
		{
			System.out.println(name1 + " is less than " + name2 + ".");
			// Displaying the value of compareTo just for clarification.
			System.out.println(name1.compareTo(name2));
		}

		// If equal compareTo returns 0.
		else if(name1.compareTo(name2) == 0)
		{
			System.out.println(name1 + " is equal to " + name2 + ".");
			System.out.println(name1.compareTo(name2));
		}

		// If greater then compareTo returns a number more than 0.
		else if(name1.compareTo(name2) > 0)
		{
			System.out.println(name1 + " is greater than " + name2 + ".");
			System.out.println(name1.compareTo(name2));
		}
	}
}