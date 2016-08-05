package com.christopheradams.ch3Notes;

public class JavaChapter3Part7IgnoreCaseDotEqualsCompareTo
{
	public static void main(String[]Args)
	{
		String myString1 = "Chris";
		String myString2 = "CHRIS";

		String myString3 = "GeOrGe";
		String myString4 = "george";

		if(myString1.equalsIgnoreCase(myString2));
			System.out.println("The Strings: " + myString1 + " and " + myString2 +
				"\nare equal, even though they are different case.\n");

		if(myString3.compareToIgnoreCase(myString4) == 0)
			System.out.println("The Strings: " + myString3 + " and " + myString4 +
				"\nare equal, even though they are different case.\n");

	}
}