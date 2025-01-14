//If you use the GridBagLayout without the GridBagConstraints class it acts a little like a FlowLayout, simply dropping the components onto the background one by one.


import javax.swing.*;
import java.awt.*;

public class SimpleGridBag 
	{
  public static void main(String[] args)
	  {
    JFrame f = new JFrame();
    JPanel p = new JPanel();

    p.setLayout(new GridBagLayout());
    
	p.add(new JButton("Java"));
    p.add(new JButton("Source"));
    p.add(new JButton("and"));
    p.add(new JButton("Support."));
	
    f.getContentPane().add(p);
    f.setSize(600, 200);
    f.show();
  }
}
