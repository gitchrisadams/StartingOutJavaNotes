package com.christopheradams.num010EnumeratedTypes;

public class EnumeratedTypesDemo
{
	// Create an Enum type with days of week:
	// We will only be allowed to set Day to these values.
	enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
		THURSDAY, FRIDAY, SATURDAY }

	public static void main(String[]args)
	{
		// Create an instance of the enum type and set it to
		// MONDAY.
		Day myDay1 = Day.MONDAY;

		// Output MONDAY.
		System.out.println(myDay1);


	}
}