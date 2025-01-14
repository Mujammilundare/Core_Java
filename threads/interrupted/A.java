class A extends Thread
	{
public void run()
	{
	System.out.println("in run......");
				try{
					Thread.sleep(1000);
					System.out.println("task............");
					}catch(InterruptedException e)
					  {
								throw new RuntimeException("Thread interrupted..."+e);
						}
						System.out.println("thread is running...");

}

public static void main(String args[]){
A t1=new A();
t1.start();

try
	{
System.out.println("before interrup");
t1.interrupt();
System.out.println("after interrup");

}catch(Exception e)
	{
	  System.out.println("Exception handled "+e);
   }
  }
}