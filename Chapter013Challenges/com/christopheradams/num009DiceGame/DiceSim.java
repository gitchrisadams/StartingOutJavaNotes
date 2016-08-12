package com.christopheradams.num009DiceGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;				// For generating random numbers.

public class DiceSim extends JFrame
{
	// Create reference to window components:
	// Panels:
	private JPanel dicePanel;
	private JPanel rollDicePanel;
	
	// Labels:
	// For displaying the dice on the button:
	private JLabel dice1Label;
	private JLabel dice2Label;
	
	// Buttons:
	private JButton rollDiceButton;
	
	// Image Icons:
	ImageIcon diceImage1;
	ImageIcon diceImage2;
	ImageIcon diceImage3;
	ImageIcon diceImage4;
	ImageIcon diceImage5;
	ImageIcon diceImage6;
	
	// For the Windows size:
	private final int WINDOW_WIDTH = 300; 	 // Window width
	private final int WINDOW_HEIGHT = 200;	 // Window height
	
	// Random Number reference:
	private Random randomNumber;
	
	// Variables:
	private int die1Num;					// For holding a random dice number.
	private int die2Num;					// For holding a random dice number.
	
	/**
	 * Constructor
	 */
	public DiceSim()
	{
		// Set the window title:
		setTitle("Dice Simulator");
		
		// Sets the size of the window:
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		
		// Specify an action for the close button.
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		// Create a BorderLayout manager.
		setLayout(new BorderLayout());
		
		// Build the panels:
		buildDicePanel();
		buildRollDiceButtonPanel();
		
		// Add the components to the content pane:
		add(dicePanel, BorderLayout.CENTER);
		add(rollDicePanel, BorderLayout.SOUTH);
		
		// Pack the contents of the window and display it.
		pack();
		setVisible(true);
	}
	
	public void buildDicePanel()
	{
		// Create panels:
		dicePanel = new JPanel();
		
		// Create the Labels:
		dice1Label = new JLabel();
		dice2Label = new JLabel();
		
		// Add components to the panel:
		dicePanel.add(dice1Label);
		dicePanel.add(dice2Label);
		
		// Create a new image Icon objects:
		diceImage1 = new ImageIcon("src/Die1.png");
		diceImage2 = new ImageIcon("src/Die2.png");
		diceImage3 = new ImageIcon("src/Die3.png");
		diceImage4 = new ImageIcon("src/Die4.png");
		diceImage5 = new ImageIcon("src/Die5.png");
		diceImage6 = new ImageIcon("src/Die6.png");
		
		/***** Set the initial values of the dice. *****/
		// Call method to generate two new random numbers for dice values:
		genRandomNum();
		
		// Call method to display dice image based on random num generated:
		changeImage();
		/***** End Set initial values of the dice *****/
	}
	
	public void buildRollDiceButtonPanel()
	{
		// Create panels:
		rollDicePanel = new JPanel();
		
		// Create buttons:
		rollDiceButton = new JButton("Roll the Dice");
		
		// Create and action listener to listen for button click:
		rollDiceButton.addActionListener(new ButtonListener());
		
		// Add components to the panel:
		rollDicePanel.add(rollDiceButton);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Call method to generate two new random numbers for dice values:
			genRandomNum();
			
			// Call method to display dice image based on random num generated:
			changeImage();
			
			
		}
	}
	
	public void genRandomNum()
	{
		randomNumber = new Random();
		
		die1Num = randomNumber.nextInt(6) + 1;
		die2Num = randomNumber.nextInt(6) + 1;
	}
	
	public void changeImage()
	{
		// Switch based on the random number generated:
		// Display appropriate Die image based on the number.
		switch(die1Num)
		{
		case 1:
			dice1Label.setIcon(diceImage1);
			break;
		case 2:
			dice1Label.setIcon(diceImage2);
			break;
		case 3:
			dice1Label.setIcon(diceImage3);
			break;
		case 4:
			dice1Label.setIcon(diceImage4);
			break;
		case 5:
			dice1Label.setIcon(diceImage5);
			break;
		case 6:
			dice1Label.setIcon(diceImage6);
			break;
		}
		
		switch(die2Num)
		{
		case 1:
			dice2Label.setIcon(diceImage1);
			break;
		case 2:
			dice2Label.setIcon(diceImage2);
			break;
		case 3:
			dice2Label.setIcon(diceImage3);
			break;
		case 4:
			dice2Label.setIcon(diceImage4);
			break;
		case 5:
			dice2Label.setIcon(diceImage5);
			break;
		case 6:
			dice2Label.setIcon(diceImage6);
			break;
		}
	}
	
	public static void main(String[] args)
	{
		new DiceSim();

	}

}
