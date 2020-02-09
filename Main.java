 import java.awt.*;
 import java.awt.event.*;
import javax.swing.*;


// Create a simple GUI window
public class Main extends JFrame {
   private JLabel label1;
   private JLabel label2;
   private JButton startb;
   //private JTextField textfield;

   public Main() {
	   setLayout(new FlowLayout());
	   
	   label1 = new JLabel("What Would You Like to Do");
	   add(label1);
	   
	   //textfield = new JTextField(15);
	   //add(textfield);
	   
	   startb = new JButton("Start");
	   add(startb);
	   
	   event start = new event();
	   startb.addActionListener(start);
	   
   }
   
   public class event implements ActionListener {
	   
	   private JButton yesButton;
	   private JButton noButton;
	   
	   public void actionPerformed(ActionEvent start) {
		   label1.setText("Are You Hungry?");
		   startb.setVisible(false);
		   
		   yesButton = new JButton("Yes");
		   add(yesButton);
		   
		   event2 yes = new event2();
		   yesButton.addActionListener(yes);
		   
		   noButton = new JButton("No");
		   add(noButton);
		   
		   event3 no = new event3();
		   noButton.addActionListener(no);
		   
		   }
	   }
	   
	   public class event2 implements ActionListener {
		   
		   private JButton lowBug;
		   private JButton midBug;
		   private JButton highBug;
		   private JLabel labelPriceR;
		   
		   public void actionPerformed(ActionEvent yes) {
			   
			   labelPriceR.setText("What is Your Budget?");
			   
			   lowBug = new JButton("Low Budget");
			   add(lowBug);
			   
			   midBug = new JButton("Mid Budget");
			   add(midBug);
			   				   
			   highBug = new JButton("High Budget");
			   add(highBug);
		   }
	   }
		   
		public class event3 implements ActionListener {
			   
			   private JButton lowBug;
			   private JButton midBug;
			   private JButton highBug;
			   private JLabel labelPriceR;
			   
			   public void actionPerformed(ActionEvent yes) {
				   
				   labelPriceR.setText("What is Your Budget?");
				   
				   lowBug = new JButton("Low Budget");
				   add(lowBug);
				   
				   midBug = new JButton("Mid Budget");
				   add(midBug);
				   				   
				   highBug = new JButton("High Budget");
				   add(highBug);
			   }
		   
		 }
	
		public static void main(String[] args) {
			GameState gui = new GameState();
			gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gui.setVisible(true);
			gui.setSize(300, 125);
			
		} 

	}