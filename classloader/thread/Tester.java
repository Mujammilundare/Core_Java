public class Tester 
	{
     public static void  main(String[] args) 
		 {
       Thread t1 = new Thread() 
		   {
           public void run() 
			   {
						 // Fire off a new  thread.
							 Thread t2 = new   Thread() 
								 {
									 public void run()  
									  {
									   while(true)
									   System.out.println("Pleased to  meet you.");
										}
								 }; // end of t2
							  t2.start();
				 }
      }; // end of t1
      // t1.setDaemon(true);
   t1.start();
  for(int i = 0; i < 50; ++i)
System.out.println("Hope you   guess my name.");
      System.out.println("Main  thread is about to end.");
   } // main()
} // Tester
