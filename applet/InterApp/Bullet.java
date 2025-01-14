

import java.awt.*;
import javax.swing.*;
/*
<APPLET CODE="Main" WIDTH=300 HEIGHT=300
	Name="Main">

</APPLET>
<APPLET CODE="Bullet" WIDTH=300 HEIGHT=300
	Name="Bullet">
</APPLET>*/
public class Bullet extends JApplet
{
	Color c = Color.black;
	public void paint(Graphics g)
	{
		Main applet = (Main) getAppletContext().getApplet("Main");
		g.setColor(applet.getColor());
		g.fillOval(0,0,60,70);
	}
};