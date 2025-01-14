import java.applet.Applet;
import netscape.javascript.JSObject;

public class Main extends Applet 
	{

    public void callbackMethod(String argument, String functionName) 
		{
        JSObject win = JSObject.getWindow(this);
        win.call(functionName, new Object[] { argument });
    }

}