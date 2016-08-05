package com.christopheradams.num002PayRollClass;

public class PayRoll
{
	// Fields:
	private int[] employeeId;			// The employee id.
	private int[] hours;				// The hours of the employee.
	private double[] payRate;			// The pay rate for the employee.
	private double[] wages;				// The wages of the employee.

	// Methods:
	/**
		Constructor
	*/
	public PayRoll(int[] empId, int numEmployees, int[] theHours, double [] thePayRate, double[] theWages)
	{
		// Create the new arrays:
		employeeId = new int[numEmployees];
		hours = new int[numEmployees];
		payRate = new double[numEmployees];
		wages = new double[numEmployees];


		// Set initial values for the employee id's.
		for(int i = 0; i < empId.length; i++)
		{
			employeeId[i] = 100000 + i;
		}
	}

	// Setter for setting the employee hours:
	public void setHours(int employeeIdToSet, int theHours)
	{
		// Use modulus to get remainder so it only uses the
		// last few digits of employee id so we can use it
		// with the array index.
		employeeIdToSet %= 100000;

		hours[employeeIdToSet] = theHours;
	}

	// Setter for setting the pay rate:
	public void setPayRate(int employeeIdToSet, double thePayRate)
	{
		employeeIdToSet %= 100000;

		payRate[employeeIdToSet] = thePayRate;
	}

	// Method to calculate the wages.
	public double calcWages(int employeeIdToSet)
	{
		employeeIdToSet %= 100000;

		wages[employeeIdToSet] = hours[employeeIdToSet] * payRate[employeeIdToSet];

		return wages[employeeIdToSet];
	}


	// Getter for the employee ID:
	public int[] getEmployeeId()
	{
		return employeeId;
	}

	// Getter for the employee hours:
	public int[] getHours()
	{
		return hours;
	}

	// Getter for wages:
	public double[] getWages()
	{
		return wages;
	}

	// Getter for rates:
	public double[] getRates()
	{
		return payRate;
	}

}