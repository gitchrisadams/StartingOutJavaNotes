package com.christopheradams.num012SavingsAccountClass;

public class SavingsAccount
{
	// Fields:
	private double annualInterestRate;
	private double monthlyInterestRate;
	private double balance;
	private double totalDeposits;
	private double totalInterestEarned;

	/**
		Constructor
	*/
	public SavingsAccount(double startingBalance)
	{
		balance = startingBalance;
	}

	// Setters:
	public void setAnnualInterestRate(double rate)
	{
		annualInterestRate = rate;
	}

	// Getters:
	public double getBalance()
	{
		return balance;
	}

	public double getTotalDeposits()
	{
		return totalDeposits;
	}

	public double getTotalInterestEarned()
	{
		return totalInterestEarned;
	}



	public void withdraw(double withdrawl)
	{
		balance -= withdrawl;
	}

	public void deposit(double dep)
	{
		balance += dep;
		totalDeposits += dep;
	}

	public void addMonthlyInterest()
	{
		monthlyInterestRate = annualInterestRate / 12;

		totalInterestEarned += monthlyInterestRate * balance;

		balance += monthlyInterestRate * balance;
	}
}





















