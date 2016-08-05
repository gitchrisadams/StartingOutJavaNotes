package com.christopheradams.num002DisplayWindowExtendingJFrameClass;

import javax.swing.*;   // Needed for Swing classes

/**
   This class extends the JFrame class. Its constructor displays
   a simple window with a title. The application exits when the
   user clicks the close button.
*/

// Extends JFrame so we do not need to create a new JFrame
// object. We can just create a SimpleWindow object and create windows.
public class SimpleWindow extends JFrame
{
   /**
      Constructor
   */

   public SimpleWindow()
   {
      final int WINDOW_WIDTH = 850;   // Window width in pixels
      final int WINDOW_HEIGHT = 450;  // Window height in pixels

      // Set this window's title.
      setTitle("Christopher Adams Was here 2016");

      // Set the size of this window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Display the window.
      setVisible(true);
   }
}
