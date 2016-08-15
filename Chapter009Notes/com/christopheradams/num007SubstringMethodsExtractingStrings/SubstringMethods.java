package com.christopheradams.num007SubstringMethodsExtractingStrings;

import javax.swing.JOptionPane;

public class SubstringMethods
{
   public static void main(String[] args)
   {
	   // Create String of my full name:
	   String fullName = "Christopher Michael Adams";
	   
	   // Get my last name by starting at the 20th char(Starts counting at 0)
	   // and go to the end of the string. Optionally you could put (beginIndex, endIndex)
	   String lastName = fullName.substring(20);
	   
	   // Get the middle name:
	   // Notice for the start position 12 the position char is included
	   // but for the ending postion 19 the car is not included. 
	   // The 19th char is actually the blank space between Michael and Adams
	   // so last char that will output is the l in Michael.
	   String middleName = fullName.substring(12, 19);
	   
	   // Output:
	   JOptionPane.showMessageDialog(null, "The full name is " + fullName + 
			   "\nThe last name is " + lastName + 
			   "\nThe middle name is " + middleName);
   }
}
