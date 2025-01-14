public class FirstThread3 implements Runnable 
   {
   public void run() 
	   {
			   System.out.println("running!!");
       }

   public static void main(String args[])  
	   {
      FirstThread3 Tt = new FirstThread3();
	  Thread t = new Thread(Tt);
   	  t.start();
	
   }
}


