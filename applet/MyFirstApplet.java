import java.awt.*;
import java.applet.Applet;
//<applet code="MyFirstApplet.class" width="200" height="300"></applet>

    
public class MyFirstApplet extends Applet
{
    public void paint(Graphics g)
        {  
		      // setBackground(Color.cyan);
              g.drawString("My applet",100,100);
			  g.drawLine(0,0,400,400);
		  	g.drawRect(10,10,400,400);
		       setBackground(Color.green);
		  	g.fillRect(100,100,200,400);

					  }
}
