 import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="UseParam.class" width="300" height="300">
<param name="msg" value="Welcome to Hell">
</applet>
*/

public class UseParam extends Applet
	{

public void paint(Graphics g)
	{
String str=getParameter("msg");
g.drawString(str,50, 50);
//g.drawLine(0,200,400,100);
//g.drawRect(10,10,400,100);
//g.fillRect(0,0,400,100);


}

}
