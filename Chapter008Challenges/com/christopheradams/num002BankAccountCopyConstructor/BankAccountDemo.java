package com.christopheradams.num002BankAccountCopyConstructor;

public class BankAccountDemo
{
	public static void main(String[]args)
	{
		// Create BankAccount object using the Constructor that
		// accepts one double.
		BankAccount myAccount1 = new BankAccount(500);

		// Create a BankAccount object this time using the copy
		// Constructor. So the new account will have same
		// balance as above. (500)
		// Notice we pass in the account we want to make a copy of.
		BankAccount myAccount2 = new BankAccount(myAccount1);

		// Output the balance of myAccount2:
		// This should be 500.0 since we copied myAccount1.
		System.out.println(myAccount2.getBalance());
	}

}