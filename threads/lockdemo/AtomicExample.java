//The java.util.concurrent.atomic package is a small toolkit of classes
//that support lock-free thread-safe programming on single variables. 
//This is an example of a shared counter without synchronization or 1:

import java.util.concurrent.atomic.AtomicInteger;


class Counter 
	{                 
    private AtomicInteger c = new AtomicInteger(0);

    public void increment() {
	c.getAndIncrement();
    }

    public void decrement() {
	c.getAndDecrement();
    }

    public int getCount() {
	return c.get();
    }
}

class Worker implements Runnable 
	{
    private Counter counter;
    private boolean increment;
    private int count;

    public Worker(Counter counter, boolean increment, int count) {
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

public class AtomicExample 
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

