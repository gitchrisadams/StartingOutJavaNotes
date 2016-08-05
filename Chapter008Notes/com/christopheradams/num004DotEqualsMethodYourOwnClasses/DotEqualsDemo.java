package com.christopheradams.num004DotEqualsMethodYourOwnClasses;

public class DotEqualsDemo
{
	public static void main(String[]args)
	{
		// Create two TestClass objects:
		TestClass myTest1 = new TestClass();
		TestClass myTest2 = new TestClass();

		// Change the myTest1's int value to 100 to
		// show that are .equals method works.
		// Comment or uncomment this for testing.
		//myTest1.setTesterInt(100);

		if(myTest1.equals(myTest2))
		{
			System.out.println("Yes they are equal.");
		}
		else
		{
			System.out.println("No, not equal.");
		}
	}
}