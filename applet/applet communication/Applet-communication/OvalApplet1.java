import java.awt.*;
import java.awt.Graphics;
import java.awt.color.*;
 import java.applet.*;


//<applet code="OvalApplet1.class" width="200" height="200"></applet>
public class OvalApplet1 extends Applet
  {
     private Color color=Color.black;
     
	public void paint(Graphics g)
	 { 
	 	
	 	g.setColor(color);
	 	g.fillOval(100,100,100,100);
	 }	 

	public Color getColor() {
		return color;
	}

	
	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	
}
