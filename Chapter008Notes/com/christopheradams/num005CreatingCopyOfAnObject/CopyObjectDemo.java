package com.christopheradams.num005CreatingCopyOfAnObject;

public class CopyObjectDemo
{
	public static void main(String[]args)
	{
		// Create a new TestClass object:
		TestClass myTest1 = new TestClass();

		// Set the int to 20 to prove we are making a copy below.
		myTest1.setTesterInt(20);

		// Create a reference to a TestClass object.
		TestClass myTest2;

		// Set myTest2 to be a copy of myTest1.
		// It should have same fields as myTest1 not the
		// default fields a new object would get.
		myTest2 = myTest1.copy();

		System.out.println(myTest2.getTesterInt());
	}
}