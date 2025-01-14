import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ButtonEvent2" width=200 height=200>
</applet>
*/
public class ButtonEvent2 extends Applet    
	{
       
	public void init()
			{
               Button b= new Button("Click here!");
                add(b);
               b.addActionListener( new ActionListener()
				{
				   public void actionPerformed(ActionEvent ae)
					{
					System.out.println("Dont Click!!");
					}

				}
				   
			   
			   
			   );
             } 

}

