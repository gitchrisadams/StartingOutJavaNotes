package com.christopheradams.ch7Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	05/09/2016
	Passing Arrays to methods.
*/


public class Ch7P2PassingArrayToMethods
{
	public static void main(String[] args)
	{
		// Create an array:
		int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

		/****** Method Call: Passing a single element to a function example ******/
		// Loop through array calling the showValue method and
		// passing in the array element.
		for(int index = 0; index< numbers.length; index++)
		{
			showValue(numbers[index]);
		}
		/****** End Method Call: Passing a single element to a function example ******/


		/***** Method Call: Passing an entire array to a function Example: *****/
		showArray(numbers);

		/***** End Method Call: Passing an entire array to a function Example: *****/


		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);
	}

	/****** Method Def: Passing a single element to a function example ******/
	public static void showValue(int n)
	{
		System.out.print(n + " ");
		System.out.println();
	}
	/****** End Method Def: Passing a single element to a function example ******/



	/****** Method Def: Passing an entire array to a function example ******/
	// Notice it accepts an array argument:
	public static void showArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
	/****** End Method Def: Passing an entire array to a function example ******/

}