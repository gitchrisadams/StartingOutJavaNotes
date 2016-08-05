package com.christopheradams.num034ArrayListsOfObjects;

import java.util.*;

public class ArrayListsOfObjects
{
	public static void main(String[]args)
	{
		// Declare a Bank account reference.
		BankAccount account;

		// Create an ArrayList to hold BankAccount objects.
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();

		// Add three BankAccount objects to the ArrayList.
		list.add(new BankAccount(100.0));
		list.add(new BankAccount(500.0));
		list.add(new BankAccount(1500.0));

		// Display each item.
		for(int i = 0; i < list.size(); i++)
		{
			account = list.get(i);
			System.out.println("Account at index " + i + "\nBalance: " + account.getBalance());
		}

		// This gets the balance directly off the ArrayList element instead
		// of having to  create the account of type BankAccount object.
		System.out.println(list.get(0).getBalance());

		// You can also create an account like we did in the loop above
		// like this.
		// This just creates a BankAccount object giving us access to the getBalance()
		// method.
		account = list.get(1);
		System.out.println(list.get(1).getBalance());


	}
}