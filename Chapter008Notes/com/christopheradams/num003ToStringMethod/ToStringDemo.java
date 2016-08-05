package com.christopheradams.num003ToStringMethod;

public class ToStringDemo
{
	public static void main(String[]args)
	{
		TestClass test1 = new TestClass();

		// We can print out test1 and it will use our toString()
		// method even though we didn't write test.toString()
		// It's automatic.
		System.out.println(test1);

		System.out.println();

		// Here we print out calling toString but notice it is
		// same as above.
		System.out.println(test1.toString());
	}
}