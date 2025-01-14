import java.awt.*;
import java.applet.*;

//<applet code="AnimationExample.class" width="200" height="300"></applet>


public class AnimationExample extends Applet 
	{

  Image img;
  public void init() 
	  {
 img =getImage(getDocumentBase(),"bike.jpg");
  }
  
  public void paint(Graphics g)
	  {

g.drawImage(img,100,100, this);
  //  g.setColor(Color.red);
System.out.println(getDocumentBase());
  //      g.drawRect(0,0,50,50);
	 //   g.fillRect(10,10,50,50);
    }
}

