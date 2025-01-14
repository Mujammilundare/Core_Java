class FirstThread2 implements Runnable
{
	Thread t;
	FirstThread2()
	{
        t = new Thread(this);
//	t.start();
	}
	public void run()
	{
		System.out.println("hi!");
		System.out.println(Thread.currentThread());
     }
			

	public static void main(String[] args) 
	{
       FirstThread2 ob =new FirstThread2();
	   	ob.t.start();
				System.out.println(Thread.currentThread());


	}
}

