package com.christopheradams.num001ReadOnlyTextFields;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

// Extend JFrame in order to use GUI components.
public class ReadOnlyTextFields extends JFrame
{
	/***** Fields *****/
	// Create panels:
	private JPanel panel1;					
	private JPanel panel2;
	private JPanel panel3;

	
	private JLabel readOnlyLabel;					// A reference to a label.
	private JTextField readOnlyTextField;		// A reference to a text field.
	private JButton calcButton;						// A reference to a button.
	
	private final int WINDOW_WIDTH = 700;			// Width of the window.
	private final int WINDOW_HEIGHT = 200;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public ReadOnlyTextFields()
	{
		// Set the windows title:
		setTitle("Read only text fields");
		
		// Set the size of the window:
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Specify what happens when the close button is clicked:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the layout type to GridLayout.
		// This layout uses rows and columns for alignment.
		setLayout(new GridLayout(0, 2));
		
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
		readOnlyLabel = new JLabel("Read only text field example, Notice it is not editable:");
		readOnlyTextField = new JTextField(10);
		
		// Make it so the the text field is not editable:(true by default with no arg)
		readOnlyTextField.setEditable(false);
		
		// Button to calculate:
		calcButton = new JButton("Calculate");
		
		// Add an action listener to the button:
		calcButton.addActionListener(new CalcButtonListener());
		
		// Create the panel objects:
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		
		// Add the label, text field, and button components to the panel:
		panel1.add(readOnlyLabel);
		panel2.add(readOnlyTextField);
		
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
			readOnlyTextField.setText("Now, you done it!");

		}
	}
	

	
	/**
	 * The main method creates an instance of the
	 * RetailPriceCalculator class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new ReadOnlyTextFields();
	}

}
