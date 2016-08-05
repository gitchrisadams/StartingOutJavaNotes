package com.christopheradams.ch3Notes;

// Import statements:
import java.util.*;						// Allows getting input from the user and other features.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.
import java.io.*;

/*
	Christopher Adams
	05/10/2016
	Comparing Strings to see if they are Palidromes.
*/


public class JavaChapter3Part5SupCompareStringsForPalidrome
{
	public static void main(String[] args)
	{
        // Create a new scanner for input from user.
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a string to check for whether it is a palidrome");
        String A=sc.next();

        // Make copies of the A and store in B and C.
        String B = A;
        String C = A;

        // Counter for copying array to other array when counting up.
        int counter = 0;

        // Convert two of the strings to charArrays.
        char[]myCharArray = B.toCharArray();
        char[]myCharArrayNew = C.toCharArray();

        // Starting value the length of the array minus 1:
        // Loop backwards through all elements in the array while i
        // is greater or equal to 0:
        for(int i = myCharArray.length-1; i >=0; i--)
        {
            // Add current i counter element in myCharArray to
            // our new array to hold the char array with the letters going backwards.
            // Use counter to count from 0 and up.
            myCharArrayNew[counter] = myCharArray[i];
            counter+=1;

        }

        //System.out.print(myCharArrayNew[0]);
        //System.out.print(myCharArrayNew[1]);
        //System.out.print(myCharArrayNew[2]);
        //System.out.print(myCharArrayNew[3]);
        //System.out.print(myCharArrayNew[4]);

        // If statement to print out "Yes" if they are equal and "No" if not.
        if(Arrays.equals(myCharArray, myCharArrayNew))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}