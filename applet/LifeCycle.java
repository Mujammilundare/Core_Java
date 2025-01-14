import java.awt.*;
import java.applet.*;

//<applet code="LifeCycle.class" width="200" height="300"></applet>

public class LifeCycle extends Applet
{

      public void init()
      {
     System.out.println("init..");
      }

      public void start()
      {
		System.out.println("start");
      }

      public void paint(Graphics g)
      {
		System.out.println("paint");
     }

     public void stop()
     {
		System.out.println("stop");
     }

     public void destroy()
     {
		System.out.println("destroy");
     }
}