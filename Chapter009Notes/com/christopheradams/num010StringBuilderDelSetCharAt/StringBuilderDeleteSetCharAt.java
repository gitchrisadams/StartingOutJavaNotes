package com.christopheradams.num010StringBuilderDelSetCharAt;

public class StringBuilderDeleteSetCharAt
{
   public static void main(String [] args)
   {
	   // Create a String with StringBuilder:
	   StringBuilder blueberryString = new StringBuilder("I ate 100 blueberries!");
	   
	   // Display the String:
	   System.out.println(blueberryString);
	   
	   // Delete the 0 in 100 blueberies:
	   blueberryString.deleteCharAt(8);
	   
	   // Display the String after deleting a 0:
	   System.out.println(blueberryString); 
	   
	   // Delete the "blue" in blueberries:
	   // Format: (start, end)
	   blueberryString.delete(9, 13);

	   // Display the String after "blue":
	   System.out.println(blueberryString); 
	   
	   // Change the 1 in 10 to a 5:
	   blueberryString.setCharAt(6, '5');
	   
	   // Output the String after changing to '5':
	   System.out.println(blueberryString); 
	   
	   
	   
	   
	   
   }
}
