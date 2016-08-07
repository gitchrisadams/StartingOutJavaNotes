package com.christopheradams.num008LatinTranslator;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface

// Extend JFrame in order to use GUI components.
public class LatinTranslator extends JFrame
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

	// Label heading for Latin words and empty string for spacing:
	private JLabel latinWordHeadingLabel;
	private JLabel emptyStringLabel;
	
	// Labels for Latin words:
	private JLabel sinisterLabel;
	private JLabel dexterLabel;
	private JLabel mediumLabel;

	// Buttons:
	private JButton sinisterButton;
	private JButton dexterButton;
	private JButton mediumButton;
	
	// Label to display the English translation:
	private JLabel englishTranslationLabel;
	
	private final int WINDOW_WIDTH = 500;			// Width of the window.
	private final int WINDOW_HEIGHT = 300;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public LatinTranslator()
	{
		// Set the windows title:
		setTitle("Latin Word Translator");
		
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
	
		// Display the window:
		setVisible(true);
	}
	
	public void buildPanel()
	{
		// Create Label heading for Latin words and empty String for spacing:
		latinWordHeadingLabel = new JLabel("Latin word:");
		emptyStringLabel = new JLabel("");

		// Create label and buttons for the latin words:
		sinisterLabel = new JLabel("sinister");
		dexterLabel = new JLabel("dexter");
		mediumLabel = new JLabel("medium");
		
		// Button to translate the words:
		sinisterButton = new JButton("Translate!");
		dexterButton = new JButton("Translate!");
		mediumButton = new JButton("Translate!");
		
		// Label to display the result in:
		englishTranslationLabel = new JLabel("English Translation Appears here...");
		
		// Add an action listener to each button:
		sinisterButton.addActionListener(new TranslateButtonListener());
		dexterButton.addActionListener(new TranslateButtonListener());
		mediumButton.addActionListener(new TranslateButtonListener());
		
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

		// Add components to the panel:
		panel1.add(latinWordHeadingLabel);
		panel2.add(emptyStringLabel);
		
		panel3.add(sinisterLabel);
		panel4.add(sinisterButton);
		
		panel5.add(dexterLabel);
		panel6.add(dexterButton);
		
		panel7.add(mediumLabel);
		panel8.add(mediumButton);
		
		panel9.add(englishTranslationLabel);
		
	}
	
	/** 
	 * CalcButtonListener is an action listener class for the Calculate button.
	 */
	private class TranslateButtonListener implements ActionListener
	{
		/**
		 * The actionPerformed method is required and executes
		 * when the user clicks the calculate button.
		 * @param e The event object.
		 */
		public void actionPerformed(ActionEvent e)
		{
			// Variables:
			String englishWord = "";
			
			// Determine which button was clicked:
			if(e.getSource() == sinisterButton)
			{
				englishWord = translate("sinister");
			}
			else if(e.getSource() == dexterButton)
			{
				englishWord = translate("dexter");
			}
			else if(e.getSource() == mediumButton)
			{
				englishWord = translate("medium");
			}
			
			englishTranslationLabel.setText(englishWord);
		}
	}
	
	/**
	 * The translate() method translates a Latin word to English.
	 * @param latinWord
	 * @return The word translated to English.
	 */
	public String translate(String latinWord)
	{
		// Variables:
		String englishWord = "";
		
		// Translate the Latin word to the English equivalent:
		if(latinWord.equals("sinister"))
		{
			englishWord = "left";
		}
		
		else if(latinWord.equals("dexter"))
		{
			englishWord = "right";
		}

		else if(latinWord.equals("medium"))
		{
			englishWord = "center";
		}
		
		return englishWord;
	}
	
	
	/**
	 * The main method creates an instance of the
	 * MonthlySalesTax class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new LatinTranslator();
	}

}
