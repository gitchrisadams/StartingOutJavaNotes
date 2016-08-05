package com.christopheradams.num003RectangleAreaCompleteProgram;

/**
   You must complete this program so it calculates
   and displays the area of a rectangle.
*/

// Insert any necessary import statements here.
import java.util.*;		// For Scanner input and other utilities.

public class AreaRectangle
{
	// Declare Scanner as a field so can be used in our methods.
	private static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args)
	{
	  double length,    // The rectangle's length
			 width,     // The rectangle's width
			 area;      // The rectangle's area

	  // Get the rectangle's length from the user.
	  length = getLength();

	  // Get the rectangle's width from the user.
	  width = getWidth();

	  // Get the rectangle's area.
	  area = getArea(length, width);

	  // Display the rectangle data.
	  displayData(length, width, area);
	}

	/**
		The getLenght() method gets the length of the rectangle from the user.
		@return The length of the rectangle.
	*/
	public static double getLength()
	{
		double len = 0.0;

		// Get the length from the user.
		System.out.print("Please enter the length of the Rectangle: ");
		len = keyboard.nextDouble();

	   // Return the length of the rectangle.
	   return len;
	}

	/**
		The getWidth() method gets the width of the rectangle from the user.
		@return The width of the rectangle.
	*/
	public static double getWidth()
	{
		double wid = 0.0;			// For storing the width of the Rectangle.

		// Get the width of the Rectangle from the user.
		System.out.print("Please enter the width of the Rectangle: ");
		wid = keyboard.nextDouble();

		return wid;
	}

	/**
		The getArea() method gets the area of a Rectangle.
		@param len The length of the Rectangle.
		@param wid The width of the Rectangle.
		@return The area of the Rectangle.
	*/
	public static double getArea(double len, double wid)
	{
		double areaOfRect = 0.0;		// To store the area of a Rectangle.

		// Calculate and return the area of the Rectangle.
		areaOfRect = len * wid;
		return areaOfRect;
	}

	/**
		The displayData() method displays the output of the Rectangle.
		@param len The length of the Rectangle.
		@param wid The width of the Rectangle.
		@param areaOfRect The area of the Rectangle.
	*/
	public static void displayData(double len, double wid, double areaOfRect)
	{
		// Display the Rectangle size and area.
		System.out.printf("%nThe length of your Rectangle is %.2f long.%n", len);
		System.out.printf("%nThe width of your Rectangle is %.2f wide.%n", wid);
		System.out.printf("%nThe area of your Rectangle is %.2f in size.%n", areaOfRect);
	}
}

