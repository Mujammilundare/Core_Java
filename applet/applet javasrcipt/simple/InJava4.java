import java.applet.*; 
import java.net.*; 

public class InJava4 extends Applet
	{ 
public void init()
	{ 
String msg = "Hello from Java (using javascript alert)"; 
try
	{ 
       getAppletContext().showDocument (new URL("javascript:doAlert(\"" + msg +"\")")); 
    } 
catch (MalformedURLException me) 
	{ 
   } 
} 
} 






