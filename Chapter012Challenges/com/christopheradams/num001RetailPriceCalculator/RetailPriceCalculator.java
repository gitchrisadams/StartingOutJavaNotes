package com.christopheradams.num001RetailPriceCalculator;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

// Extend JFrame in order to use GUI components.
public class RetailPriceCalculator extends JFrame
{
	/***** Fields *****/
	// Create 6 panels:
	private JPanel panel1;					
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	
	private JLabel wholesaleCostLabel;				// A reference to a label.
	private JTextField wholesaleCostTextField;		// A reference to a text field.
	private JButton calcButton;						// A reference to a button.
	private JLabel markupPercentLabel;				// A reference to a label.
	private JLabel emptyStringLabel;				// Empty string for alignment.
	private JTextField markupPercentTextField;		// A reference to a text field.
	private final int WINDOW_WIDTH = 500;			// Width of the window.
	private final int WINDOW_HEIGHT = 200;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public RetailPriceCalculator()
	{
		// Set the windows title:
		setTitle("Retail Price Calculator");
		
		// Set the size of the window:
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Specify what happens when the close button is clicked:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the layout type to GridLayout.
		// This layout uses rows and columns for alignment.
		setLayout(new GridLayout(3, 2));
		
		// Call method to build the panel:
		buildPanel();
		
		// Add the panel to the frame's content pane:
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		
		// Display the window:
		setVisible(true);
		
	}
	
	public void buildPanel()
	{
		// Create a label and text field to get the wholesale cost from user:
		wholesaleCostLabel = new JLabel("Enter the wholesale cost:");
		wholesaleCostTextField = new JTextField(10);
		
		markupPercentLabel = new JLabel("Enter the markup percentage:");
		markupPercentTextField = new JTextField(10);
		
		emptyStringLabel = new JLabel("");
		
		// Button to calculate the Retail cost:
		calcButton = new JButton("Calculate");
		
		// Add an action listener to the button:
		calcButton.addActionListener(new CalcButtonListener());
		
		// Create the panel object:
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		
		// Add the label, text field, and button components to the panel
		// for the wholesale cost.
		panel1.add(wholesaleCostLabel);
		panel2.add(wholesaleCostTextField);
		
		// Add the label, text field, and button components to the panel
		// for the markup percentage.
		panel3.add(markupPercentLabel);
		panel4.add(markupPercentTextField);
		
		// Add an empty string to the panel so the calculate button is under
		// the text fields. In grid layout this pushes the button to the right.
		panel5.add(emptyStringLabel);
		
		// Add the calculate button to the panel:
		panel6.add(calcButton);
		
	}
	
	/** 
	 * CalcButtonListener is an action listener class for the Calculate button.
	 */
	private class CalcButtonListener implements ActionListener
	{
		/**
		 * The actionPerformed method is required and executes
		 * when the user clicks the calculate button.
		 * @param e The event object.
		 */
		public void actionPerformed(ActionEvent e)
		{
			String input;				// To hold the user's raw input.
			double wholesaleCost;		// The wholesale cost of an item.
			double markupPercent;		// The amount to markup the item.
			double retailPrice;			// The retail price of an item.
			
			// Get the raw text entered by the user as a String:
			input = wholesaleCostTextField.getText();
			
			// Convert the text entered to a double:
			wholesaleCost = Double.parseDouble(input);
			
			// Get the raw text entered by the user as a String:
			input = markupPercentTextField.getText();
			
			// Convert text entered to a double:
			markupPercent = Double.parseDouble(input);
			
			// Calculate the retail price:
			retailPrice = wholesaleCost * markupPercent + wholesaleCost;
			
			// Display the result:
			JOptionPane.showMessageDialog(null, 
				String.format("The retail cost is $%.2f", retailPrice));
		}
	}
	
	/**
	 * The main method creates an instance of the
	 * RetailPriceCalculator class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new RetailPriceCalculator();
	}

}
