package com.christopheradams.num005MonthClass;

public class Month
{
	// Fields:
	private int monthNumber;

	/**
		Constructor
	*/
	// No arg Constructor.
	public Month()
	{
		monthNumber = 1;
	}

	/**
		Constructor
	*/
	public Month(int monthNumber)
	{
		setMonthNumber(monthNumber);
	}

	/**
		Constructor
	*/
	public Month(String monthName)
	{
		switch(monthName)
		{
			case "January": case "january": case "jan": case "JANUARY":
				monthNumber = 1;
				break;
			case "February": case "february": case "feb": case "FEBRUARY":
				monthNumber = 2;
				break;
			case "March": case "march": case "mar": case "MARCH":
				monthNumber = 3;
				break;
			case "April": case "april": case "apr": case "APRIL":
				monthNumber = 4;
				break;
			case "May": case "may": case "MAY":
				monthNumber = 5;
				break;
			case "June": case "june": case "jun": case "JUNE":
				monthNumber = 6;
				break;
			case "July": case "july": case "jul": case "JULY":
				monthNumber = 7;
				break;
			case "Auguest": case "august": case "aug": case "AUGUST":
				monthNumber = 8;
				break;
			case "September": case "september": case "sept": case "SEPTEMBER":
				monthNumber = 9;
				break;
			case "October": case "october": case "oct": case "OCTOBER":
				monthNumber = 10;
				break;
			case "November": case "november": case "nov": case "NOVEMBER":
				monthNumber = 11;
				break;
			case "December": case "december": case "dec": case "DECEMBER":
				monthNumber = 12;
				break;
		}
	}

	// Setters:
	public void setMonthNumber(int monthNumber)
	{
		if(monthNumber < 1 || monthNumber > 12)
			this.monthNumber = 1;
		else
			this.monthNumber = monthNumber;
	}

	// Getters:
	public int getMonthNumber()
	{
		return monthNumber;
	}

	public String getMonthName()
	{
		String monthName = "No month name given";

		switch(monthNumber)
		{
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
				break;
		}
		return monthName;
	}

	public String toString()
	{
		String formattedString = String.format("%-15s%d%n%-15s%-15s",
			"Month number: ", monthNumber, "Month name: " , getMonthName());

		return formattedString;
	}

	public boolean equals(Month monthToCompare)
	{
		boolean isEqual;

		if(monthToCompare.getMonthNumber() == monthNumber)
			isEqual = true;
		else
			isEqual = false;

		return isEqual;

	}

	public boolean greaterThan(Month monthToCompare)
	{
		boolean isGreater;

		if(monthNumber > monthToCompare.getMonthNumber())
			isGreater = true;
		else
			isGreater = false;

		return isGreater;
	}

	public boolean lessThan(Month monthToCompare)
	{
		boolean isLessThan;

		if(monthNumber < monthToCompare.getMonthNumber())
			isLessThan = true;
		else
			isLessThan = false;

		return isLessThan;
	}

}