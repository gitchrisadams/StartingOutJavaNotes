package com.christopheradams.num001EmployeeAndProductionWorker;

public class EmployeeClient
{
	public static void main(String[]args)
	{
		// Variables:
		String empName = "Christopher Adams";
		String empNum = "1234-A";
		String hireDate = "7/29/16";
		Shift myShift = Shift.SHIFT1;			// Uses enum for Shift1 or Shift2.
		double hourlyRate = 40.00;

		String empName2 = "John Adams";
		String empNum2 = "1235-B";
		String hireDate2 = "7/30/16";
		Shift myShift2 = Shift.SHIFT2;			// Uses enum for Shift1 or Shift2.
		double hourlyRate2 = 20.00;


		// Create a new shift worker:
		ProductionWorker prodWorker1 =  new ProductionWorker(empName, empNum, hireDate, myShift, hourlyRate);

		// Output the production worker's info:
		System.out.println("Production Worker number 1:");
		System.out.println(prodWorker1.getEmpName() + "\n");
		System.out.println(prodWorker1.getEmpNum() + "\n");
		System.out.println(prodWorker1.getHireDate() + "\n");
		System.out.println("Shift number: " + prodWorker1.getShift() + "\n");
		System.out.printf("$%.2f / hour%n", prodWorker1.getHourlyRate());

		// Create an Employee not a shift worker:
		Employee employee1 = new Employee(empName, empNum, hireDate);

		// Output info on employee 2:
		System.out.println("\nEmployee 2:");
		System.out.println(employee1.getEmpName());
		System.out.println();

		// Create a new production worker but off of the Employee class:
		Employee employeeProdDemo1 = new ProductionWorker(empName2, empNum2, hireDate2, myShift2, hourlyRate2);

		// Output the employee:
		System.out.println(employeeProdDemo1.getEmpName());


	}
}