package com.christopheradams.num007Aggregation;

public class Score
{
	// Fields:
	double score = 100.0;

	/**
		Copy Constructor
	*/
	public Score(Score scoreToCopy)
	{
		score = scoreToCopy.score;
	}

	/**
		Constructor
	*/
	public Score()
	{

	}

	/**
		The toString method formats the String output.
	*/
	public String toString()
	{
		String myString = "The Score: " + score;

		return myString;
	}
}