import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayout1 extends JFrame implements ActionListener
	{
CardLayout card;
Container c;
CardLayout1()
	{
		
	    c=getContentPane();
		//card=new CardLayout();
		card=new CardLayout(40,30);
//create CardLayout object with 40 hor space and 30 ver space
		c.setLayout(card);
		
		JButton b1=new JButton("tom");
		JButton b2=new JButton("jerry");
		JButton b3=new JButton("harry");
	
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
			
		c.add(b1);
		c.add(b2);
		c.add(b3);
						
	}
	public void actionPerformed(ActionEvent e) 
		{
	      card.next(c);
	   }

	public static void main(String[] args) 
		{
		CardLayout1 cl=new CardLayout1();
		cl.setSize(400,400);
		cl.setVisible(true);
		cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }
}

