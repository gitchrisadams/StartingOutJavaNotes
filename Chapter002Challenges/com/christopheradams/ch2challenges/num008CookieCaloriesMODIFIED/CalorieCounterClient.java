package com.christopheradams.ch2challenges.num008CookieCaloriesMODIFIED;

public class CalorieCounterClient
{
	public static void main(String[]args)
	{
		// Variables:


		// Create a new CalorieCounter object:
		CalorieCounter chrisCalories = new CalorieCounter();

		// Get the daily calorie limit from the user.
		chrisCalories.inputDailyCalories();

		// Display the daily calorie limit.
		System.out.println("Daily Calorie limit: " + chrisCalories.getCalories());
		System.out.println();

		// Get the food items and calories from the user.
		chrisCalories.inputFoodItemsAndCals();

		// Loop through items and calories and display them.
		chrisCalories.loopItemsCals();

		// Total the calories:
		chrisCalories.totalCalories();

		// Display the total calories.
		System.out.println("\nThe total calories: " + chrisCalories.getTotalCalories());



	}
}

/***************************** Output ************************
Please enter your daily calorie limit for today: 2000
Daily Calorie limit: 2000
Enter the food item, enter Q when done: Banana
Enter the calories: 90

Enter the food item, enter Q when done: Carrot
Enter the calories: 50

Enter the food item, enter Q when done: Donut
Enter the calories: 100

Enter the food item, enter Q when done: Q

Press any key to continue . . .

***************************************************************/