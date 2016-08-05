package com.christopheradams.ch2challenges.num008CookieCaloriesMODIFIED;

// For Scanner input and other utilities.
import java.util.ArrayList;
import java.util.Scanner;

public class CalorieCounter
{

	// Fields:
	// The daily calorie limit.
	private int caloriesPerDay;

	// The total calories from food items.
	private int totalCalories;

	// An ArrayList of food items.
	private ArrayList<String> foodItems = new ArrayList<String>(100);

	// An ArrayList of the calories for the food items.
	private ArrayList<Integer> foodItemCals = new ArrayList<Integer>(100);

	// Create a new Scanner object for keyboard input.
	Scanner keyboard = new Scanner(System.in);

	// Constructors:
	/**
		Constructor
	*/
	public CalorieCounter()
	{

	}

	// Methods:
	public int inputDailyCalories()
	{
		System.out.print("Please enter your daily calorie limit for today: ");
		caloriesPerDay = keyboard.nextInt();

		// Consume newline in output buffer:
		keyboard.nextLine();
		return caloriesPerDay;
	}

	public void inputFoodItemsAndCals()
	{
		int itemsCounter = 0;			// Keeping track of the number of items in ArrayLists.
		String foodItemInput = "";
		int foodItemCalsInput = 0;

		// Priming read:
		// Get food item as input.
		System.out.print("Enter the food item, enter Q when done: ");
		foodItemInput = keyboard.nextLine();

		// Don't ask for calories if user entered Q or q:
		if(!foodItemInput.equals("Q") && !foodItemInput.equals("q"))
		{
			System.out.print("Enter the calories: ");
			foodItemCalsInput = keyboard.nextInt();

			// Consume the newline in buffer:
			keyboard.nextLine();
		}

		System.out.println();

		// While not equal to the sentinel, keep looping.
		while(!foodItemInput.equals("Q") && !foodItemInput.equals("q"))
		{
			// Store the input in the ArrayList:
			foodItems.add(foodItemInput);
			foodItemCals.add(foodItemCalsInput);

			// Increment the itemsCounter:
			itemsCounter++;

			// Get food item as input.
			System.out.print("Enter the food item, enter Q when done: ");
			foodItemInput = keyboard.nextLine();

			// Don't ask for calories if user entered Q or q:
			if(!foodItemInput.equals("Q") && !foodItemInput.equals("q"))
			{
				System.out.print("Enter the calories: ");
				foodItemCalsInput = keyboard.nextInt();

				// Consume the newline in buffer:
				keyboard.nextLine();
			}

			System.out.println();
		}
	}

	// Method to loop through food items and calories and display them.
	public void loopItemsCals()
	{
		for(int i = 0; i < foodItems.size(); i++)
		{
			System.out.println("Food item " + (i+1) + ": " + foodItems.get(i));
			System.out.println("Calories: " + foodItemCals.get(i) + "\n");
		}
	}

	// Method to add up the total calories:
	public void totalCalories()
	{
		for(int i = 0; i < foodItems.size(); i++)
		{
			// Add the calories and store in field for total calories.
			totalCalories += foodItemCals.get(i);
		}
	}

	// Getters:
	public int getCalories()
	{
		return caloriesPerDay;
	}

	public ArrayList<String> getFoodItems()
	{
		return foodItems;
	}

	public ArrayList<Integer> getFoodItemCals()
	{
		return foodItemCals;
	}

	public int getTotalCalories()
	{
		return totalCalories;
	}


}