package com.christopheradams.num006JoesAutomotive;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

// Extend JFrame in order to use GUI components.
public class JoeAutomotive extends JFrame
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
	private JPanel panel8;
	private JPanel panel9;
	private JPanel panel10;

	// Empty String for spacing after chooseServiceLabel(no checkbox here)
	private JLabel emptyStringLabel;
	
	// Checkboxes:
	private JCheckBox oilChangeCheckBox;
	private JCheckBox lubeCheckBox;
	private JCheckBox radiatorFlushCheckBox;
	private JCheckBox trannyFlushCheckBox;
	private JCheckBox inspectionCheckBox;
	private JCheckBox mufflerCheckBox;
	private JCheckBox tireRotationCheckBox;
	private JCheckBox otherCheckBox;

	// Calculate button:
	private JButton calcButton;
	
	private final int WINDOW_WIDTH = 600;			// Width of the window.
	private final int WINDOW_HEIGHT = 400;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public JoeAutomotive()
	{
		// Set the windows title:
		setTitle("Joe's Automotive Service Selector(JASS)");
		
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
		add(panel4);
		add(panel5);
		add(panel6);
		add(panel7);
		add(panel8);
		add(panel9);
		add(panel10);
		
		// Display the window:
		setVisible(true);
	}
	
	public void buildPanel()
	{
		// Create label objects:
		emptyStringLabel = new JLabel("");
		
		// Create Checkbox objects:
		oilChangeCheckBox = new JCheckBox("Oil change: $26");
		lubeCheckBox = new JCheckBox("Lube job: $18");
		radiatorFlushCheckBox = new JCheckBox("Radiator flush: $30");
		trannyFlushCheckBox = new JCheckBox("Transmission flush: $80");
		inspectionCheckBox = new JCheckBox("Inspection: $15");
		mufflerCheckBox = new JCheckBox("Muffler replacement: $100");
		tireRotationCheckBox = new JCheckBox("Tire rotation: $20");
		otherCheckBox = new JCheckBox("Other non-routine service: $20/hr");
		
		// Button to calculate:
		calcButton = new JButton("Calculate Fees");
		
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
		panel8 = new JPanel();
		panel9 = new JPanel();
		panel10 = new JPanel();

		// Add the label, text field, and button components to the panel.
		panel1.add(oilChangeCheckBox);
		panel2.add(lubeCheckBox);
		
		panel3.add(radiatorFlushCheckBox);
		panel4.add(trannyFlushCheckBox);
		
		panel5.add(inspectionCheckBox);
		panel6.add(mufflerCheckBox);
		
		panel7.add(tireRotationCheckBox);
		panel8.add(otherCheckBox);

		// Add an empty string to the panel so the calculate button is under
		// the text fields. In grid layout this pushes the button to the right.
		panel9.add(emptyStringLabel);
		
		//Add the calculate button to the panel:
		panel10.add(calcButton);
		
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
			// Constants:
			final double OIL_CHANGE = 26;
			final double LUBE = 18;
			final double RAD_FLUSH = 30;
			final double TRANS_FLUSH = 80;
			final double INSPECTION = 15;
			final double NEW_MUFFLER = 100;
			final double TIRE_ROTATE = 20;
			final double LABOR_RATE = 20;				// Per hour.
			
			// Variables:
			int nonRoutineServiceLaborHours = 0;
			double nonRoutineServiceLaborTotal = 0;
			double nonRoutineServicePartsTotal = 0;
			double totalBill = 0;
			
			// Determine what checkboxes are checked:
			if(oilChangeCheckBox.isSelected())
			{
				totalBill += OIL_CHANGE;
			}
			
			if(lubeCheckBox.isSelected())
			{
				totalBill += LUBE;
			}
			
			if(radiatorFlushCheckBox.isSelected())
			{
				totalBill += RAD_FLUSH;
			}			
			
			if(trannyFlushCheckBox.isSelected())
			{
				totalBill += TRANS_FLUSH;
			}
			
			if(inspectionCheckBox.isSelected())
			{
				totalBill += INSPECTION;
			}	
			
			if(mufflerCheckBox.isSelected())
			{
				totalBill += NEW_MUFFLER;
			}	
			
			if(tireRotationCheckBox.isSelected())
			{
				totalBill += TIRE_ROTATE;
			}	
			
			if(otherCheckBox.isSelected())
			{
				// Get input for non-routine service and parts cost:
				String input = JOptionPane.showInputDialog("How many hours did job take?");
				
				nonRoutineServiceLaborHours = Integer.parseInt(input);
				
				// Get the labor total by multiplying hours by the rate:
				nonRoutineServiceLaborTotal = nonRoutineServiceLaborHours * LABOR_RATE;
				
				input = JOptionPane.showInputDialog("How much did the parts cost?");
				
				nonRoutineServicePartsTotal = Double.parseDouble(input);
				
				// Add the labor and parts cost to the total bill:
				totalBill += nonRoutineServiceLaborTotal + nonRoutineServicePartsTotal;
			}				
			
			// Display the results:
			JOptionPane.showMessageDialog(null, 
				String.format("Total bill with labor and parts included is: $%,.2f%n", 
						totalBill), 
						"Total Bill", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	/**
	 * The main method creates an instance of the
	 * MonthlySalesTax class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new JoeAutomotive();
	}

}
