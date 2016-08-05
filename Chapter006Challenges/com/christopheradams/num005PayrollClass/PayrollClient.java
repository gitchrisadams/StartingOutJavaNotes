package com.christopheradams.num005PayrollClass;

import java.util.*;

public class PayrollClient
{
	public static void main(String[]args)
	{
		// Variables:
		//double = grossPay;

		// Create a Scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Create a new Payroll object:
		Payroll employee1 = new Payroll("Christopher Adams", 1234567);

		// Get the rest of the data for Christopher Adams from the user:
		System.out.print("Please enter the hourly rate for " + employee1.getEmployeeName() + ": ");
		employee1.setHourlyRate(keyboard.nextDouble());

		System.out.print("Please enter the number of hours worked:");
		employee1.setNumHoursWorked(keyboard.nextDouble());


		System.out.println("\nHourly rate: " + employee1.getHourlyRate());

		// Output employee1's name and id number.
		System.out.println("Name: " + employee1.getEmployeeName());
		System.out.println("ID number: " + employee1.getIdNum());
		System.out.println();

		System.out.printf("The gross pay is: $%.2f%n", employee1.calcGrossPay());

	}
}