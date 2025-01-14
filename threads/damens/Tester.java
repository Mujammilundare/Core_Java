 import java.awt.*;
 import java.awt.event.*;
 
 public class Tester 
	 {
     public static void  main(String[] args) 
		 {
        Frame f = new Frame();
 
        f.addWindowListener(new WindowAdapter() 
			{
           public void windowClosing(WindowEvent evt) 
			   {
                  System.exit(0);
              }
           });
      f.setBounds(30, 30, 400, 400);
      f.setVisible(true);
    }
}

