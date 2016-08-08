package com.christopheradams.num015Fonts;

import javax.swing.*;    // Needed for Swing classes

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*; // Needed for ActionListener Interface

public class Fonts extends JFrame
{
   private JPanel panel;             // To reference a panel
  
   // Create some extra labels to demonstrate changing font:
   private JLabel label1;  
   private JLabel label2;
   private JLabel label3;
   private JLabel label4;

   private final int WINDOW_WIDTH = 225;  // Window width
   private final int WINDOW_HEIGHT = 225; // Window height

   /**
      Constructor
   */

   public Fonts()
   {
      // Set the window title.
      setTitle("Fonts Demo");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new BorderLayout());

      // Build the panel and add it to the frame.
      buildPanel();

      // Add the panel to the frame's content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }

   /**
      The buildPanel method adds a label, text field, and
      and a button to a panel.
   */

   private void buildPanel()
   {
      /***** Create some more lables *****/
	  label1 = new JLabel("Serif Plain", SwingConstants.CENTER);
      label2 = new JLabel("Serif Bold", SwingConstants.CENTER);
      label3 = new JLabel("Serif Italic", SwingConstants.CENTER);
      label4 = new JLabel("Serif Bold and Italic", SwingConstants.CENTER);
      
      /***** Set the font of the labels *****/
      // 24 is the size of the font.
      label1.setFont(new Font("Serif", Font.PLAIN, 24));
      
      label2.setFont(new Font("Serif", Font.BOLD, 24));
      
      label3.setFont(new Font("Serif", Font.ITALIC, 24));
      
      // We use the + to use both bold and italic:
      label4.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 24));
      

      // Create a JPanel object and let the panel
      // field reference it.
      panel = new JPanel();

      // Add the labels to the panel:
      panel.add(label1);
      panel.add(label2);
      panel.add(label3);
      panel.add(label4);
   }

  

   /**
      main method
   */

   public static void main(String[] args)
   {
      new Fonts();
   }
}