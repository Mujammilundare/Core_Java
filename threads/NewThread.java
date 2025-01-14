class NewThread implements Runnable
{
	String name;
	Thread t;
	NewThread(String str)
	{
		name = str;
		t = new Thread(this, name);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i = 5; i>0; i--)
			{
				System.out.println("child" +name+ ":" +i);
				Thread.sleep(500);
			}
		}
		catch( InterruptedException e)
		{
			System.out.println(name+"interruppted");
		}
			System.out.println(name+"exiting");
	}
}
			