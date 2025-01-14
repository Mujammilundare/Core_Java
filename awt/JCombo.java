import java.applet.*;
import java.awt.*;
import java.awt.event.*;


//<applet code="JCombo.class" width=250  height=250   ></applet>

public  class  JCombo extends Applet implements ActionListener
 {	
 public void init()
	{  
		Button b = new Button("Click here!");
	    add(b);
		b.addActionListener(this);
      }

public void actionPerformed(ActionEvent e)
	 {
    	System.out.println(e);
     }

}