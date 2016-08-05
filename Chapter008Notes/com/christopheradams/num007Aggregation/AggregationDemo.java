package com.christopheradams.num007Aggregation;

public class AggregationDemo
{
	public static void main(String[]args)
	{
		// Create a new TestClass object:
		TestClass myTest1 = new TestClass();

		// Create a new Score object:
		Score myScore1 = new Score();

		// Create a new TestClass using the 3 arg constructor and
		// passing in the Score object to show how aggregation works.
		TestClass myTest2 = new TestClass(myScore1, 12, "Test 555");

		System.out.println(myTest2.getScore());
	}
}