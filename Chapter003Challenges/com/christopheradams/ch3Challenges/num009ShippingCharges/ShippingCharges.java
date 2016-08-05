package com.christopheradams.ch3Challenges.num009ShippingCharges;

public class ShippingCharges
{
	// Fields:
	// Constants:
	private final double TWO_POUND_RATE = 1.10;
	private final double OVER_TWO_RATE = 2.20;
	private final double OVER_SIX_RATE = 3.70;
	private final double OVER_TEN_RATE = 3.80;

	// Variables:
	double packageWeight;

	/**
		Constructor
	*/
	public ShippingCharges(double weight)
	{
		packageWeight = weight;
	}

	// Getters:
	public double getTwoPoundRate()
	{
		return TWO_POUND_RATE;
	}

	public double getOverTwoRate()
	{
		return OVER_TWO_RATE;
	}

	public double getOverSixRate()
	{
		return OVER_SIX_RATE;
	}

	public double getOverTenRate()
	{
		return OVER_TEN_RATE;
	}

	// Setters:
	public void setPackageWeight(double weight)
	{
		packageWeight = weight;
	}

	// Methods:
	public double calcShippingCharges()
	{
		double shippingCharges = 0.00;

		if(packageWeight <= 2)
			shippingCharges = TWO_POUND_RATE;
		else if(packageWeight > 2 && packageWeight <= 6)
			shippingCharges = OVER_TWO_RATE;
		else if(packageWeight > 6 && packageWeight <= 10)
			shippingCharges = OVER_SIX_RATE;
		else if(packageWeight > 10)
			shippingCharges = OVER_TEN_RATE;

		return shippingCharges;
	}
}