package com.christopheradams.num010CardDealer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;				// For generating random numbers.

public class CardDealer extends JFrame
{
	// Create reference to window components:
	// Panels:
	private JPanel cardsPanel;
	private JPanel dealCardPanel;
	
	// Labels:
	// For displaying the card on the button:
	private JLabel card1Label;
	private JLabel card2Label;
	
	// Buttons:
	private JButton dealCardsButton;
	
	// Image Icon references:
	private ImageIcon cardImage1;
	private ImageIcon cardImage2;
	private ImageIcon cardImage3;
	private ImageIcon cardImage4;
	private ImageIcon cardImage5;
	private ImageIcon cardImage6;
	private ImageIcon cardImage7;
	private ImageIcon cardImage8;
	private ImageIcon cardImage9;
	private ImageIcon cardImage10;
	private ImageIcon cardImage11;
	private ImageIcon cardImage12;
	private ImageIcon cardImage13;
	private ImageIcon cardImage14;
	private ImageIcon cardImage15;
	private ImageIcon cardImage16;
	private ImageIcon cardImage17;
	private ImageIcon cardImage18;
	private ImageIcon cardImage19;
	private ImageIcon cardImage20;
	private ImageIcon cardImage21;
	private ImageIcon cardImage22;
	private ImageIcon cardImage23;
	private ImageIcon cardImage24;
	private ImageIcon cardImage25;
	private ImageIcon cardImage26;
	private ImageIcon cardImage27;
	private ImageIcon cardImage28;
	private ImageIcon cardImage29;
	private ImageIcon cardImage30;
	private ImageIcon cardImage31;
	private ImageIcon cardImage32;
	private ImageIcon cardImage33;
	private ImageIcon cardImage34;
	private ImageIcon cardImage36;
	private ImageIcon cardImage37;
	private ImageIcon cardImage38;
	private ImageIcon cardImage39;
	private ImageIcon cardImage40;
	private ImageIcon cardImage41;
	private ImageIcon cardImage42;
	private ImageIcon cardImage43;
	private ImageIcon cardImage44;
	private ImageIcon cardImage45;
	private ImageIcon cardImage46;
	private ImageIcon cardImage47;
	private ImageIcon cardImage48;
	private ImageIcon cardImage49;
	private ImageIcon cardImage50;
	private ImageIcon cardImage51;
	private ImageIcon cardImage52;
	
	private ImageIcon cardImageBlueBack;
	private ImageIcon cardImageRedBack;
	private ImageIcon cardJoker1;
	private ImageIcon cardJoker2;
	
	
	
	// For the Windows size:
	private final int WINDOW_WIDTH = 400; 	 // Window width
	private final int WINDOW_HEIGHT = 350;	 // Window height
	
	// Random Number reference:
	private Random randomNumber;
	
	// Variables:
	private int card1Num;					// For holding a random card number.
	
	// True if the card has already been drawn.
	private boolean card1Drawn, card2Drawn, card3Drawn, card4Drawn, card5Drawn, card6Drawn;		
	
	private int cardCounter = 0;
	
	// Constants:
	private final int NUMBER_IN_DECK = 6;
	
	
	
	
	
	/**
	 * Constructor
	 */
	public CardDealer()
	{
		// Set the window title:
		setTitle("Card Dealer");
		
		// Sets the size of the window:
		setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
		
		// Specify an action for the close button.
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
		// Create a BorderLayout manager.
		setLayout(new BorderLayout());
		
		// Build the panels:
		buildCardPanel();
		buildDealCardsButtonPanel();
		
		// Add the components to the content pane:
		add(cardsPanel, BorderLayout.CENTER);
		add(dealCardPanel, BorderLayout.SOUTH);
		
		// Pack the contents of the window and display it.
		pack();
		setVisible(true);
	}
	
	public void buildCardPanel()
	{
		// Create panels:
		cardsPanel = new JPanel();
		
		// Create the Labels:
		card1Label = new JLabel();
		card2Label = new JLabel();
		
		// Add components to the panel:
		cardsPanel.add(card1Label);
		cardsPanel.add(card2Label);
		
		// Create a new image Icon objects:
		cardImage1 = new ImageIcon("src/Cards/2_Clubs.jpg");
		cardImage2 = new ImageIcon("src/Cards/2_Diamonds.jpg");
		cardImage3 = new ImageIcon("src/Cards/2_Hearts.jpg");
		cardImage4 = new ImageIcon("src/Cards/2_Spades.jpg");
		cardImage5 = new ImageIcon("src/Cards/3_Clubs.jpg");
		cardImage6 = new ImageIcon("src/Cards/3_Diamonds.jpg");
		cardImageRedBack = new ImageIcon("src/Cards/Backface_Red.jpg");
		
		// Set image to be just the Red card to represent the deck:
		card1Label.setIcon(cardImageRedBack);
		
		// Set the image of a random card to start:
		// Call method to generate random number for card value:
		card1Num = genRandomNum();
		
		// Call method to display card image based on random num generated:
		changeImage(card1Num);
	}
	
	public void buildDealCardsButtonPanel()
	{
		// Create panels:
		dealCardPanel = new JPanel();
		
		// Create buttons:
		dealCardsButton = new JButton("Deal a card");
		
		// Create and action listener to listen for button click:
		dealCardsButton.addActionListener(new ButtonListener());
		
		// Add components to the panel:
		dealCardPanel.add(dealCardsButton);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Call method to generate random number for card value:
			card1Num = genRandomNum();
			
			// Call method to display card image based on random num generated:
			changeImage(card1Num);
			
			
		}
	}
	
	public int genRandomNum()
	{
		int randomCardNumber;
		
		randomNumber = new Random();
		
		randomCardNumber = randomNumber.nextInt(6) + 1;
		
		return randomCardNumber;
	}
	
	public void changeImage(int cardNumber)
	{
		int newCard; 
		
		if(cardCounter <= NUMBER_IN_DECK)
		{
			// Switch based on the random number generated:
			// Display appropriate Die image based on the number.
			switch(cardNumber)
			{
			case 1:
				if(!card1Drawn)
				{
					card2Label.setIcon(cardImage1);
					card1Drawn = true;
					cardCounter++;
					break;
				}
				else
				{
					newCard = genRandomNum();
					changeImage(newCard);
					break;
				}
			case 2:
				if(!card2Drawn)
				{
					card2Label.setIcon(cardImage2);
					card2Drawn = true;
					cardCounter++;
					break;
				}
				else
				{
					newCard = genRandomNum();
					changeImage(newCard);
					break;
				}
			case 3:
				if(!card3Drawn)
				{
					card2Label.setIcon(cardImage3);
					card3Drawn = true;
					cardCounter++;
					break;
				}
				else
				{
					newCard = genRandomNum();
					changeImage(newCard);
					break;
				}
			case 4:
				if(!card4Drawn)
				{
					card2Label.setIcon(cardImage4);
					card4Drawn = true;
					cardCounter++;
					break;
				}
				else
				{
					newCard = genRandomNum();
					changeImage(newCard);
					break;
				}
			case 5:
				if(!card5Drawn)
				{
					card2Label.setIcon(cardImage5);
					card5Drawn = true;
					cardCounter++;
					break;
				}
				else
				{
					newCard = genRandomNum();
					changeImage(newCard);
					break;
				}
			case 6:
				if(!card6Drawn)
				{
					card2Label.setIcon(cardImage6);
					card6Drawn = true;
					cardCounter++;
					break;
				}
				else
				{
					newCard = genRandomNum();
					changeImage(newCard);
					break;
				}
			}
		}
		else
		{
			System.out.println("No more cards are left in the deck.");
		}
	}
	
	public static void main(String[] args)
	{
		new CardDealer();

	}

}
