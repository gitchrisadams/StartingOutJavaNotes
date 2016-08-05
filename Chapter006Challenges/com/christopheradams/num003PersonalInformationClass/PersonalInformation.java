package com.christopheradams.num003PersonalInformationClass;

/**
	Christopher Adams 7/10/16
	The PersonalInformation class holds personal data such as name, address,
	age, and phone number.
*/

public class PersonalInformation
{

	// Fields:
	private String name;				// The name of the person.
	private String address;				// The physical address of the person.
	private String phone;				// The person's telephone number.
	private int age;					// The person's age.

	/**
		Constructor
	*/
	public PersonalInformation(String theName, String theAddress, String thePhone, int theAge)
	{
		// Set the values passed in to be stored in the appropriate fields.
		name = theName;
		address = theAddress;
		phone = thePhone;
		age = theAge;
	}


	/********* Getters *********/
	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public String getPhone()
	{
		return phone;
	}

	public int getAge()
	{
		return age;
	}


	/************ Setters *************/
	public void setName(String theName)
	{
		name = theName;
	}

	public void setAddress(String theAddress)
	{
		address = theAddress;
	}

	public void setPhone(String thePhone)
	{
		phone = thePhone;
	}

	public void setAge(int theAge)
	{
		age = theAge;
	}
}