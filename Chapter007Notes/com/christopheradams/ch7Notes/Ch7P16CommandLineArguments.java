package com.christopheradams.ch7Notes;

/*
	Christopher Adams
	5/13/2016
	Command-Line Arguments.
*/


public class Ch7P16CommandLineArguments
{
	// Notice main has String[] args so it accepts a string array.
	public static void main(String[]args)
	{
		for(int index = 0; index < args.length; index++)
		{
			/*
				We can pass arguments to main.
				We just type in the following to the command line when running the program:
				java NAME_OF_YOUR_FILE_HERE YourArgHere1 YourArgHere2
				Example:
				java Ch7P16CommandLineArguments Hello World
				Will display:
				Hello
				World
			*/

			// Output whatever we send as commandline arguments:
			System.out.println(args[index]);
		}
	}
}