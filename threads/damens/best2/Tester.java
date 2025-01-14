import java.awt.*;
 public class Tester 
	 {
    public static void  main(String[] args) 
		{
       Thread t1 = new Thread() 
		   {
          public void run() 
			  {
             Frame f = new Frame();
             f.setBounds(30, 30,400, 400);
            f.setVisible(true);
          }
       }; // end of t1

    t1.setDaemon(true);
       t1.start();

       try {
		   Thread.sleep(5000); 
	   }
       catch(InterruptedException 
          e) {}
    } // main()
} // Tester

