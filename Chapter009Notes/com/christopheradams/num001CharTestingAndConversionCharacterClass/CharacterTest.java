package com.christopheradams.num001CharTestingAndConversionCharacterClass;

import javax.swing.JOptionPane;

/**
   This program demonstrates some of the Character
   class's character testing methods.
*/

public class CharacterTest
{
   public static void main(String[] args)
   {
      String input;  // To hold the user's input
      char ch;       // To hold a single character

      // Get a character from the user and store
      // it in the ch variable.
      input = JOptionPane.showInputDialog("Enter " +
                            "any single character.");
      ch = input.charAt(0);
      
      // Test the character.
      // True if the char is a letter:
      if (Character.isLetter(ch))
      {
         JOptionPane.showMessageDialog(null, 
                        "That is a letter.");
      }

      // True if the char is a digit:
      if (Character.isDigit(ch))
      {
         JOptionPane.showMessageDialog(null,
                         "That is a digit.");
      }
      
      // True if the char is lowercase:
      if (Character.isLowerCase(ch))
      {
         JOptionPane.showMessageDialog(null,
              "That is a lowercase letter.");
      }

      // True if the char is upper case:
      if (Character.isUpperCase(ch))
      {
         JOptionPane.showMessageDialog(null,
             "That is an uppercase letter.");
      }
      
      // True if value passed is the spacebar character:
      if (Character.isSpaceChar(ch))
      {
         JOptionPane.showMessageDialog(null,
                         "That is a space.");
      }

      // True if a white space char like space, tab, new line is passed in:
      if (Character.isWhitespace(ch))
      {
         JOptionPane.showMessageDialog(null,
          "That is a whitespace character.");
      }
      
      System.exit(0);
   }
}
