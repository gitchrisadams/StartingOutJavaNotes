package com.christopheradams.num010CelsToFahr;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

// Extend JFrame in order to use GUI components.
public class CelsToFahr extends JFrame
{
	/***** Fields *****/
	// Create 6 panels:
	private JPanel panel1;					
	private JPanel panel2;
	private JPanel panel3;

	
	private JLabel celsiusTempLabel;				// A reference to a label.
	private JTextField celsiusTempTextField;		// A reference to a text field.
	private JButton calcButton;						// A reference to a button.
	
	private final int WINDOW_WIDTH = 600;			// Width of the window.
	private final int WINDOW_HEIGHT = 100;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public CelsToFahr()
	{
		// Set the windows title:
		setTitle("MPG Calculator");
		
		// Set the size of the window:
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Specify what happens when the close button is clicked:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the layout type to GridLayout.
		// This layout uses rows and columns for alignment.
		setLayout(new GridLayout(0, 3));
		
		// Call method to build the panel:
		buildPanel();
		
		// Add the panel to the frame's content pane:
		add(panel1);
		add(panel2);
		add(panel3);
		
		// Display the window:
		setVisible(true);
		
	}
	
	public void buildPanel()
	{
		// Create labels and text fields:
		celsiusTempLabel = new JLabel("Enter temperature in Celsius:");
		celsiusTempTextField = new JTextField(10);
		
		// Button to calculate:
		calcButton = new JButton("Calculate");
		
		// Add an action listener to the button:
		calcButton.addActionListener(new CalcButtonListener());
		
		// Create the panel objects:
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		// Add the label, text field, and button components to the panel:
		panel1.add(celsiusTempLabel);
		panel2.add(celsiusTempTextField);
		
		// Add the calculate button to the panel:
		panel3.add(calcButton);
		
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
			// Variables:
			String input;				// To hold the user's raw input.
			double celsiusTemp;			// The temperature in Celsius.
			double fahrTemp;			// The temperature in Fahrenheit.
			
			// Get input from the user and convert to appropriate type:
			input = celsiusTempTextField.getText();
			celsiusTemp = Double.parseDouble(input);
			
			// Call method to convert Celsius to Fahrenheit.
			fahrTemp = convertCelsToFahr(celsiusTemp);
			
			// Display the result:
			JOptionPane.showMessageDialog(null, 
				String.format("%.0f degrees Celsius in Fahrenheit is: %.0f degrees F.", celsiusTemp, fahrTemp));
		}
	}
	
	public double convertCelsToFahr(double celsTemp)
	{
		return 9.0/5 * celsTemp + 32;
	}
	
	/**
	 * The main method creates an instance of the
	 * RetailPriceCalculator class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new CelsToFahr();
	}

}
