package com.christopheradams.num002ImageViewer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.*;

public class ImageViewer extends JFrame
{
	// Create references:
	private JMenuBar menuBar;					// For the menu bar.
	private JMenu fileMenu;						// The file menu.
	private JMenuItem fileOpen;					// The file open menu item.
	private JFileChooser fileChooser;			// For opening a file.
	private JLabel imageLabel;					// For displaying the image inside the label.
	private JPanel imagePanel;					// For holding the image label.
	private ImageIcon imageToDisplay;			// For Changing the image icon/picture.
	private ImageIcon newImageToDisplay;		// For changing the image icon/picture to new image.
	
	// Window size:
	private final int WINDOW_WIDTH = 700;			// Width of the window.
	private final int WINDOW_HEIGHT = 500;			// Height of window.
	
    /**
     * Constructor
     */
	public ImageViewer()
	{
		// Set the title:
		setTitle("Image Viewer");
		
		// Set the size of the window:
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setLayout(new BorderLayout());
		
		// Set the default close operation:
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Call method to build the panel and menu bar:
		buildMenuBar();
		buildImagePanel();
		
		// Add the image panel to our BorderLayout:
		add(imagePanel, BorderLayout.CENTER);
		
		// Pack and set the window to visible:
		pack();
		setVisible(true);
	}
	
	/**
	 * The buildMenuBar() method builds the menu bar.
	 */
	private void buildMenuBar()
	{
		// Create a new menuBar object:
		// The JMenuBar() component acts as a container for the menu.
		menuBar = new JMenuBar();
		
		// Call method that builds the file open menu:
		buildFileMenu();
		
		// Add the file open menu to the menu bar:
		menuBar.add(fileMenu);
		
		// Set the windows's menu bar:
		setJMenuBar(menuBar);	
	}
	
   /**
    * The buildFileMenu() method builds the file menu and file open menu item.
    */
   private void buildFileMenu()
   {
	   
	  // Create a JMenu object for the File Open menu.
	  fileOpen = new JMenuItem("Open");
	  
	  // Shortcut key:
	  fileOpen.setMnemonic(KeyEvent.VK_O);
	  
	  // Add action listener to respond to menu being selected:
	  fileOpen.addActionListener(new FileOpenListener());
		
	  // Create a JMenu object for the File menu.
      fileMenu = new JMenu("File");
      
      // Shortcut key:
      fileMenu.setMnemonic(KeyEvent.VK_F);

      // Add the File open item to the File menu.
      fileMenu.add(fileOpen);
   }
   
   /**
    * The buildImagePanel() method builds the image panel.
    */
   private void buildImagePanel()
   {
	   // Create a new image panel.
	   imagePanel = new JPanel();
	   
	   // Create a new Image label.
	   imageLabel = new JLabel("Image will display here", SwingConstants.CENTER);
	   
	   // Set the startup image of the label:
	   imageToDisplay = new ImageIcon("src/kenzie.png");
	   imageLabel.setIcon(imageToDisplay);
	   
	   // Get rid of the text on the label:
	   imageLabel.setText(null);
	   
	   // Add the image label to the panel:
	   imagePanel.add(imageLabel);
   }
	
   /**
    * The FileOpenListener is for responding the the File Open menu selection.
    * @author Christopher
    *
    */
	private class FileOpenListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Create a new file chooser object:
			fileChooser = new JFileChooser();
			
			// Display the file open dialog so user can browse/open an image file:
			int status = fileChooser.showOpenDialog(null);
			
			// If file opened successfully:
			if(status == JFileChooser.APPROVE_OPTION)
			{
				// Store the selected file in a File variable:
				File selectedFile = fileChooser.getSelectedFile();
				
				// Store the name of the path of the selected file in a String:
				String filename = selectedFile.getPath();
				
				// Create a new ImageIcon object passing in the filename we got
				// from the file open file chooser:
				newImageToDisplay = new ImageIcon(filename);
				
				// Set the image label to display the image:
				imageLabel.setIcon(newImageToDisplay);
			}
		}
	}
	
	/**
	 * The main() method creates a new ImageViewer() object.
	 * @param args
	 */
	public static void main(String[]args)
	{
		new ImageViewer();
	}
}














