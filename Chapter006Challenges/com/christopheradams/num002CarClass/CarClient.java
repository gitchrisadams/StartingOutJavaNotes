package com.christopheradams.num002CarClass;

public class CarClient
{
	public static void main(String[]args)
	{
		// Create a new Car object:
		Car myCar = new Car(2009, "Subaru");

		// Call the accelerate method 5 times:
		for(int i = 0; i < 5; i++)
		{
			myCar.accelerate();
			System.out.println("----------------->>>>>>>>>>>> Hitting the gas!");
			System.out.println("The car's speed is now " + myCar.getSpeed() + " mph.\n");
		}
		System.out.println();

		// Call the break method 5 times:
		for(int i = 0; i < 5; i++)
		{
			myCar.brake();
			System.out.println("))))))))))))))))))))) Braking )))))))))))))))");
			System.out.println("The car's speed is now " + myCar.getSpeed() + " mph.\n");
		}
	}

}