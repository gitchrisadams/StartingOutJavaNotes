package com.christopheradams.num014TextAreas;

import javax.swing.*;    // Needed for Swing classes

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.*; // Needed for ActionListener Interface

/**
   The KiloConverter class displays a JFrame that
   lets the user enter a distance in kilometers. When
   the Calculate button is clicked, a dialog box is
   displayed with the distance converted to miles.
*/

public class TextAreasAndScrollBars extends JFrame
{
   private JPanel panel;             // To reference a panel
   private JLabel messageLabel;      // To reference a label
   
   /***** We are using a text area instead of a text field *****/
   // Create the JTextArea reference.
   private JTextArea textInputTextArea;
   
   /***** We can also create scroll bars for the text area *****/
   private JScrollPane textInputScrollPane;
   
   private JButton calcButton;       // To reference a button
   private final int WINDOW_WIDTH = 700;  // Window width
   private final int WINDOW_HEIGHT = 500; // Window height

   /**
      Constructor
   */

   public TextAreasAndScrollBars()
   {
      // Set the window title.
      setTitle("Kilometer Converter");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new BorderLayout());

      // Build the panel and add it to the frame.
      buildPanel();

      // Add the panel to the frame's content pane.
      add(panel, BorderLayout.CENTER);
      
      // Display the window.
      setVisible(true);
   }

   /**
      The buildPanel method adds a label, text field, and
      and a button to a panel.
   */

   private void buildPanel()
   {
      // Create a label to display instructions.
      messageLabel = new JLabel("Enter a distance " +
                                "in kilometers");

      /***** We are using a JTextArea instead of a text field *****/
      // We could also pass it a String that initially sets the text
      // displayed in the Text Area like this:(Where info is the String)
      // textInputTextArea = new JTextArea(info, 20, 40);
      // The (20, 40) is for a Text Area 20 rows by 40 columns.
      textInputTextArea = new JTextArea(20, 40);
      
      /***** We can also create scroll bars for the text area *****/
      textInputScrollPane = new JScrollPane(textInputTextArea);
      
      /***** You can set a policy of when scroll bars show up *****/
      // JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED (The default, don't need to specify)
      // JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
      // JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
      // JScrollPane.VERTICAL_SCROLLBAR_NEVER
      // JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
      // The below never sets a horizontal scroll bar and always sets a
      // vertical scroll bar.
      textInputScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      textInputScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
 
      /***** You can also set line wrapping so the text wraps *****/
      /***** to the next line when reaching end of line *****/
      textInputTextArea.setLineWrap(true);


      // Create a button with the caption "Calculate".
      calcButton = new JButton("Calculate");

      // Add an action listener to the button.
      // This registers/creates a connection between the button
      // and the action listener.
      // We could have also wrote it like this:
      /**
      CalcButtonListener listener = new CalcButtonListener();
      calcButton.addActionListener(listener);
      **/
      calcButton.addActionListener(new CalcButtonListener());

      // Create a JPanel object and let the panel
      // field reference it.
      panel = new JPanel();
      
      /***** Adding a TextArea instead of text field *****/
      /*****  Notice we don't add the text area, only the scroll pane. *****/
      /***** This is very important, it doesn't work otherwise *****/
      // See the part commented out below, avoid using this:
      //panel.add(textInputTextArea);
      panel.add(textInputScrollPane);

      // Add the label, text field, and button
      // components to the panel.
      panel.add(messageLabel);
      

      
      
      panel.add(calcButton);
   }

   /**
      CalcButtonListener is an action listener class for
      the Calculate button.
   */
   // Notice we need to implement ActionListener:
   private class CalcButtonListener implements ActionListener
   {
      /**
         The actionPerformed method executes when the user
         clicks on the Calculate button.
         @param e The event object.
      */
      // Even if you don't use the param (e) in this case,
      // you still have to have a param for (ActionEvent e)
      public void actionPerformed(ActionEvent e)
      {
         final double CONVERSION = 0.6214;
         String input;  // To hold the user's input
         double miles;  // The number of miles

         // Get the text entered by the user into the
         // text area.
         // With JTextArea we also have access to the setText()
         input = textInputTextArea.getText();

         // Convert the input to miles.
         miles = Double.parseDouble(input) * CONVERSION;

         // Display the result.
         JOptionPane.showMessageDialog(null, input +
                  " kilometers is " + miles + " miles.");
      }
   }

   /**
      main method
   */

   public static void main(String[] args)
   {
      new TextAreasAndScrollBars();
   }
}