package com.christopheradams.num009BankAccountAndSavings;

public class SavingsAccountClient
{
	public static void main(String[]args)
	{
		/***** Variables *****/
		double balance = 1000;
		double annualInterestRate = .05;

		// Create a new Savings Account object:
		SavingsAccount account1 = new SavingsAccount(balance, annualInterestRate);

		// Display the balance:
		System.out.println("The starting balance is: $" + account1.getBalance() + "\n");

		// Make 5 withdrawals:
		for(int i = 0; i < 6; i++)
		{
			System.out.println("Withdrawing $" + (i+1));
			account1.withdraw(i+1);
			System.out.println("The balance is now: $" + account1.getBalance());

			// Display the account status:
			if(account1.isActive(account1.getBalance()))
				System.out.println("Account is active.\n");
			else
				System.out.println("Account is inactive.\n");
		}

		// Call method to process the monthly transactions:
		account1.monthlyProcess();

		System.out.println("\nThe ending balance is: $" + account1.getBalance() + "\n");




	}
}