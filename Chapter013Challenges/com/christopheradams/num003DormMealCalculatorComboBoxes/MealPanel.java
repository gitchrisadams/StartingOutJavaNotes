package com.christopheradams.num003DormMealCalculatorComboBoxes;

import javax.swing.*;
import java.awt.*;

/**
 * The MealPanel Class is responsible for the Meal Panel.
 * @author Christopher
 *
 */
public class MealPanel extends JPanel
{
	// Create a reference to components:
	private JComboBox mealsComboBox;
	
	// Create an array to store in the meals ComboBox:
	private String[] mealsArray = {"7 meals/week $560/semester", "14 meals/week $1095/semester",
			"Unlimited meals $1500/semester"};
	
	/**
	 * Constructor
	 */
	public MealPanel()
	{
		// Set the layout:
		setLayout(new GridLayout(4,1));
		
		// Create the combo box object:
		mealsComboBox = new JComboBox(mealsArray);
		
		// Add a border around the panel:
		setBorder(BorderFactory.createTitledBorder("Meals"));
		
		// Add the combo box to the panel:
		add(mealsComboBox);	
	}
	
	// Getter:
	public double getMealCost()
	{
		// Variables:
		double mealCost = 0.0;		// The cost of meals per semester.
		int selectedItem;			// The index of the item selected in the combo box.
		
		// Store the index of the selected meal in an int variable:
		selectedItem = mealsComboBox.getSelectedIndex();
		
		// Determine dorm cost based on the index of item selected:
		switch(selectedItem)
		{
			case 0:
				mealCost = 560;
				break;
			case 1:
				mealCost = 1095;
				break;
			case 2:
				mealCost = 1500;
				break;
		}

		// Return the meal cost to the calling function:
		return mealCost;
	}
}
