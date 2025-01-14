import java.awt.*;
import java.applet.*;

//<applet code="LifeCycle.class" height = 300 width=200> </applet>

public class LifeCycle extends Applet
{
	public void init ()
	{ 
		System.out.println("This is init.\n");
	}

	public void start()
	{
       System.out.println("Applet started .\n");
	}
	public void paint (Graphics g)
	{
		System.out.println("Applet just painted");
	}
   public void stop()
	{
	System.out.println("Applet stopped");
	}

	public void destroy()

	{
		System.out.println("Applet destroyed");

	}

}