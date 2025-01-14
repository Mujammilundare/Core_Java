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
      
	  GridBagLayout gb = new GridBagLayout(); 
      c.setLayout(gb);
	  GridBagConstraints gbc = new GridBagConstraints(); 

      
	  JButton b1 = new JButton("Start Test 1");
      gbc.gridx = 1;
      gbc.gridy = 0;
	  gbc.gridwidth=2;
//	  gbc.gridhe
      
	  c.add(b1,gbc);
      
	  JButton b2 = new JButton("Start Test 2");
      gbc.gridx = 1;
      gbc.gridy = 1;
      
	  c.add(b2,gbc);
      setContentPane(c);
   }
}

   public class Demo2 {
      public static void main(String[] args) {
         Window win = new Window();
      }
}

