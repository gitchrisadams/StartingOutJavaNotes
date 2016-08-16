package com.christopheradams.num011StringBuilder;

public class StringBuilderMethods
{
   public static void main(String [] args)
   {
	   /***** Create a new String using StringBuilder *****/
	   /**** Unlike regular Strings, StringBuilder Strings are mutable *****/
	   /**** a.k.a can be changed. *****/
	   StringBuilder city = new StringBuilder("Westerly");
	   
	   // Output the StringBuilder:
	   System.out.println(city);
	   
	   // Note about StringBuilder:
	   // You can do this StringBuilder city = "Westerly"
	   // like you can a normal String, you need the new keyboard.
	   /***** End String Builder *****/
	   
	   /***** Appending values to a String *****/
	   // This will produce Westerly, RI by appending a String:
	   city.append(" , RI");
	   
	   System.out.println(city);
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
