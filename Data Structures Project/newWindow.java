package clean;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import javax.swing.*;

public class newWindow {

	static String indexString;

	public newWindow(String s){

		indexString=s;

}
	
	public static void test() throws IOException {

		JFrame popUp = new JFrame("Restaurant Reviews");

		//creates the JFrame
		popUp.setSize(400, 300);
		popUp.setLocationRelativeTo(null);
		popUp.setLayout(null);
		popUp.getContentPane().setBackground(Color.gray);
				
		ResRating t = new ResRating(indexString);	
		
		//gets the size of the array
		int x = t.printAll().size();
		
		//creates a new JLabel for the title
		JLabel Title = new JLabel("Restaurant Reviews");
		Title.setFont(new Font("Serif", Font.BOLD, 30));
		Title.setSize(Title.getPreferredSize());
		Title.setLocation(70,20);
		popUp.add(Title);
		
		//creates a JLabel for each review
		JLabel review1 = null;
		JLabel review2 = null;
		JLabel review3 = null;
				
		//sets the JLabels to each review
		if (x==0){
			review1 = new JLabel("Review 1:");
			review2 = new JLabel("Review 2:");
			review3 = new JLabel("Review 3:");
		}
		if (x==1){
			review1 = new JLabel("Review 1: " + t.printAll().get(0));
			review2 = new JLabel("Review 2:");
			review3 = new JLabel("Review 3:");
		}
		if (x==2){
			review1 = new JLabel("Review 1: " + t.printAll().get(0));
			review2 = new JLabel("Review 2: " + t.printAll().get(1));
			review3 = new JLabel("Review 3:");
		}
		if (x>=3){
			review1 = new JLabel("Review 1: " + t.printAll().get(0));
			review2 = new JLabel("Review 2: " + t.printAll().get(1));
			review3 = new JLabel("Review 3: " + t.printAll().get(2));
		}
		
		review1.setLocation(50,80);
		review2.setLocation(50,130);
		review3.setLocation(50,180);
		
		review1.setSize(review1.getPreferredSize());
		review2.setSize(review2.getPreferredSize());
		review3.setSize(review3.getPreferredSize());
		
		popUp.add(review1);
		popUp.add(review2);
		popUp.add(review3);
		
		popUp.setVisible(true);
		
		System.out.println(t.printAll());
	
	}
}