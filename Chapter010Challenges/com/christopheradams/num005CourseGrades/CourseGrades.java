package com.christopheradams.num005CourseGrades;

public class CourseGrades extends GradedActivity
{
	/******* Fields: *******/
	/******* Constants: ******/
	private final int NUM_ASSIGNMENTS = 4;

	// Create an array of type GradedActivity:
	private GradedActivity[] grades = new GradedActivity[NUM_ASSIGNMENTS];

	/***** Methods: *****/
	/**
		The setLab() method sets the lab score passed in, into an array
		in a field.
		@param labScore The lab score.
	*/
	public void setLab(GradedActivity labScore)
	{
		// Set the labScore passed in to the first element in the
		// array of GradedActivity grades in our fields.
		grades[0] = labScore;
	}

	public void setPassFailExam(PassFailExam passFailScore)
	{
		grades[1] = passFailScore;
	}

	public void setEssay(Essay essayScore)
	{
		grades[2] = essayScore;
	}

	public void setFinalExam(FinalExam finalExamScore)
	{
		grades[3] = finalExamScore;
	}

	public String toString()
	{
		String formattedString = "";
		System.out.println("Listed in order lab score, pass/fail exam, essay and final exam:");
		for(int i = 0; i < grades.length; i++)
		{
			formattedString += String.format("Score " + (i+1) + ": " + grades[i].getScore());
			formattedString += String.format(" that's a " + grades[i].getGrade() + ".\n");
		}

		return formattedString;
	}


}