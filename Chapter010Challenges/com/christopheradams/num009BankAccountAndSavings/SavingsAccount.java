package com.christopheradams.num009BankAccountAndSavings;

public class SavingsAccount extends BankAccount
{
	/***** Fields *****/
	private boolean isActive;

	/***** Constants *****/
	private final double MIN_BALANCE = 25;
	private final double SERVICE_FEE = 1;
	private final int NUM_WITHDRAWALS_ALLOWED = 4;

	/**
		Constructor
	*/
	public SavingsAccount(double balance, double annualInterestRate)
	{
		super(balance, annualInterestRate);
		isActive(getBalance());

	}

	public void withdraw(double withdrawal)
	{
		if(isActive(getBalance()))
		{
			super.withdraw(withdrawal);
		}
		else
		{
			System.out.println("Account is inactive, Withdrawals are not allowed!");
		}
	}

	public void deposit(double deposit)
	{
		if(isActive(getBalance()))
		{
			// If already active just complete the deposit.
			super.deposit(deposit);
		}
		else
		{
			// Make the deposit.
			super.deposit(deposit);

			// If that brought balance over 25, make the account active:
			isActive(getBalance());
		}
	}

	public void monthlyProcess()
	{
		if(getNumWithdrawals() > NUM_WITHDRAWALS_ALLOWED)
		{
			// Charge service fee if more than number of withdrawals allowed in month:
			setMonthlyServiceCharges((getNumWithdrawals() - NUM_WITHDRAWALS_ALLOWED) * SERVICE_FEE);

			// If we added a service fee then set account to active/inactive status:
			isActive(getBalance());

			// Call method to process the monthly transactions:
			super.monthlyProcess();
		}
	}

	public boolean isActive(double balance)
	{
		// Set account to deactivated if blance less than the minimum requirement:
		if(balance < MIN_BALANCE)
			isActive = false;
		else
			isActive = true;

		return isActive;
	}
}