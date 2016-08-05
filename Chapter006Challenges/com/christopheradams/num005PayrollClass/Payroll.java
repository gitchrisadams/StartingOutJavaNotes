package com.christopheradams.num005PayrollClass;

public class Payroll
{
	// Fields:
	private String employeeName;
	private int idNum;
	private double hourlyRate;
	private double numHoursWorked;

	/**
		Constructor
	*/
	public Payroll(String theEmployeeName, int theIdNum)
	{
		// Set fields to values passed in to constructor.
		employeeName = theEmployeeName;
		idNum = theIdNum;
	}

	// Getters:
	public String getEmployeeName()
	{
		return employeeName;
	}

	public int getIdNum()
	{
		return idNum;
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public double numHoursWorked()
	{
		return numHoursWorked;
	}

	// Setters:
	public void setHourlyRate(double theHourlyRate)
	{
		hourlyRate = theHourlyRate;
	}

	public void setNumHoursWorked(double theNumHoursWorked)
	{
		numHoursWorked = theNumHoursWorked;
	}

	// Methods:
	public double calcGrossPay()
	{
		double grossPay;

		// Calculate the gross pay.
		grossPay = numHoursWorked * hourlyRate;

		return grossPay;
	}
}