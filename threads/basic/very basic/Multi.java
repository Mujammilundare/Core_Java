class Multi extends Thread
	{
public void run()
	{
		System.out.println("thread is running...");
	


	}
	public static void main(String args[]) throws InterruptedException
	{
		Multi t1=new Multi();
System.out.println("before start");
		t1.start();
       t1.join();
System.out.println("after start and main exits");

	}
}


//	try{Thread.sleep(5000);}catch(Exception e){}