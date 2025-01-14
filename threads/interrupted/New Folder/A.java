class A extends Thread
	{
public void run()
	{
				try{
							System.out.println("before task");
								Thread.sleep(3000);
								System.out.println("after task");
					}
				catch(InterruptedException e)
					{
						System.out.println("Exception handled "+e);
					}
System.out.println("thread is running...");
}

public static void main(String args[]){
A t1=new A();
t1.start();

t1.interrupt();

}
}