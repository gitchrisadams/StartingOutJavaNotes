package com.christopheradams.num009MPGCalculator;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

// Extend JFrame in order to use GUI components.
public class MpgCalculator extends JFrame
{
	/***** Fields *****/
	// Create 6 panels:
	private JPanel panel1;					
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	
	private JLabel gallonsOfGasLabel;				// A reference to a label.
	private JTextField gallonsOfGasTextField;		// A reference to a text field.
	private JLabel numMilesPerTankLabel;			// A reference to a label.
	private JTextField numMilesPerTankTextField;	// A reference to a text field.
	private JLabel emptyStringLabel;				// Empty string for alignment.
	private JButton calcButton;						// A reference to a button.
	
	private final int WINDOW_WIDTH = 500;			// Width of the window.
	private final int WINDOW_HEIGHT = 200;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public MpgCalculator()
	{
		// Set the windows title:
		setTitle("MPG Calculator");
		
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
		// Create labels and text fields:
		gallonsOfGasLabel = new JLabel("Enter the gallons of gas the car holds:");
		gallonsOfGasTextField = new JTextField(10);
		
		numMilesPerTankLabel = new JLabel("# of miles can drive on full tank:");
		numMilesPerTankTextField = new JTextField(10);
		
		// For spacing:
		emptyStringLabel = new JLabel("");
		
		// Button to calculate:
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
		
		// Add the label, text field, and button components to the panel:
		panel1.add(gallonsOfGasLabel);
		panel2.add(gallonsOfGasTextField);

		panel3.add(numMilesPerTankLabel);
		panel4.add(numMilesPerTankTextField);
		
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
			double gallonsOfGas;		// Gallons of gas used.
			double numMilesPerTank;		// The number of miles out of a full tank.
			double mpg;					// The miles per gallon.

			// Get input from user and cast to appropriate type:
			input = gallonsOfGasTextField.getText();
			gallonsOfGas = Double.parseDouble(input);
			
			input = numMilesPerTankTextField.getText();
			numMilesPerTank = Double.parseDouble(input);
			
			// Call method to calculate the miles per gallon:
			mpg = calcMpg(numMilesPerTank, gallonsOfGas);
			
			
			// Display the result:
			JOptionPane.showMessageDialog(null, 
				String.format("Your miles per gallon(mpg) is: %.2f", mpg));
		}
	}
	
	/**
	 * The calcMpg() method calculates the miles per gallon.
	 * @param miles
	 * @param gallons
	 * @return The miles per gallon.
	 */
	public double calcMpg(double miles, double gallons)
	{
		double mpg = 0;
		
		if(miles != 0)
			mpg = miles / gallons;
		
		return mpg;
	}
	
	/**
	 * The main method creates an instance of the
	 * RetailPriceCalculator class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new MpgCalculator();
	}

}
