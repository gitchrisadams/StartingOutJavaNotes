package com.christopheradams.num007SalesReceiptFile;

public class RetailItem
{
	// Fields:
	private String descrip;			// The description of the retail item.
	private int unitsOnHand;		// The units of the retail item on hand.
	private double price;			// The price of the retail item.

	/**
		Constructor
	*/
	RetailItem(String theDescrip, int theUnitsOnHand, double thePrice)
	{
		// Set fields to values passed to Constructor.
		descrip = theDescrip;
		unitsOnHand = theUnitsOnHand;
		price = thePrice;
	}

	// Getters:
	public String getDescrip()
	{
		return descrip;
	}

	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}

	public double getPrice()
	{
		return price;
	}

	// Setters:
	public void setDescrip(String theDescrip)
	{
		descrip = theDescrip;
	}

	public void setUnitsOnHand(int theUnitsOnHand)
	{
		unitsOnHand = theUnitsOnHand;
	}

	public void setPrice(double thePrice)
	{
		price = thePrice;
	}



}