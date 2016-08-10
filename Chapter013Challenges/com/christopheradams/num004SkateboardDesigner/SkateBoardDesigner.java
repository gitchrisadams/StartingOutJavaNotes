package com.christopheradams.num004SkateboardDesigner;
// TODO: Need to add functionality to the combo boxes to
// add the subtotal, sales tax, and total when submit is clicked.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SkateBoardDesigner extends JFrame
{
	// Create references:
	private JPanel optionsPanel;			// The choose options panel.
	private JPanel totalsPanel;				// Panel to display totals inside.
	private JPanel buttonPanel;				// For the submit button.
	private JComboBox decksComboBox;		// ComboBox for the deck components.
	private JComboBox trucksComboBox;		// ComboBox for the truck components.
	private JComboBox wheelsComboBox;		// ComboBox for the wheels.
	private JComboBox miscComboBox;			// ComboBox for miscellaneous items.
	private JButton submitButton;			// Submit button for getting the totals.
	
	// Create arrays for items to store in combo boxes:
	private String[] decksArray = 
		{"The Master Thrasher $60", "The Dicktator $45", "The Street King $50"};
	
	private String[] trucksArray = 
		{"7.75 inch axel $35", "8 inch axel $40", "8.5 inch axel $45"};
	
	private String[] wheelsArray = 
		{"51mm $20", "55mm $22", "58mm $24", "61mm $28"};
	
	
	
	/**
	 * Constructor
	 */
	public SkateBoardDesigner()
	{
		// Set the window title:
		setTitle("Skateboard Designer");
		
		// Specify action for close button:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a BorderLayout manager:
		setLayout(new GridLayout(0, 1));
		
		// Call methods that build the panels:
		buildOptionsPanel();
		buildButtonPanel();
		buildTotalsPanel();
		
		// Add panels to the content pane:
		add(optionsPanel);
		add(buttonPanel);
		add(totalsPanel);
		
		// Pack and display the window:
		pack();
		setVisible(true);
	}
	
	public void buildOptionsPanel()
	{
		// Create a panel to hold the choose options combo boxes:
		optionsPanel = new JPanel();
		
		// Add a titled border around the panel:
		optionsPanel.setBorder(BorderFactory.createTitledBorder("Choose options:"));
		
		// Create a comboBox components:
		decksComboBox = new JComboBox(decksArray);
		trucksComboBox = new JComboBox(trucksArray);
		wheelsComboBox = new JComboBox(wheelsArray);
		
		// Add the combo boxes to the options panel:
		optionsPanel.add(decksComboBox);
		optionsPanel.add(trucksComboBox);
		optionsPanel.add(wheelsComboBox);

	}
	
	public void buildButtonPanel()
	{
		buttonPanel = new JPanel();
		
		submitButton = new JButton("Submit");
		
		buttonPanel.add(submitButton);
	}
	
	public void buildTotalsPanel()
	{
		// Create the panel to display the totals:
		totalsPanel = new JPanel();
		
		totalsPanel.setBorder(BorderFactory.createTitledBorder("Totals:"));
	}
	

	public static void main(String[] args)
	{
		new SkateBoardDesigner();

	}

}
