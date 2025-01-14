//Yields execution control to another thread.



public class YieldDemo implements Runnable
{
    public static void main(String[] args)
    {
        YieldDemo p = new YieldDemo();
        p.init();
    }

    public void init()
    {
        try
        {
            // Create a second thread and start it.
            Thread thr2 = new Thread(this);
            System.out.println("Starting " +thr2.getName() + "...");
            thr2.start();

            // Create a third thread and start it.
            Thread thr3 = new Thread(this);
            System.out.println("Starting " +thr3.getName() + "...");
            thr3.start();

            // Display the number of active threads.  This
            // count includes the main thread.
            System.out.println("Active threads = " + Thread.activeCount());

            // Block until the other threads finish.
            thr2.join();
            thr3.join();
        }
        catch (InterruptedException ex)
        {
            System.out.println(ex.toString());
        }
    }

    // Implements Runnable.run()
      private int counter = 0;
	public void run()
    {
        for (int i = 0; i < 10000000; i++)
        {
            // Yield control to another thread every
            // 1000000 iterations.
            if ((i % 1000000) == 0)
            {
                System.out.println(Thread.currentThread().getName() + " is yielding control...");
                Thread.currentThread().yield();
            }
        }

        System.out.println(Thread.currentThread().getName() +" has finished executing.");
    }


}


