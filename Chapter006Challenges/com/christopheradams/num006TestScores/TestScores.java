package com.christopheradams.num006TestScores;

public class TestScores
{
	// Fields:
	private int testScore1;
	private int testScore2;
	private int testScore3;

	/**
		Constructor
	*/
	public TestScores(int score1, int score2, int score3)
	{
		testScore1 = score1;
		testScore2 = score2;
		testScore3 = score3;
	}

	// Getters:
	public int getTestScore1()
	{
		return testScore1;
	}

	public int getTestScore2()
	{
		return testScore2;
	}

	public int getTestScore3()
	{
		return testScore3;
	}

	// Setters:
	public void setTestScore1(int score1)
	{
		testScore1 = score1;
	}

	public void setTestScore2(int score2)
	{
		testScore2 = score2;
	}

	public void setTestScore3(int score3)
	{
		testScore3 = score3;
	}

	// Methods:
	public int calcTotal(int score1, int score2, int score3)
	{
		int total = score1 + score2 + score3;

		return total;
	}

	public double calcAvg(int total, int numScores)
	{
		double average = (double)total / numScores;

		return average;
	}

}