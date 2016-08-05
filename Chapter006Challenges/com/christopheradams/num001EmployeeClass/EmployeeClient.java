package com.christopheradams.num001EmployeeClass;

public class EmployeeClient
{
	public static void main(String[]args)
	{
		// Create some employees:
		Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

		Employee employee4 = new Employee("Chris Adams", 12345, "IT", "Analyst", Employee.FIRED);

		System.out.println(Employee.FIRED);

		System.out.printf("%-15s%-15s%-15s%-15s%n", "Name", "ID Number", "Department", "Position");
		System.out.println("-------------------------------------------------------------");
		System.out.printf("%-15s%-15d%-15s%-15s%n", employee1.getName(), employee1.getEmployeeId(),
						  				employee1.getDepartment(), employee1.getPosition());

		System.out.printf("%n%-15s%-15d%-15s%-15s%n", employee2.getName(), employee2.getEmployeeId(),
						  				employee2.getDepartment(), employee2.getPosition());

		System.out.printf("%n%-15s%-15d%-15s%-15s%n", employee3.getName(), employee3.getEmployeeId(),
						  				employee3.getDepartment(), employee3.getPosition());
	}

}

