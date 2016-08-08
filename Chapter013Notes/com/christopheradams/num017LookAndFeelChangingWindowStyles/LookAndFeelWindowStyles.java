package com.christopheradams.num017LookAndFeelChangingWindowStyles;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

/**
	This class displays a window with a	slider component.
	The user	can convert	the Celsius	temperatures from
	0 through 100 to Fahrenheit by moving the	slider.
*/

public class LookAndFeelWindowStyles	extends JFrame
{
	private JLabel	label1, label2;	  // Message labels
	private JTextField fahrenheitTemp; // Fahrenheit temp
	private JTextField celsiusTemp; // Celsius temp
	private JPanel	fpanel;			  // Fahrenheit panel
	private JPanel	cpanel;			  // Celsius panel
	private JPanel	sliderPanel;	  // Slider	panel
	private JSlider slider;			  // Temperature adjuster
	

	/**
		Constructor
	*/

	public LookAndFeelWindowStyles()
	{
		/***** Changing the Look and Feel of window Styles *****/
		try
		{
			// Change UIMangager.setLookAnd... like this to change Look and feel:
			// ("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			// ("javax.swing.plaf.metal.MetalLookAndFeel");
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Error setting " + "the look and feel");
			
			System.exit(0);
		}

		//	Set the title.
		setTitle("Temperatures");

		//	Specify an action	for the close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//	Create the message labels.
		label1 =	new JLabel("Fahrenheit: ");
		label2 =	new JLabel("Celsius: ");

		//	Create the read-only	text fields.
		fahrenheitTemp	= new	JTextField("32.0", 10);
		fahrenheitTemp.setEditable(false);
		celsiusTemp	= new	JTextField("0.0",	10);
		celsiusTemp.setEditable(false);

		/*****	Create the slider. *****/
		// Format: (int orientation, int minValue, int maxValue, int initialValue)
		slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		
		// The tickets are the marks between numbers:
		slider.setMajorTickSpacing(20); // Major tick every 20
		slider.setMinorTickSpacing(5);  // Minor tick every 5
		slider.setPaintTicks(true);	  	// Display tick marks
		slider.setPaintLabels(true);	// Display numbers
		
		// This is used for responding to the event of moving the slider:
		slider.addChangeListener(new SliderListener());

		//	Create panels and	place	the components	in	them.
		fpanel =	new JPanel();
		fpanel.add(label1);
		fpanel.add(fahrenheitTemp);
		cpanel =	new JPanel();
		cpanel.add(label2);
		cpanel.add(celsiusTemp);
		sliderPanel	= new	JPanel();
		sliderPanel.add(slider);

		//	Create a	GridLayout manager.
		setLayout(new GridLayout(3, 1));

		//	Add the panels	to	the content	pane.
		add(fpanel);
		add(cpanel);
		add(sliderPanel);

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
			double fahrenheit, celsius;

			/*****	Get the slider	value. *****/
			celsius = slider.getValue();

			//	Convert the	value	to	Fahrenheit.
			fahrenheit = (9.0	/ 5.0) *	celsius + 32.0;

			//	Store	the celsius	temp in its	display field.
			celsiusTemp.setText(Double.toString(celsius));

			//	Store	the Fahrenheit	temp in its	display field.
			fahrenheitTemp.setText(String.format("%.1f",	fahrenheit));
		}
	}

	/*
		The main	method creates	an	instance	of	the
		class, which displays a	window with	a slider.
	*/

	public static void main(String[]	args)
	{
		new LookAndFeelWindowStyles();
	}
}