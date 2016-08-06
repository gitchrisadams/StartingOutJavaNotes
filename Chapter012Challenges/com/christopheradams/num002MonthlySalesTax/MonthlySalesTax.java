package com.christopheradams.num002MonthlySalesTax;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

// Extend JFrame in order to use GUI components.
public class MonthlySalesTax extends JFrame
{
	/***** Fields *****/
	// Create 4 panels:
	private JPanel panel1;					
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;

	
	private JLabel totalSalesLabel;					// A reference to a label.
	private JTextField totalSalesTextField;			// A reference to a text field.
	private JButton calcButton;						// A reference to a button.
	private JLabel emptyStringLabel;				// Empty string for alignment.
	private final int WINDOW_WIDTH = 500;			// Width of the window.
	private final int WINDOW_HEIGHT = 200;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public MonthlySalesTax()
	{
		// Set the windows title:
		setTitle("Monthly Sales Tax Calculator");
		
		// Set the size of the window:
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Specify what happens when the close button is clicked:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the layout type to GridLayout.
		// This layout uses rows and columns for alignment.
		setLayout(new GridLayout(2, 2));
		
		// Call method to build the panel:
		buildPanel();
		
		// Add the panel to the frame's content pane:
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		
		// Display the window:
		setVisible(true);
		
	}
	
	public void buildPanel()
	{
		// Create a label and text field to get the wholesale cost from user:
		totalSalesLabel = new JLabel("Enter the total sales:");
		totalSalesTextField = new JTextField(10);
		
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
		
		// Add the label, text field, and button components to the panel
		// for the total sales cost.
		panel1.add(totalSalesLabel);
		panel2.add(totalSalesTextField);
		
		// Add an empty string to the panel so the calculate button is under
		// the text fields. In grid layout this pushes the button to the right.
		panel3.add(emptyStringLabel);
		
		// Add the calculate button to the panel:
		panel4.add(calcButton);
		
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
			double totalSales;			// The total sales.
			double stateTax;			// The state tax.
			double countyTax;			// The county tax.
			double totalSalesTax = 0;	// The total sales tax.
			
			// Constants:
			final double STATE_TAX = .04; 
			final double COUNTY_TAX = .02;
			
			// Get the raw text entered by the user as a String:
			input = totalSalesTextField.getText();
			
			// Convert the text entered to a double:
			totalSales = Double.parseDouble(input);
			
			// Calculate the state and county tax:
			stateTax = totalSales * STATE_TAX;
			countyTax = totalSales * COUNTY_TAX;
			
			// Calculate the total sales tax:
			totalSalesTax += stateTax + countyTax;
			
			// Display the results:
			JOptionPane.showMessageDialog(null, 
				String.format("The total state tax is $%.2f", stateTax));
			
			JOptionPane.showMessageDialog(null, 
					String.format("The total county tax is $%.2f", countyTax));
			
			JOptionPane.showMessageDialog(null, 
					String.format("The total sales tax is $%.2f", totalSalesTax));
		}
	}
	
	/**
	 * The main method creates an instance of the
	 * MonthlySalesTax class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new MonthlySalesTax();
	}

}
