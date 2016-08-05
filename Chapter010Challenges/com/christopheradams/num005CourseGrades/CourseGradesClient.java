package com.christopheradams.num005CourseGrades;

public class CourseGradesClient
{
	public static void main(String[]args)
	{
		/***** Variables: *****/
		// For Essay:
		double grammarPoints = 10;
		double spellingPoints = 20;
		double correctLengthPoints = 20;
		double contentPoints = 20;

		// For pass fail score:
		int questions = 10;
		int missed = 2;
		double minPassScore = 70;

		// For final exam:
		int finalQuestions = 50;
		int finalMissed = 5;

		// Create a new object to record scores for various tests:
		CourseGrades courseGrades1 = new CourseGrades();

		/***** Create a new objects for individual scores for various tests: *****/
		GradedActivity labScore1 = new GradedActivity();

		PassFailExam passFailScore1 = new PassFailExam(questions, missed, minPassScore);

		Essay essayScore1 = new Essay(grammarPoints, spellingPoints,
			correctLengthPoints, contentPoints);

		FinalExam finalExam1 = new FinalExam(finalQuestions, finalMissed);



		// Set scores to arbitrary values for testing the program:
		labScore1.setScore(60);

		// Pass our essay to GradedActivity so it sets the score:
		essayScore1.setScore(essayScore1.getTotalScore());


		/***** Pass the score to method in CourseGrades class
			   that will record the grade. *****/
		courseGrades1.setLab(labScore1);
		courseGrades1.setPassFailExam(passFailScore1);
		courseGrades1.setEssay(essayScore1);
		courseGrades1.setFinalExam(finalExam1);

		System.out.println(courseGrades1);






	}
}