//Program of performing single task by multiple threads

class Multi extends Thread
	{
 public void run()
	 {
		 System.out.println("task one");
		 System.out.println(Thread.currentThread());
	 }
 public static void main(String args[])
	 {
		  Multi t1=new Multi();
		  Multi t2=new Multi();
		  Multi t3=new Multi();

		  t1.start();
		  t2.start();
		  t3.start();
  }
}

