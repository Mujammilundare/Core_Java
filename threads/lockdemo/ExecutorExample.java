/*
The Java Executor interface replaces the call new Thread(new RunnableTask()).start() 
with executor.execute(new RunnableTask()).
The concurrent package provides built-in utility classes to manage threads so 
that you don't need to worry about them. 

*/

import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
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

    public void run() {
	for (int i = 0; i < this.count; i++) {
	    if (increment) {
		this.counter.increment();
	    }
	    else {
		this.counter.decrement();
	    }
	}
    }
}




public class ExecutorExample 
	{
    public static void main(String[] args) throws Exception 
		{
	System.out.println("Using fixed thread pool:");
	ExecutorService executor = Executors.newFixedThreadPool(2);
	test(executor);

	System.out.println("\nUsing cached thread pool:");
	executor = Executors.newCachedThreadPool();
	test(executor);

	System.out.println("\nUsing single thread executor:");
	executor = Executors.newSingleThreadExecutor();
	test(executor);
    }

    private static void test(ExecutorService executor) throws InterruptedException 
		{
	Counter counter = new Counter();

	executor.execute(new Worker(counter, true, 10000));
	executor.execute(new Worker(counter, false, 10000));

	// reject new tasks
	executor.shutdown();

	// wait for termination
	executor.awaitTermination(60, TimeUnit.SECONDS);

	System.out.println("Final count: " + counter.getCount());
    }
}
