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
	private JLabel decksLabel;
	private JLabel trucksLabel;
	private JLabel wheelsLabel;
	private JLabel miscLabel;
	private JComboBox decksComboBox;		// ComboBox for the deck components.
	private JComboBox trucksComboBox;		// ComboBox for the truck components.
	private JComboBox wheelsComboBox;		// ComboBox for the wheels.
	private JComboBox miscComboBox;			// ComboBox for miscellaneous items.
	private JButton submitButton;			// Submit button for getting the totals.
	private JLabel subTotalLabel;
	private JLabel salesTaxLabel;
	private JLabel totalLabel;
	private JTextField subTotalTextField;
	private JTextField salesTaxTextField;
	private JTextField totalTextField;
	
	// Create arrays for items to store in combo boxes:
	private String[] decksArray = 
		{"The Master Thrasher $60", "The Dicktator $45", "The Street King $50"};
	
	private String[] trucksArray = 
		{"7.75 inch axel $35", "8 inch axel $40", "8.5 inch axel $45"};
	
	private String[] wheelsArray = 
		{"51mm $20", "55mm $22", "58mm $24", "61mm $28"};
	
	private String[] miscArray = 
		{"Grip tape $10", "Bearings $30", "Riser pads $2", "Nuts & bolt kit $3"};	
	
	
	
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
		
		// Create the labels for the combo boxes:
		decksLabel = new JLabel("Decks:");
		trucksLabel = new JLabel("Trucks:");
		wheelsLabel = new JLabel("Wheels:");
		miscLabel = new JLabel("Miscellaneous:");
		
		
		// Create a comboBox components:
		decksComboBox = new JComboBox(decksArray);
		trucksComboBox = new JComboBox(trucksArray);
		wheelsComboBox = new JComboBox(wheelsArray);
		miscComboBox = new JComboBox(miscArray);
		
		// Add the combo boxes to the options panel:
		optionsPanel.add(decksLabel);
		optionsPanel.add(decksComboBox);
		optionsPanel.add(trucksLabel);
		optionsPanel.add(trucksComboBox);
		optionsPanel.add(wheelsLabel);
		optionsPanel.add(wheelsComboBox);
		optionsPanel.add(miscLabel);
		optionsPanel.add(miscComboBox);

	}
	
	public void buildButtonPanel()
	{
		buttonPanel = new JPanel();
		
		submitButton = new JButton("Submit");
		
		// Create a action listener to listen for clicking of submit button:
		submitButton.addActionListener(new ButtonListener());
		
		buttonPanel.add(submitButton);
	}
	
	public void buildTotalsPanel()
	{
		// Create the panel to display the totals:
		totalsPanel = new JPanel();
		
		// Add a titled border for the Totals panel:
		totalsPanel.setBorder(BorderFactory.createTitledBorder("Totals:"));
		
		// Create buttons and text field objects to display the results:
		subTotalLabel = new JLabel("Subtotal:");
		subTotalTextField = new JTextField(10);
		
		salesTaxLabel = new JLabel("Tax rate:");
		salesTaxTextField = new JTextField(10);
		
		totalLabel = new JLabel("Total:");
		totalTextField = new JTextField(10);
		
		// Set the text fields to be uneditable:
		subTotalTextField.setEditable(false);
		salesTaxTextField.setEditable(false);
		totalTextField.setEditable(false);
		
		// Add components to the totals panel:
		totalsPanel.add(subTotalLabel);
		totalsPanel.add(subTotalTextField);
		totalsPanel.add(salesTaxLabel);
		totalsPanel.add(salesTaxTextField);
		totalsPanel.add(totalLabel);
		totalsPanel.add(totalTextField);
		
		
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Constants:
			final double SALES_TAX = .06;
			
			// Doubles to hold the cost of the items and totals:
			double deckTotal = 0;
			double truckTotal = 0;
			double wheelTotal = 0;
			double miscTotal = 0;
			double subTotal = 0;
			double salesTax = 0;
			double total = 0;
			
			
			// Store the index of the combo box item 
			// that is selected for each combo box:
			int selectedDeck = decksComboBox.getSelectedIndex();
			int selectedTrucks = trucksComboBox.getSelectedIndex();
			int selectedWheels = wheelsComboBox.getSelectedIndex();
			int selectedMisc = wheelsComboBox.getSelectedIndex();
			
			// Switch statements to determine the cost of the deck:
			switch(selectedDeck)
			{
				case 0:
					deckTotal = 60;
					break;
				case 1:
					deckTotal = 45;
					break;
				case 2:
					deckTotal = 50;
					break;
			}
			
			// Switch statements to determine the cost of the trucks:
			switch(selectedTrucks)
			{
				case 0:
					truckTotal = 35;
					break;
				case 1:
					truckTotal = 40;
					break;
				case 2:
					truckTotal = 45;
					break;
			}		
			
			// Switch statements to determine the cost of the wheels:
			switch(selectedWheels)
			{
				case 0:
					wheelTotal = 20;
					break;
				case 1:
					wheelTotal = 22;
					break;
				case 2:
					wheelTotal = 24;
					break;
				case 3:
					wheelTotal = 28;
			}	
			
			// Switch statements to determine the cost of the misc items:
			switch(selectedMisc)
			{
				case 0:
					miscTotal = 10;
					break;
				case 1:
					miscTotal = 30;
					break;
				case 2:
					miscTotal = 2;
					break;
				case 3:
					miscTotal = 3;
			}	
			
			// Calculate the subtotal:
			subTotal = deckTotal + truckTotal + wheelTotal + miscTotal;
			
			// Calculate the sales tax:
			salesTax = subTotal * SALES_TAX;
			
			// Calculate the total:
			total = salesTax + subTotal;
			
			// Display the results:
			subTotalTextField.setText(String.format("$%,.2f", subTotal));
			
			salesTaxTextField.setText(String.format("$%,.2f", salesTax));
			
			totalTextField.setText(String.format("$%,.2f", total));
			
			
			
		}
	}
	

	public static void main(String[] args)
	{
		new SkateBoardDesigner();

	}

}
