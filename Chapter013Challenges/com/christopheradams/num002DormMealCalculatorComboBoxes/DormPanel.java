package com.christopheradams.num002DormMealCalculatorComboBoxes;

import javax.swing.*;
import java.awt.*;

/**
 * The DormPanel Class is responiselbe for the Dorm Panel. 
 * @author Christopher
 *
 */
public class DormPanel extends JPanel
{
	// Create references to components:
	private JComboBox dormsComboBox;
	
	// Create an array to store in the dorms ComboBox:
	private String[] dormsArray = {"Allen Hall $1500/Semester", "Pike Hall $1600/Semester", 
			"Farthing Hall $1200/Semester", "University Suites $1800/Semester"};
	
	/**
	 * Constructor
	 */
	public DormPanel()
	{
		// Set the layout:
		setLayout(new GridLayout(4,1));
		
		// Create the combo box object:
		dormsComboBox = new JComboBox(dormsArray);
		
		// Add a border around the panel:
		setBorder(BorderFactory.createTitledBorder("Dorms"));
		
		// Add the combo box to the panel:
		add(dormsComboBox);
	}
	
	// Getter:
	/**
	 * The getDormCost() method allows access to the dorm cost.
	 * @return The cost of the dorm.
	 */
	public double getDormCost()
	{
		// Variables:
		double dormCost = 0.0;		// The cost of the dorm per semester.
		int selectedItem;			// The index of the item selected in the combo box.
		
		selectedItem = dormsComboBox.getSelectedIndex();
		
		// Determine dorm cost based on the index of item selected:
		switch(selectedItem)
		{
			case 0:
				dormCost = 1500;
				break;
			case 1:
				dormCost = 1600;
				break;
			case 2:
				dormCost = 1200;
				break;
			case 3:
				dormCost = 1800;
				break;
		}

		// Return the dorm cost to the calling function:
		return dormCost;
	}
}
