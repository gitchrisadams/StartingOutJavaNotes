package com.christopheradams.num007LongDistanceCalls;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

// Extend JFrame in order to use GUI components.
public class LongDistanceCalls extends JFrame
{
	/***** Fields *****/
	// Create panels:
	private JPanel panel1;					
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;

	// Create Label for asking user to select radio button for rate:
	private JLabel rateSelectHeading;
	
	
	// RadioBoxes:
	private JRadioButton daytimeRadioButton;
	private JRadioButton eveningRadioButton;
	private JRadioButton offPeakRadioButton;
	
	// Button group:
	private ButtonGroup radioButtonGroup;
	
	// Label and text field for number of minutes:
	private JLabel numMinutesLabel;
	private JTextField numMinutesTextField;

	// Calculate button:
	private JButton calcButton;
	
	private final int WINDOW_WIDTH = 400;			// Width of the window.
	private final int WINDOW_HEIGHT = 300;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public LongDistanceCalls()
	{
		// Set the windows title:
		setTitle("Reach out and touch someone!");
		
		// Set the size of the window:
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Specify what happens when the close button is clicked:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the layout type to GridLayout.
		// This layout uses rows and columns for alignment.
		setLayout(new GridLayout(0, 1));
		
		// Call method to build the panel:
		buildPanel();
		
		// Add the panel to the frame's content pane:
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(panel7);
	
		// Display the window:
		setVisible(true);
	}
	
	public void buildPanel()
	{
		// Create Label for asking user to select a rate:
		rateSelectHeading = new JLabel("Please select a rate:");
		
		// Create RadioButton objects:
		daytimeRadioButton = new JRadioButton("Daytime Rate: (6a.m - 5:59p.m.) .07/min");
		eveningRadioButton = new JRadioButton("Evening Rate: (6p.m - 11:59p.m.) .12/min");
		offPeakRadioButton = new JRadioButton("Off-Peak Rate: (12a.m - 5:59a.m.) .05/min");
		
		// Group the radio buttons:
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(daytimeRadioButton);
		radioButtonGroup.add(eveningRadioButton);
		radioButtonGroup.add(offPeakRadioButton);
		
		// Create label and text field objects for the minutes from user:
		numMinutesLabel = new JLabel("Enter the number of minutes used.");
		numMinutesTextField = new JTextField(10);
		
		// Button to calculate:
		calcButton = new JButton("Calculate phone bill");
		
		// Add an action listener to the button:
		calcButton.addActionListener(new CalcButtonListener());
		
		// Create the panel object:
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		panel7 = new JPanel();

		// Add the label, text field, and button components to the panel.
		panel1.add(rateSelectHeading);
		panel2.add(daytimeRadioButton);
		panel3.add(eveningRadioButton);
		
		panel4.add(offPeakRadioButton);
		panel5.add(numMinutesLabel);
		
		panel6.add(numMinutesTextField);
		
		//Add the calculate button to the panel:
		panel7.add(calcButton);
		
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
			if(daytimeRadioButton.isSelected())
			{
				System.out.println("Daytime selected");
			}
			else if(eveningRadioButton.isSelected())
			{
				System.out.println("Evening is selected");
			}
			else if(offPeakRadioButton.isSelected())
			{
				System.out.println("Off peak is selected");
			}
			else
			{
				System.out.println("Nothing is selected");
			}
			

//			// Display the results:
//			JOptionPane.showMessageDialog(null, 
//				String.format("Total bill with labor and parts included is: $%,.2f%n", 
//						totalBill), 
//						"Total Bill", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	/**
	 * The main method creates an instance of the
	 * MonthlySalesTax class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new LongDistanceCalls();
	}

}
