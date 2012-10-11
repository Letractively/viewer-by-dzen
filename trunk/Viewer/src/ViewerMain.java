import javax.swing.*; 
import java.awt.event.*; 
import java.awt.GridLayout; 
import java.awt.BorderLayout; 
import java.awt.Graphics;
import java.awt.image.BufferedImage;

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
		
		
		
	}
	

	
	public static void main(String[] args) {
	}
}


