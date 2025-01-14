import java.util.concurrent.locks.ReentrantLock; 
import java.util.concurrent.locks.Lock; 

/*zz
class Counter 
	{
    private int count;

    public  synchronized void increment() {
	count++;
    }

    public  synchronized void decrement() {
	count--;
    }

    public int getCount() {
	return count;
    }



}
*/


class Counter {
    private int count;

	private Lock lock = new ReentrantLock();

    public void increment() 
		{
	try {
	    lock.lock();
	    count++;
	}
	finally {
	    lock.unlock();
	}
    }

    public void decrement() 
		{
	try {
	    lock.lock();
	    count--;
	}
	finally {
	    lock.unlock();
	}
    }

    public int getCount() {
	return count;
    }
}






class Worker implements Runnable 
	{
    private Counter counter;
    private boolean increment;
    private int count;

    public Worker(Counter counter, boolean increment, int count) 
		{
			this.counter = counter;
			this.increment = increment;
			this.count = count;
     }

    public void run() 
		{
				for (int i = 0; i < this.count; i++) 
					{
					if (increment) 
						{
							this.counter.increment();
						 }
				 else {
							this.counter.decrement();
						}
	    			}
    }
}


public class LockExample 
	{
    public static void main(String[] args) throws Exception 
		{
	Counter counter = new Counter();
	Thread t1 = new Thread(new Worker(counter, true, 10000));
	t1.start();
	Thread t2 = new Thread(new Worker(counter, false, 10000));
	t2.start();

	t1.join();
	t2.join();
	System.out.println("Final count: " + counter.getCount());
    }
}




