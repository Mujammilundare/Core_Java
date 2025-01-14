public class ThreadGroupManager 
	{ 
public static void main(String[] args)
	{ 
ThreadGroup group = new ThreadGroup("My thread group Singh"); 
Thread1 t1 = new Thread1(); 
Thread2 t2 = new Thread2(); 
Thread th1 = new Thread(group, t1); 
Thread th2 = new Thread(group, t2); 
th1.start(); 
th2.start(); 
} 
} 
class Thread1 implements Runnable 
	{ 
public void run() { 
	System.out.println(Thread.currentThread());
System.out.println("Inside run of Thread 1"); 
} 
} 
class Thread2 implements Runnable 
	{ 
public void run() { 
System.out.println("Inside run of Thread 2"); 
} 
}