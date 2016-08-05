package com.christopheradams.num002ShiftSupervisor;

public class ShiftSupervisor extends Employee
{
	// Fields:
	private double annualSalary;
	private double bonus;


	/**
		Constructor
	*/
	public ShiftSupervisor(String empName, String empNum, String hireDate,
		double annualSalary, double bonus)
	{
		super(empName, empNum, hireDate);

		this.annualSalary = annualSalary;
		this.bonus = bonus;
	}

	// Getters:
	public double getAnnualSalary()
	{
		return annualSalary;
	}

	public double getBonus()
	{
		return bonus;
	}

	// Setters:
	public void setAnnualSalaray(double annualSalary)
	{
		this.annualSalary = annualSalary;
	}

	public void setBonus(double bonus)
	{
		this.bonus = bonus;

		// Add the bonus to the annualSalary field.
		annualSalary += bonus;
	}

}









