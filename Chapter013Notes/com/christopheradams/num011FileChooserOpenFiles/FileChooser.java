package com.christopheradams.num011FileChooserOpenFiles;

import javax.swing.*;		// Needed for Swing classes and creating GUI components.

import java.awt.*;
import java.awt.event.*; // Needed for ActionListener Interface
import java.io.File;

// Extend JFrame in order to use GUI components.
public class FileChooser extends JFrame
{
	/***** Fields *****/
	// Create panels:
	private JPanel panel1;		

	/***** Create a new file chooser reference *****/
	private JFileChooser fileChooser;
	
	private final int WINDOW_WIDTH = 700;			// Width of the window.
	private final int WINDOW_HEIGHT = 500;			// Height of window.
	
	/**
	 * 	Constructor
	 */
	public FileChooser()
	{
		// Set the windows title:
		setTitle("File Chooser");
		
		// Set the size of the window:
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Specify what happens when the close button is clicked:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the layout type to GridLayout.
		// This layout uses rows and columns for alignment.
		setLayout(new GridLayout(0, 1));
		
		// Call method to build the panel:
		buildPanel();
		
		// Add the panel to the frame's content pane:
		add(panel1);
		
		
		// Display the window:
		setVisible(true);
		
		/***** Create an int for status of file chooser *****/
		/***** And make open dialog display on program load *****/
		int status = fileChooser.showOpenDialog(null);
		
		/***** Find out what file was opened *****/
		// The options are:
		// CANCEL_OPTION if user clicked cancel button.
		// APPROVE_OPTION indicating user clicked Open or Save.
		// ERROR_OPTION the return value indicates an error occured.
		if(status == JFileChooser.APPROVE_OPTION)
		{
			File selectedFile = fileChooser.getSelectedFile();
			String filename = selectedFile.getPath();
			
			// Display the file path that was opened:
			JOptionPane.showMessageDialog(null, "You selected" + filename);
		}
		
	}
	
	public void buildPanel()
	{
		/***** Create a new file chooser object *****/
		fileChooser = new JFileChooser();
	
		// Create the panel object:
		panel1 = new JPanel();

		panel1.add(fileChooser);
	}

	
	/**
	 * The main method creates an instance of the
	 * RetailPriceCalculator class, which displays its
	 * window on the screen.
	 */
	public static void main(String[]args)
	{
		new FileChooser();
	}

}
