package com.christopheradams.num009StringMethodsConcatReplaceTrim;

public class ConcatReplaceTrim
{
   public static void main(String [] args)
   {
	   /***** String concat ******/
	   String firstName = "Chris";
	   String lastName = "Adams";
	   
	   System.out.println(firstName.concat(lastName));
	   /***** End String concat *****/
	   
	   
	   /***** String replace *****/
	   String str1 = "Tom Talber Tried Trains";
	   
	   String str2;
	   // Format: (oldChar, newChar)
	   // Replace 'T' with 'D'.
	   str2 = str1.replace('T', 'D');
	   
	   System.out.println("\n" + str2);
	   
	   /***** End String replace *****/
	   
	   
	   /***** Trim *****/
	   // Create a String with leading and trailing spaces:
	   String stringToTrim = "        Hello        ";
	   
	   // Output string with the leading spaces:
	   System.out.println("\nString untrimmed: " + stringToTrim);
	   
	   // Trim off the leading spaces:
	   String stringTrimmed = stringToTrim.trim();
	   
	   // Output the String trimmed:
	   System.out.println("\nString trimmed: " + stringTrimmed);

	   
	   
   }
}
