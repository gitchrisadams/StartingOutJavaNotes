package com.christopheradams.num005CourseGrades;

public class Essay extends GradedActivity
{
	// Fields:
	private double grammarPoints;
	private double spellingPoints;
	private double correctLengthPoints;
	private double contentPoints;
	private double totalScore;

	/**
		Constructor
	*/
	public Essay(double grammarPoints, double spellingPoints,
		double correctLengthPoints, double contentPoints)
	{
		this.grammarPoints = grammarPoints;
		this.spellingPoints = spellingPoints;
		this.correctLengthPoints = correctLengthPoints;
		this.contentPoints = contentPoints;

		totalScore += grammarPoints + spellingPoints + correctLengthPoints + contentPoints;


	}

	// Getters:
	public double getTotalScore()
	{
		return totalScore;
	}
}