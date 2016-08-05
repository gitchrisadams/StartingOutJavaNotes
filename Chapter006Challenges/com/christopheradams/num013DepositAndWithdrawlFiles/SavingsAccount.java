package com.christopheradams.num013DepositAndWithdrawlFiles;

public class SavingsAccount
{
	// Fields:
	private double annualInterestRate;
	private double monthlyInterestRate;
	private double balance;
	private double totalDeposits;
	private double totalInterestEarned;
	private double totalWithdrawals;

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

	public double getTotalWithdrawals()
	{
		return totalWithdrawals;
	}



	public void withdraw(double withdrawal)
	{
		balance -= withdrawal;
		totalWithdrawals += withdrawal;
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





















