package com.christopheradams.num003TeamLeader;

public class TeamLeader extends ProductionWorker
{
	// Fields:
	double monthlyBonus;
	int trainingHours;
	int reqTrainingHours;

	/**
		Constructor
	*/
	public TeamLeader(String empName, String empNum, String hireDate,
		Shift theShift, double hourlyRate, int trainingHours, int reqTrainingHours)
	{
		// Pass in to the super constructor a.k.a the ProductionWorker class.
		super(empName, empNum, hireDate, theShift, hourlyRate);
	}

	// Getters:
	public int getTrainingHours()
	{
		return trainingHours;
	}

	public int getReqTrainingHours()
	{
		return reqTrainingHours;
	}
}