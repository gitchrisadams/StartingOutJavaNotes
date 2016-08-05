package com.christopheradams.ch5Powerpoints;

public class ReturningAString
{
	public static void main(String[]args)
	{
	String customerName;

	customerName = fullName("John", "Martin");

	System.out.println(customerName);

	}


	public static String fullName(String first, String last)
	{
		String name;

		name = first + " " + last;

		return name;
	}
}
