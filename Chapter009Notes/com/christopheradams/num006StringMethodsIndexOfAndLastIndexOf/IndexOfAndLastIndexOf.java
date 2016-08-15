package com.christopheradams.num006StringMethodsIndexOfAndLastIndexOf;

import javax.swing.JOptionPane;

public class IndexOfAndLastIndexOf
{
   public static void main(String[] args)
   {
	   // Create String:
	   String str = "Four score and seven years ago.";
	   
	   // Create two int's for holding index of the character:
	   int first, last;
	   
	   /***** Using indexOf and lastIndexOf to find index of a char in a String *****/
	   first = str.indexOf('r');
	   last = str.lastIndexOf('r');
	   
	   // Output where the 'r' appears in the String:
	   JOptionPane.showMessageDialog(null, "The letter r first appears at position: " + first + 
			   "\nThe letter r last appears at position: " + last);
	   
	   /***** End Using indexOf and lastIndexOf to find index of a char in a String *****/
	   
	   /***** Using a Loop to show the position of a character *****/
	   System.out.println("The letter r appears at the following locations:");
	   
	   // Priming read:
	   // Store the first instance of the char 'r':
	   int position = str.indexOf('r');
	   
	   while(position != -1)
	   {
		   // Output the position of the char 'r':
		   System.out.println(position);
		   
		   // Store the position 'r' is found and the (position + 1) means
		   // start looking for it at the current position + 1
		   position = str.indexOf('r', position + 1);
	   }
	   /***** End Using a Loop to show the position of a character *****/
	   
	   
	   /***** Using a Loop to show the position of a character using lastIndexOf *****/
	   System.out.println("\nThe letter r appears at the following locations:");
	   
	   // Priming read:
	   // Store the last instance of the char 'r':
	   position = str.lastIndexOf('r');
	   
	   while(position != -1)
	   {
		   // Output the position of the char 'r':
		   System.out.println(position);
		   
		   // Store the position 'r' is found and the (position - 1) means
		   // start looking for it at the current position minus 1 since
		   // we are not going from last to first(backwards).
		   position = str.lastIndexOf('r', position - 1);
	   }
	   /***** End Using a Loop to show the position of a character using lastIndexOf *****/
	   
	   
	   /***** Finding Strings within Strings(Substrings) with IndexOf/LastIndexOf *****/
	   /***** Note: We can do the same below with lastIndexOf, see above example *****/
	   // Create a string:
	   String str3 = "and a one and a two and a three";
	   
	   // int to store the position String is found at:
	   int pos3;
	   
	   // Output heading:
	   System.out.println("The word 'and' appears at the following locations.");
	   
	   // Priming read:
	   // Store the position the word "and" is found:
	   pos3 = str3.indexOf("and");
	   
	   // -1 means it is not found, so loop while we keep finding "and":
	   while(pos3 != -1)
	   {
		   // Output position "and" is found at:
		   System.out.println(pos3);
		   
		   // Store the next index that "and" is found at:
		   pos3 = str3.indexOf("and", pos3 + 1);
	   }
	   /***** Finding Strings within Strings(Substrings) with IndexOf/LastIndexOf *****/
	   
	   
   }
}
