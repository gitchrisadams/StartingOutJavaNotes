package com.christopheradams.num008ConferenceRegSystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ConfRegSystem extends JFrame
{
	// Create references for the components of the window:
	// Panels:
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;

	// Labels:
	private JLabel chooseOptions;
	private JLabel regTypeLabel;
	private JLabel totalCostLabel;
	private JLabel totalCostDisplayLabel;

	// ComboBoxes:
	private JComboBox regTypeComboBox;

	// CheckBoxes:
	private JCheckBox openingNightDinnerCheckBox;
	private JCheckBox workShop1CheckBox;
	private JCheckBox workShop2CheckBox;
	private JCheckBox workShop3CheckBox;
	private JCheckBox workShop4CheckBox;

	// Create array for the registration ComboBox:
	private String[] regType =
	{ "General $895", "Student $495" };

	// Variables:
	private double regTotal = 0;
	private double dinnerTotal = 0;
	private double workShop1 = 0;
	private double workShop2 = 0;
	private double workShop3 = 0;
	private double workShop4 = 0;
	private double workshopTotal = 0;
	private double grandTotal = 0;
	private int regAmountIndex = 0;

	// Constants:
	private final double GEN_REG_COST = 895;
	private final double STUD_REG_COST = 495;
	private final double DINNER_COST = 30;
	private final double WORKSHOP1_COST = 295;
	private final double WORKSHOP2_COST = 295;
	private final double WORKSHOP3_COST = 395;
	private final double WORKSHOP4_COST = 395;

	// For the Windows size:
	private final int WINDOW_WIDTH = 640; // Window width
	private final int WINDOW_HEIGHT = 220; // Window height

	/**
	 * Constructor
	 */
	public ConfRegSystem()
	{
		// Set the title of the windows:
		setTitle("Conference Registration System");

		// Specify an action for the close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a GridLayout:
		setLayout(new BorderLayout());

		// Build the panels:
		buildPanel1();
		buildPanel2();
		buildPanel3();
		buildPanel4();

		// Sets the size of the window:
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));

		// Add the panels to the content pane:
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.WEST);
		add(panel3, BorderLayout.CENTER);
		add(panel4, BorderLayout.SOUTH);

		// Call method that calculates the totals so total is set
		// when the window first loads:
		calcTotals();

		// Pack and display the window.
		pack();
		setVisible(true);
	}

	/***** Build the panels *****/
	public void buildPanel1()
	{

		/***** Choose Options *****/
		// Create the panel object:
		panel1 = new JPanel();

		// Create the choose options label:
		chooseOptions = new JLabel("Pick your registration options:");

		// Set the font to make larger:
		chooseOptions.setFont(new Font("Serif", Font.BOLD, 20));

		// Add components to the panel:
		panel1.add(chooseOptions);
		/***** End Choose Options *****/

	}

	public void buildPanel2()
	{
		// Create the panel object:
		panel2 = new JPanel();

		// Add a border around the panel.
		panel2.setBorder(BorderFactory.createTitledBorder("Options"));

		panel2.setLayout(new GridLayout(2, 1));

		/***** Registration Type *****/
		// Create the registration Label:
		regTypeLabel = new JLabel("Choose Registration type:");

		// Create the ComboBox:
		regTypeComboBox = new JComboBox(regType);

		// Add an action listener to the ComboBox:
		regTypeComboBox.addActionListener(new ComboBoxListener());

		// Add components to the panel:
		panel2.add(regTypeLabel);
		panel2.add(regTypeComboBox);
		/***** End Registration Type *****/

		/***** Opening Night CheckBox *****/
		// Create the CheckBox:
		openingNightDinnerCheckBox = new JCheckBox("Opening Night Dinner: $30");

		// Add an action listener to the CheckBox:
		openingNightDinnerCheckBox.addActionListener(new OpeningNightCheckBoxListener());

		// Add components to the panel:
		panel2.add(openingNightDinnerCheckBox);
		/***** End Opening Night CheckBox *****/
	}

	public void buildPanel3()
	{
		// Create the panel object:
		panel3 = new JPanel();

		panel3.setLayout(new GridLayout(4, 1));

		// Add a border around the panel.
		panel3.setBorder(BorderFactory.createTitledBorder("Choose Workshops:"));

		/***** For the Workshop CheckBoxes *****/
		// Create CheckBoxes:
		workShop1CheckBox = new JCheckBox("Intro to ecommerce: $295");
		workShop2CheckBox = new JCheckBox("The Future of the web: $295");
		workShop3CheckBox = new JCheckBox("Advanced Java Programming: $395");
		workShop4CheckBox = new JCheckBox("Networking Security: $395");

		// Add Listener for workshop CheckBoxes are checked/unchecked:
		workShop1CheckBox.addActionListener(new Workshop1CheckBoxListener());
		workShop2CheckBox.addActionListener(new Workshop2CheckBoxListener());
		workShop3CheckBox.addActionListener(new Workshop3CheckBoxListener());
		workShop4CheckBox.addActionListener(new Workshop4CheckBoxListener());

		// Add components to the panel:
		panel3.add(workShop1CheckBox);
		panel3.add(workShop2CheckBox);
		panel3.add(workShop3CheckBox);
		panel3.add(workShop4CheckBox);
		/***** End For the Workshop CheckBoxes *****/

	}

	public void buildPanel4()
	{
		// Create the panel object:
		panel4 = new JPanel();

		// Create Labels:
		totalCostLabel = new JLabel("Totals:");
		totalCostDisplayLabel = new JLabel();

		// Set the font for totals to make them larger:
		totalCostLabel.setFont(new Font("Serif", Font.BOLD, 24));
		totalCostDisplayLabel.setFont(new Font("Serif", Font.BOLD, 24));

		panel4.add(totalCostLabel);
		panel4.add(totalCostDisplayLabel);
	}

	/***** End Build the panels *****/

	/**
	 * The calcTotals method calculates the totals based on the options selected
	 * for the conference.
	 */
	public void calcTotals()
	{
		// Initially set the grand total to 0:
		grandTotal = 0;

		/***** Registration Total: *****/
		// Indexes of the item that is selected:
		regAmountIndex = regTypeComboBox.getSelectedIndex();

		// Switch based on index number of item that is selected:
		switch (regAmountIndex)
		{
		case 0:
			regTotal = GEN_REG_COST;
			break;
		case 1:
			regTotal = STUD_REG_COST;
			break;
		}

		/***** Opening Night Dinner: *****/
		// If the CheckBox to attend opening night dinner is selected
		// then set the price of dinner total.
		if (openingNightDinnerCheckBox.isSelected())
		{
			dinnerTotal = DINNER_COST;
		} else
		{
			dinnerTotal = 0;
		}

		/***** Workshop total *****/
		// Add the cost of each workshop in a workshop variable:
		if (workShop1CheckBox.isSelected())
		{
			workShop1 = WORKSHOP1_COST;
		} else
		{
			workShop1 = 0;
		}
		if (workShop2CheckBox.isSelected())
		{
			workShop2 = WORKSHOP2_COST;
		} else
		{
			workShop2 = 0;
		}
		if (workShop3CheckBox.isSelected())
		{
			workShop3 = WORKSHOP3_COST;
		} else
		{
			workShop3 = 0;
		}
		if (workShop4CheckBox.isSelected())
		{
			workShop4 = WORKSHOP4_COST;
		} else
		{
			workShop4 = 0;
		}

		// Get the total of all workshops:
		workshopTotal = workShop1 + workShop2 + workShop3 + workShop4;

		// Add the totals:
		grandTotal = regTotal + dinnerTotal + workshopTotal;

		// Set the text of the total display label to display the total:
		totalCostDisplayLabel.setText(String.format("$%,.2f", grandTotal));

	}

	/***** Inner Classes to listen for Click Events *****/
	private class ComboBoxListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			calcTotals();
		}
	}

	private class OpeningNightCheckBoxListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			calcTotals();
		}
	}

	private class Workshop1CheckBoxListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			calcTotals();
		}
	}

	private class Workshop2CheckBoxListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			calcTotals();
		}
	}

	private class Workshop3CheckBoxListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			calcTotals();
		}
	}

	private class Workshop4CheckBoxListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			calcTotals();
		}
	}

	/**
	 * Main method to create an instance of the class to create the window.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		new ConfRegSystem();

	}

}
