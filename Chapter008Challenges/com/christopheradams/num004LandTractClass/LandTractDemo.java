package com.christopheradams.num004LandTractClass;

public class LandTractDemo
{
	public static void main(String[]args)
	{
		LandTract myLand1 = new LandTract(10.0, 10.0);
		LandTract myLand2 = new LandTract(20.0, 10.0);

		// Output the area of myLand1 using the toString method:
		System.out.println(myLand1);
		System.out.println();

		// See if the land objects are equal:
		if(myLand1.equals(myLand2))
			System.out.println("Yes they are equal.");
		else
			System.out.println("No they are not equal.");





	}
}