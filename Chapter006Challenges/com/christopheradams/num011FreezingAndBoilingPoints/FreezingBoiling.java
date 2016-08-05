package com.christopheradams.num011FreezingAndBoilingPoints;

public class FreezingBoiling
{
	// Fields:
	private int temperature;

	/**
		Constructor
	*/
	public FreezingBoiling(int temp)
	{
		temperature = temp;
	}

	// Getters:
	public int getTemp()
	{
		return temperature;
	}

	// Setters:
	public void setTemp(int temp)
	{
		temperature = temp;
	}

	// Methods:
	public boolean isEthylFreezing()
	{
		if(temperature <= -173)
			return true;
		else
			return false;
	}

	public boolean isEthylBoiling()
	{
		if(temperature >= 172)
			return true;
		else
			return false;
	}

	public boolean isOxygenFreezing()
	{
		if(temperature <= -362)
			return true;
		else
			return false;
	}

	public boolean isOxygenBoiling()
	{
		if(temperature >= -306)
			return true;
		else
			return false;
	}

	public boolean isWaterFreezing()
	{
		if(temperature <= 32)
			return true;
		else
			return false;
	}

	public boolean isWaterBoiling()
	{
		if(temperature >= 212)
			return true;
		else
			return false;
	}
}