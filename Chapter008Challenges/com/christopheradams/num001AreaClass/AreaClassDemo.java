package com.christopheradams.num001AreaClass;

public class AreaClassDemo
{
	public static void main(String[]args)
	{
		// Create a new Area object:
		Area myArea1 = new Area();

		// Calculate the area of a circle. Only on param passed in for
		// circles.
		System.out.printf("%.2f%n", myArea1.calcArea(10));

		// Calculate the area of Rectangle, two strings passed in:
		System.out.printf("%n%.2f%n", myArea1.calcArea("10", "5"));

		// Calculate the area of a Cylinder. two doubles passed in.
		System.out.printf("%n%.2f%n", myArea1.calcArea(10.0, 10.0));
	}
}