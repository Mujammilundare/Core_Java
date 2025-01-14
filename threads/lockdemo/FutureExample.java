/*
The Future interface represents the result of an asynchronous computation.
Future provides methods to check if the computation is complete, to wait for its completion,
and to retrieve the result of the computation. 
You call one of the three submit methods of ExecutorService to get a Future object: 
<T> Future<T> submit(Callable<T> task) 
<T> Future<T> submit(Runnable task, T result) 

Future<?> submit(Runnable task) 

Use the first two to retrieve usable results from the computation.
The third option returns a Future that returns null upon successful completion. 
It is used to simply wait for the task to complete, much like Thread.join()
*/

import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutionException;
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
			else 
				{
				this.counter.decrement();
			}
		}
		}
}

public class FutureExample 
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

    private static void test(ExecutorService executor) 
		   throws ExecutionException, InterruptedException {
	Counter counter = new Counter();

	Future<?> f1 = executor.submit(new Worker(counter, true, 10000));
	Future<?> f2 = executor.submit(new Worker(counter, false, 10000));

	// reject new tasks, must call in order to exit VM
	executor.shutdown();

	// wait for termination, much like Thread.join()
	f1.get();
	f2.get();

	System.out.println("Final count: " + counter.getCount());
    }
}

