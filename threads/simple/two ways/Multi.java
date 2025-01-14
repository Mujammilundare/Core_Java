	import java.io.*;

class Multi extends Thread
	{
		public void run()
		{
			try
			{
				System.out.println("running.............");
				Thread.sleep(5000);
			}
			catch (Exception e)
			{
			}

		}


public static void main(String args[]) throws Exception
	{

		 Multi ob =	new Multi();
		   ob.start();
		  ob.join();   
		System.out.println("after start and java prog exits........");

     }
}