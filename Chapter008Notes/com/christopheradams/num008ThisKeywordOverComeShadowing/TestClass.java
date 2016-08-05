package com.christopheradams.num008ThisKeywordOverComeShadowing;

public class TestClass
{
	// Create some fields with same name as
	// parameters in our methods to show how
	// the "this" keyword works to overcome shadowing.
	private int myInt1;

	// Create a setter using the "this" keyword.
	public void setMyInt1(int myInt1)
	{
		// Notice we use "this" to indicate we are setting the
		// field of this class.
		this.myInt1 = myInt1;
	}
}