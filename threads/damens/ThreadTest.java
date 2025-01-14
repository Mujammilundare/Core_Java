class  ThreadTest
{

public static void main(String[] args) 
	{
	Thread t = new Thread() 
	{
	
	 public void run() 
		 {
           System.out.println("I'm a man of wealth and taste...");
         }
  };
//Note that the setDaemon() method must be 
//called before the thread's start() method is invoked
t.setDaemon(true);
System.out.println(Thread.currentThread());
t.start();



	}
}
