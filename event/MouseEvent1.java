import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="MouseEvent1" width=200 height=200>
</applet>
*/
public class MouseEvent1 extends Applet implements MouseListener
	{
  public void init()
	{
     addMouseListener(this);
    }

 public void mouseClicked (MouseEvent me) 
	 {
	 System.out.println("mouseClicked..");
     } 

 public void mousePressed (MouseEvent me) 
	 {
	 System.out.println("mousePressed..");
	 } 
 public void mouseReleased (MouseEvent me)
	 {
	 System.out.println("mouseReleased..");
     }  
 public void mouseEntered (MouseEvent me) 
	 {
	 System.out.println("mouseEntered.."+me.getX()+"    "+me.getY());
     } 
 public void mouseExited (MouseEvent me) 
	 {
	 System.out.println("mouseExited..");
	 }  
}