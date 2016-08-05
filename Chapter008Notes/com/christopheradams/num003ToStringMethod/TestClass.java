package com.christopheradams.num003ToStringMethod;

public class TestClass
{
	// Create some fields:
	private int testerInt = 5;
	private String testerString = "The test";
	private double testerDouble = 7.0;

	/**
		toString() method
		@return The String formatted properly.
	*/
	public String toString()
	{
		// Create a new String to hold the formatting:
		String formattedString = String.format("%-10s%5.2f%5d%n",
			testerString, testerDouble, testerInt);

		// Return the formatted String:
		return formattedString;
	}
}