package com.christopheradams.num001StaticFields;

public class StaticFields
{
	// A static field:
	private static int instanceCount = 0;

	/**
		Constructor
	*/
	public StaticFields()
	{
		// Increment the static field so whenever a new
		// object is created, the counter is incremented.
		instanceCount++;
	}

	// Getters:
	public int getInstanceCount()
	{
		return instanceCount;
	}
}