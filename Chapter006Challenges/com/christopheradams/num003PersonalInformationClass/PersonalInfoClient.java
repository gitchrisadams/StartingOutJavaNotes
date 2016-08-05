package com.christopheradams.num003PersonalInformationClass;

public class PersonalInfoClient
{
	public static void main(String[]args)
	{
		// Create a new PersonalInformation object for me.
		PersonalInformation chris = new PersonalInformation("Christopher Adams", "10A Coastal Court Westerly, RI",
			"(860) 617-4625", 40);

		System.out.println(chris.getName() + " - " + chris.getAddress() + " - " +
			chris.getPhone() + " - " + chris.getAge() + "\n");

		// Create a new PersonalInformation file for Ann-Marie:
		PersonalInformation annMarie = new PersonalInformation("Ann-Marie Adams", "10A Coastal Court Westerly, RI",
			"(860) 581-3800", 32);

		System.out.println(annMarie.getName() + " - " + annMarie.getAddress() + " - " +
			annMarie.getPhone() + " - " + annMarie.getAge() + "\n");

		// Create a new PersonalInformation file for Kenzie:
		PersonalInformation kenzie = new PersonalInformation("Kenzie Adams", "10A Coastal Court Westerly, RI",
			"She's a dog dude!", 11);

		System.out.println(kenzie.getName() + " - " + kenzie.getAddress() + " - " +
			kenzie.getPhone() + " - " + kenzie.getAge() + "\n");

		// Change Kenzie's age to 12:
		kenzie.setAge(12);

		// Display Kenzie's new info:
		System.out.println("Kenzie's new info:");
		System.out.println(kenzie.getName() + " - " + kenzie.getAddress() + " - " +
			kenzie.getPhone() + " - " + kenzie.getAge() + "\n");

	}
}