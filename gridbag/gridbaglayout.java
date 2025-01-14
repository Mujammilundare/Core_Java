import java.awt.*;
import javax.swing.*;
public class Demo 
	{
      public static void main(String[] args) 
		  {
                Window win = new Window();
         }
   }

class Window extends JFrame 
	{
   public Window () 
	   {
      super ("Window Title");
      setSize(400,100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      setVisible(true);
      Container ca = getContentPane();
      ca.setBackground(Color.lightGray);
      FlowLayout flm = new FlowLayout();
      ca.setLayout(flm);
      JButton start = new JButton("Start");
      ca.add(start);
      JButton stop = new JButton("Stop");
      ca.add(stop);
      setContentPane(ca);
 }
}

