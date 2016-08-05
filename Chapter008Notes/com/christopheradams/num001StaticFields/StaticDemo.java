package com.christopheradams.num001StaticFields;

public class StaticDemo
{
	public static void main(String[]args)
	{
		// Variables:
		int objectCount;

		// Create instances of the StaticFields class:
		StaticFields myStatic1 = new StaticFields();
		StaticFields myStatic2 = new StaticFields();

		// Get the number of instances of classes we
		// creaed by getting the static field from the class.
		// Store it in a variable.
		objectCount = myStatic1.getInstanceCount();

		// Display the number of objects.
		System.out.println(objectCount);
	}
}