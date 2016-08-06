package com.christopheradams.num004TravelExpenses;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

// Extend JFrame in order to use GUI components.
public class TravelExpenses extends JFrame
{
	/***** Fields *****/
	// Create 16 panels:
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
	private JPanel panel11;
	private JPanel panel12;
	private JPanel panel13;
	private JPanel panel14;
	private JPanel panel15;
	private JPanel panel16;
	private JPanel panel17;
	private JPanel panel18;

	
	// Label references:
	private JLabel numberOfDaysLabel;
	private JLabel airfareFeesLabel;
	private JLabel carRentalFeesLabel;
	private JLabel numMilesDrivenLabel;
	private JLabel parkingFeesLabel;
	private JLabel taxiFeesLabel;
	private JLabel conferenceFeesLabel;
	private JLabel lodgingFeesLabel;
	
	// Text field references:
	private JTextField numberOfDaysTextField;
	private JTextField airfareFeesTextField;
	private JTextField carRentalFeesTextField;
	private JTextField numMilesDrivenTextField;
	private JTextField parkingFeesTextField;
	private JTextField taxiFeesTextField;
	private JTextField conferenceFeesTextField;
	private JTextField lodgingFeesTextField;
	
	// Calculate button:
	private JButton calcButton;
	
	private JLabel emptyStringLabel;				// Empty string for alignment.
	private final int WINDOW_WIDTH = 600;			// Width of the window.
	private final int WINDOW_HEIGHT = 400;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public TravelExpenses()
	{
		// Set the windows title:
		setTitle("Travel Expenses");
		
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
		add(panel11);
		add(panel12);
		add(panel13);
		add(panel14);
		add(panel15);
		add(panel16);
		add(panel17);
		add(panel18);
		
		// Display the window:
		setVisible(true);
	}
	
	public void buildPanel()
	{
		// Create labels and text field objects:
		numberOfDaysLabel = new JLabel("Enter the number of days for your trip:");
		numberOfDaysTextField = new JTextField(10);
		
		airfareFeesLabel = new JLabel("Airfare fees:");
		airfareFeesTextField = new JTextField(10);
		
		carRentalFeesLabel = new JLabel("Car rental fees:");
		carRentalFeesTextField = new JTextField(10);
		
		numMilesDrivenLabel = new JLabel("Number of miles driven if private vehicle used:");
		numMilesDrivenTextField = new JTextField(10);
		
		parkingFeesLabel = new JLabel("Parking fees:");
		parkingFeesTextField = new JTextField(10);
		
		taxiFeesLabel = new JLabel("Taxi fees:");
		taxiFeesTextField = new JTextField(10);
		
		conferenceFeesLabel = new JLabel("Conference/Seminar fees:");
		conferenceFeesTextField = new JTextField(10);
		
		lodgingFeesLabel = new JLabel("Lodging fees:");
		lodgingFeesTextField = new JTextField(10);
		
		// Empty string for spacing:
		emptyStringLabel = new JLabel("");
		
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
		panel11 = new JPanel();
		panel12 = new JPanel();
		panel13 = new JPanel();
		panel14 = new JPanel();
		panel15 = new JPanel();
		panel16 = new JPanel();
		panel17 = new JPanel();
		panel18 = new JPanel();
		
		// Add the label, text field, and button components to the panel.
		panel1.add(numberOfDaysLabel);
		panel2.add(numberOfDaysTextField);
		
		panel3.add(airfareFeesLabel);
		panel4.add(airfareFeesTextField);
		
		panel5.add(carRentalFeesLabel);
		panel6.add(carRentalFeesTextField);
		
		panel7.add(numMilesDrivenLabel);
		panel8.add(numMilesDrivenTextField);
		
		panel9.add(parkingFeesLabel);
		panel10.add(parkingFeesTextField);
		
		panel11.add(taxiFeesLabel);
		panel12.add(taxiFeesTextField);
		
		panel13.add(conferenceFeesLabel);
		panel14.add(conferenceFeesTextField);
		
		panel15.add(lodgingFeesLabel);
		panel16.add(lodgingFeesTextField);

		// Add an empty string to the panel so the calculate button is under
		// the text fields. In grid layout this pushes the button to the right.
		panel17.add(emptyStringLabel);
		
		//Add the calculate button to the panel:
		panel18.add(calcButton);
		
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
			int numberOfDays;					// Number of days traveling.
			double airfareFees;					// Fees for airfare.
			double carRentalFees;				// Fees for renting a car.
			double numMilesDriven;				// The number of miles driven.
			double parkingFees;					// The amount of parking fees.
			double taxiFees;					// The amount of taxi fees.
			double conferenceFees;				// The amount of conference/seminars fees.
			double lodgingFees;					// The amount of lodging fees per night.
			double totalExpenses;				// The total expenses for the trip.
			double totalAllowable;				// The total allowable expenses for the trip.
			double excessOwed;					// The amount owed to the traveler.
			double owedByTraveler;				// The amount owed by the traveler.

			// Get the raw text entered by the user as a String:
			input = numberOfDaysTextField.getText();
			
			// Convert the text entered to an int:
			numberOfDays = Integer.parseInt(input);
			
			// Get the raw text entered by the user as a String:
			input = airfareFeesTextField.getText();
			
			// Convert the text entered to a double:
			airfareFees = Double.parseDouble(input);
			
			// Get the raw text entered by the user as a String:
			input = carRentalFeesTextField.getText();
			
			// Convert the text entered to a double:
			carRentalFees = Double.parseDouble(input);
			
			// Get the raw text entered by the user as a String:
			input = numMilesDrivenTextField.getText();
			
			// Convert the text entered to a double:
			numMilesDriven = Double.parseDouble(input);
			
			// Get the raw text entered by the user as a String:
			input = parkingFeesTextField.getText();
			
			// Convert the text entered to a double:
			parkingFees = Double.parseDouble(input);
		
			// Get the raw text entered by the user as a String:
			input = taxiFeesTextField.getText();
			
			// Convert the text entered to a double:
			taxiFees = Double.parseDouble(input);
			
			// Get the raw text entered by the user as a String:
			input = conferenceFeesTextField.getText();
			
			// Convert the text entered to a double:
			conferenceFees = Double.parseDouble(input);		
			
			// Get the raw text entered by the user as a String:
			input = lodgingFeesTextField.getText();
			
			// Convert the text entered to a double:
			lodgingFees = Double.parseDouble(input);	
			
			// Call method to calculate the total expense:
			totalExpenses = calcExpenses(numberOfDays, airfareFees, carRentalFees, 
					numMilesDriven, parkingFees, taxiFees, conferenceFees, lodgingFees);
			
			// Call method to calculate the total allowable expenses:
			totalAllowable = calcAllowable(numberOfDays, carRentalFees, numMilesDriven, 
					parkingFees, taxiFees, lodgingFees);
			
			// Call method to calculate the excess that must be paid to the user:
			excessOwed = excessOwed(totalExpenses, totalAllowable);
			
			// Call method to calculate how much in expenses the user must pay:
			owedByTraveler = amountMustPay(totalExpenses, totalAllowable);

			// Display the results:
			JOptionPane.showMessageDialog(null, 
				String.format("The total expenses for the trip: $%,.2f%n"
						+ "The total allowable expenses: $%,.2f%n"
						+ "The total excess owed to you is: $%,.2f%n"
						+ "The total amount owed by you is: $%,.2f%n", 
						totalExpenses, totalAllowable, excessOwed, owedByTraveler), 
						"Travel Expenses", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public double calcExpenses(int numberOfDays, double airfareFees, double carRentalFees, 
			double numMilesDriven, double parkingFees, double taxiFees, double conferenceFees, double lodgingFees)
	{
		double totalExpenses;			// The total expenses for the trip.
		double totalLodgingFees;		// The total for lodgning fees.
		
		// Calculate total lodging by mult daily rate by number of days staying.
		totalLodgingFees = lodgingFees * numberOfDays;
		
		// Calculate the total expenses.
		totalExpenses = airfareFees + carRentalFees + parkingFees + 
				taxiFees + conferenceFees + totalLodgingFees;
		
		return totalExpenses;
	}
	
	/**
	 * The calcAllowable() method calculates the allowable expenses.
	 * @param numberOfDays
	 * @param airfareFees
	 * @param carRentalFees
	 * @param numMilesDriven
	 * @param parkingFees
	 * @param taxiFees
	 * @param conferenceFees
	 * @param lodgingFees
	 * @return The allowable expenses.
	 */
	public double calcAllowable(int numberOfDays, double carRentalFees, double numMilesDriven, 
			double parkingFees, double taxiFees, double lodgingFees)
	{
		// Constants:
		final double MEAL_ALLOWANCE = 37;				// Amount per day for meals.
		final double PARK_ALLOWANCE = 10;				// Amount per day for parking.
		final double TAXI_ALLOWANCE = 20;				// Amount per day for taxi service.
		final double LODGING_ALLOWANCE = 95;			// Amount per day for Lodging.
		final double PRIV_CAR_ALLOWANCE = .27;			// Amount per mile for use of a private car.
		
		// Variables:
		double allowableMeals;						// Allowable amount for meals.
		double allowableParking = 0;				// Allowable amount for parking.
		double allowableTaxi = 0;					// Allowable amount for taxi.
		double allowableLodging;					// Allowable amount for lodging.
		double allowablePrivCar = 0;				// Allowable amount for private car use.
		double totalAllowable;						// The total allowable expenses.
		
		
		// Calculate allowable for meals:
		allowableMeals = numberOfDays * MEAL_ALLOWANCE;
		
		// Calculate allowable parking fees if any:
		if(parkingFees > 0)
		{
			allowableParking = numberOfDays * PARK_ALLOWANCE;
		}
		
		// Calculate allowable taxi fees:
		if(taxiFees > 0)
		{
			allowableTaxi = numberOfDays * TAXI_ALLOWANCE;
		}
		
		// Calculate allowable lodging:
		allowableLodging = numberOfDays * LODGING_ALLOWANCE;
		
		// Calculate allowable mileage if a private vehicle was used:
		if(numMilesDriven > 0)
		{
			allowablePrivCar = numMilesDriven * PRIV_CAR_ALLOWANCE;
		}
		
		// Calculate the total allowable expense and return to calling method:
		totalAllowable = allowableMeals + allowableParking + allowableTaxi + 
				allowableLodging + allowablePrivCar;
		
		return totalAllowable;
	}
	
	/**
	 * The excessOwed() method calculates the amount owed to the user.
	 * @param totalExpenses
	 * @param totalAllowable
	 * @return The amount owed to the user.
	 */
	public double excessOwed(double totalExpenses, double totalAllowable)
	{
		double excessOwed = 0;
		
		if(totalExpenses < totalAllowable)
		{
			excessOwed = totalAllowable - totalExpenses;
		}
		
		return excessOwed;
	}
	
	/**
	 * The amountMustPay() method calculates how much the traveler must pay.
	 * @param totalExpenses
	 * @param totalAllowable
	 * @return The amount owed by the traveler.
	 */
	public double amountMustPay(double totalExpenses, double totalAllowable)
	{
		double owedByTraveler = 0;
		
		if(totalExpenses > totalAllowable)
		{
			owedByTraveler = totalExpenses - totalAllowable;
		}
		
		return owedByTraveler;
	}
	
	/**
	 * The main method creates an instance of the
	 * MonthlySalesTax class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new TravelExpenses();
	}

}
