import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ButtonEvent" width=200 height=200></applet>
*/
public class ButtonEvent extends Applet implements ActionListener
	{
       public void init()
			{
               Button b= new Button("Click here!");
                add(b);
                 b.addActionListener(this);
			}
				
				public void actionPerformed(ActionEvent ae)
						{
				        		System.out.println("Dont Click!!"+ae);
						 } 
			
			
				
	}
				
			
  

  /*
	b.addActionListener( new ActionListener()
					
				{

				

  */