// to compile  set classpath=C:\jdk1.7.0\jre\lib\plugin.jar

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.URL;
import netscape.javascript.*;

public class  InterFrameDemo extends Applet implements ActionListener
{
	TextField tf;
	Button b;
	Label l;
	String target;

	public void init()
	{
		target = getParameter("target");
		setLayout( new BorderLayout());
	
		tf = new TextField(20);
		b = new Button("Transfer Data");
		add("South", tf);
		add("North", b);
		
		b.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b)
		{
			//
			String js = "parent.f1.toOtherFrame(\""+tf.getText()+"\", \" "+target+"\")";
			System.out.println("to Javascript : " +js);
			//This static method returns a JSObject for the window containing the given applet.
			JSObject win = (JSObject) JSObject.getWindow(this);
			win.eval(js);
		}
	}
	public void fromOtherFrame(String s)
	{
		tf.setText(s);
	}
}
