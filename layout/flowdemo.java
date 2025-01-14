import java.awt.*;
import java.applet.Applet;
import javax.swing.*;


//<applet code="flowdemo.class" height = 75 width=175> </applet>

public class flowdemo extends Applet 
{

	public void init()
	{

FlowLayout flow = new FlowLayout();
  setLayout(flow);

//GridLayout grid = new GridLayout(2,3);
	//setLayout (grid);
	
//	BoxLayout box=	new BoxLayout (this, BoxLayout.Y_AXIS);
//setLayout (box);
//setLayout (new BoxLayout(this, BoxLayout.X_AXIS));




setLayout (new BorderLayout(50,100));


	JButton b1=new JButton("NORTH");
	JButton b2=new JButton("SOUTH");
	JButton b3=new JButton("EAST");
	JButton b4=new JButton("WEST");
	JButton b5=new JButton("CENTER");
	
	add(b1,BorderLayout.NORTH);
	add(b2,BorderLayout.SOUTH);
	add(b3,BorderLayout.EAST);
	add(b4,BorderLayout.WEST);
	add(b5,BorderLayout.CENTER);


	}
}



	