import java.awt.*;
import javax.swing.*;

class Window extends JFrame 
	{
   public Window () 
	   {
      super ("Window Title");
      setSize(400,100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setVisible(true);
      
	  Container c = getContentPane();
      c.setBackground(Color.lightGray);
      
	  FlowLayout flm = new FlowLayout();
      c.setLayout(flm);
      
	  JButton start = new JButton("Start");
      c.add(start);
      
	  JButton stop = new JButton("Stop");
      c.add(stop);
      
	  setContentPane(c);
 }
}



public class Demo 
	{
      public static void main(String[] args) 
		  {
                Window win = new Window();
         }
   }


