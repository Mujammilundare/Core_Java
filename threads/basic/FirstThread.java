class Thread1 extends Thread
{
	public void run()
	{
    	System.out.println("running........");
	}	
}
public class FirstThread
{
	public static void main(String[] args)  
	{	
    	Thread1  t1 = new Thread1();
		t1.start();

   }
}
