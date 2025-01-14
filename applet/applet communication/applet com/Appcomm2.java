

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="Appcomm2" width=200 height=200 Name="Appcomm2"></applet>
 <applet code="AppComm1" width=200 height=200 Name="AppComm1"></applet> */

public class Appcomm2 extends JApplet{
	//Color selectedColour;	
	
	public void paint(Graphics g){
		super.paint(g);
		
		AppComm1 applet = (AppComm1) getAppletContext().getApplet("AppComm1");
		//selectedColour=applet.getColor();
		
		g.setColor(applet.getColor());
		g.fillOval(80, 70, 60, 50);		
	}
}

