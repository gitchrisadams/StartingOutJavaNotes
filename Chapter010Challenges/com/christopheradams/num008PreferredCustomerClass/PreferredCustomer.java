package com.christopheradams.num008PreferredCustomerClass;

public class PreferredCustomer extends Customer
{
	/***** Fields *****/
	private double customerPurchases;
	private double discountPercent;

	/**
		Constructor
	*/
	public PreferredCustomer(String name, String address, String phone,
		int cusNum, boolean onMailingList, double customerPurchases)
	{
		super(name, address, phone, cusNum, onMailingList);

		this.customerPurchases = customerPurchases;

		// Call method that calculates the discount percentage
		// based on how much customer spends.
		calcDiscountPercent();
	}

	// Getters:
	public double getCustomerPurchases()
	{
		return customerPurchases;
	}

	public double getDiscountPercent()
	{
		return discountPercent;
	}

	// Setters:
	public void setCustomerPurchases(double customerPurchases)
	{
		this.customerPurchases = customerPurchases;
	}

	/***** Methods *****/
	public void calcDiscountPercent()
	{
		if(customerPurchases >= 2000)
		{
			discountPercent = .10;
		}
		else if(customerPurchases >= 1500)
		{
			discountPercent = .07;
		}
		else if(customerPurchases >= 1000)
		{
			discountPercent = .06;
		}
		else if(customerPurchases >= 500)
		{
			discountPercent = .05;
		}
	}
}