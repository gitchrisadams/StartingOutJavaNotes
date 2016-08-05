package com.christopheradams.num003ForLoopSumOddNum1To100;

public class ForLoopSumOddNum1To100
{
	public static void main(String[]args)
	{
		int total = 0;

		// Instead of i++ we just do i+=2 so only odd numbers are totaled.
		for(int i = 1; i <= 100; i+=2)
		{
			total += i;
		}
		System.out.println("The total is: " + total);
	}
}