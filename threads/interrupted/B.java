
class B extends Thread
	{

 void run()
	{
		try{
			System.out.println("sone ke tayarri");
			Thread.sleep(3000);
			System.out.println("task");
			}
			catch(InterruptedException e)
			{
			System.out.println("InterruptedExceptio .............................");
//		       throw new RuntimeException("Thread interrupted..."+e);
			}
			System.out.println("cake processing .........................................");

}

public static void main(String args[])
	{
B t1=new B();
t1.start();

		t1.interrupt();
}
}

