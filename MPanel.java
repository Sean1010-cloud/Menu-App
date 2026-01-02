package unit5Assignment;
// Sean Lee-Wah	
// 11/29/2023
// Creates background for restaurant 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ImagesGUI.IPanel;

public class MPanel extends JPanel{
		
	Image bg;

	  	 
		public MPanel() {
	    	super();
	    	Toolkit kit = Toolkit.getDefaultToolkit();
	    	bg = kit.getImage("C:\\Users\\tiluser\\Downloads\\Unit5\\ImagesGUI\\background.jpg"); // needs to written like this to load image in from my laptop  
		}
		public void paintComponent(Graphics comp) {
	    	 Graphics2D comp2D = (Graphics2D) comp;
	    	 comp2D.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
	    	 
		}
		public static void main(String [] args) {
			JFrame d = new JFrame("Background");
			IPanel bg = new IPanel();
			d.setSize(640,400);
			d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
			d.add(bg);
			d.setVisible(true);
		}
	}

