package com.christopheradams.num002ShiftSupervisor;

public class ShiftSupervisorClient
{
	public static void main(String[]args)
	{
		// Variables:
		String empName = "Chris Adams";
		String empNum = "123456";
		String hireDate = "7/29/16";
		double annualSalary = 50000.00;
		final double BONUS = 5000;
		boolean hasMetProdGoals = true;

		// Create an instance of the ShiftSupervisor object:
		ShiftSupervisor supervisor1 = new ShiftSupervisor(empName, empNum,
			hireDate, annualSalary, BONUS);

		// Output the supervisor's annual salary before adding any
		// possible bonus:
		System.out.println("The supervisor earned $" + supervisor1.getAnnualSalary());
		System.out.println();

		// If a supervisor has met the production goals, then
		// give them a bonus:
		if(hasMetProdGoals)
		{
			supervisor1.setBonus(BONUS);
		}

		// Output the supervisor's salary after adding any possible bonus:
		System.out.println("The supervisor earned $" + supervisor1.getAnnualSalary() +
			" after the bonuses were handed out.");


	}
}