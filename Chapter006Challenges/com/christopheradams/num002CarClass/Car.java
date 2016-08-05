package com.christopheradams.num002CarClass;

public class Car
{
	// fields:
	private int yearModel;			// The year of the car.
	private String make;			// The make of the car.
	private int speed;				// The cars current speed.

	// Constants:
	final int INCREASE_5 = 5;		// For increasing the speed by 5 mph.
	final int DECREASE_5 = -5;		// For decreasing the speed by 5 mph.

	// Methods:
	/**
		Constructor
		@param year The year of the car.
		@param theMake The make of the car.
	*/
	public Car(int year, String theMake)
	{
		// Assign passed in values to our fields.
		yearModel = year;
		make = theMake;

		// Set value for speed field.
		speed = 0;
	}

	/**
		The getYearModel() method gets the year of the car.
		@return The year of the car.
	*/
	public int getYearModel()
	{
		return yearModel;
	}

	/**
		The getMake() method gets the make of the car.
		@return The make of the car.
	*/
	public String getMake()
	{
		return make;
	}

	/**
		The getSpeed() method gets the speed of the car.
		@return The speed of the car.
	*/
	public int getSpeed()
	{
		return speed;
	}

	/**
		The accelerate() method increases the speed of the car.
	*/
	public void accelerate()
	{
		// Increase speed each time method is called.
		speed += INCREASE_5;
	}

	/**
		The brake() method decreases the speed of the car.
	*/
	public void brake()
	{
		// Decrease speed each time method is called.
		speed += DECREASE_5;
	}


}