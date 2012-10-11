import javax.swing.*; 

import java.awt.event.*; 
import java.awt.GridLayout; 
import java.awt.BorderLayout; 
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ViewerMain {
	

	JPanel windowContent;
	JPanel Options;
	JPanel View;
	JFormattedTextField memName;
	JTextField account;
	JTextField password;
	JButton next;
	JButton previous;
	JButton exit;
	
	
	ViewerMain() {
		
		//Creating main panel 
		windowContent  = new JPanel();
		BorderLayout bl = new BorderLayout();
		windowContent.setLayout (bl);
		
		//Creating panel for mem name 
		memName = new JFormattedTextField();
		windowContent.add("North", memName);
		
		//Creating panel for mem img.
		
		View = new JPanel ();
		GridLayout vl = new GridLayout();
		View.setLayout(vl);
		windowContent.add("Center", View);

		//Image from xml 
		
		//Adding  button next and previous
		
		
		//Creating fields for options  (can be needed if future)
		
		Options = new JPanel();
		BorderLayout ol =  new BorderLayout();
		Options.setLayout(ol);
		windowContent.add("South", Options);
		
		
		
	
		
		//Adding frame 
		
		JFrame frame = new JFrame("9GAG.com - Just for fun!");
		frame.setContentPane(windowContent);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
	}
}


