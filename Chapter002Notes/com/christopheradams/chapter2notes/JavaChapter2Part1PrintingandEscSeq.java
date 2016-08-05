package com.christopheradams.chapter2notes;

// Import needed to be able to use Scanner class and get input from user:
import java.util.Scanner;

// Import allows us to have access to gui dialog messages and prompts:
import javax.swing.JOptionPane;

/*
	Christopher Adams
 	04/29
 	Java examples in Chapter 2
*/

/**
	This is an example of a java doc comment that starts with /** and ents with * /
	This program explains concepts explained in chapter 2 of the text book.
*/

// Name the class the same as the .java filename:
public class JavaChapter2Part1PrintingandEscSeq
{
	public static void main(String[] args)
	{
		// Print examples:
		// These will print on same line:
		System.out.print("Hello World!, ");
		System.out.println("how are you doing?");
		System.out.println("");


		// Instead of using println you could use excape sequences with print:
		System.out.print("Hello World!, \n");
		System.out.print("how are you doing?\n");
		System.out.print("I'm doing quite well!");
		System.out.println("");
		System.out.println("");


		// Breaking of print statements into more than one line in code:
		System.out.println("Enter a value that is " +
							"greater than zero and less " +
							"than 10.\n");


		// Escape sequences:
		System.out.println("Tab over here ->, \t");
		System.out.println("After tab we will print this then go to a new line ->, \n");
		System.out.println("Print a backslash by using escap char \\");
		System.out.println("Print double quotes: \" or print single quotes \'");
		System.out.println("");

	}


}