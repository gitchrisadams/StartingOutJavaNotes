package com.christopheradams.num005TheaterRevenue;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

// Extend JFrame in order to use GUI components.
public class TheaterRevenue extends JFrame
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
	
	// Label references:
	private JLabel adultTicketsPriceLabel;
	private JLabel adultTicketsSoldLabel;
	private JLabel kidTicketsPriceLabel;
	private JLabel kidTicketsSoldLabel;
	
	// Text field references:
	private JTextField adultTicketsPriceTextField;
	private JTextField adultTicketsSoldTextField;
	private JTextField kidTicketPriceTextField;
	private JTextField kidTicketSoldTextField;

	
	// Calculate button:
	private JButton calcButton;
	
	private JLabel emptyStringLabel;				// Empty string for alignment.
	private final int WINDOW_WIDTH = 600;			// Width of the window.
	private final int WINDOW_HEIGHT = 400;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public TheaterRevenue()
	{
		// Set the windows title:
		setTitle("Theater Revenue");
		
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
		// Create labels and text field objects:
		adultTicketsPriceLabel = new JLabel("Price per adult ticket:");
		adultTicketsPriceTextField = new JTextField(10);
		
		adultTicketsSoldLabel = new JLabel("Number of adult tickets sold:");
		adultTicketsSoldTextField = new JTextField(10);
		
		kidTicketsPriceLabel = new JLabel("Price per child ticket:");
		kidTicketPriceTextField = new JTextField(10);
		
		kidTicketsSoldLabel = new JLabel("Number of child tickets sold:");
		kidTicketSoldTextField = new JTextField(10);
		
		
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

		// Add the label, text field, and button components to the panel.
		panel1.add(adultTicketsPriceLabel);
		panel2.add(adultTicketsPriceTextField);
		
		panel3.add(adultTicketsSoldLabel);
		panel4.add(adultTicketsSoldTextField);
		
		panel5.add(kidTicketsPriceLabel);
		panel6.add(kidTicketPriceTextField);
		
		panel7.add(kidTicketsSoldLabel);
		panel8.add(kidTicketSoldTextField);

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
			String input;						// To hold the user's raw input.
			double pricePerAdultTicket;			// Price per adult ticket.
			double pricePerKidTicket;			// Price per child ticket.
			int numAdultTicketsSold;			// The number of adult tickets sold.
			int numKidTicketsSold;				// The number of child tickets sold.
			double grossRevenueAdultTickets;	// Gross revenue for adult tickets.
			double netRevenueAdultTickets;		// Net Revenue for adult tickets.
			double grossRevenueKidTickets;		// Gross revenue for child tickets.
			double netRevenueKidTickets;		// Net revenue for child tickets.
			double totalGrossRevenue;			// Total revenue of adult and child tickets.
			double totalNetRevenue;				// The total net revenue.

			// Get the raw text entered by the user as a String:
			input = adultTicketsPriceTextField.getText();
			
			// Convert the text entered to a double:
			pricePerAdultTicket = Double.parseDouble(input);
			
			// Get the raw text entered by the user as a String:
			input = adultTicketsSoldTextField.getText();
			
			// Convert the text entered to a double:
			numAdultTicketsSold = Integer.parseInt(input);
			
			// Get the raw text entered by the user as a String:
			input = kidTicketPriceTextField.getText();
			
			// Convert the text entered to a double:
			pricePerKidTicket = Double.parseDouble(input);
			
			// Get the raw text entered by the user as a String:
			input = kidTicketSoldTextField.getText();
			
			// Convert the text entered to a double:
			numKidTicketsSold = Integer.parseInt(input);
			
			// Call method to calculate the gross revenue for adult tickets:
			grossRevenueAdultTickets = calcGrossRevenue(numAdultTicketsSold, pricePerAdultTicket);
			
			// Call method to calculate the gross revenue for child tickets:
			grossRevenueKidTickets = calcGrossRevenue(numKidTicketsSold, pricePerKidTicket);
			
			// Call method to calculate net revenue of adult tickets:
			netRevenueAdultTickets = calcNetRevenue(grossRevenueAdultTickets);
			
			// Call method to calculate net revenue of child tickets:
			netRevenueKidTickets = calcNetRevenue(grossRevenueKidTickets);
			
			// Call method to calculate the total gross revenue:
			totalGrossRevenue = calculateTotalGross(grossRevenueAdultTickets, grossRevenueKidTickets);
			
			// Call method to calculate the total net revenue:
			totalNetRevenue = calculateTotalNet(netRevenueAdultTickets, netRevenueKidTickets);
			

			// Display the results:
			JOptionPane.showMessageDialog(null, 
				String.format("The total gross for adult ticket sales is: $%,.2f%n"
						+ "The total net for adult ticket sales is: $%,.2f%n"
						+ "The total gross for child ticket sales is: $%,.2f%n"
						+ "The total net for child ticket sales is: $%,.2f%n"
						+ "The total gross revenue for all ticket sales is: $%,.2f%n"
						+ "The total net revenue for all ticket sales is: $%,.2f%n", 
						grossRevenueAdultTickets, netRevenueAdultTickets, 
						grossRevenueKidTickets, netRevenueKidTickets, 
						totalGrossRevenue, totalNetRevenue), 
						"Ticket Sales", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	/**
	 * The calcGrossRevenue() method calculates the gross revenue for ticket sales.
	 * @param numTickets
	 * @param pricePerTicket
	 * @return The gross revenue of ticket sales. 
	 */
	public double calcGrossRevenue(int numTickets, double pricePerTicket)
	{
		// Variables:
		double totalGrossRevenue;
		
		// Calculate the gross revenue:
		totalGrossRevenue = numTickets * pricePerTicket;
		
		return totalGrossRevenue;
	}
	
	/**
	 * The calcNetRevenue() method calculates the net revenue of ticket sales.
	 * @param grossRevenue
	 * @return The net revenue of ticket sales.
	 */
	public double calcNetRevenue(double grossRevenue)
	{
		// Constants:
		final double THEATER_KEEP_PERCENT = .20;
		
		// Variables:
		double netRevenue = 0;
		
		// Calculate the net revenue:
		netRevenue += grossRevenue * THEATER_KEEP_PERCENT;
		
		return netRevenue;
	}
	
	/**
	 * The calculateTotalGross() method calculates the total gross ticket sales.
	 * @param grossRevenueAdultTickets
	 * @param grossRevenueKidTickets
	 * @return The total gross ticket sales.
	 */
	public double calculateTotalGross(double grossRevenueAdultTickets, double grossRevenueKidTickets)
	{
		return grossRevenueAdultTickets + grossRevenueKidTickets;
	}
	
	/**
	 * The calculateTotalNet() method calculates the total net ticket sales.
	 * @param netRevenueAdultTickets
	 * @param netRevenueKidTickets
	 * @return The total net ticket sales.
	 */ 
	public double calculateTotalNet(double netRevenueAdultTickets, double netRevenueKidTickets)
	{
		return netRevenueAdultTickets + netRevenueKidTickets;
	}
	
	
	
	/**
	 * The main method creates an instance of the
	 * MonthlySalesTax class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new TheaterRevenue();
	}

}
