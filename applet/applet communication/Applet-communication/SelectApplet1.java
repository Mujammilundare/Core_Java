


import java.applet.*;
import java.awt.*;
import java.awt.event.*;
 
//<applet code="SelectApplet1.class" width="200" height="200"></applet>

public class SelectApplet1 extends Applet implements ActionListener
  {

     private Button r,g,b;
     private OvalApplet1 ovalApp;
     private AppletContext ctx;
     
	public  SelectApplet1()
	{
		r=new Button("RED");
		g=new Button("GREEN");
		b=new Button("BLUE");
		
		r.addActionListener(this);
		g.addActionListener(this);
		b.addActionListener(this);
		
		add(r);
		add(g);
		add(b);
		
	}
	
  public void actionPerformed(ActionEvent ae)
  {
  	  ctx=getAppletContext();
  	 ovalApp= (OvalApplet1)ctx.getApplet("OAPP");
  	 
  	 if(ae.getActionCommand().equals("RED"))
  	  
  	  	 ovalApp.setColor(Color.red);
  	  	 
  	  
  	  
  	 if(ae.getActionCommand().equals("GREEN"))
  	  
  	  ovalApp.setColor(Color.green);
  	  
  	  
  	 if(ae.getActionCommand().equals("BLUE")) 	
  	 
  	 	 ovalApp.setColor(Color.blue);
  	 	 
  	 
  	ovalApp.repaint();
  }
  	 		 
 
   	 
				
}
