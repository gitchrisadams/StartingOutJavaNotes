package com.christopheradams.num002ImageViewer;

import javax.swing.*;

public class ImageViewer extends JFrame
{
	// Create references:
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem fileOpen;
	
	public ImageViewer()
	{
		// Set the title:
		setTitle("Image Viewer");
		
		// Set the default close operation:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Call method to build the menu bar:
		buildMenuBar();
		
		// Pack and set the window to visibile:
		pack();
		setVisible(true);
	}
	
	private void buildMenuBar()
	{
		// Create a new menuBar object:
		// The JMenuBar() component acts as a container for the menu.
		menuBar = new JMenuBar();
		
		// Call method that builds the file open menu:
		buildFileOpenMenu();
		
		
		
	}
	
	private void buildFileOpenMenu()
	{
		
	}
	
	
}














