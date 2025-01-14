//First.java
import java.applet.Applet;
import java.awt.Graphics;



public class First extends Applet
	{
	public void paint(Graphics g)
		{
		System.out.println("paint called..");
	       g.drawString("welcome to applet",150,150);
        }
}