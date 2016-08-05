package com.christopheradams.num002PayRollClass;

public class PayRollClient
{
	public static void main(String[]args)
	{
		// Constants:
		final int NUM_EMPLOYEES = 7;				// The number of employees.

		// Create an array of employee id's:
		int[] emptyEmployeeId = new int[NUM_EMPLOYEES];

		// Create an array of employee hours:
		int[] emptyEmployeeHours = new int[NUM_EMPLOYEES];

		// Create an array for employee pay rates.
		double[] emptyEmployeeRates = new double[NUM_EMPLOYEES];

		// Create an array for employee wages.
		double[] emptyWages = new double[NUM_EMPLOYEES];

		// Create a new PayRoll object:
		PayRoll payRoll2016 = new PayRoll(emptyEmployeeId, NUM_EMPLOYEES, emptyEmployeeHours,
										  emptyEmployeeRates, emptyWages);

		// Create references to the arrays in the PayRoll class:
		int[] filledEmployeeIds = payRoll2016.getEmployeeId();

		int[] filledEmployeeHours = payRoll2016.getHours();

		double[] filledEmployeeRates = payRoll2016.getRates();

		double[] filledEmployeeWages = payRoll2016.getWages();

		// Call setters to set hours and payrate for employee 100001:
		payRoll2016.setHours(100001, 40);
		payRoll2016.setPayRate(100001, 10);

		// Call method to calculate the wages for employee 100001.
		payRoll2016.calcWages(100001);

		// Output employee 100001 to the screen.
		System.out.println(filledEmployeeIds[1]);

		System.out.println(filledEmployeeHours[1]);

		System.out.println(filledEmployeeWages[1]);

		System.out.println(filledEmployeeRates[1]);

		System.out.println(filledEmployeeWages[1]);

	}
}

/************************* Output *******************************
100001
40
400.0
10.0
400.0
Press any key to continue . . .
******************************************************************/