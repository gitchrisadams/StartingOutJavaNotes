package com.christopheradams.num001EmployeeAndProductionWorker;



public class ProductionWorker extends Employee
{

	// Fields:
	private double hourlyRate;
	private Shift myShift;

	/**
		Constructor
		@param empName The employee name.
		@param empNum The employee number.
		@param hireDate The employee hire date.
		@param theShift The SHIFT1 or SHIFT2.
		@param hourlyRate The hourly rate.
	*/
	public ProductionWorker(String empName, String empNum,
		String hireDate, Shift theShift, double hourlyRate)
	{
		// Must make call to the super class's constructor due to
		// this class extending employee.
		super(empName, empNum, hireDate);

		// Assign the sift and hourly rate to the fields:
		// The shift is an enum and can only be SHIFT1 or SHIFT2.
		myShift = theShift;
		this.hourlyRate = hourlyRate;
	}

	// Getters:
	public Shift getShift()
	{
		return myShift;
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	// Setters:
	public void setShift(Shift shift)
	{
		myShift = shift;
	}

	public void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}
}