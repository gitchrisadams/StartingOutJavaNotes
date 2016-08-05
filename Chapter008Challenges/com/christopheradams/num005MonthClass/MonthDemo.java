package com.christopheradams.num005MonthClass;

public class MonthDemo
{
	public static void main(String[]args)
	{
		// Create a Month object passing in the month 4 for April.
		Month myMonth1 = new Month(6);
		Month myMonth2 = new Month(7);

		System.out.println(myMonth1);

		if(myMonth1.equals(myMonth2))
		{
			System.out.println("Yes they are equal.");
		}
		else
		{
			System.out.println("No, not equal.");
		}

		if(myMonth1.greaterThan(myMonth2))
			System.out.println("Yes, Greater than.");
		else
			System.out.println("No, not greater than.");

		if(myMonth1.lessThan(myMonth2))
			System.out.println("Yes, less than.");
		else
			System.out.println("No, not less than.");

	}
}