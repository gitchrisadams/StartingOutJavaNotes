package com.christopheradams.num012NumberAnalysisClass;

import java.util.*;
import java.io.*;

public class AnalyzeNumsClient
{
	public static void main(String[]args) throws IOException
	{
		AnalyzeNums nums1 = new AnalyzeNums("test.txt");

		System.out.println("\nThe lowest number in the set is: " + nums1.calcLowest());

		System.out.println("\nThe highest number in the set is: " + nums1.calcHighest());

		System.out.println("\nThe total of all numbers in the set is: " + nums1.totalNums());

		System.out.printf("\nThe average of all the numbers is: %.2f%n", nums1.calcAvg());

	}
}
