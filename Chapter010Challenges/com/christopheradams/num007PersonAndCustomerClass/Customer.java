package com.christopheradams.num007PersonAndCustomerClass;

public class Customer extends Person
{
	/***** Fields *****/
	private int cusNum;
	private boolean onMailingList;

	/**
		Constructor
	*/
	public Customer(String name, String address, String phone,
		int cusNum, boolean onMailingList)
	{
		super(name, address, phone);
		this.cusNum = cusNum;
		this.onMailingList = onMailingList;
	}

	// Getters:
	public int getCusNum()
	{
		return cusNum;
	}

	public boolean getOnMailingList()
	{
		return onMailingList;
	}

	// Setters:
	public void setCusNum(int cusNum)
	{
		this.cusNum = cusNum;
	}

	public void setOnMailingList(boolean onMailingList)
	{
		this.onMailingList = onMailingList;
	}
}