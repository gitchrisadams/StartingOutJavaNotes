package com.christopheradams.num004RetailItemClass;

public class RetailItemClient
{
	public static void main(String[]args)
	{
		// Create a new Retail item object.
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);

		// Create a new Retail item object.
		RetailItem item2 = new RetailItem("Jeans", 40, 34.95);

		// Create a new Retail item object.
		RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

		System.out.printf("%-20s%-20s%-20s%-20s%n", "Item", "Description", "Units on Hand", "Price");
		System.out.println("-----------------------------------------------------------------------");
		System.out.printf("%-23s%-10s%15d%13s%,5.2f%n",
			"Item # 1", item1.getDescrip(), item1.getUnitsOnHand(), "$",item1.getPrice());
		System.out.printf("%-23s%-10s%15d%13s%,5.2f%n",
			"Item # 2", item2.getDescrip(), item2.getUnitsOnHand(), "$",item2.getPrice());
		System.out.printf("%-23s%-10s%15d%13s%,5.2f%n",
			"Item # 3", item3.getDescrip(), item3.getUnitsOnHand(), "$", item3.getPrice());
	}
}