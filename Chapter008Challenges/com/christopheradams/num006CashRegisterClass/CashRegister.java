package com.christopheradams.num006CashRegisterClass;

public class CashRegister
{
	// Fields:
	private RetailItem item;
	private int numItems;

	/**
		Constructor
		@param item The retail item to process.
		@param numItems The number of items to process.
	*/
	public CashRegister(RetailItem item1, int numItems1)
	{
		item = item1;
		numItems = numItems1;
	}

	public double getSubtotal()
	{
		return item.getPrice() * numItems;
	}

	public double getTax()
	{
		final double SALES_TAX = .06;

		return getSubtotal() * SALES_TAX;
	}

	public double getTotal()
	{
		return getSubtotal() + getTax();
	}
}