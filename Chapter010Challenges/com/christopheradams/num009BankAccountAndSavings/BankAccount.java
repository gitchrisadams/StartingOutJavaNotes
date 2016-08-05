package com.christopheradams.num009BankAccountAndSavings;

public abstract class BankAccount
{
	/***** Fields *****/
	private double balance;
	int numDeposits;
	int numWithdrawals;
	double annualInterestRate;
	double monthlyServiceCharges;

	/**
		Constructor
	*/
	public BankAccount(double balance, double annualInterestRate)
	{
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	/***** Getters *****/
	public double getBalance()
	{
		return balance;
	}

	public double getNumWithdrawals()
	{
		return numWithdrawals;
	}

	/***** Setters *****/
	public void setMonthlyServiceCharges(double monthlyServiceCharges)
	{
		this.monthlyServiceCharges = monthlyServiceCharges;
	}

	/***** Methods *****/
	public void deposit(double deposit)
	{
		balance += deposit;

		// Increment counter to track number of deposits:
		numDeposits++;
	}

	public void withdraw(double withdrawal)
	{
		balance -= withdrawal;

		// Increment number of withdrawals counter.
		numWithdrawals++;
	}

	public void calcInterest()
	{
		// Formula to calculate monthly interest.
		double monthlyInterestRate = annualInterestRate / 12;
		double monthlyInterest = balance * monthlyInterestRate;

		// Add the monthly interest earned to the balance.
		balance += monthlyInterest;
	}

	public void monthlyProcess()
	{
		// Subtract any service charges from the balance:
		balance -= monthlyServiceCharges;

		// Call the calcInterest method:
		calcInterest();

		// Reset withdraw and deposit counter back to 0:
		numDeposits = 0;
		numWithdrawals = 0;

		// Reset service charges to 0:
		monthlyServiceCharges = 0;
	}
}