package com.christopheradams.chapter2notes;

// Import needed to be able to use Scanner class and get input from user:
import java.util.Scanner;

// Import allows us to have access to gui dialog messages and prompts:
import javax.swing.JOptionPane;

/*
	Christopher Adams
 	04/29/2016
 	Java examples in Chapter 2
*/

/**
	This is an example of a java doc comment that starts with /** and ents with * /
	This program explains concepts explained in chapter 2 of the text book.
*/

// Name the class the same as the .java filename:
public class JavaChapter2Part7DialogBoxes
{
	public static void main(String[] args)
	{
		/*************************** Dialog Boxes ***************************/
		// Must import javax.swing.JOptionPane above. Must also use System.Exit(0) end of main.
		// Get input from a dialog gui box:
		String myDialogInput;
		myDialogInput = JOptionPane.showInputDialog("What's your name fool?");

		// Display a dialog gui message:
		JOptionPane.showMessageDialog(null, "Hello, " + myDialogInput);

		/*************************** End Dialog Boxes ***************************/

		// Causes program to properly end. Required if use JOptionPane class:
		System.exit(0);

	}


}