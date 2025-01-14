//"Demonstrates the use of weightx, weighty constraints"

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridBagWithWeight
	{

  public static void main(String[] args) {
    JFrame f = new JFrame();
    JPanel p = new JPanel();

    p.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    p.setLayout(new GridBagLayout());
   	c = new GridBagConstraints();
   
	c.insets = new Insets(2, 2, 2, 2);
    c.weighty = 1.0; //try 0.0
    c.weightx = 1.0;
    c.gridx = 0;
    c.gridy = 0;
    p.add(new JButton("Java"), c);
    c.gridx = 1;
    p.add(new JButton("Source"), c);
    c.gridx = 0;
    c.gridy = 1;
    p.add(new JButton("and"), c);
    c.gridx = 1;
    p.add(new JButton("Support."), c);

    f.getContentPane().add(p);
    f.setSize(600, 200);
    f.show();
  }
}

