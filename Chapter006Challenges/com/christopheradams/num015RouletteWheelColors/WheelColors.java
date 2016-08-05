package com.christopheradams.num015RouletteWheelColors;

public class WheelColors
{
	// Fields:
	private int pocketNumber;
	private String pocketColor;

	/**
		Constructor
	*/
	public WheelColors(int pocketNum)
	{
		pocketNumber = pocketNum;
	}

	// Methods:
	public String getPocketColor()
	{
		if(pocketNumber == 0)
			pocketColor = "Green";
		else if(pocketNumber <= 10)
			if(pocketNumber % 2 == 0)
				pocketColor = "Black";
			else
				pocketColor = "Red";
		else if(pocketNumber <= 18)
			if(pocketNumber % 2 == 0)
				pocketColor = "Red";
			else
				pocketColor = "Black";
		else if(pocketNumber <= 28)
			if(pocketNumber % 2 == 0)
				pocketColor = "Black";
			else
				pocketColor = "Red";
		else if(pocketNumber <= 36)
			if(pocketNumber %2 == 0)
				pocketColor = "Red";
			else
				pocketColor = "Black";
		return pocketColor;
	}
}