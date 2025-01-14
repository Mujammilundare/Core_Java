import java.awt.*;

import javax.swing.*;


public class GB1 extends JPanel
{
	private JPanel tallPanel =new JPanel();
	private JPanel tallPanel2 =new JPanel();
	GB1()
	{
		tallPanel.setLayout(new GridLayout(3,1));
		tallPanel.add(new Button("Press"));
		tallPanel.add(new Button("Any"));
		tallPanel.add(new Button("One"));
		
		tallPanel2.setLayout(new GridLayout(3,1));
		tallPanel2.add(new Button("Press"));
		tallPanel2.add(new Button("Any"));
		tallPanel2.add(new Button("One"));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.gridx=0;	c.gridy=0;
		add(new JButton("topleft"),c);
		c.gridx=1;
		add(new JButton("topmiddle"), c);
		c.gridx=2;
		add(new JButton("topright"), c);
		
		c.gridx=0;	c.gridy=1;
		add(new JButton("lefthandsidemiddle"),c);
		c.gridx=1;
		add(tallPanel,c);
		
		c.gridy=2;
		add(new JButton("bottomcenter"),c);
		c.gridx=2;
		add(tallPanel2,c);

	}
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("GridBag Example 1");
		f.getContentPane().add(new GB1());
		f.pack();
		f.setVisible(true);
	}
}


