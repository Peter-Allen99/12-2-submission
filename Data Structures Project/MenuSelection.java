package clean;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JPanel {
	private static final long serialVersionUID = 1L;
	
	JButton Info;
	JButton Reviews;
	JButton OrderFood;
	JButton Restaurant;
	JLabel Title;

	MenuSelection() {

	//creates a new JFrame for the Menu
	JFrame Menu = new JFrame("Menu");
	Menu.setSize(325, 350);
	Menu.setLocationRelativeTo(null);
	Menu.setLayout(null);
	Menu.getContentPane().setBackground(Color.gray);

	//creates a new JLabel for the menu
	Title = new JLabel("Menu");
	Title.setFont(new Font("Serif", Font.BOLD, 20));
	Title.setSize(Title.getPreferredSize());
	Title.setLocation(125, 20);
	Menu.add(Title);
	
	//creates and sets up a button and its action listener (Info)
	Info = new JButton("Restaurant Information");
	Info.setSize(Info.getPreferredSize());
	Info.setLocation(70, 70);
	Info.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			
			//This is where it should go to another screen
			RestInfo correct = new RestInfo();
			correct.setVisible(true);
		}
	});
	
	Menu.add(Info);
	
	//creates and sets up a button and its action listener (Restaurant)
	Restaurant = new JButton("Find a Restaurant");
	Restaurant.setSize(Restaurant.getPreferredSize());
	Restaurant.setLocation(85, 120);
	Restaurant.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			//this is where it should go to another screen
			RestFinder correct = new RestFinder();
			correct.setVisible(true);
			
		}
	});
	
	Menu.add(Restaurant);
	
	//creates and sets up a new button and action listener (Reviews)
	Reviews = new JButton("Reviews");
	Reviews.setSize(Reviews.getPreferredSize());
	Reviews.setLocation(108, 170);
	Reviews.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			//This is where it should go to another screen
			RestReview correct = new RestReview();
			correct.setVisible(true);
		}
	});
	
	Menu.add(Reviews);
	
	//creates and sets up a new button and action listener (OrderFood)
	OrderFood = new JButton("Order Food");
	OrderFood.setSize(OrderFood.getPreferredSize());
	OrderFood.setLocation(101, 220);
	OrderFood.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			//This is where it should go to another screen
			OrderGui correct = new OrderGui();
			correct.setVisible(true);
		}
	});
	Menu.add(OrderFood);
		
	Menu.setVisible(true);
}
}