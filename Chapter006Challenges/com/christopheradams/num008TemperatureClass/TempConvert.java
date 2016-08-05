package com.christopheradams.num008TemperatureClass;

public class TempConvert
{
	// Fields:
	double ftemps;			// Temp in Fahrenheit

	/**
		Constructor
	*/
	public TempConvert(double ftemp)
	{
		ftemps = ftemp;
	}

	// Setters:
	public void setFTemp(double ftemp)
	{
		ftemps = ftemp;
	}

	// Getters:
	public double getFTemp()
	{
		return ftemps;
	}

	public double getCelsTemp()
	{
		double celsTemp = ((5/9.0) * (ftemps - 32));

		return celsTemp;
	}

	public double getKelvinTemp()
	{
		double kelvinTemp = ((5/9.0) * (ftemps - 32)) + 273;

		return kelvinTemp;
	}

}