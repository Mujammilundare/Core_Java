
import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Main extends JApplet 
{
	Color color;
	JComboBox c;

	public void init()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch (Exception e)
		{
		}
		c = new JComboBox();
		c.addItem("black");
		c.addItem("red");
		c.addItem("green");
		c.addItem("blue");
		setLayout(null);
		//add(c,"Center");
		c.setBounds(50,50,100,30);
		add(c);
		c.addItemListener(new ItemListener()
		{
				public void itemStateChanged(ItemEvent ie)
				{
		if("black".equals(c.getSelectedItem()))
			color = color.black;
		else if("blue".equals(c.getSelectedItem()))
				color = color.blue;
		else if("red".equals(c.getSelectedItem()))
					color = color.red;
		else
				color = color.green;

	JApplet a = (JApplet)getAppletContext().getApplet("Bullet");
		a.repaint();
				}
		});
		
	}
	public Color getColor()
	{
		return color;
	}
	
}