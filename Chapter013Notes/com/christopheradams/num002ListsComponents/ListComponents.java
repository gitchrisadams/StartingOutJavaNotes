package com.christopheradams.num002ListsComponents;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

//General List information:
//When you create a list you must pass it an array of objects.

// Extend JFrame in order to use GUI components.
public class ListComponents extends JFrame
{
	/***** Fields *****/
	// Create panels:
	private JPanel panel1;					
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;

	// Create an array to pass to the JList:
	private String[] names = {"Chris", "Bob", "Ryan", "AJ"};
	
	// Create a new JList reference:
	private JList nameList;
	
	// Create labels, text fields and buttons references:
	private JLabel readOnlyLabel;					// A reference to a label.
	private JTextField readOnlyTextField;			// A reference to a text field.
	private JButton calcButton;						// A reference to a button.
	
	
	private final int WINDOW_WIDTH = 700;			// Width of the window.
	private final int WINDOW_HEIGHT = 200;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public ListComponents()
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
		add(panel4);
		
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
		
		// Create a new List object:
		nameList = new JList(names);
		
		/* Set the selection mode of the list, the options for selection modes are:
		 * SINGLE_SELECTION where only one item can be selected (the default)
		 * SINGLE_INTERVAL_SELECTION where only contiguous items can be selected together.
		 * MULTIPLE_INTERVAL_SELECTION where you can pick and choose what is selected.
		 */
		nameList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
		
		// Add an action listener to the button:
		calcButton.addActionListener(new CalcButtonListener());
		
		// Create the panel objects:
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		
		// Add the label, text field, and button components to the panel:
		panel1.add(readOnlyLabel);
		panel2.add(readOnlyTextField);
		
		// Add the calculate button to the panel:
		panel3.add(calcButton);
		
		panel4.add(nameList);
		
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
	 * class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new ListComponents();
	}

}
