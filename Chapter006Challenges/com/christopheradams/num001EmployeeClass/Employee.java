package com.christopheradams.num001EmployeeClass;


public class Employee
{
	// Fields:
	private String name;
	private int idNumber;
	private String department;
	private String position;

	// A public constant field:
	public static final boolean FIRED = true;

	/**
		Constructor
		@param empName The employee name.
		@param empIdNum The employee Id number.
		@param empDept The employee department.
		@param empPosition The position of the employee.
	*/
	public Employee(String empName, int empIdNum, String empDept, String empPosition)
	{
		// Assign value passed in to appropriate fields.
		name = empName;
		idNumber = empIdNum;
		department = empDept;
		position = empPosition;
	}

	/**
		Constructor
		@param empName The name of the employee.
		@param empIdNum The employee Id number.
	*/
	public Employee(String empName, int empIdNum)
	{
		// Assign value passed in to appropriate fields.
		name = empName;
		idNumber = empIdNum;

		// Set the department and position fields as empty Strings.
		department = "";
		position = "";

	}

	/**
		Constructor
		@param empName The employee name.
		@param empIdNum The employee Id number.
		@param empDept The employee department.
		@param empPosition The position of the employee.
	*/
	public Employee(String empName, int empIdNum, String empDept, String empPosition, boolean isFired)
	{
		// Assign value passed in to appropriate fields.
		name = empName;
		idNumber = empIdNum;
		department = empDept;
		position = empPosition;
	}

	/**
		Constructor
	*/
	// The no-arg constructor.
	public Employee()
	{
		name = "";
		department = "";
		position = "";
		idNumber = 0;
	}

	// Methods:
	/**
		The setName() method sets the name of the employee.
		@param empName The name of the employee.
	*/
	public void setName(String empName)
	{
		// Set field to value passed in.
		name = empName;
	}

	/**
		The setDepartment() method sets the name of the department.
		@param empDept The name of the department of the employee.
	*/
	public void setDepartment(String empDept)
	{
		department = empDept;
	}

	/**
		The setPosition() method sets the position of the employee.
		@param empPosition The position of the employee.
	*/
	public void setPosition(String empPosition)
	{
		position = empPosition;
	}

	/**
		The getName() method gets the name of the employee.
		@return The name of the employee.
	*/
	public String getName()
	{
		// Return the name of the employee.
		return name;
	}

	/**
		The getDepartment() method gets the department of the employee.
		@return The department of the employee.
	*/
	public String getDepartment()
	{
		return department;
	}

	/**
		The getPosition() method gets the position of the employee.
		@return the position of the employee.
	*/
	public String getPosition()
	{
		return position;
	}

	/**
		The getEmployeeId() method gets the id of the employee.
		@return The id of the employee.
	*/
	public int getEmployeeId()
	{
		return idNumber;

	}



}