package com.christopheradams.num007SalesReceiptFile;

import java.io.*;
import java.util.*;

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

	public void salesReceipt() throws IOException
	{
		// Create a new PrintWriter object:
		PrintWriter outputFile = new PrintWriter("salesReceipt.txt");

		outputFile.printf("%-20s%n", "SALES RECEIPT");
		outputFile.printf("%-20s$%.2f%n", "Unit Price:", item.getPrice());
		outputFile.printf("%-20s%d%n", "Quantity: ", numItems);
		outputFile.printf("%-20s$%.2f%n", "Subtotal: ", getSubtotal());
		outputFile.printf("%-20s$%.2f%n", "Sales Tax: ", getTax());
		outputFile.printf("%-20s$%.2f%n", "Total: ", getTotal());

		outputFile.close();



	}
}