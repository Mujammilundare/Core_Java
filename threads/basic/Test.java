public class Test implements Runnable 
	{
public void run() 
	{
    System.out.print("test"+Thread.currentThread());
    }
public static void main(String[] args) 
	{
Thread t = new Thread(new Test());
t.start();
t.run();
} 
} 