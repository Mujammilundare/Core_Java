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
//b.setBounds(50,50,60,50);
add(b);
b.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
	{
AppletContext ctx= getAppletContext();
Applet a= ctx.getApplet("app2");  
a.setBackground(Color.green);
}
}