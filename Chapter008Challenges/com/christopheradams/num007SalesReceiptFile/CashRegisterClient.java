package com.christopheradams.num007SalesReceiptFile;

import java.util.*;
import java.io.*;

public class CashRegisterClient
{
	public static void main(String[]args) throws IOException
	{
		int numItems = 0;

		// Create a new Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get number of items being purchased from the user.
		System.out.print("Enter quantity of items being purchased: ");
		numItems = keyboard.nextInt();

		// Create a new RetailItem object:
		RetailItem myRetail = new RetailItem("Gloves", 5, 20);

		// Create a new CashRegister object passing in the RetailItem object
		// and the number of items purchased.
		CashRegister cashReg1 = new CashRegister(myRetail, numItems);

		System.out.println("Subtotal: $" + cashReg1.getSubtotal());
		System.out.println();
		System.out.println("Tax: $" + cashReg1.getTax());
		System.out.println();
		System.out.println("Total: $" + cashReg1.getTotal());

		// Generate a sales receipt:
		cashReg1.salesReceipt();




	}
}