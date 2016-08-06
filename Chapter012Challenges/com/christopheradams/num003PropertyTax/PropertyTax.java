package com.christopheradams.num003PropertyTax;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

// Extend JFrame in order to use GUI components.
public class PropertyTax extends JFrame
{
	/***** Fields *****/
	// Create 4 panels:
	private JPanel panel1;					
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;

	
	private JLabel propertyValueLabel;				// A reference to a label.
	private JTextField propertyValueTextField;		// A reference to a text field.
	private JButton calcButton;						// A reference to a button.
	private JLabel emptyStringLabel;				// Empty string for alignment.
	private final int WINDOW_WIDTH = 500;			// Width of the window.
	private final int WINDOW_HEIGHT = 200;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public PropertyTax()
	{
		// Set the windows title:
		setTitle("Property Tax");
		
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
		// Create a label and text field to get the input from user:
		propertyValueLabel = new JLabel("Enter the value of your home:");
		propertyValueTextField = new JTextField(10);
		
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
		
		// Add the label, text field, and button components to the panel.
		panel1.add(propertyValueLabel);
		panel2.add(propertyValueTextField);
		
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
			String input;						// To hold the user's raw input.
			double valueOfHome;					// The home's value from the user.
			double totalAssessmentValue;		// The total assessment value of the home.
			double totalPropertyTax;			// The total property tax owed.
			
			// Constants:
			final double ASSESSMENT_VAL_RATE = .60; 		// Rate to assess home.
			final double PROPERTY_TAX_RATE = .64;			// Rate to charge per $ figure.
			
			// Assessment value is based on charging per a number.
			// In this case we are charging per every $100 of the assessment.
			final double ASSESSMENT_VAL_PER_RATE  = 100;
			
			// Get the raw text entered by the user as a String:
			input = propertyValueTextField.getText();
			
			// Convert the text entered to a double:
			valueOfHome = Double.parseDouble(input);
			
			// Calculate the assessment value of the home:
			totalAssessmentValue = valueOfHome * ASSESSMENT_VAL_RATE;
			
			// Calculate the total property tax:
			totalPropertyTax = totalAssessmentValue / ASSESSMENT_VAL_PER_RATE * 
					PROPERTY_TAX_RATE;
		
			// Display the results:
			// Notice we added a custom title to the JOption pane by
			// supplying 4 arguments. "Property Tax" and JOptionPane.INFORMATION_MESSAGE
			JOptionPane.showMessageDialog(null, 
				String.format("The total assessed value of the home is $%.2f%n"
						+ "The total propery tax is $%.2f", totalAssessmentValue, totalPropertyTax), 
						"Property Tax", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	/**
	 * The main method creates an instance of the
	 * MonthlySalesTax class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new PropertyTax();
	}

}
