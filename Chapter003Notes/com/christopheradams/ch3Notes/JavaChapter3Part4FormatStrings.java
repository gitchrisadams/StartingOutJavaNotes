package com.christopheradams.ch3Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.

/*
	Christopher Adams
	04/29/2016
	Java Chapter 3 Examples
*/

/**
	This is an example of a java doc comment that starts with /** and ents with * /
	This program explains concepts explained in chapter 3 of the text book.
*/

// Name Class same as the .java file name:
public class JavaChapter3Part4FormatStrings
{
	public static void main(String[] args)
	{

		/************************ Formatting strings printf String.format ************************/
		// Displaying double with default decimal places(6):(Also notice we escape the %f with double % or %%f)
		// The "%f" prints out due to the %%f
		// Declare a double:
		double sales = 12345.67;
		int myNumToFormat = 150;

		// Output, notice it prints out with 6 decimal places 12345.670000
		System.out.printf("The double formatted to the default six decimal places with %%f is: %f \n", sales);

		// The format of the printf format specifier is %[flags][width][.precision]conversion
		// Everything in brackets is optional.

		// Now lets print out the same number with only two decimal places:
		// the .2f is the precision and number after the dot and before f is number of decimal places to display:
		System.out.printf("The double formatted to two decimal places with %%.2f is: %.2f \n", sales);

		// Minimum Field Width:
		// This will print out the number with 20 Spaces similar to this:           123345.670000
		System.out.printf("The double printed with %%20f should have a width of 20: %20f \n", sales);

		// Combining field width and precision:
		// This will print out the number with 12 Spaces and with 2 decimal places similar to this;
		//    12345.67
		System.out.printf("The double printed with %%12.2f should have a width of 12 " +
						  "and a precision of 2: %12.2f \n", sales);

		// You can also format integers and floats with minimum field width:
		System.out.printf("The int formatted w/ field width of 6 with %%6d is: %6d \n", myNumToFormat);
		System.out.println("");

		// Formatting a number with commas: Like 1,234,567.89
		System.out.printf("This number is formatted with commas: %,.2f", 1234567.90);
		System.out.println("");
		System.out.println("");

		// Padding numbers with leading zeros:
		double numToPadZero = 123.4;
		System.out.printf("A number padded with zeros:%08.1f", numToPadZero);
		System.out.println("");
		System.out.println("");

		// Left justifying integers:
		// Notice the minus sign after the %.
		// Replace the 8 with however many decimals you want to left justify:
		System.out.printf("%-8d%-8d", 123, 145);
		System.out.println("");
		System.out.printf("%-8d%-8d", 1000, 23);
		System.out.println("");
		System.out.println("");

		// Adding leading/padding of zeros to an int:
		// We are adding up to 3 padded zeros here:
		// So if integer only has two digits, it will display as 065.
		System.out.printf("%03d\n", 500);
		System.out.printf("%03d\n", 65);

		// Formatting String Arguments:
		String headingFirstName = "First Name";
		String headingLastName = "Last Name";
		String stringToFormat1 = "Christopher";
		String stringToFormat2 = "Adams";
		String stringToFormat3 = "George";
		String stringToFormat4 = "Washington";
		System.out.printf("I used a %%s string formatter to format the string here: %s\n\n", stringToFormat1);

		// Formatting Strings with a field width:
		// Notice these are right justified by default. Because we don't have a minus:
		System.out.printf("%20s%20s\n", headingFirstName, headingLastName);
		System.out.printf("%20s%20s\n", stringToFormat1, stringToFormat2);
		System.out.printf("%20s%20s\n", stringToFormat3, stringToFormat4);
		System.out.printf("%20s%20s\n", headingFirstName, headingLastName);
		System.out.printf("%20s%20s\n", stringToFormat1, stringToFormat2);
		System.out.printf("%20s%20s\n", stringToFormat3, stringToFormat4);
		System.out.println("");
		System.out.println("");


		// Formatting Strings with a field width:
		// Same as above but now we are left justifying them: Notice the minus:
		System.out.printf("%-20s%-20s\n", headingFirstName, headingLastName);
		System.out.printf("%-20s%-20s\n", stringToFormat1, stringToFormat2);
		System.out.printf("%-20s%-20s\n", stringToFormat3, stringToFormat4);

		System.out.printf("%-20s%-20s\n", headingFirstName, headingLastName);
		System.out.printf("%-20s%-20s\n", stringToFormat1, stringToFormat2);
		System.out.printf("%-20s%-20s\n", stringToFormat3, stringToFormat4);
		System.out.println("");
		System.out.println("");

		// Example of mixing arguments of different data types:
		int jayHoursWorked = 1;
		String jaysName = "Jay";
		double jayPay = 2000.50;

		System.out.printf("Name: %s, Hours: %d Pay: $%,.2f\n", jaysName, jayHoursWorked, jayPay);

		/************** The String.format method works same way as printf: **************/
		double myStringDotFormat1 = 500.00;

		// We pass in our double with all the formatting and store it in a string myStringDotFormatted1:
		String myStringDotFormatted1 = String.format("Your annual pay is $%,.2f", myStringDotFormat1);

		// Display the formatted string in a dialog box:
		JOptionPane.showMessageDialog(null, myStringDotFormatted1);

		/************** End The String.format method works same way as printf: **************/


		/************************ End Formatting strings printf String.format ************************/

		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);

	}
}