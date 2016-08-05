package com.christopheradams.num009DaysInAMonth;

public class MonthDays
{
	// Fields:
	int months;
	int years;
	boolean isLeapYear;
	int daysInMonth;

	/**
		Constructor
	*/
	public MonthDays(int month, int year)
	{
		months = month;
		years = year;
	}

	// Methods:
	public int getNumberOfDays()
	{
		// Calculate leap year for February.
		if(months == 2)
		{
			if(years % 100 == 0 && years % 400 == 0 || years % 4 == 0)
			{
				isLeapYear = true;
			}
		}

		switch(months)
		{
			case 1:
				daysInMonth = 31;
				break;
			case 2:
				if(isLeapYear)
				{
					daysInMonth = 29;
					break;
				}
				else
				{
					daysInMonth = 28;
					break;
				}
			case 3:
				daysInMonth = 31;
				break;
			case 4:
				daysInMonth = 30;
				break;
			case 5:
				daysInMonth = 31;
				break;
			case 6:
				daysInMonth = 30;
				break;
			case 7:
				daysInMonth = 31;
				break;
			case 8:
				daysInMonth = 31;
				break;
			case 9:
				daysInMonth = 30;
				break;
			case 10:
				daysInMonth = 31;
				break;
			case 11:
				daysInMonth = 30;
				break;
			case 12:
				daysInMonth = 31;
				break;
		}

		return daysInMonth;

	}
}