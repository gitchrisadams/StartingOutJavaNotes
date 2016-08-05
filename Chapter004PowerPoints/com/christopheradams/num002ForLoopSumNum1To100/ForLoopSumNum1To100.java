package com.christopheradams.num002ForLoopSumNum1To100;

public class ForLoopSumNum1To100
{
	public static void main(String[]args)
	{
		int total = 0;

		for(int i = 1; i <= 100; i++)
		{
			total += i;
		}

		System.out.println("Total is: " + total);
	}
}