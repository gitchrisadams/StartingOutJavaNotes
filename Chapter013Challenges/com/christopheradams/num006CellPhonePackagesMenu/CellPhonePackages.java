package com.christopheradams.num006CellPhonePackagesMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
   The CellPhonePackages class enables the user to select
   the different cell phone options they would like and
   displays the prices of each in a menu system.
*/

public class CellPhonePackages extends JFrame
{
   // Panel references:
   private JPanel panel1;
   private JPanel panel2;
   private JPanel panel3;
   
   // The following will reference menu components.
   private JMenuBar menuBar;		// The menu bar
   private JMenu packagesMenu;  	// The menu for the packages.
   private JMenu modelMenu;     	// The menu for different models.
   private JMenu featuresMenu;		// The menu for the different features.
   private JMenuItem package1Item;  // Package number 1 item.
   private JMenuItem package2Item;  // Package number 2 item.
   private JMenuItem package3Item;  // Package number 3 item.
   private JMenuItem model1Item;	// Model number 1 item.
   private JMenuItem model2Item;	// Model number 2 item.
   private JMenuItem model3Item;	// Model number 3 item.
   private JMenuItem feature1Item;	// Feature number 1 item.
   private JMenuItem feature2Item;	// Feature number 2 item.
   
   // CheckBoxes:
   private JCheckBoxMenuItem voiceMailCheckBox;
   private JCheckBoxMenuItem textMessagingCheckBox;
   
   // Create label reference to display the prices inside:
   private JLabel packagePriceHeading;
   private JLabel packagePriceDisplay;
   private JLabel modelPriceHeading;
   private JLabel modelPriceDisplay;
   private JLabel featurePriceHeading;
   private JLabel featurePriceDisplay;
   
   // For window size:
   private final int WINDOW_WIDTH = 400;   // Window width
   private final int WINDOW_HEIGHT = 200;  // Window height

   // Variables:
   private double voicemailTotal = 0;
   private double textMessagingTotal = 0;
   private double featuresTotal = 0;
   
   // Constants:
   private final double VM_PRICE = 5;			// Voicemail total.
   private final double TM_PRICE = 10;			// Text Messaging total.
   private final double SALES_TAX = .06;		// Sales tax rate.
   
   
   /**
      Constructor
   */

   public CellPhonePackages()
   {
      // Set the title.
      setTitle("Cell Phone Packages Selector");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      // Set the layout:
      setLayout(new GridLayout(3, 0));
      
      // Create panels:
      panel1 = new JPanel();
      panel2 = new JPanel();
      panel3 = new JPanel();
      
      // Sets the size of the window:
      setPreferredSize(
              new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
      
      // Create Labels:
      // Swing.Constants.CENTER Aligns the label to the center.
      packagePriceHeading = new JLabel("Package Price:", SwingConstants.CENTER);
      packagePriceDisplay = new JLabel();
      modelPriceHeading = new JLabel("Model Price:", SwingConstants.CENTER);
      modelPriceDisplay = new JLabel();     
      featurePriceHeading = new JLabel("Features Price:", SwingConstants.CENTER);
      featurePriceDisplay = new JLabel();   

      // Add the labels to display the prices to the panel:
      panel1.add(packagePriceHeading);
      panel1.add(packagePriceDisplay);
      panel2.add(modelPriceHeading);
      panel2.add(modelPriceDisplay);
      panel3.add(featurePriceHeading);
      panel3.add(featurePriceDisplay);
      
      // Add the components to the content pane.
      add(panel1);
      add(panel2);
      add(panel3);
      
      // Build the menu bar.
      buildMenuBar();

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildMenuBar method builds the menu bar.
   */

   private void buildMenuBar()
   {
      // Create the menu bar.
	  // The JMenuBar() component acts as a container for the menu.
      menuBar = new JMenuBar();

      // Create menus:
      buildPackageMenu();
      buildModelMenu();
      buildFeaturesMenu();

      // Add the menus to the menu bar:
      menuBar.add(packagesMenu);
      menuBar.add(modelMenu);
      menuBar.add(featuresMenu);

      // Set the window's menu bar.
      setJMenuBar(menuBar);
   }

   /**
      The buildPackageMenu() method builds the Package menu
   */

   private void buildPackageMenu()
   {
      /***** Create the packages menu items: *****/
	  // Packages 1:
      package1Item = new JMenuItem("300 min/month");
      package1Item.addActionListener(new Package1Listener());
 
      // Packages 2:
      package2Item = new JMenuItem("800 min/month");
      package2Item.addActionListener(new Package2Listener());
      
      // Packages 3:
      package3Item = new JMenuItem("1500 min/month");
      package3Item.addActionListener(new Package3Listener());
      /***** End Create the packages menu items: *****/
      
      // Create a JMenu object for the Packages menu.
      packagesMenu = new JMenu("Packages");
      packagesMenu.setMnemonic(KeyEvent.VK_P);

      // Add the packages menu items to the File menu.
      packagesMenu.add(package1Item);
      packagesMenu.add(package2Item);
      packagesMenu.add(package3Item);
   }

   /**
      The buildModelMenu() method builds the model menu.
   */

   private void buildModelMenu()
   {
      // Create the model menu items:
	  // Packages 1:
	   model1Item = new JMenuItem("Apple iPhone 10S");
	   model1Item.addActionListener(new Model1Listener());
 
      // Packages 2:
	   model2Item = new JMenuItem("Android S11");
	   model2Item.addActionListener(new Model2Listener());
      
      // Packages 3:
	   model3Item = new JMenuItem("Nokia 200h");
	   model3Item.addActionListener(new Model3Listener());

      // Create a JMenu object for the Packages menu.
      modelMenu = new JMenu("Models");
      modelMenu.setMnemonic(KeyEvent.VK_M);

      // Add the packages menu items to the File menu.
      modelMenu.add(model1Item);
      modelMenu.add(model2Item);
      modelMenu.add(model3Item);
   }
   
   public void buildFeaturesMenu()
   {
      // Create the features menu items:
	  // Feature 1:
	  // Create new CheckBox and add action listener:
	  voiceMailCheckBox = new JCheckBoxMenuItem("Voicemail", false);
	  voiceMailCheckBox.addActionListener(new Feature1Listener());
 
      // Feature 2:
	  // Create new CheckBox and add action listener:
	  textMessagingCheckBox = new JCheckBoxMenuItem("Text Messaging", false);
	  textMessagingCheckBox.addActionListener(new Feature2Listener());

      // Create a JMenu object for the Packages menu.
      featuresMenu = new JMenu("Features");
      featuresMenu.setMnemonic(KeyEvent.VK_F);

      // Add the packages menu items to the File menu.
      featuresMenu.add(voiceMailCheckBox);
      featuresMenu.add(textMessagingCheckBox);
   }

   	/****** Listeners for selecting from menu event *****/
    private class Package1Listener implements ActionListener
    {
       public void actionPerformed(ActionEvent e)
       {
    	   // Set the text of the JLabel to display the price:
    	   packagePriceDisplay.setText("$45/month");
       }
    }
    
    private class Package2Listener implements ActionListener
    {
       public void actionPerformed(ActionEvent e)
       {
    	   // Set the text of the JLabel to display the price:
    	   packagePriceDisplay.setText("$65/month");
       }
    }
    
    private class Package3Listener implements ActionListener
    {
       public void actionPerformed(ActionEvent e)
       {
    	   // Set the text of the JLabel to display the price:
    	   packagePriceDisplay.setText("$99/month");
       }
    }
    
    private class Feature1Listener implements ActionListener
    {
       public void actionPerformed(ActionEvent e)
       {
    	   // If voicemail CheckBox is selected:
    	   if(voiceMailCheckBox.isSelected())
    	   {
    		   // Set the total for voicemail to the voicemail rate:
    		   voicemailTotal = VM_PRICE;
    		   
    		   // Add the voicemail total to the features total.
    		   featuresTotal += voicemailTotal;
    	   }
    	   // Else the voicemail CheckBox is not selected:
    	   else if(!voiceMailCheckBox.isSelected())
    	   {
    		   // Set voicemail total to 0 and add voicemail rate to 
    		   // the features total.
    		   voicemailTotal = 0;
    		   featuresTotal -= VM_PRICE;
    	   }
    	   
    	   // Display the features total:
    	   featurePriceDisplay.setText(String.format("$%,.2f / month", featuresTotal));
       }
    }
    
    private class Feature2Listener implements ActionListener
    {
       public void actionPerformed(ActionEvent e)
       {
    	// If text messaging CheckBox is selected:
    	   if(textMessagingCheckBox.isSelected())
    	   {
    		   // Add the text messaging rate to the text messaging total.
    		   textMessagingTotal = TM_PRICE;
    		   
    		   // Add the text messaging total to the features total.
    		   featuresTotal += textMessagingTotal;
    	   }
    	   // Else the text messaging CheckBox is not selected:
    	   else if(!textMessagingCheckBox.isSelected())
    	   {
    		   // Set the text messaging total to 0.
    		   textMessagingTotal = 0;
    		   
    		   // Subtract the text messaging rate from the features total:
    		   featuresTotal -= TM_PRICE;
    	   }
    	   
    	   // Display the features total:
    	   featurePriceDisplay.setText(String.format("$%,.2f / month", featuresTotal));
    	   
       }
    }

    private class Model1Listener implements ActionListener
    {
       public void actionPerformed(ActionEvent e)
       {
    	   // Set the text of the JLabel to display the price:
    	   modelPriceDisplay.setText("$29.95");
       }
    }
    
    private class Model2Listener implements ActionListener
    {
       public void actionPerformed(ActionEvent e)
       {
    	   // Set the text of the JLabel to display the price:
    	   modelPriceDisplay.setText("49.95");
       }
    }
    
    private class Model3Listener implements ActionListener
    {
       public void actionPerformed(ActionEvent e)
       {
    	   // Set the text of the JLabel to display the price:
    	   modelPriceDisplay.setText("99.95");
       }
    }
   
   /**
      The main method creates an instance of the
      CellPhonePackages class, which causes it to display
      its window.
   */

   public static void main(String[] args)
   {
      new CellPhonePackages();
   }
}
