class DemoThread implements Runnable
{
	public void run()
	{

		for (int i=0;i<10;i++ )
		{	Thread.yield();
               System.out.println("in child thread");
			   		   try{
			   Thread.sleep(2000);
		   }catch(Exception e){ System.out.println(e);}
		
		

		}
	}
}
public class YieldDemo1
{
public static void main(String[] args)
{

DemoThread obj=new DemoThread();
Thread t1=new Thread(obj);
t1.start();
		for (int i=0;i<10;i++ )
		{
           System.out.println("in main thread");
		   try{
			   Thread.sleep(2000);
		   }catch(Exception e){ System.out.println(e);}
}
}
}