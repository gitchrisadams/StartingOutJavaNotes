package com.christopheradams.num003DormMealCalculatorComboBoxes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DormMealCalc extends JFrame
{
	// Create references to Panels from our Panels classes:
	private DormPanel dormPanel;
	private MealPanel mealPanel;
	private TotalsPanel totalsPanel;
	
	// Create a button panel:
	private JPanel buttonPanel;

	// Create a submit button reference:
	private JButton submitButton;
	
	// Create an exit button reference:
	private JButton exitButton;
	
	/**
	 * Constructor
	 */
	public DormMealCalc()
	{
		// Set the title:
		setTitle("Dorm/Meal Calculator");
		
		// Specify the action for the close button:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the Layout:
		setLayout(new BorderLayout());
		
		// Create the custom panels:
		dormPanel = new DormPanel();
		mealPanel = new MealPanel();
		totalsPanel = new TotalsPanel();
		
		// Create the button panel:
		buildButtonPanel();
		
		// Add the components to the content pane:
		add(dormPanel, BorderLayout.WEST);
		add(mealPanel, BorderLayout.CENTER);
		add(totalsPanel, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);
		
		// Pack and display the window:
		pack();
		setVisible(true);
	}

	/**
	 * The buildButtonPanel() method builds the button panel.
	 */
	private void buildButtonPanel()
	{
		// Create a panel for the buttons:
		buttonPanel = new JPanel();
		
		// Create the buttons:
		submitButton = new JButton("Submit");
		exitButton = new JButton("Exit");
		
		// Register action listeners for the button action:
		submitButton.addActionListener(new SubmitButtonListener());
		exitButton.addActionListener(new ExitButtonListener());
		
		// Add the buttons to the button panel:
		buttonPanel.add(submitButton);
		buttonPanel.add(exitButton);
	}
	
	/**
	 * Private inner class for the submit button action.
	 * @author Christopher
	 *
	 */
	private class SubmitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Variables:
			double dormTotal;			// Total cost of the dorm.
			double mealsTotal;			// Total cost of meals.
			
			// Call the getter from the DormPanel Class to get the dorm cost:
			// store it in a double.
			dormTotal = dormPanel.getDormCost();
			
			// Call the getter from the MealPanel Class to get the meal cost:
			// store it in a double.
			mealsTotal = mealPanel.getMealCost();
			
			// Call the setter to set the totals of the dorm and meals.
			// This will set the prices of the dorm and meals in the totals panel
			// text field so it displays.
			totalsPanel.setTotalsPanel(dormTotal, mealsTotal);
			
		}
	}
	
	/**
	 * Private inner class for the exit button action.
	 * @author Christopher
	 *
	 */
	private class ExitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

	/**
	 * The main() method for creating a DormMealCalc window.
	 * @param args
	 */
	public static void main(String[] args)
	{
		new DormMealCalc();

	}

}
