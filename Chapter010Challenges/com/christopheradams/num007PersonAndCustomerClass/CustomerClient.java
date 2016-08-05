package com.christopheradams.num007PersonAndCustomerClass;

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

		System.out.println("Customer1:");
		System.out.println("Name: " + customer1.getName());
		System.out.println("Address: " + customer1.getAddress());
		System.out.println("Telephone: " + customer1.getPhone());
		System.out.println("Customer #: " + customer1.getCusNum());
		if(customer1.getOnMailingList())
			System.out.println("Yes, the customer is on the mailing list!");
		else
			System.out.println("No, the customer is not on the mailing list...");
	}
}