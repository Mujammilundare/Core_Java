class MyThread extends Thread
	{
MyThread(String str)
		{
	super(str);
		}

 public void run()
	 {
  System.out.println("Daemon: "+Thread.currentThread().isDaemon()+""+"Name: "+Thread.currentThread().getName());
	}

 public static void main(String[] args)
	 {
  MyThread t1=new MyThread("rohit");
  MyThread t2=new MyThread("ajay");
//  t1.setDaemon(true);
  
  t1.start();
  t1.setDaemon(true);
  t2.start();
 }
}

