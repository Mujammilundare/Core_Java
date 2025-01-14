class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("running.........!");
	}
}


 class FirstThread11
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(Thread.currentThread());
	
		Thread1  th = new Thread1();
		th.setDaemon(true);

       System.out.println("d.isDaemon() = " + th.isDaemon());
    	th.start();
      System.out.println("d.isDaemon() = " + th.isDaemon());

	}
}
