class DemoThread implements Runnable
{
	public void run()
	{
	System.out.println(Thread.currentThread());
	Thread.yield();
	//It Causes the currently executing thread to temporarily pause and allow other threads to execute.
	System.out.println(Thread.currentThread());
	}
}
public class YieldDemo0
{
public static void main(String[] args)
{
DemoThread obj=new DemoThread();
Thread t1=new Thread(obj,"Tom");
t1.start();

DemoThread obj1=new DemoThread();
Thread t2=new Thread(obj1,"Jerry");
t2.start();
}
}
