package com.christopheradams.num001AreaClass;

public class Area
{
	// Calculate the area of a Circle.
	// Only one parameter.
	public static double calcArea(double radius)
	{
		double area = Math.pow(radius, 2.0) * Math.PI;
		return area;
	}

	// Calculate area of a Rectangle.
	// Overloaded method, two String params accepted.
	// The Strings will be converted to a double.
	public static double calcArea(String width, String length)
	{
		double area = Double.parseDouble(width) * Double.parseDouble(length);

		return area;
	}

	// Calculate the area of a Cylinder.
	// Another overloaded method, two double params are accepted.
	public static double calcArea(double radius, double height)
	{
		double area = Math.PI * Math.pow(radius, 2.0) * height;

		return area;
	}
}