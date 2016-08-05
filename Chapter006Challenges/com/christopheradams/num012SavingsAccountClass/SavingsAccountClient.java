package com.christopheradams.num012SavingsAccountClass;

import java.util.*;

public class SavingsAccountClient
{
	public static void main(String[]args)
	{
		// Variables:
		double annualInterestRate = 0.0;
		double startingBalance = 0.0;
		int monthsActive = 0;
		double depositedThisMonth = 0.0;
		double withdrawnThisMonth = 0.0;

		// Create a new Scanner.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the annual interest rate: ");
		annualInterestRate = keyboard.nextDouble();

		System.out.println();

		System.out.print("Please enter the starting balance: ");
		startingBalance = keyboard.nextDouble();

		System.out.println();

		System.out.print("How many months has you account been active? ");
		monthsActive = keyboard.nextInt();

		// Create a new savings account object:
		SavingsAccount chrisSavings = new SavingsAccount(startingBalance);

		// Set the interest rate:
		chrisSavings.setAnnualInterestRate(annualInterestRate);

		for(int i = 0; i < monthsActive; i++)
		{
			System.out.print("How much deposited in month " + (i + 1) + ": ");
			depositedThisMonth = keyboard.nextDouble();

			chrisSavings.deposit(depositedThisMonth);

			System.out.print("How much did you withdraw in month " + (i + 1) + ": ");
			withdrawnThisMonth = keyboard.nextDouble();

			chrisSavings.withdraw(withdrawnThisMonth);

			chrisSavings.addMonthlyInterest();
		}

		// Ouput data:
		System.out.printf("%nThe ending balance is: $%.2f%n",
			chrisSavings.getBalance());

		System.out.printf("%nThe total amount of deposits is $%.2f%n",
			chrisSavings.getTotalDeposits());

		System.out.printf("%nThe total interest earned is $%.2f%n",
			chrisSavings.getTotalInterestEarned());





	}


}