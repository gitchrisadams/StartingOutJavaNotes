package com.christopheradams.num007Aggregation;

public class TestClass
{
	// Create some fields:
	private int testerInt = 5;
	private String testerString = "The test";
	private double testerDouble = 3.0;

	// Field that has instance of another class Score
	// A test has a Score.
	// When another class is a field in a class it's called aggregation.
	private Score myScore;

	// Create a constructor that includes the Score field:
	/**
		Constructor
	*/
	public TestClass(Score theScore, int theTesterInt, String theTesterString)
	{
		myScore = new Score(theScore);
		testerInt = theTesterInt;
		testerString = theTesterString;
	}

	// Getter shown here for cohesion of above.
	public Score getScore()
	{
		return new Score();
	}

	/**
		copy Constructor
	*/
	public TestClass(TestClass theTestClass)
	{
		// Take the test class fields of the class passed in
		// and store the values of those fields in the fields
		// of the new object being created.
		testerInt = theTestClass.testerInt;
		testerString = theTestClass.testerString;
	}

	/**
		Constructor
	*/
	public TestClass(int theTesterInt, String theTesterString)
	{
		testerInt = theTesterInt;
		testerString = theTesterString;
	}

	/**
		Constructor
		No arg constructor.
	*/
	public TestClass()
	{

	}


	/**
		The copy() method creates a copy of an object.
		@return The copy of the object.
	*/
	public TestClass copy()
	{
		TestClass copyOfObject = new TestClass(testerInt, testerString);

		// Return the copy of the object.
		return copyOfObject;
	}

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

	// Getters:
	public int getTesterInt()
	{
		return testerInt;
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