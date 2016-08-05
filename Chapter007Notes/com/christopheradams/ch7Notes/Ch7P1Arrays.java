package com.christopheradams.ch7Notes;

/******* Common Import statements *******/
import javax.swing.*;				// Provides class for creating GUI's.
import java.awt.*;				// Windowing Toolkit, drawing /creating gui.

/*
	Christopher Adams
	05/09/2016
	Arrays.
*/


public class Ch7P1Arrays
{
	public static void main(String[] args)
	{

		/***** Creating Arrays *****/
		// Creates an array with 6 elements 0 through 5:
		int[] numbers = new int[6];

		// You can also just create an array reference variable first
		// and have no array elements yet like this:
		int[] numbers2;

		// Then you can use new word to create the actual array and assign its
		// address to the numbers 2 variable:
		numbers2 = new int[10];		// Array with 10 elements.

		// Arrays of different data types:
		float[] myFloatArray = new float[100];
		char[] myCharArray = new char[41];
		long[] myLongArray = new long[50];
		double[] myDoubleArray = new double[100];

		// You can also set the size of an array with a variable:
		// Create constant int to use for the index of array elements:
		final int NUM_ELEMENTS = 6;

		// Create the array and make it have 6 elements by using final/constant:
		int[] numbers3 = new int[NUM_ELEMENTS];

		// Assigning an array element a value and output to screen.
		numbers3[0] = 10;
		System.out.println("The value in array numbers3[0] is: " + numbers3[0] +"\n");

		// Creating an array and initializing with a bunch of values at once:
		// Notice we do not need to use the "new" keyword.
		int[]days = {31,28,31};
		System.out.println("The days array contains: " + days[0] + " " + days[1] +
							" " + days[2] + "\n");

		// Alternate Style of declaring an Array:
		// Brackets can come after the array name instead of before it:
		int numbersAlt[], codesAlt[], scoresAlt[];

		/***** End Creating Arrays *****/


		/***** Array Length and Array Loops *****/
		// Create a new array and give it 25 elements:
		double[] myArrayToFindLength = new double[25];
		myArrayToFindLength[0] = 25.0;

		// Since our array as 25 elements we can assign the size of it to an int:
		int sizeOfArray = myArrayToFindLength.length;
		System.out.println("The size of myArrayToFindLength is: " + sizeOfArray + "\n");

		// Looping through an arra:
		for(int i = 0; i < myArrayToFindLength.length; i++)
		{
			System.out.println("Counter number: " + i);
			System.out.println("Array data: " + myArrayToFindLength[i] + "\n");
		}
		System.out.println();

		// Enhanced Array Loop:
		// Loops through whole array.
		// Current double it is looping through is the "val" variable.
		for(double val : myArrayToFindLength)
		{
			System.out.println("Current counter val we are at now is: " + val);
		}
		System.out.println();
		/***** End Array Length and Array Loops *****/


		/***** Reassigning an Array Reference to a different array *****/
		// Create a new array:
		int[] myArrayToReassign = new int[10];

		// We reassign the array to a new on that now has 5 elements not 10:
		myArrayToReassign = new int[5];
		/***** End Reassigning an Array Reference to a different array *****/


		/***** Copying Arrays *****/
		// The below example does NOT copy an array:
		// It instead just references the array so both
		// point to the same address. Change one, it changes other.
		int[]arrayThatIsNotACopy1 = {2,3};
		int[]arrayThatIsNotACopy2 = arrayThatIsNotACopy1;

		// Print out two elements from both arrays to show
		System.out.println("Array 1 element 0: " + arrayThatIsNotACopy1[0] + " " +
							"Array 1 element 1: " + arrayThatIsNotACopy1[1] + "\n");
		System.out.println("Array 2 element 0: " + arrayThatIsNotACopy2[0] + " " +
							"Array 2 element 1: " + arrayThatIsNotACopy2[1] + "\n");
		System.out.println();

		// Now change one of the elements to prove it gets changed in both arrays:
		arrayThatIsNotACopy1[0] = 10;
		// Print out two elements from both arrays to show
		System.out.println("Array 1 element 0: " + arrayThatIsNotACopy1[0] + " " +
							"Array 1 element 1: " + arrayThatIsNotACopy1[1] + "\n");
		System.out.println("Array 2 element 0: " + arrayThatIsNotACopy2[0] + " " +
							"Array 2 element 1: " + arrayThatIsNotACopy2[1] + "\n");
		System.out.println();



		/***** Copying one array to another with a loop *****/
		// First create two different arrays:
		int[]firstArray = {5, 10, 15, 20, 25};
		int[]secondArray = new int[5];

		// Loop through the length of one of the arrays, copying
		// the contents of each element to each element.
		for(int index = 0; index < firstArray.length; index++)
		{
			secondArray[index] = firstArray[index];
			System.out.println("secondArray[" + index + "] 's value is: " +
								secondArray[index] + "\n");
			System.out.println("firstArray[" + index + "] 's value is: " +
								firstArray[index] + "\n");
		}



		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);
	}

}