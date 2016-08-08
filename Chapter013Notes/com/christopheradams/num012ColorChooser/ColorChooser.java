package com.christopheradams.num012ColorChooser;

import javax.swing.*;

import java.awt.Color;

public class ColorChooser extends JFrame
{
	// Fields:
	// Create a new panel reference:
	JPanel panel;
	private final int WINDOW_WIDTH = 500;			// Width of the window.
	private final int WINDOW_HEIGHT = 200;			// Height of window.
	
	// Create a new color reference:
	Color selectedColor;
	
	public ColorChooser()
	{
		// Set the windows title:
		setTitle("Retail Price Calculator");
		
		// Set the size of the window:
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Specify what happens when the close button is clicked:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Call method to build the panel:
		buildPanel();
		
		// Add the panel to the frame's content pane:
		add(panel);
		
		// Display the window:
		setVisible(true);
		
		/***** Color Chooser demo *****/
		/***** The color chooser loads once and you choose the color *****/
		/***** and then the panel changes to the color chosen *****/
		// Create the new Color chooser object:
		selectedColor = JColorChooser.showDialog(null, "Select a Background Color", Color.BLUE);
		
		// Set the color of the panel to the selected color:
		panel.setBackground(selectedColor);
		/***** End Color Chooser demo *****/
	}
	
	public void buildPanel()
	{
		// Create the panel objects:
		panel = new JPanel();
		

	}
	

	public static void main(String[] args)
	{
		new ColorChooser();

	}

}
