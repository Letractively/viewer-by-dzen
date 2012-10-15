import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ViewerMain {
	
	public static void main(String[] args) {
		
		Image image = null;
		try {
		URL url = new URL("http://d24w6bsrhbeh9d.cloudfront.net/photo/5605686_460s.jpg");
	    image = ImageIO.read(url);
		} catch (IOException e) {
		}	
		
		
		Frame frame = new JFrame("9GAG");
		JLabel label = new JLabel(new ImageIcon(image));
		((JFrame) frame).getContentPane().add(label, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}