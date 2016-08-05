package com.christopheradams.num009LayoutManagersFlowLayout;

import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for FlowLayout class

/**
   This class demonstrates how to use a FlowLayout manager
   with the content pane.
*/
// The FlowLayout rearranges items when screen is resized.
// So buttons for example would move to rows or columns based
// on how screen is resized.
public class FlowWindow extends JFrame
{
   private final int WINDOW_WIDTH = 600;  // Window width
   private final int WINDOW_HEIGHT = 405; // Window height

   /**
      Constructor
   */

   public FlowWindow()
   {
      // Set the title bar text.
      setTitle("Flow Layout");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Add a FlowLayout manager to the content pane.
      // This sets the FlowLayout as the layout manager.
      // We can pass it an argument to affect alignment.
      /*** To align left: ***/
      // setLayout(new FlowLayout(FlowLayout.LEFT));
      /*** To adjust the space between components ***/
      // using horizontal and vertical gap parameters.
      // First param is alignment then pass in ints like this:
      // Format: setLayout(new FlowLayout(int alignment, int horzGap, int vertGap));
      // setLayout(new FlowLayout(FlowLayout.LEFT, 10, 7));
      setLayout(new FlowLayout());

      // Create three buttons.
      JButton button1 = new JButton("Button 1");
      JButton button2 = new JButton("Button 2");
      JButton button3 = new JButton("Button 3");

      // Add the three buttons to the content pane.
      add(button1);
      add(button2);
      add(button3);

      // Display the window.
      setVisible(true);
   }

   /**
      The main method creates an instance of the FlowWindow
      class, causing it to display its window.
   */

   public static void main(String[] args)
   {
      new FlowWindow();
   }
}
