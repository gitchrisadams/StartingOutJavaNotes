package com.christopheradams.num007ShadeDesigner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ShadeDesigner extends JFrame
{
	// Create panel references:
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	
	// Create label references:
	private JLabel optionsLabel;
	private JLabel stylesLabel;
	private JLabel sizeLabel;
	private JLabel colorsLabel;
	private JLabel numShadesLabel;
	private JLabel totalHeadingLabel;
	private JLabel totalDisplayLabel;
	private JLabel baseRateDisplayLabel;
	
	// Create JComboBox references:
	private JComboBox stylesComboBox;
	private JComboBox sizeComboBox;
	private JComboBox colorsComboBox;
	private JComboBox numShadesComboBox;
	
	// Create arrays for the ComboBoxes:
	private String[] stylesArray = {"Regular Shades: add $0", "Folding Shades: add $10", 
			"Roman Shades: add $15"};
	
	private String[] sizesArray = {"25 inches wide: add $0", "27 inches wide: add $2",
			"32 inches wide: add $4", "40 inches wide: add $6"};
	
	private String[] colorsArray = {"Natural: Add $5", "Blue: Add $0", "Teal: add $0", 
			"Red: add $0", "Green: add $0"};
	
	private Integer[] numShadesArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
			15, 16, 17, 18, 19, 20};
	
	// Variables:
	private double stylesTotal = 0;
	private double sizesTotal = 0;
	private double colorsTotal = 0;
	private int numShades = 0;
	
	// To store the number of the index selected in the ComboBox:
	private int stylesSelected = 0;
	private int sizesSelected = 0;
	private int colorsSelected = 0;
	private int numShadesSelected = 0;
	
	// Constants:
	// Prices of shaded related items:
	// Shade Type:
	private final double REG_SHADE = 0;
	private final double FOLD_SHADE = 10;
	private final double ROM_SHADE = 15;
	
	// Sizes:
	private final double WIDE_25 = 0;
	private final double WIDE_27 = 2;
	private final double WIDE_32 = 4;
	private final double WIDE_40 = 6;
	
	// Colors:
	private final double NATURAL = 5;
	private final double BLUE = 0;
	private final double TEAL = 0;
	private final double RED = 0;
	private final double GREEN = 0;
	
	// Price per normal shade:
	private final double BASE_RATE_PER_SHADE = 50;
	
    // For window size:
    private final int WINDOW_WIDTH = 500;   // Window width
    private final int WINDOW_HEIGHT = 500;  // Window height
	
	/**
	 * Constructor
	 */
	public ShadeDesigner()
	{
		// Set the window title:
		setTitle("Shade Designer");
		
		// Set the Layout:
		setLayout(new GridLayout(7, 0));
		
		// Sets the size of the window:
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		
		// Specify an action for the close button.
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    // call methods to build the panels:
	    buildPanel1();
	    buildPanel2();
	    buildPanel3();
	    buildPanel4();
	    buildPanel5();
	    buildPanel6();
	    
	    // Add panels to the content pane:
	    add(panel1);
	    add(panel2);
	    add(panel3);
	    add(panel4);
	    add(panel5);
	    add(panel6);
	    
	    // Call method that calculates the total:
	    totalDisplayLabel.setText(String.format("$%,.2f", calcTotal()));

		// Pack and display the window.
		pack();
		setVisible(true);
	}
	
	public void buildPanel1()
	{
		// Create the new panel object:
		panel1 = new JPanel();
		
		// Create a new label objects:
		optionsLabel = new JLabel("Choose your options:");
		
		// Set font of the options label to make it larger:
		optionsLabel.setFont(new Font("Serif", Font.BOLD, 20));
		
		// Add to the panel:
		panel1.add(optionsLabel);
	}
	
	public void buildPanel2()
	{
		// Create the new panel object:
		panel2 = new JPanel();
		
		// Create a new label object:
		stylesLabel = new JLabel("Styles:");

		// Create new ComboBox object passing in the array:
		stylesComboBox = new JComboBox(stylesArray);
		
		// Create a click listener to listen for change in ComboBox Selection:
		stylesComboBox.addActionListener(new StylesListener());
		
		// Add to the panel:
		panel2.add(stylesLabel);
		panel2.add(stylesComboBox);
		
	}
	
	public void buildPanel3()
	{
		// Create the new panel object:
		panel3 = new JPanel();
		
		// Create a new label object:
		sizeLabel = new JLabel("Sizes:");

		// Create new ComboBox object passing in the array:
		sizeComboBox = new JComboBox(sizesArray);
		
		// Create a click listener to listen for change in ComboBox Selection:
		sizeComboBox.addActionListener(new SizesListener());
		
		// Add to the panel:
		panel3.add(sizeLabel);
		panel3.add(sizeComboBox);
		
	}
	
	public void buildPanel4()
	{
		// Create the new panel object:
		panel4 = new JPanel();
		
		// Create a new label object:
		colorsLabel = new JLabel("Colors:");

		// Create new ComboBox object passing in the array:
		colorsComboBox = new JComboBox(colorsArray);
		
		// Create a click listener to listen for change in ComboBox Selection:
		colorsComboBox.addActionListener(new ColorsListener());
		
		// Add to the panel:
		panel4.add(colorsLabel);
		panel4.add(colorsComboBox);
		
	}
	
	public void buildPanel5()
	{
		// Create the new panel object:
		panel5 = new JPanel();
		
		// Create a new label object:
		numShadesLabel = new JLabel("# of shades:");

		// Create new ComboBox object passing in the array:
		numShadesComboBox = new JComboBox(numShadesArray);
		
		// Create a click listener to listen for change in ComboBox Selection:
		numShadesComboBox.addActionListener(new NumShadesListener());
		
		// Add to the panel:
		panel5.add(numShadesLabel);
		panel5.add(numShadesComboBox);
		
	}
	
	public void buildPanel6()
	{
		// Create the new panel object:
		panel6 = new JPanel();
		
		// Create a new label objects:
		totalHeadingLabel = new JLabel("Total: ");
		totalDisplayLabel = new JLabel();
		baseRateDisplayLabel = new JLabel("@ $50/ shade base rate");
		
		// Set the font for totals to make them larger:
		totalHeadingLabel.setFont(new Font("Serif", Font.BOLD, 24));
		totalDisplayLabel.setFont(new Font("Serif", Font.BOLD, 24));
		baseRateDisplayLabel.setFont(new Font("Serif", Font.BOLD, 24));

		// Add to the panel:
		panel6.add(totalHeadingLabel);
		panel6.add(totalDisplayLabel);
		panel6.add(baseRateDisplayLabel);
		
	}
	
	public double calcTotal()
	{
		// Get the selected index of all the ComboBoxes:
		stylesSelected = stylesComboBox.getSelectedIndex();
		sizesSelected = sizeComboBox.getSelectedIndex();
		colorsSelected = colorsComboBox.getSelectedIndex();
		numShadesSelected = numShadesComboBox.getSelectedIndex();
		
		// Switch statement to calculate how much to charge for 
		// the item that is selected:
		switch(stylesSelected)
		{
			case 0:
				stylesTotal = REG_SHADE;
				break;
			case 1:
				stylesTotal = FOLD_SHADE;
				break;
			case 2:
				stylesTotal = ROM_SHADE;
				break;
		}
		
		switch(sizesSelected)
		{
			case 0:
				sizesTotal = WIDE_25;
				break;
			case 1:
				sizesTotal = WIDE_27;
				break;
			case 2:
				sizesTotal = WIDE_32;
				break;
			case 3:
				sizesTotal = WIDE_40;
				break;
		}	
		
		switch(colorsSelected)
		{
			case 0:
				colorsTotal = NATURAL;
				break;
			case 1:
				colorsTotal = BLUE;
				break;
			case 2:
				colorsTotal = TEAL;
				break;
			case 3:
				colorsTotal = RED;
				break;
			case 4:
				colorsTotal = GREEN;
				break;
		}
		
		// The number of shades is the array element plus one since
		// arrays start counting at zero.
		numShades = numShadesSelected + 1;
		
		// Return the number base rate price of one shade plus all the options
		// times the number of shades being purchased:
		return (BASE_RATE_PER_SHADE + stylesTotal + sizesTotal + colorsTotal) * numShades;
	}
	
	/***** Inner classes to deal with ComboBox selection Clicks *****/
	private class StylesListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		    // Call method that calculates the total:
		    totalDisplayLabel.setText(String.format("$%,.2f", calcTotal()));
		}
	}
	
	private class SizesListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		    // Call method that calculates the total:
		    totalDisplayLabel.setText(String.format("$%,.2f", calcTotal()));
		}
	}
	
	private class ColorsListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		    // Call method that calculates the total:
		    totalDisplayLabel.setText(String.format("$%,.2f", calcTotal()));
		}
	}
	
	private class NumShadesListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		    // Call method that calculates the total:
		    totalDisplayLabel.setText(String.format("$%,.2f", calcTotal()));
		}
	}

	public static void main(String[] args)
	{
		new ShadeDesigner();

	}

}
