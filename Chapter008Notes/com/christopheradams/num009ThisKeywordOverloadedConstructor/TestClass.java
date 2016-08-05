package com.christopheradams.num009ThisKeywordOverloadedConstructor;

public class TestClass
{
	// Fields:
	private int myInt1;
	private String myString1;

	/**
		Constructor
	*/
	public TestClass(int myInteger, String myString)
	{
		myInt1 = myInteger;
		myString1 = myString;
	}

	// Constructor that calls a constructor.
	// Only one value was passed in, a String
	// Se we are calling the two arg constructor
	// from the one arg constructor and setting the
	// int to a 0 and passing in the String.
	// We need to use the "this" keyword to do this.
	public TestClass(String myString)
	{
		this(0, myString);
	}

	// Getters:
	public int getMyInt()
	{
		return myInt1;
	}

	public String getMyString1()
	{
		return myString1;
	}

}