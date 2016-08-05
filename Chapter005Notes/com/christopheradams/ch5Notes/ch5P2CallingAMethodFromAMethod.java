package com.christopheradams.ch5Notes;

// Import statements:
import java.util.Scanner;				// Allows getting input from the user.
import javax.swing.JOptionPane;			// Allows access to gui dialog messages and prompts.
import java.io.*;						// Used for reading and writing to a file.
import java.util.Random;				// For generating random numbers.

/*
	Christopher Adams
	5/03/2016
	Calling a method from a method.
*/


public class ch5P2CallingAMethodFromAMethod
{
	/***** Example of a Simple Method call *****/
	// We add throws IOException since we are writing to a file and this is needed for error handling.
	public static void main(String[] args) throws IOException
	{
		System.out.println("I am starting in main().");
		deep();
		System.out.println("Now I am back in the main() method");

	// Causes program to properly end. Required if use JOptionPane class:
	System.exit(0);
	}


	/**
		The deep method displays a message and then calls the deeper method.
	*/
	public static void deep()
	{
		System.out.println("I am now in deep and in the deep() method.");
		deeper();
		System.out.println("Now I am back in the deep() method.");
	}


	/**
		The deeper method simply displays a message.
	*/
		public static void deeper()
		{
			System.out.println("I am now in deeper and inside the deeper() method");
	}





}