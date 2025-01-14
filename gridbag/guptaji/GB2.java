import java.awt.*;


import javax.swing.*;


public class GB2 extends JPanel
{

	public GB2()
	{
		Font bigfont = new Font("Serif", Font.PLAIN, 36);
		setLayout(new GridLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx=0;	c.gridy=0;
		addButton("TL", bigfont, c);
		c.gridx=1;
		addButton("Top Middle", bigfont, c);
		c.gridx=2;
		addButton("TR", bigfont, c);
		
		c.gridx=0;	c.gridy=1;
		addButton("ML", bigfont, c);
		c.gridx=2;
		addButton("MR", bigfont, c);
		
		c.gridx=0;	c.gridy=2;
		addButton("BL", bigfont, c);
		c.gridx=1;
		addButton("Bottom Middle", bigfont, c);
		c.gridx=2;
		addButton("BR", bigfont, c);
		
		Font smallfont = new Font("SansSerif", Font.PLAIN, 10);
		c.gridx=1;	c.gridy=1;
		addButton("x", smallfont, c);
	}
	private void addButton(String label, Font font, GridBagConstraints gbc)
	{
		JButton btn = new JButton(label);
		btn.setFont(font);
		add(btn, gbc);
	}
	
	public static void main(String[] args) 
	{
		JFrame f = new JFrame("GridBag Example");
		f.getContentPane().add(new GB2(), BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}

}
