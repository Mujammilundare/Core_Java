import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ButtonEvent" width=200 height=200>
</applet>
*/
public class ButtonEvent11 extends Applet 
	{
       

	public void init()
			{
               Button b= new Button("Click here!");
                add(b);
               b.addActionListener(new MyEvent());
             } 

	
	private  class MyEvent implements ActionListener 
    {
		public void actionPerformed(ActionEvent ae)
					{
					System.out.println("Dont Click!!");
					
					}
	    }
        
}

