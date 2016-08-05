package com.christopheradams.num004DotEqualsMethodYourOwnClasses;

public class TestClass
{
	// Create some fields:
	private int testerInt = 5;
	private String testerString = "The test";
	private double testerDouble = 7.0;

	/**
		The equals() method determines of two objects are equal.
		@param objectToCompare The object to compare for equality.
		@return True if values are equal, otherwise false.
	*/
	public boolean equals(TestClass objectToCompare)
	{
		// boolean status if the objects are equal.
		boolean status;

		if(testerString.equals(objectToCompare.testerString) &&
			testerInt == objectToCompare.testerInt &&
			testerDouble == objectToCompare.testerDouble)
		{
			// Yes equal so set to true;
			status = true;
		}
		else
		{
			// Not equal so set to false;
			status = false;
		}

		// Return if they are equal status to calling method:
		return status;
	}

	// Setters:
	public void setTesterInt(int changeIntTest)
	{
		testerInt = changeIntTest;
	}

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