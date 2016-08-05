package com.christopheradams.num009ThisKeywordOverloadedConstructor;

public class ThisOverloadDemo
{
	public static void main(String[]args)
	{
		// Create a new TestClass passing in two arguments (Normal).
		TestClass myTest1 = new TestClass(2, "My test to the 2 arg constructor");

		// Create a new TestClass this time passing in only one argument.
		// The TestClass will take value passed in and call the two arg constructor
		// and since we only passed in one value, it will set the int value
		// to zero.
		TestClass myTest2 = new TestClass("My test to one arg constructor");

		System.out.println(myTest1.getMyInt());
		System.out.println();
		System.out.println(myTest1.getMyString1());
		System.out.println();


		System.out.println(myTest2.getMyInt());
		System.out.println();
		System.out.println(myTest2.getMyString1());


	}
}