public final class Foo implements Runnable 
	{
@Override public void run()
	{
	System.out.println("child running...");
	// ...
	}
public static void main(String[] args) 
	{
Foo foo = new Foo();
new Thread(foo).start();
//new Thread(foo).run();
}
}
