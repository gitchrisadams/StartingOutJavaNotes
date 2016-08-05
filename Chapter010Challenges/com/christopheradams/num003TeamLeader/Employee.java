package com.christopheradams.num003TeamLeader;

public class Employee
{
	// Fields:
	private String empName;
	private String empNum;
	private String hireDate;

	/**
		Constructor
	*/
	public Employee(String empName, String empNum, String hireDate)
	{
		this.empName = empName;
		this.empNum = empNum;
		this.hireDate = hireDate;
	}

	// Getters:
	public String getEmpName()
	{
		return empName;
	}

	public String getEmpNum()
	{
		return empNum;
	}

	public String getHireDate()
	{
		return hireDate;
	}

	// Setters:
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public void setEmpNum(String empNum)
	{
		this.empNum = empNum;
	}
}