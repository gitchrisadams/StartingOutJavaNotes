package com.christopheradams.num003DormMealCalculatorComboBoxes;

import javax.swing.*;
import java.awt.*;

/**
 * The TotalPanel Class displays the totals.
 * @author Christopher
 *
 */
public class TotalsPanel extends JPanel
{
	// Create label references:
	private JLabel dormTotalLabel;
	private JLabel mealTotalLabel;
	private JLabel grandTotalLabel;
	
	// Create Text field references:
	private JTextField dormTotalTextField;
	private JTextField mealTotalTextField;
	private JTextField grandTotalTextField;
	
	/**
	 * Constructor
	 */
	public TotalsPanel()
	{
		// Set the layout:
		setLayout(new GridLayout(4,1));
		
		// Add a border around the panel:
		setBorder(BorderFactory.createTitledBorder("Totals"));
		
		// Create the component objects:
		dormTotalLabel = new JLabel("Dorm Total:");
		dormTotalTextField = new JTextField(10);
		mealTotalLabel = new JLabel("Meals total:");
		mealTotalTextField = new JTextField(10);
		grandTotalLabel = new JLabel("Grand total:");
		grandTotalTextField = new JTextField(10);
		
		// Make it so the Totals text field are not editable:
		dormTotalTextField.setEditable(false);
		mealTotalTextField.setEditable(false);
		grandTotalTextField.setEditable(false);
		
		// Add components to the panel:
		add(dormTotalLabel);
		add(dormTotalTextField);
		add(mealTotalLabel);
		add(mealTotalTextField);
		add(grandTotalLabel);
		add(grandTotalTextField);
	}
	
	// Setter:
	/**
	 * The setTotalsPanel sets the the dorm and meal totals and displays them.
	 * It also displays the grand total. 
	 * @param dormTotal
	 * @param mealsTotal
	 */
	public void setTotalsPanel(double dormTotal, double mealsTotal)
	{
		// Set the dorm total and meals total to display in the
		// appropriate text fields. Add the total and display it.
		// Format the output properly. 
		dormTotalTextField.setText(String.format("$%,.2f", dormTotal));
		mealTotalTextField.setText(String.format("$%,.2f", mealsTotal));
		grandTotalTextField.setText(String.format("$%,.2f", (dormTotal + mealsTotal)));
	}
}
