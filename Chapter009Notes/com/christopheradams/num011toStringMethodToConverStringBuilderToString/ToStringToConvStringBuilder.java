package com.christopheradams.num011toStringMethodToConverStringBuilderToString;

public class ToStringToConvStringBuilder
{
   public static void main(String [] args)
   {
	   // Create a new String:
	   StringBuilder strToConvert = new StringBuilder("This is a test.");
	   
	   // Convert the StringBuilder object to a String:
	   String strConverted = strToConvert.toString();
	   
	   System.out.println(strConverted);
	   
   }
}
