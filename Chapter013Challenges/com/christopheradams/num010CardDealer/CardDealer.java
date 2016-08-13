package com.christopheradams.num010CardDealer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
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
	private ImageIcon cardImage35;
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
	
	// Create an ArrayList for storing cards that were already drawn/used:
	private ArrayList<Integer> cardsUsedArrayList = new ArrayList<>();
	
	
	// Random Number reference:
	private Random randomNumber;
	
	// Variables:
	private int card1Num;					// For holding a random card number.
	
	
	// True if the card has already been drawn.
	private boolean cardUsed;
	
	private int cardCounter = 0;
	
	// Constants:
	private final int NUMBER_IN_DECK = 6;
	
	// For the Windows size:
	private final int WINDOW_WIDTH = 400; 	 // Window width
	private final int WINDOW_HEIGHT = 350;	 // Window height
	
	
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
		cardImage7 = new ImageIcon("src/Cards/3_Hearts.jpg");
		cardImage8 = new ImageIcon("src/Cards/3_Spades.jpg");
		
		cardImage9 = new ImageIcon("src/Cards/4_Clubs.jpg");
		cardImage10 = new ImageIcon("src/Cards/4_Diamonds.jpg");
		cardImage11 = new ImageIcon("src/Cards/4_Hearts.jpg");
		cardImage12 = new ImageIcon("src/Cards/4_Spades.jpg");
		
		cardImage13 = new ImageIcon("src/Cards/5_Clubs.jpg");
		cardImage14 = new ImageIcon("src/Cards/5_Diamonds.jpg");
		cardImage15 = new ImageIcon("src/Cards/5_Hearts.jpg");
		cardImage16 = new ImageIcon("src/Cards/5_Spades.jpg");
		
		cardImage17 = new ImageIcon("src/Cards/6_Clubs.jpg");
		cardImage18 = new ImageIcon("src/Cards/6_Diamonds.jpg");
		cardImage19 = new ImageIcon("src/Cards/6_Clubs.jpg");
		cardImage20 = new ImageIcon("src/Cards/6_Diamonds.jpg");
		
		cardImage21 = new ImageIcon("src/Cards/7_Hearts.jpg");
		cardImage22 = new ImageIcon("src/Cards/7_Spades.jpg");
		cardImage23 = new ImageIcon("src/Cards/7_Clubs.jpg");
		cardImage24 = new ImageIcon("src/Cards/7_Diamonds.jpg");
		
		cardImage25 = new ImageIcon("src/Cards/8_Clubs.jpg");
		cardImage26 = new ImageIcon("src/Cards/8_Diamonds.jpg");
		cardImage27 = new ImageIcon("src/Cards/8_Hearts.jpg");
		cardImage28 = new ImageIcon("src/Cards/8_Spades.jpg");
		
		cardImage29 = new ImageIcon("src/Cards/9_Clubs.jpg");
		cardImage30 = new ImageIcon("src/Cards/9_Diamonds.jpg");
		cardImage31 = new ImageIcon("src/Cards/9_Clubs.jpg");
		cardImage32 = new ImageIcon("src/Cards/9_Diamonds.jpg");
		
		cardImage33 = new ImageIcon("src/Cards/10_Clubs.jpg");
		cardImage34 = new ImageIcon("src/Cards/10_Diamonds.jpg");
		cardImage35 = new ImageIcon("src/Cards/10_Hearts.jpg");
		cardImage36 = new ImageIcon("src/Cards/10_Spades.jpg");
		
		cardImage37 = new ImageIcon("src/Cards/Ace_Clubs.jpg");
		cardImage38 = new ImageIcon("src/Cards/Ace_Diamonds.jpg");
		cardImage39 = new ImageIcon("src/Cards/Ace_Clubs.jpg");
		cardImage40 = new ImageIcon("src/Cards/Ace_Diamonds.jpg");
		
		cardImage41 = new ImageIcon("src/Cards/King_Clubs.jpg");
		cardImage42 = new ImageIcon("src/Cards/King_Diamonds.jpg");
		cardImage43 = new ImageIcon("src/Cards/King_Clubs.jpg");
		cardImage44 = new ImageIcon("src/Cards/King_Diamonds.jpg");
		
		cardImage45 = new ImageIcon("src/Cards/Queen_Hearts.jpg");
		cardImage46 = new ImageIcon("src/Cards/Queen_Spades.jpg");
		cardImage47 = new ImageIcon("src/Cards/Queen_Clubs.jpg");
		cardImage48 = new ImageIcon("src/Cards/Queen_Diamonds.jpg");
		
		cardImage49 = new ImageIcon("src/Cards/Jack_Clubs.jpg");
		cardImage50 = new ImageIcon("src/Cards/Jack_Diamonds.jpg");
		cardImage51 = new ImageIcon("src/Cards/Jack_Clubs.jpg");
		cardImage52 = new ImageIcon("src/Cards/Jack_Diamonds.jpg");
		
		cardImageRedBack = new ImageIcon("src/Cards/Backface_Red.jpg");
		
		// Set image to be just the Red card to represent the deck:
		card1Label.setIcon(cardImageRedBack);
		
		// Set the image of a random card to start:
		// Call method to generate random number for card value:
		card1Num = genRandomNum();
		
		// Call method to display card image based on random num generated:
		drawCard(card1Num);
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
			drawCard(card1Num);
			
			
		}
	}
	
	public int genRandomNum()
	{
		int randomCardNumber;
		
		randomNumber = new Random();
		
		randomCardNumber = randomNumber.nextInt(52) + 1;
		
		return randomCardNumber;
	}
	
	public void drawCard(int randomNum)
	{
		// Set boolean to false to start:
		cardUsed = false;
		
		int newRandNum = randomNum;
		
		for(int i = 0; i < cardsUsedArrayList.size(); i++)
		{
			if(cardsUsedArrayList.get(i) == newRandNum)
			{
				cardUsed = true;
			}
		}
		
		// While the card has already been drawn, generate new random number,
		// and see if this new number has already been drawn.
		while(cardUsed)
		{
			newRandNum = genRandomNum();
			
			for(int i = 0; i < cardsUsedArrayList.size(); i++)
			{
				if(cardsUsedArrayList.get(i) == newRandNum)
				{
					cardUsed = true;
				}
				else
				{
					cardUsed = false;
				}
			}
		}
		
		// Card not drawn yet but we are using it so add to card not used list:
		cardsUsedArrayList.add(newRandNum);
		
		if(cardsUsedArrayList.size() <= 52)
		{
			// Change the image to the new random number:
			changeImage(newRandNum);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "No more cards left in the deck");
		}
		
	}
	
	public void changeImage(int cardNumber)
	{
		System.out.println("The card number is: " + cardNumber);
		
		switch(cardNumber)
		{
		case 1:
			card2Label.setIcon(cardImage1);
			break;
		case 2:
			card2Label.setIcon(cardImage2);
			break;
		case 3:
			card2Label.setIcon(cardImage3);
			break;
		case 4:
			card2Label.setIcon(cardImage4);
			break;
		case 5:
			card2Label.setIcon(cardImage5);
			break;
		case 6:
			card2Label.setIcon(cardImage6);
			break;
		case 7:
			card2Label.setIcon(cardImage7);
			break;
		case 8:
			card2Label.setIcon(cardImage8);
			break;
		case 9:
			card2Label.setIcon(cardImage9);
			break;
		case 10:
			card2Label.setIcon(cardImage10);
			break;
		case 11:
			card2Label.setIcon(cardImage11);
			break;
		case 12:
			card2Label.setIcon(cardImage12);
			break;
		case 13:
			card2Label.setIcon(cardImage13);
			break;
		case 14:
			card2Label.setIcon(cardImage14);
			break;
		case 15:
			card2Label.setIcon(cardImage15);
			break;
		case 16:
			card2Label.setIcon(cardImage16);
			break;
		case 17:
			card2Label.setIcon(cardImage17);
			break;
		case 18:
			card2Label.setIcon(cardImage18);
			break;
		case 19:
			card2Label.setIcon(cardImage19);
			break;
		case 20:
			card2Label.setIcon(cardImage20);
			break;
		case 21:
			card2Label.setIcon(cardImage21);
			break;
		case 22:
			card2Label.setIcon(cardImage22);
			break;
		case 23:
			card2Label.setIcon(cardImage23);
			break;
		case 24:
			card2Label.setIcon(cardImage24);
			break;
		case 25:
			card2Label.setIcon(cardImage25);
			break;
		case 26:
			card2Label.setIcon(cardImage26);
			break;
		case 27:
			card2Label.setIcon(cardImage27);
			break;
		case 28:
			card2Label.setIcon(cardImage28);
			break;
		case 29:
			card2Label.setIcon(cardImage29);
			break;
		case 30:
			card2Label.setIcon(cardImage30);
			break;
		case 31:
			card2Label.setIcon(cardImage31);
			break;
		case 32:
			card2Label.setIcon(cardImage32);
			break;
		case 33:
			card2Label.setIcon(cardImage33);
			break;
		case 34:
			card2Label.setIcon(cardImage34);
			break;
		case 35:
			card2Label.setIcon(cardImage35);
			break;
		case 36:
			card2Label.setIcon(cardImage36);
			break;
		case 37:
			card2Label.setIcon(cardImage37);
			break;
		case 38:
			card2Label.setIcon(cardImage38);
			break;
		case 39:
			card2Label.setIcon(cardImage39);
			break;
		case 40:
			card2Label.setIcon(cardImage40);
			break;
		case 41:
			card2Label.setIcon(cardImage41);
			break;
		case 42:
			card2Label.setIcon(cardImage42);
			break;
		case 43:
			card2Label.setIcon(cardImage43);
			break;
		case 44:
			card2Label.setIcon(cardImage44);
			break;
		case 45:
			card2Label.setIcon(cardImage45);
			break;
		case 46:
			card2Label.setIcon(cardImage46);
			break;
		case 47:
			card2Label.setIcon(cardImage47);
			break;
		case 48:
			card2Label.setIcon(cardImage48);
			break;
		case 49:
			card2Label.setIcon(cardImage49);
			break;
		case 50:
			card2Label.setIcon(cardImage50);
			break;
		case 51:
			card2Label.setIcon(cardImage51);
			break;
		case 52:
			card2Label.setIcon(cardImage52);
			break;
		}

	}
	
	public static void main(String[] args)
	{
		new CardDealer();

	}

}
