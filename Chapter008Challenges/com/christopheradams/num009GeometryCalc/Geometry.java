package com.christopheradams.num009GeometryCalc;

import java.util.*;

public class Geometry
{
	// Scanner as a field:
	private static Scanner keyboard = new Scanner(System.in);

	public static double circleArea(double radius)
	{
		while(radius < 0)
		{
			System.out.print("Radius cannot be negative, enter valid value: ");
			radius = keyboard.nextDouble();
		}

		// Calculate the area of a circle and return it.
		double area = Math.PI * radius;

		return area;
	}

	public static double rectArea(double len, double wid)
	{
		while(len < 0 || wid < 0)
		{
			System.out.println("Values cannot be negative, enter valid value: ");
			System.out.print("Enter the length: ");
			len = keyboard.nextDouble();
			System.out.print("Enter the width: ");
			wid = keyboard.nextDouble();
		}
		// Calculate area of a rectangle and return it.
		double area = len * wid;

		return area;
	}

	public static double triArea(double base, double height)
	{
		while(base < 0 || height < 0)
		{
			System.out.println("Values cannot be negative, enter valid value: ");
			System.out.print("Enter base: ");
			base = keyboard.nextDouble();

			System.out.print("Enter height: ");
			height = keyboard.nextDouble();
		}

		// Calculate area of a triangle and return it.
		double area = base * height * .5;

		return area;
	}



}