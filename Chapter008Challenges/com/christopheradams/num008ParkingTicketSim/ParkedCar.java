package com.christopheradams.num008ParkingTicketSim;

public class ParkedCar
{
	// Fields:
	private String carMake;
	private String carModel;
	private String carColor;
	private int licNum;
	private int numMinParked;

	/**
		Constructor
	*/
	public ParkedCar(String make, String model, String color, int license, int minParked)
	{
		carMake = make;
		carModel = model;
		carColor = color;
		licNum = license;
		numMinParked = minParked;
	}

	// Getters:
	public String getMake()
	{
		return carMake;
	}

	public String getModel()
	{
		return carModel;
	}

	public String getColor()
	{
		return carColor;
	}

	public int getLicNum()
	{
		return licNum;
	}

	public int getNumMinParked()
	{
		return numMinParked;
	}


}











