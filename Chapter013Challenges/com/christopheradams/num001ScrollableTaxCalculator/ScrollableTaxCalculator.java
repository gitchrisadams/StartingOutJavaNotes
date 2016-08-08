package com.christopheradams.num001ScrollableTaxCalculator;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ScrollableTaxCalculator	extends JFrame
{
	/***** Create component references: *****/
	// Labels:
	private JLabel	enterPurchaseLabel;					// Purchase price label.
	private JLabel taxRateLabel;						// Tax rate label.
	private JLabel sliderLabel;							// Slider label.
	private JLabel salesTaxLabel;						// Label for sales tax text field.
	
	// Text fields:
	private JTextField enterPurchasePriceTextField; 	// Purchase price text field.
	private JTextField taxRateTextField; 				// Tax rate text field.
	private JTextField salesTaxTextField;				// Text field for displaying sales tax.
	
	// Panels:
	private JPanel	purchasePanel;			  			// Purchase price panel.
	private JPanel	taxPanel;			  				// Tax rate panel.
	private JPanel sliderLabelPanel;					// Panel for slider label.
	private JPanel	sliderPanel;	  					// Slider	panel
	private JPanel displayPanel;						// Panel to display results.
	
	// Slider:
	private JSlider slider;			  					// Slider for adjusting tax rate.

	/**
		Constructor
	*/

	public ScrollableTaxCalculator()
	{
		//	Set the title.
		setTitle("Scrollable Tax Calculator");

		//	Specify an action for the close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//	Create the labels.
		enterPurchaseLabel =	new JLabel("Enter purchase price: ");
		taxRateLabel =	new JLabel("Tax Rate: ");
		sliderLabel = new JLabel("Adjust slider for Tax rate percentage:");

		//	Create the text field to get the purchase price.
		enterPurchasePriceTextField	= new JTextField(10);
		
		// Create a label and uneditable text field for displaying sales tax info:
		salesTaxLabel = new JLabel("Sales Tax:");
		salesTaxTextField = new JTextField(10);
		salesTaxTextField.setEditable(false);

		// Uneditable text field for displaying the tax rate:
		taxRateTextField	= new	JTextField("0.0",	10);
		taxRateTextField.setEditable(false);

		/*****	Create the slider. *****/
		// Format: (int orientation, int minValue, int maxValue, int initialValue)
		slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		
		// The tickets are the marks between numbers:
		slider.setMajorTickSpacing(2); // Major tick every 2
		slider.setMinorTickSpacing(1);  // Minor tick every 1
		slider.setPaintTicks(true);	  	// Display tick marks
		slider.setPaintLabels(true);	// Display numbers
		
		// This is used for responding to the event of moving the slider:
		slider.addChangeListener(new SliderListener());

		//	Create panels and place the components in them.
		purchasePanel =	new JPanel();
		purchasePanel.add(enterPurchaseLabel);
		purchasePanel.add(enterPurchasePriceTextField);
		
		/***** Create panels and add components to them *****/
		taxPanel =	new JPanel();
		taxPanel.add(taxRateLabel);
		taxPanel.add(taxRateTextField);
		
		sliderLabelPanel = new JPanel();
		sliderLabelPanel.add(sliderLabel);
		
		sliderPanel	= new	JPanel();
		sliderPanel.add(slider);
		
		displayPanel = new JPanel();
		displayPanel.add(salesTaxLabel);
		displayPanel.add(salesTaxTextField);

		//	Create a GridLayout manager.
		setLayout(new GridLayout(5, 1));

		//	Add the panels	to	the content	pane.
		add(purchasePanel);
		add(taxPanel);
		add(sliderLabelPanel);
		add(sliderPanel);
		add(displayPanel);
		
		//	Pack and	display the	frame.
		pack();
		setVisible(true);
	}

	/**
		Private inner class to handle	the change events
		that are	generated when	the slider is moved.
	*/

	private class SliderListener implements ChangeListener
	{
		public void	stateChanged(ChangeEvent e)
		{
			// Variables:
			String input;				// For getting raw input from the user as a String:
			double purchasePrice;		// Purchase price of an item.
			double taxRate;				// The tax rate of an item.
			double salesTax;			// The purchase price times the tax rate.

			/*****	Get the slider	value. *****/
			taxRate = slider.getValue();
			
			// Get text from the text field and convert from String to Double:
			input = enterPurchasePriceTextField.getText();
			purchasePrice = Double.parseDouble(input);
			
			// Calculate the sales tax:
			salesTax = purchasePrice * taxRate / 100;
			
			// Display results:
			taxRateTextField.setText(String.format("%,.0f%%", taxRate));
			salesTaxTextField.setText(String.format("$%,.2f", salesTax));
		}
	}

	/*
		The main	method creates	an	instance	of	the
		class, which displays a	window with	a slider.
	*/

	public static void main(String[]	args)
	{
		new ScrollableTaxCalculator();
	}
}