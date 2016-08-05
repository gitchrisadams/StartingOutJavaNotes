package com.christopheradams.num008PreferredCustomerClass;

public class CustomerClient
{
	public static void main(String[]args)
	{
		/***** Variables *****/
		// Data for a new customer:
		String name = "Chris Adams";
		String address = "10A Coastal Court Westerly, RI 02891";
		String phone = "860-617-4625";
		int cusNum = 12345;
		boolean onMailingList = false;

		// Create a new Customer object:
		Customer customer1 = new Customer(name, address, phone,
			cusNum, onMailingList);

		// Create a new Preferred Customer object:
		PreferredCustomer customer2 = new PreferredCustomer
			("Ann-Marie Adams", address, phone, 123456, onMailingList, 1000);

		// Output information on customer1:
		System.out.println("Customer1:");
		System.out.println("Name: " + customer1.getName());
		System.out.println("Address: " + customer1.getAddress());
		System.out.println("Telephone: " + customer1.getPhone());
		System.out.println("Customer #: " + customer1.getCusNum());
		if(customer1.getOnMailingList())
			System.out.println("Yes, the customer is on the mailing list!");
		else
			System.out.println("No, the customer is not on the mailing list...");
		System.out.println();

		// Output selected info about cutomer 2:
		// This is our preferred Customer so they get a
		// discount based on how much they spend.
		System.out.println("Name: " + customer2.getName());
		System.out.println("Discount Percent: " + (customer2.getDiscountPercent() * 100) + "%");
		System.out.println("Purchases before discount: $" + customer2.getCustomerPurchases());

		// Apply discount:
		System.out.println("Purchases after discount: $" +
			(customer2.getCustomerPurchases() *
			customer2.getDiscountPercent() +
			customer2.getCustomerPurchases()));


	}
}