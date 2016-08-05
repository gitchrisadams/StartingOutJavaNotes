package com.christopheradams.num006CopyConstructors;

public class CopyConstructorsDemo
{
	public static void main(String[]args)
	{
		// Create a new TestClass object:
		TestClass myTest1 = new TestClass();

		// Set the int to 20 to prove we are making a copy below.
		myTest1.setTesterInt(20);

		// Create a new TestClass object as a copy of myTest1 using
		// the copy Constructor.
		// We pass in myTest1 becuase that is the class we are copying.
		TestClass myTest2 = new TestClass(myTest1);


		System.out.println(myTest2.getTesterInt());
	}
}