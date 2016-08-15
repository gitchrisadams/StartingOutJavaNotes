package com.christopheradams.num005StringMethodsRegionMatchesMethods;

import javax.swing.JOptionPane;

public class RegionMatches
{
   public static void main(String[] args)
   {
	   // Create two Strings:
	   String str = "Four score and seven years ago.";
	   String str2 = "Those seven years passed quickly";
	   
	   /***** regionMatches to see if two strings match *****/
	   // (15, str2, 6, 11) begins at char 15 of str or the 's' in "seven..."
	   // The next string to search is str2 and it starts at char 6 and goes 
	   // to 11 characters. So the 's' in seven to the 's' in years.
	   if(str.regionMatches(15, str2, 6, 11))
	   {
		   JOptionPane.showMessageDialog(null, "The regions match.");
	   }
	   else
	   {
		   JOptionPane.showMessageDialog(null, "They don't match.");
	   }
	   
	   // If you don't want the match to be case sensitive you can do this:
	   // if(str.regionMatches(true, 15, str2, 6, 11))
	   // Notice true is added as the first argument.
	   /***** End regionMatches to see if two strings match *****/
	   
	   
	   
   }
}
