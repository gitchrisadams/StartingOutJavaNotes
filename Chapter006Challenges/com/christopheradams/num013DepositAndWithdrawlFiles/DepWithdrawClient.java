package com.christopheradams.num013DepositAndWithdrawlFiles;

import java.util.*;
import java.io.*;

public class DepWithdrawClient
{
	public static void main(String[]args) throws IOException
	{
		// Variables:
		double startingBalance = 500.00;
		int depCounter = 0;
		int withCounter = 0;

		// Constants:
		final String DEP_FILE = "Deposits.txt";
		final String WITHDRAW_FILE = "Withdrawals.txt";
		final Double INT_RATE = .05;

		// Create file objects.
		File depFile = new File(DEP_FILE);
		File withFile = new File(WITHDRAW_FILE);

		// If either of the files do not exist, exit the program.
		if(!depFile.exists() || !withFile.exists())
		{
			System.out.println("File does not exist, exiting the program...");
			System.exit(0);
		}

		// Create two Scanners for each file, one to count the data items
		// in the file and one to read them into an array:
		Scanner depFileCounter = new Scanner(depFile);
		Scanner depFileInput = new Scanner(depFile);
		Scanner withFileCounter = new Scanner(withFile);
		Scanner withFileInput = new Scanner(withFile);

		// Loop through both files and count how many items are in there:
		while(depFileCounter.hasNext())
		{
			depFileCounter.nextDouble();
			depCounter++;
		}
		while(withFileCounter.hasNext())
		{
			withFileCounter.nextDouble();
			withCounter++;
		}

		// Create array the size of elements counted in the files.
		double[] depArray = new double[depCounter];
		double[] withArray = new double[withCounter];

		// Reset our counters:
		depCounter = 0;
		withCounter = 0;

		// Now loop through the files again and store in the array.
		while(depFileInput.hasNext())
		{
			depArray[depCounter] = depFileInput.nextDouble();
			depCounter++;
		}

		while(withFileInput.hasNext())
		{
			withArray[withCounter] = withFileInput.nextDouble();
			withCounter++;
		}

		// Create a new SavingsAccount object:
		SavingsAccount myAccount = new SavingsAccount(startingBalance);

		// Output the starting balance:
		System.out.printf("%nThe starting balance is: $%.2f%n%n",
			myAccount.getBalance());

		// Call the withdraw method for each element in the array.
		for(int i = 0; i < withArray.length; i++)
		{
			myAccount.withdraw(withArray[i]);
			System.out.println("Withdrawing: " + withArray[i]);
		}

		// Call the deposit method for each element in the array.
		for(int i = 0; i < depArray.length; i++)
		{
			myAccount.deposit(depArray[i]);
			System.out.println("Depositing: " + depArray[i]);
		}

		// Call method to set the annual interest rate:
		myAccount.setAnnualInterestRate(INT_RATE);



		// Output:
		System.out.printf("%nThe balance before interest is: $%.2f%n",
			myAccount.getBalance());

		// Call method to calculate the total interest earned:
		myAccount.addMonthlyInterest();

		System.out.printf("%nThe total amount of deposits is $%.2f%n",
			myAccount.getTotalDeposits());

		System.out.printf("%nThe total amount of Withdrawls is $%.2f%n",
			myAccount.getTotalWithdrawals());

		System.out.printf("%nThe total interest earned is $%.2f%n",
			myAccount.getTotalInterestEarned());

		System.out.printf("%nThe balance after interest is applied is: $%.2f%n",
			myAccount.getBalance());
	}
}

/****************** Output *******************
depCounter: 4 withCounter: 5

Withdrawals:
29.88
110.0
27.52
50.0
12.9

Deposits:
100.0
124.0
78.92
37.55
Press any key to continue . . .
*********************************************/