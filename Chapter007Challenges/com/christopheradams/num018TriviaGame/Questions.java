package com.christopheradams.num018TriviaGame;

public class Questions
{
	// Fields:
	private String triviaQuestions;
	private String answers0;
	private String answers1;
	private String answers2;
	private String answers3;
	private String correctAnswers;

	/**
		Constructor
	*/
	public Questions(String question, String ans0, String ans1, String ans2, String ans3, String corAns)
	{
		triviaQuestions = question;
		answers0 = ans0;
		answers1 = ans1;
		answers2 = ans2;
		answers3 = ans3;
		correctAnswers = corAns;
	}

	// Getters:
	public String getQuestions()
	{
		return triviaQuestions;
	}

	public String getAnswer0()
	{
		return answers0;
	}

	public String getAnswer1()
	{
		return answers1;
	}

	public String getAnswer2()
	{
		return answers2;
	}

	public String getAnswer3()
	{
		return answers3;
	}

	public String getCorrectAnswer()
	{
		return correctAnswers;
	}
}