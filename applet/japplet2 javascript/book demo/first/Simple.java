// to compile  set classpath=C:\jdk1.7.0\jre\lib\plugin.jar
// run this example in browser runtime needs JSObject
//"javascript:alert" javascript:alert('Godly click...') 
//Warning !! HTML : To use javascript in an applet, you must be add "MAYSCRIPT" tag in applet definition
//<APPLET codeBase="./" code=tmin_JS width=80 height=25 MAYSCRIPT> 

 



 import java.awt.Graphics ;
 import java.awt.Event ;
 import netscape.javascript.JSObject; // // LiveConnect... for JavaScript

//<APPLET CODE="Simple.class" WIDTH="200" HEIGHT="200"></APPLET>

 public class Simple extends java.applet.Applet 
	 {

     public void paint(Graphics g) 
		 {       
		       g.drawString("God the great...", 10, 10) ;
         }

     public boolean mouseDown(Event e, int x, int y)
		 {
	   try 
	    {
		  JSObject.getWindow (this).eval ("javascript:alert('Simple click x=" + x + " y=" + y + "')") ;
	   }
	   catch (Exception ex) 
		   { 
		     showStatus( "Error call javascript err=" + ex );
	       }
	   return true ;
     }

  }
