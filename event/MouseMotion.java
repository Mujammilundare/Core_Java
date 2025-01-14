import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="MouseMotion" width=200 height=200>
</applet>
*/
public class MouseMotion extends Applet implements MouseMotionListener
	{
  public void init()
	{
     addMouseMotionListener(this);
    }

 public void mouseMoved (MouseEvent me) 
	 {
//	 System.out.println("mouseMoved..");
	 showStatus(me.getX()+" "+me.getY());

     } 

 public void mouseDragged (MouseEvent me) 
	 {
	// System.out.println("mouseDragged..");
 	 showStatus(me.getX()+" "+me.getY());
	 } 

}