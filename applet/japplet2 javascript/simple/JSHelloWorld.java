import javax.swing.*;

//<APPLET CODE="JSHelloWorld.class" WIDTH="250" HEIGHT="250"></APPLET>

public class JSHelloWorld extends JApplet
	{
    JTextArea txt = new JTextArea(100,100);
    public JSHelloWorld() 
		{
        txt.setText("Hello World");
        getContentPane().add(txt);
    }
}
