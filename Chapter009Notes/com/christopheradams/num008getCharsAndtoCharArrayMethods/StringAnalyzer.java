package com.christopheradams.num008getCharsAndtoCharArrayMethods;

import javax.swing.JOptionPane;

/**
   This program displays the number of letters,
   digits, and whitespace characters in a string.
*/

public class StringAnalyzer
{
   public static void main(String [] args)
   {
      String input;        // To hold input
      char[] array;        // Array for input
      int letters = 0;     // Number of letters
      int digits = 0;      // Number of digits
      int whitespaces = 0; // Number of whitespaces

      // Get a string from the user.
      input = JOptionPane.showInputDialog("Enter " +
                                       "a string:");
      
      // Create a string to demonstrate getChars:
      String fullName = "Christopher Michael Adams";
      
      // Create a char array:
      char[] nameArray = new char[5];
      
      /***** The getChars method demo *****/
      // Format: (srcBegin, srcEnd, dst, dstBegin);
      // This takes the full name and begins at srcBegin char and goes to srcEnd
      // Then it stores it in the dst(destination) and the dstBegin is the element
      // in the destination array it begins storing at.
      fullName.getChars(20, 25, nameArray, 0);
      
      // Output the char array w/ a loop:
      for(int i = 0; i < nameArray.length; i++)
      {
    	  System.out.print(nameArray[i] + " ");
      }
      /***** End The getChars method demo *****/

      
      /***** Convert the string to a char array. *****/
      array = input.toCharArray();

      // Analyze the characters.
      for (int i = 0; i < array.length; i++)
      {
         if (Character.isLetter(array[i]))
            letters++;
         else if (Character.isDigit(array[i]))
            digits++;
         else if (Character.isWhitespace(array[i]))
            whitespaces++;
      }

      // Display the results.
      JOptionPane.showMessageDialog(null,
                      "That string contains " +
                      letters + " letters, " +
                      digits + " digits, and " +
                      whitespaces +
                      " whitespace characters.");
      
      System.exit(0);
   }
}
