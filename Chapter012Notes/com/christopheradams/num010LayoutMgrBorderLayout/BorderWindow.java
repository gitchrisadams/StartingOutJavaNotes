package com.christopheradams.num010LayoutMgrBorderLayout;

import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for BorderLayout class

/**
   This class demonstrates the BorderLayout manager.
   The border layout is fluid stretches to fill the area.
   It's fluid and changes when you resize the windows.
*/

public class BorderWindow extends JFrame
{
   private final int WINDOW_WIDTH = 400;   // Window width
   private final int WINDOW_HEIGHT = 300;  // Window height

   /**
      Constructor
   */

   public BorderWindow()
   {
      // Set the title bar text.
      setTitle("Border Layout");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Add a BorderLayout manager to the content pane.
      /***** To specify horizontal and vertical format use this format: *****/
      // setLayout(new BorderLayout(int horizontalGap, int verticalGap);
      // Where horizontal/vertical gap is an integer number.
      setLayout(new BorderLayout());

      // Create five buttons.
      JButton button1 = new JButton("North Button");
      JButton button2 = new JButton("South Button");
      JButton button3 = new JButton("East Button");
      JButton button4 = new JButton("West Button");
      JButton button5 = new JButton("Center Button");

      // Add the five buttons to the content pane.
      // Each region can only hold one component at a time.
      // Notice we specify NORTH, SOUTH, EAST, WEST, CENTER for placement
      // of components.
      add(button1, BorderLayout.NORTH);
      add(button2, BorderLayout.SOUTH);
      add(button3, BorderLayout.EAST);
      add(button4, BorderLayout.WEST);
      add(button5, BorderLayout.CENTER);

      // Display the window.
      setVisible(true);
   }

   /**
      The main method creates an instance of the BorderWindow
      class, causing it to display its window.
   */

   public static void main(String[] args)
   {
      new BorderWindow();
   }
}
