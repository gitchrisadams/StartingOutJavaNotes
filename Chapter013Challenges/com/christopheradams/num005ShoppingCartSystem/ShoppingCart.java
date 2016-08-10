package com.christopheradams.num005ShoppingCartSystem;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart extends JFrame
{
	/***** Create references for components: *****/
	// Panels:
	private JPanel booksPanel;
	private JPanel addButtonPanel;
	private JPanel cartPanel;
	
	// Lists:
	private JList booksList;
	private JList cartList;
	
	// Buttons:
	private JButton addButton;
	private JButton removeButton;
	private JButton checkoutButton;

	
	// Scroll Panes:
	private JScrollPane bookScrollPane;
	private JScrollPane cartScrollPane;
	
	// Variables:
	// Totals and sales tax:
	private double subtotal;
	private double salesTax;
	private double total;
	private String rawInput;							// The raw input string from the file.
	private String inputFormatted;						// For storing book name formated with dollar sign.
	private String bookNameOnly;						// For storing the name of the book only, no dollar value.
	private String[] splitArray;						// The raw input split at comma as delimiter.
	private double bookPriceOnly;						// The price of the book as a double value.

	
	// Constants:
	private final double SALES_TAX = .06;				// The sales tax rate.
	
	// ArrayLists:
	private ArrayList<String> bookPricesOnlyStrings;	// For storing book prices as Strings in an array list.
	private ArrayList<String> bookNames;				// Storing the names of the book in ArrayList.
	private ArrayList<Double> bookPrices;				// Storing the prices of the books in an ArrayList.
	private ArrayList<String> emptyStringArrayList;		// Until filled, the string in the list is empty.
	private ArrayList<Double> emptyDoubleArrayList;		// Until filled, the string in the list is empty.
	
	/**
	 * Constructor
	 * @throws FileNotFoundException 
	 */
	public ShoppingCart() throws FileNotFoundException
	{
		/***** Read in the contents of the text file into ArrayLists: *****/
		// Create a new File object to store
		File booksFile = new File("src/BookPrices.txt");
		
		// Be sure the file exists before we read from it:
		if(!booksFile.exists())
		{
			JOptionPane.showMessageDialog(null, "File does not exist, exiting the program.");
			System.exit(0);
		}
		
		// File exists so create a new Scanner:
		Scanner inputFile = new Scanner(booksFile);
		
		// Create the array lists:
		bookNames = new ArrayList<String>();
		bookPrices = new ArrayList<Double>();
		bookPricesOnlyStrings = new ArrayList<String>();
		emptyDoubleArrayList = new ArrayList<Double>();
		
		// Loop through file contents and store in Array Lists:
		while(inputFile.hasNext())
		{
			// Get the next raw input from the file as a String:
			rawInput = inputFile.nextLine();
			
			// Split the array at comma as the delimiter and store it in 
			// an array so we can get just the double from it.
			splitArray = rawInput.split(",");
			
			// Take the part of the rawInput we split that has the double it in it
			// which is at array element 1 and store it as a double.
			bookPriceOnly = Double.parseDouble(splitArray[1]);
			
			// Store the String part before the comma in a String so we have the
			// book name only part of the String.
			bookNameOnly = splitArray[0];
			
			// Format the string so it has a dollar sign:
			inputFormatted = String.format("%-20s $%,.2f", bookNameOnly, bookPriceOnly);
			
			// Add the String and the double to separate array lists:
			bookNames.add(inputFormatted);
			
			// Add the book prices with just the price to the bookPrices ArrayList:
			bookPrices.add(bookPriceOnly);
			
		}
		
		// Done with the Scanner so close it:
		inputFile.close();
		
		// Loop through the arrayList of doubles and convert to String
		// with dollar signs, 2 decimal places, and extra spacing.
		for(int i = 0; i < bookPrices.size(); i++)
		{
			bookPricesOnlyStrings.add(String.format("$%,.2f%-35s", bookPrices.get(i), ""));
		}
		
		/***** Preparing the windows / GUI elements *****/
		// Set the window title:
		setTitle("Book Store Shopping Cart");
		
        // Specify an action for the close button.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a BorderLayout manager.
        setLayout(new BorderLayout());
        
        // Call the methods to build the panels:
        buildBooksPanel();
        buildButtonPanel();
        buildCartPanel();
   
        // Add the panels to the content pane:
        add(booksPanel, BorderLayout.WEST);
        add(cartPanel, BorderLayout.EAST);
        add(addButtonPanel, BorderLayout.SOUTH);
        
        // Pack and display the window:
        pack();
        setVisible(true);
	}
	
	public void buildBooksPanel()
	{
		// Create a new panel object:
		booksPanel = new JPanel();
		
		// Create a titled border around the panel:
		booksPanel.setBorder(BorderFactory.createTitledBorder("Books:"));
		
		// Create a new list object:
		booksList = new JList(bookNames.toArray());
		
		// Set first 10 rows before having to scroll:
		booksList.setVisibleRowCount(10);
		
		// Create a new scroll pane to allow scrolling:
		bookScrollPane = new JScrollPane(booksList);
		
		// Add to the panel:
		booksPanel.add(bookScrollPane);
	}
	
	public void buildButtonPanel()
	{
		addButtonPanel = new JPanel();
		
		// Create a Add button object to add books to cart and add it to the panel:
		addButton = new JButton("Add to cart >>");
		addButtonPanel.add(addButton);
		
		// Create the checkout button and add it to the panel:
		checkoutButton = new JButton("Checkout");
		addButtonPanel.add(checkoutButton);
		
		// Create remove from cart button and add it to the panel:
		removeButton = new JButton("<< Remove from cart");
		addButtonPanel.add(removeButton);
		
		// Add action listener to listen for when add to cart button
		// is pressed:
		addButton.addActionListener(new AddToCartListener());
		
		// Add action listener to listen for when the remove
		// from cart button is pressed:
		removeButton.addActionListener(new RemoveFromCartListener());
		
		// Add action listener to the checkout button:
		checkoutButton.addActionListener(new CalculateListener());
		

	}

	
	public void buildCartPanel()
	{
		emptyStringArrayList = new ArrayList<String>();
		
		// Create a new panel object:
		cartPanel = new JPanel();
		
		// Create a titled border around the panel:
		cartPanel.setBorder(BorderFactory.createTitledBorder("Shopping Cart:"));
		
		// Create a new list object:
		cartList = new JList(emptyStringArrayList.toArray());
		
		cartList.setVisibleRowCount(10);
		
		cartScrollPane = new JScrollPane(cartList);
		
		// Add to the panel:
		cartPanel.add(cartScrollPane);
	}
	
	private class AddToCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Store the item that is selected in a String
			String selection = (String)booksList.getSelectedValue();
			
			// Store the index of the selected book an int variable:
			int index = booksList.getSelectedIndex();
			
			// Add the selected item to the Array List:
			emptyStringArrayList.add(selection);
			
			// Put the selected book price in the 
			// shopping cart price list Array List:
			emptyDoubleArrayList.add(bookPrices.get(index));
			
			// Put the selected book into the shopping cart list:
			cartList.setListData(emptyStringArrayList.toArray());
			

		}
	}
	
	private class RemoveFromCartListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Store the cart item that is selected in a String:
			int selection = cartList.getSelectedIndex();
			
			// Remove the selected item from the Array List based on index number:
			emptyStringArrayList.remove(selection);
			
			// Remove the selected book price from the 
			// shopping cart price list ArrayList:
			emptyDoubleArrayList.remove(selection);
			
			// Update the cart list to show updated values:
			cartList.setListData(emptyStringArrayList.toArray());
		}
	}
	
	private class CalculateListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			subtotal = 0;
			
			for(int i = 0; i < emptyDoubleArrayList.size(); i++)
			{
				// Calculate totals:
				subtotal += emptyDoubleArrayList.get(i);
				salesTax = subtotal * SALES_TAX;
				
				total = subtotal + salesTax;
				
				
			}
			
			// Display the totals:
			JOptionPane.showMessageDialog(null, String.format(
					"Subtotal: $%,.2f %nSales tax: $%,.2f %nTotal: $%,.2f", 
					subtotal, salesTax, total));
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		new ShoppingCart();

	}

}
