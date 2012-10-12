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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;



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

		// download Image from xml and save on HD 
		
		public static void SaveImage (String [] args)  throws Exception  {
		
			String imageUrl = "http://d24w6bsrhbeh9d.cloudfront.net/photo/5582120_460s.jpg";
			String destinationFile  = "image_01.jpeg";
			saveImage (imageUrl, destinationFile);			
		}
		
		public static void saveImage (String imageUrl, String destinationFile) throws IOException {
		URL url = new URL (imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);
		
		byte [] b = new byte [20848];
		int length;
		
		while ((length = is.read(b)) !=-1) {
			os.white(b, 0, length);
	
			}
		
		is. close();
		os.close ();
		}
		
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


