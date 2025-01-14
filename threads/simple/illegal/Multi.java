//Can u start a thread twice
//you does so, an IllegalThreadStateException is thrown.

class Multi extends Thread
	{
 public void run()
	 {
		   System.out.println("running...");
	}
 public static void main(String args[])
	 {
  Multi t1=new Multi();
  t1.start();
  t1.start();
 }
}