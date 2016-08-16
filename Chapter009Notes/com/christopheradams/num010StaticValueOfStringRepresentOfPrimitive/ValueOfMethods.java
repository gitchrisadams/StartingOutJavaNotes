package com.christopheradams.num010StaticValueOfStringRepresentOfPrimitive;

public class ValueOfMethods
{
   public static void main(String [] args)
   {
	   /* The valueOf methods return a String representation
	    * of a primitive value.
	    */
	   // boolean:
	   // Will output, "true" as a String.
	   boolean b = true;
	   System.out.println(String.valueOf(b));
	   
	   // char array All elements:
	   char[]letters = { 'a', 'b', 'c' };
	   // Outputs all the elements in the char array: "abc" as a String.
	   System.out.println(String.valueOf(letters));
	   
	   // char Array that returns only part of the elements in an array:
	   // (char[] array, int subscript, int count)
	   // subscript is starting postion and count is number of elements.
	   // So this will only output the 'a' as a String.
	   System.out.println(String.valueOf(letters, 0, 1));
	   
	   // double:
	   // Outputs double as a String:
	   double d = 2.49544567;
	   
	   // This will output "2.49544567" as a String
	   System.out.println(String.valueOf(d));
	   
	   // Integer:
	   // Output Integer as a String:
	   int i = 7;
	   System.out.println(String.valueOf(i));
	   
	   
	   
	   
   }
}
