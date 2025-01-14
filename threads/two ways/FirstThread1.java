class Thread1 extends Thread
{
	public void run()
	{		//System.out.println(Thread.currentThread());
			System.out.println("hi this is child running");
	}
}

public class FirstThread1
{
	public static void main(String[] args)
	{
//		System.out.println(Thread.currentThread());
		Thread1  th = new Thread1();
//		th.setName("pradeep");
	//	th.setPriority(7);
		//th.setPriority(Thread.MAX_PRIORITY);
		System.out.println("before");
		th.start();

	//	try{Thread.sleep(3000);}catch(InterruptedException e){}
	try{	  th.join();}catch(InterruptedException e){}

    	
		System.out.println("after  main prog exits!!");
	}
}
