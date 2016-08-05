package com.christopheradams.num008PreferredCustomerClass;

public class Person
{
	/***** Fields *****/
	private String name;
	private String address;
	private String phone;

	/**
		Constructor
	*/
	public Person(String name, String address, String phone)
	{
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	// Getters:
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

	// Setters:
	public void setName(String name)
	{
		this.name = name;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}


}
