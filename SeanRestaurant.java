package unit5Assignment;
// Sean Lee-Wah
// 11/29/2023
// Creating restaurant using JFrame properties
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SeanRestaurant extends JFrame implements ItemListener{

	public static double sum; 
	// creating background image 
	 Image bg;
	 
	 // image icons using JLabel
	 // image for beef burger 
	 ImageIcon burger = new ImageIcon ("C:\\Users\\tiluser\\Downloads\\Unit5\\ImagesGUI\\src\\burger.jpg"); // has to be written like this to find each image from my laptop by searching through my folders. Can be switched though if images are not visible. 
	 Image img1 = burger.getImage() ;   
	 Image newimg1 = img1.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH ) ; 
	 ImageIcon burgerpic = new ImageIcon( newimg1 );
	 JLabel burgerlbl = new JLabel(burgerpic);
	 
	 // image for fries 
	 ImageIcon fries = new ImageIcon ("C:\\Users\\tiluser\\Downloads\\Unit5\\ImagesGUI\\src\\fries.jpg");
	 Image img2 = fries.getImage() ;   
	 Image newimg2 = img2.getScaledInstance(250, 200, java.awt.Image.SCALE_SMOOTH ) ; 
	 ImageIcon friespic = new ImageIcon(newimg2);
	 JLabel frieslbl = new JLabel(friespic);
	 
	 // image for iced tea 
	 ImageIcon IceTea = new ImageIcon ("C:\\Users\\tiluser\\Downloads\\Unit5\\ImagesGUI\\src\\IcedTea.jpg");
	 Image img3 = IceTea.getImage() ;   
	 Image newimg3 = img3.getScaledInstance(150, 230, java.awt.Image.SCALE_SMOOTH ) ; 
	 ImageIcon IceTeaPic = new ImageIcon(newimg3);
	 JLabel IcedTeaLabel = new JLabel(IceTeaPic);
	 
	 // image for chicken strips, cs stands for chicken strips.  
	 ImageIcon cs = new ImageIcon("C:\\Users\\tiluser\\Downloads\\Unit5\\ImagesGUI\\src\\chickenstrips.jpg");
	 Image img4 = cs.getImage();
	 Image newimg4 = img4.getScaledInstance(270, 100, java.awt.Image.SCALE_SMOOTH);
	 ImageIcon cspic = new ImageIcon(newimg4);
	 JLabel cslbl = new JLabel(cspic);
	 
	 // image for apple juice  
	 ImageIcon aj = new ImageIcon("C:\\Users\\tiluser\\Downloads\\Unit5\\ImagesGUI\\src\\applejuice.jpg");
	 Image img5 = aj.getImage();
	 Image newimg5 = img5.getScaledInstance(150, 200, java.awt.Image.SCALE_SMOOTH);
	 ImageIcon ajpic = new ImageIcon(newimg5);
	 JLabel ajlbl = new JLabel(ajpic);
	 
	 // creating new label, panels, and radio buttons 
	 JLabel name = new JLabel("                                                                                            Welcome to The Burger Hub");
	 JPanel pn0 = new JPanel();
	 JPanel pnl = new JPanel(new GridLayout(3,2));
	 JPanel pnl1 = new JPanel();
	 JPanel pnl2 = new JPanel();
	 JPanel pnl3 = new JPanel();
	 JRadioButton drink1 = new JRadioButton("Apple Juice") ;
	 JRadioButton drink2 = new JRadioButton("Orange Juice") ;
	 JRadioButton drink3 = new JRadioButton("Coffee") ;
	 JRadioButton drink4 = new JRadioButton("Iced Coffee") ;

	 // creating new checkboxes 
	 JCheckBox clear = new JCheckBox("Clear Order") ; 
	 JCheckBox calculate = new JCheckBox("Calculate Order");
	 
	 // creating new text areas
	 JTextArea order = new JTextArea( 15, 15 ) ;
	 JTextArea price = new JTextArea(13,5);
	 
	 // creating new arrays for each combobox
	 String [] mains = { "Beef Burger", "Fries", "Onion Rings", "Chicken Burger", "Chicken Strips" } ; 
	 String [] drinks = {"Iced Tea", "Root Beer", "Sprite", "Coke", "Dr. Pepper", "Mountain Dew"};
	 String [] sides = {"Caesar Salad", "Corn Salad", "Coleslaw", "Mac and Cheese"};
	 
	 // creating new comboboxes
	 JComboBox box = new JComboBox(mains);
	 JComboBox box1 = new JComboBox(drinks);
	 JComboBox box2 = new JComboBox(sides);
	
	 public SeanRestaurant(){
		 
	  super("Restaurant");
	  MPanel bg = new MPanel(); // creates background image
	  setSize(640,400);
	  setLayout(new BorderLayout());
	  setDefaultCloseOperation( EXIT_ON_CLOSE );
	  // adding all radio buttons, checkboxes, and comboboxes to ItemListener 
	  drink1.addItemListener(this) ; 
	  drink2.addItemListener(this) ;
	  drink3.addItemListener(this) ; 
	  drink4.addItemListener(this) ;
	  clear.addItemListener(this) ;
	  calculate.addItemListener(this);
	  box.addItemListener(this) ;
	  box1.addItemListener(this);
	  box2.addItemListener(this);
	  
	  // setting text for price list of items
	  price.setText("Price Of Items:" + "\n" + "Apple Juice: $1.29" + "\n" + "Orange Juice: $1.29" + "\n" + "Coffee: $1.50" + "\n" + "Iced Coffee: $1.50" + "\n" + "Beef Burger: $6.99" + "\n" + "Chicken Burger: $5.99" + "\n" + "Fries: $3.00" + "\n" + "Onion Rings: $3.50" + "\n" + "Chicken Strips: $6.00" + "\n" + "Iced Tea: $1.50" + "\n" + "Root Beer: $1.50" + "\n" + "Sprite: $1.50" + "\n" + "Coke: $1.50" + "\n" + "Dr. Pepper: $1.50" + "\n" + "Mountain Dew: $1.50" + "\n" + "Caesar Salad: $3.50" + "\n" + "Corn Salad: $2.00" + "\n" + "Coleslaw: $3.00" + "\n" + "Mac and Cheese: $2.99");
	  
	  // change size and font of title, and size of panel with items
	  name.setPreferredSize(new Dimension(1250,50));
	  name.setFont(new Font("Serif", Font.BOLD, 20));
	  pnl.setPreferredSize(new Dimension(800, 100));
	  pn0.add(name, BorderLayout.PAGE_START);
	  // adding items to specific panels 
	  pnl.add(drink1); 
	  pnl.add(drink2);
	  pnl.add(drink3); 
	  pnl.add(drink4);
	  pnl.add(clear);
	  pnl.add(box);
	  pnl.add(box1);
	  pnl.add(box2);
	  pnl.add(calculate);
	  pnl3.add(burgerlbl);
	  pnl3.add(cslbl);
	  pnl3.add(frieslbl);
	  pnl3.add(IcedTeaLabel);
	  pnl3.add(ajlbl);
	  // change so order and price list are not editable by user 
	  order.setText("Order: ");
	  order.setEditable(false);
	  pnl1.add(order);
	  price.setEditable(false);
	  pnl2.add(price);
	  // add each panel to the background to make everything visible
	  bg.add(pn0, BorderLayout.PAGE_START);
	  bg.add(pnl2, BorderLayout.LINE_START);
	  bg.add(pnl, BorderLayout.CENTER);
	  bg.add(pnl1, BorderLayout.LINE_END);
	  bg.add(pnl3, BorderLayout.CENTER);
	  add(bg);
	  setVisible(true);

	 }
	   // continuously adds specific values to sum based on the specific item selected by user  
	public void itemStateChanged( ItemEvent event ){
	  // getItemsSelectable() method identifies the originating component and adds it to order list 
	   if((event.getItemSelectable() == drink1) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
		   order.append("\n" + "Apple juice selected" ) ;
		   sum = sum + 1.29;
	   }
	  if(( event.getItemSelectable() == drink2) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
		  order.append("\n" + "Orange juice selected") ;
		  sum = sum + 1.29;
	  }
	  
	  if(( event.getItemSelectable() == drink3) && ( event.getStateChange() == ItemEvent.SELECTED ) ){
		   order.append("\n" + "Coffee selected") ;
		   sum = sum + 1.50;
	   }
	  
	  if(( event.getItemSelectable() == drink4) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
		  order.append( "\n" + "Iced coffee selected" ) ;
		  sum = sum + 1.50;
	  }
	  
	  if( ( event.getItemSelectable() == clear) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
		  order.setText(" ") ; // clear order list when user clicks clear order checkbox by setting text to blank 
		  sum = 0; // reset sum as well when order of items is cleared
	  }

	  if( ( event.getItemSelectable() == box) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
		  order.append( "\n" + event.getItem().toString() + " selected"  );
		  
		  // change to event.getItem() when selecting items from combobox
		  if(event.getItem().equals("Beef Burger")) { // use .equals to check text that is selected
			  sum = sum + 6.99;
		  }
		  if(event.getItem().equals("Fries")) {
			  sum = sum + 3.00;
		  }
		  if(event.getItem().equals("Onion Rings")) {
			  sum = sum + 3.50;
		  }
		  if(event.getItem().equals("Chicken Burger")) {
			  sum = sum + 5.99;
		  }
		  if(event.getItem().equals("Chicken Strips")) {
			  sum = sum + 6.00;
		  }
	  }
	  
	 if( ( event.getItemSelectable() == box1 ) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
		 order.append( "\n" + event.getItem().toString() + " selected"  );
		 sum = sum + 1.50; // all fountain drinks cost the same so always add $1.50 when any drink is selected
	 }
			 	 
	 if( ( event.getItemSelectable() == box2 ) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
		 order.append( "\n" + event.getItem().toString() + " selected"  );
		 
		 if(event.getItem().equals("Caesar Salad")) {
			  sum = sum + 3.50;
		  }
		 if(event.getItem().equals("Corn Salad")) {
			  sum = sum + 2.00;
		  }
		 if(event.getItem().equals("Coleslaw")) {
			  sum = sum + 3.00;
		  }
		 if(event.getItem().equals("Mac and Cheese")) {
			  sum = sum + 2.99;
		  }
			 }
	 
	 if( ( event.getItemSelectable() == calculate ) && ( event.getStateChange() == ItemEvent.SELECTED ) ) {
		 order.append("\n" + "\n" + "The total cost is $" + sum); // outputs total cost of all items selected by user when clicked 
		 
			 }
	 }

	 public static void main ( String[] args ){
	   
		 SeanRestaurant example = new SeanRestaurant();
	 
	 } 
	 }