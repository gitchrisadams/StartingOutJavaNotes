package com.christopheradams.num003TeamLeader;

public class TeamLeaderClient
{
	public static void main(String[]args)
	{
		// Variables:
		String empName = "Tom Jenkins";
		String empNum = "65543";
		String hireDate = "7/29/16";
		Shift theShift = Shift.SHIFT1;
		double hourlyRate = 20.00;
		int trainingHours = 100;
		int reqTrainingHours = 150;

		// Create a new TeamLeader object:
		TeamLeader lead1 = new TeamLeader(empName, empNum, hireDate,
			theShift, hourlyRate, trainingHours, reqTrainingHours);

		// Output information on TeamLeader lead1:
		System.out.println("Team leader 1:");
		System.out.println("Employee name: " + lead1.getEmpName());
		System.out.println("Employee number: " + lead1.getEmpNum());
		System.out.println("Employee hire date: " + lead1.getHireDate());
		System.out.println("Shift: " + lead1.getShift());
		System.out.println("Hourly Rate: " + lead1.getHourlyRate());
		System.out.println("Training hours completed: " + lead1.getTrainingHours());
		System.out.println("Training hours required: " + lead1.getReqTrainingHours());


	}
}