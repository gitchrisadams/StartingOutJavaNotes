package com.christopheradams.num011TicTacToeSim;

import javax.swing.*; 					// Needed for Swing classes
import java.awt.event.*;
import java.awt.*;    					// Needed for GridLayout class
import java.util.Random;				// For generating random numbers.

public class TicTacToe extends JFrame
{
	// References to Image Icons:
	private ImageIcon oImage;
	private ImageIcon xImage;
	private ImageIcon blankImage;
	
	// References to buttons that will hold the X's and O's:
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	
	// For the size of the window:
	private final int WINDOW_WIDTH = 400;   // Window width
	private final int WINDOW_HEIGHT = 400;  // Window height
	
	// True if it is O's turn or True if it is X's turn:
	private boolean oTurn;
	private boolean xTurn;
	
	// True if O's is the winner or True of X's is the winner:
	private boolean oWinner;
	private boolean xWinner;
	
	// Multi dim array for holding the game board:
	private Integer[][] gameBoardArray = new Integer[3][3];
	
	// Random number reference for determining who's turn it is:
	private Random randomNumber;
	
	/**
	 * Constructor
	 */
	public TicTacToe()
	{
		// Set the title bar text.
		setTitle("Tic Tac Toe");
		
		// Set the size of the window.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Specify an action for the close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add a GridLayout manager to the content pane.
		setLayout(new GridLayout(3, 3));
		
		// Create six buttons:
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		button5 = new JButton();
		button6 = new JButton();
		button7 = new JButton();
		button8 = new JButton();
		button9 = new JButton();
		
		// Create ActionListeners for Buttons to respond to click event:
		button1.addActionListener(new Button1Listener());
		button2.addActionListener(new Button2Listener());
		button3.addActionListener(new Button3Listener());
		button4.addActionListener(new Button4Listener());
		button5.addActionListener(new Button5Listener());
		button6.addActionListener(new Button6Listener());
		button7.addActionListener(new Button7Listener());
		button8.addActionListener(new Button8Listener());
		button9.addActionListener(new Button9Listener());
		
		// Create the image objects for X's, O's, and a blank image to start:
		oImage = (new ImageIcon(getClass().getResource("/lettero.png")));
		xImage = (new ImageIcon(getClass().getResource("/letterx.png")));
		blankImage = (new ImageIcon(getClass().getResource("/blank.png")));
		
		/***** Random number 1 to 2 to determine who's turn to start *****/
		int randomNumOneOrTwo;
		randomNumber = new Random();
		randomNumOneOrTwo = randomNumber.nextInt(2) + 1;
		
		// If statement to determine if X's or O's start first:
		if(randomNumOneOrTwo == 1)
		{
			oTurn = true;
		}
		else
		{
			xTurn = true;
		}
		
		// Initialize/fill the array with arbitrary number 2 to start;
		for(int row = 0; row < gameBoardArray.length; row++)
		{
			for(int col = 0; col < gameBoardArray[0].length; col++)
			{
				gameBoardArray[row][col] = 2;
			}
		}

		// Set button to a blank image and get rid of button borders:
		button1.setIcon(blankImage);
		button2.setIcon(blankImage);
		button3.setIcon(blankImage);
		button4.setIcon(blankImage);
		button5.setIcon(blankImage);
		button6.setIcon(blankImage);
		button7.setIcon(blankImage);
		button8.setIcon(blankImage);
		button9.setIcon(blankImage);
		
		// Set the button to look more like a label:
		button1.setBorderPainted(false);
		button2.setBorderPainted(false);
		button3.setBorderPainted(false);
		button4.setBorderPainted(false);
		button5.setBorderPainted(false);
		button6.setBorderPainted(false);
		button7.setBorderPainted(false);
		button8.setBorderPainted(false);
		button9.setBorderPainted(false);
		
		// Set the border to null to again, look more like a label:
		button1.setBorder(null);
		button2.setBorder(null);
		button3.setBorder(null);
		button4.setBorder(null);
		button5.setBorder(null);
		button6.setBorder(null);
		button7.setBorder(null);
		button8.setBorder(null);
		button9.setBorder(null);
		
		// Create six panels.
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		
		// Add the labels to the panels.
		panel1.add(button1);
		panel2.add(button2);
		panel3.add(button3);
		panel4.add(button4);
		panel5.add(button5);
		panel6.add(button6);
		panel7.add(button7);
		panel8.add(button8);
		panel9.add(button9);

		// Add the panels to the content pane.
		add(panel1);  
		add(panel2);  
		add(panel3); 
		add(panel4);  
		add(panel5);  
		add(panel6); 
		add(panel7); 
		add(panel8); 
		add(panel9); 

		// Display the window.
		pack();
		setVisible(true);
	}
	
	/***** Listeners for responding to the selecting a Square for an X or an O *****/
	
	private class Button1Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// If the current Icon is blank and it is O's turn then:
			if(button1.getIcon().equals(blankImage) && oTurn)
			{
				// Set the button Icon to the O image and swap whose turn it is:
				button1.setIcon(oImage);
				xTurn = true;
				oTurn = false;
				
				// Store a 0 for O's in the gameboard Array:
				gameBoardArray[0][0] = 0;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
			// Else if Icon image is blank and it is X's turn then: 
			else if(button1.getIcon().equals(blankImage) && xTurn)
			{
				// Set the button Icon to the X image and swap whose turn it is:
				button1.setIcon(xImage);
				xTurn = false;
				oTurn = true;
				
				// Store a 1 for X's in the gameboard Array:
				gameBoardArray[0][0] = 1;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
		}
	}
	
	// See first button above for explanation of this code:
	private class Button2Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(button2.getIcon().equals(blankImage) && oTurn)
			{
				button2.setIcon(oImage);
				xTurn = true;
				oTurn = false;
				
				// Store a 0 for O's in the gameboard Array:
				gameBoardArray[0][1] = 0;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
			else if(button2.getIcon().equals(blankImage) && xTurn)
			{
				button2.setIcon(xImage);
				xTurn = false;
				oTurn = true;
				
				// Store a 1 for X's in the gameboard Array:
				gameBoardArray[0][1] = 1;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
		}
	}
	
	// See first button above for explanation of this code:
	private class Button3Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(button3.getIcon().equals(blankImage) && oTurn)
			{
				button3.setIcon(oImage);
				xTurn = true;
				oTurn = false;
				
				// Store a 0 for O's in the gameboard Array:
				gameBoardArray[0][2] = 0;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
			else if(button3.getIcon().equals(blankImage) && xTurn)
			{
				button3.setIcon(xImage);
				xTurn = false;
				oTurn = true;
				
				// Store a 1 for X's in the gameboard Array:
				gameBoardArray[0][2] = 1;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
			
			
		}
	}
	
	// See first button above for explanation of this code:
	private class Button4Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(button4.getIcon().equals(blankImage) && oTurn)
			{
				button4.setIcon(oImage);
				xTurn = true;
				oTurn = false;
				
				// Store a 0 for O's in the gameboard Array:
				gameBoardArray[1][0] = 0;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
			else if(button4.getIcon().equals(blankImage) && xTurn)
			{
				button4.setIcon(xImage);
				xTurn = false;
				oTurn = true;
				
				// Store a 1 for X's in the gameboard Array:
				gameBoardArray[1][0] = 1;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
		}
	}
	
	// See first button above for explanation of this code:
	private class Button5Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(button5.getIcon().equals(blankImage) && oTurn)
			{
				button5.setIcon(oImage);
				xTurn = true;
				oTurn = false;
				
				// Store a 0 for O's in the gameboard Array:
				gameBoardArray[1][1] = 0;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
			else if(button5.getIcon().equals(blankImage) && xTurn)
			{
				button5.setIcon(xImage);
				xTurn = false;
				oTurn = true;
				
				// Store a 1 for X's in the gameboard Array:
				gameBoardArray[1][1] = 1;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
		}
	}
	
	// See first button above for explanation of this code:
	private class Button6Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(button6.getIcon().equals(blankImage) && oTurn)
			{
				button6.setIcon(oImage);
				xTurn = true;
				oTurn = false;
				
				// Store a 0 for O's in the gameboard Array:
				gameBoardArray[1][2] = 0;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
			else if(button6.getIcon().equals(blankImage) && xTurn)
			{
				button6.setIcon(xImage);
				xTurn = false;
				oTurn = true;
				
				// Store a 1 for X's in the gameboard Array:
				gameBoardArray[1][2] = 1;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
		}
	}
	
	// See first button above for explanation of this code:
	private class Button7Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(button7.getIcon().equals(blankImage) && oTurn)
			{
				button7.setIcon(oImage);
				xTurn = true;
				oTurn = false;
				
				// Store a 0 for O's in the gameboard Array:
				gameBoardArray[2][0] = 0;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
			else if(button7.getIcon().equals(blankImage) && xTurn)
			{
				button7.setIcon(xImage);
				xTurn = false;
				oTurn = true;
				
				// Store a 1 for X's in the gameboard Array:
				gameBoardArray[2][0] = 1;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
		}
	}
	
	// See first button above for explanation of this code:
	private class Button8Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(button8.getIcon().equals(blankImage) && oTurn)
			{
				button8.setIcon(oImage);
				xTurn = true;
				oTurn = false;
				
				// Store a 0 for O's in the gameboard Array:
				gameBoardArray[2][1] = 0;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
			else if(button8.getIcon().equals(blankImage) && xTurn)
			{
				button8.setIcon(xImage);
				xTurn = false;
				oTurn = true;
				
				// Store a 1 for X's in the gameboard Array:
				gameBoardArray[2][1] = 1;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
		}
	}
	
	// See first button above for explanation of this code:
	private class Button9Listener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(button9.getIcon().equals(blankImage) && oTurn)
			{
				button9.setIcon(oImage);
				xTurn = true;
				oTurn = false;
				
				// Store a 0 for O's in the gameboard Array:
				gameBoardArray[2][2] = 0;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
			else if(button9.getIcon().equals(blankImage) && xTurn)
			{
				button9.setIcon(xImage);
				xTurn = false;
				oTurn = true;
				
				// Store a 1 for X's in the gameboard Array:
				gameBoardArray[2][2] = 1;
				
				// Call method to determine if there is a winner:
				determineWinner();
			}
		}
	}
	
	/**
	 * The determineWinner() method determines whether X's has won or
	 * if O's has won. 
	 */
	public void determineWinner()
	{
		// Determine if X's won:
		// Across the top row:
		if(gameBoardArray[0][0] == 1 & gameBoardArray[0][1] == 1 & gameBoardArray[0][2] == 1)
			xWinner = true;
		// Across the 2nd row:
		else if(gameBoardArray[1][0] == 1 & gameBoardArray[1][1] == 1 & gameBoardArray[1][2] == 1)
			xWinner = true;
		// Across 3rd row:
		else if(gameBoardArray[2][0] == 1 & gameBoardArray[2][1] == 1 & gameBoardArray[2][2] == 1)
			xWinner = true;
		// Down first row:
		else if(gameBoardArray[0][0] == 1 & gameBoardArray[1][0] == 1 & gameBoardArray[2][0] == 1)
			xWinner = true;
		// Down second row:
		else if(gameBoardArray[0][1] == 1 & gameBoardArray[1][1] == 1 & gameBoardArray[2][1] == 1)
			xWinner = true;
		// Down third row:
		else if(gameBoardArray[0][2] == 1 & gameBoardArray[1][2] == 1 & gameBoardArray[2][2] == 1)
			xWinner = true;
		// Diagonal one:
		else if(gameBoardArray[0][0] == 1 & gameBoardArray[1][1] == 1 & gameBoardArray[2][2] == 1)
			xWinner = true;
		// Diagonal two:
		else if(gameBoardArray[0][2] == 1 & gameBoardArray[1][1] == 1 & gameBoardArray[2][0] == 1)
			xWinner = true;
		
		// Determine if O's won:
		// Across the top row:
		if(gameBoardArray[0][0] == 0 & gameBoardArray[0][1] == 0 & gameBoardArray[0][2] == 0)
			oWinner = true;
		// Across the 2nd row:
		else if(gameBoardArray[1][0] == 0 & gameBoardArray[1][1] == 0 & gameBoardArray[1][2] == 0)
			oWinner = true;
		// Across 3rd row:
		else if(gameBoardArray[2][0] == 0 & gameBoardArray[2][1] == 0 & gameBoardArray[2][2] == 0)
			oWinner = true;
		// Down first row:
		else if(gameBoardArray[0][0] == 0 & gameBoardArray[1][0] == 0 & gameBoardArray[2][0] == 0)
			oWinner = true;
		// Down second row:
		else if(gameBoardArray[0][1] == 0 & gameBoardArray[1][1] == 0 & gameBoardArray[2][1] == 0)
			oWinner = true;
		// Down third row:
		else if(gameBoardArray[0][2] == 0 & gameBoardArray[1][2] == 0 & gameBoardArray[2][2] == 0)
			oWinner = true;
		// Diagonal one:
		else if(gameBoardArray[0][0] == 0 & gameBoardArray[1][1] == 0 & gameBoardArray[2][2] == 0)
			oWinner = true;
		// Diagonal two:
		else if(gameBoardArray[0][2] == 0 & gameBoardArray[1][1] == 0 & gameBoardArray[2][0] == 0)
			oWinner = true;
		
		// Display message and exit game if someone has won:
		if(oWinner)
		{
			JOptionPane.showMessageDialog(null, "O's won! Game over!");
			System.exit(0);
		}
		if(xWinner)
		{
			JOptionPane.showMessageDialog(null, "X's won! Game over!");
			System.exit(0);
		}
		
		
	}

	/**
	 * The main() method creates an instance of the TicTacToe class.
	 * @param args
	 */
	public static void main(String[] args)
	{
		new TicTacToe();

	}

}
