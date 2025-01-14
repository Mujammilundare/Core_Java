import java.applet.*;
import java.awt.*;
import java.awt.event.*;


//<applet code="ContextApplet.class" width="299" height="200" name="app1"></applet>
//<applet code="First.class" width="299" height="200"  name="app2"></applet>


public class ContextApplet extends Applet implements ActionListener
	{


public void init()
	{
Button b= new Button("Click");
b.setBounds(50,50,60,50);
add(b);
b.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
	{
	System.out.println("Click1");
AppletContext ctx= getAppletContext();
	System.out.println("Click2");
Applet a= ctx.getApplet("app2");  
	System.out.println("Click3"+a);
a.setBackground(Color.green);
	System.out.println("Click4");
}
}