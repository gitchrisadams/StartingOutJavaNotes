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
	   /***** End Trim *****/
	   
	   
	   /***** String Builder Append *****/
	   // Create a String:
	   StringBuilder stringToAppend = new StringBuilder();
	   
	   // Append a String object:
	   stringToAppend.append("We sold ");
	   
	   // Output the String:
	   System.out.println("\n" + stringToAppend);
	   
	   // Append an int to the String:
	   stringToAppend.append(12);
	   
	   // Output the String:
	   System.out.println("\n" + stringToAppend);
	   
	   // Append another String:
	   stringToAppend.append(" doughnuts for $");
	   
	   // Output the String:
	   System.out.println("\n" + stringToAppend);
	   
	   // Append a double to the String:
	   stringToAppend.append(15.95);
	   
	   // Output the String:
	   System.out.println("\n" + stringToAppend);
	   /***** End String Builder Append *****/
	   
	   
	   /***** Insert methods *****/
	   // Create String builder object:
	   StringBuilder ny = new StringBuilder("New City");
	   
	   // Output the String before we insert workd "york"
	   System.out.println(ny);
	   
	   // Append the word "York" between New and City:
	   // (Place start inserting, "Thing to insert ")
	   ny.insert(4, "york ");
	   
	   // Output the String after inserting "york":
	   System.out.println(ny);
	   /***** End Insert methods *****/
	   
	   
	   /***** Inserting a char array into a String Builder *****/
	   // Create a new char array:
	   char cArray[] = { '2', '0', ' ' };
	   
	   // Create a new String Builder object:
	   StringBuilder charString = new StringBuilder("In July we sold cars.");
	   
	   // Insert the char's '2' and '0' and a space starting at the 16th char:
	   charString.insert(16, cArray);
	   
	   // Output the String:
	   System.out.println(charString);
	   /***** End Inserting a char array into a String Builder *****/
	   
	   
	   /***** The replace method *****/
	   // Create a new StringBuilder object:
	   StringBuilder strReplace = new StringBuilder("We moved from Chicago to Atlanta");
	   
	   // Replace the string starting at char 14 to char 21 with "New York":
	   strReplace.replace(14, 21, "New York");
	   
	   // Output the String:
	   System.out.println(strReplace);
	   /***** End The replace method *****/
	   
	   
   }
}
