 class AutoCloseableResource implements AutoCloseable 
	{

    @Override
    public void close() 
		{
          System.out.println("in close()");
          throw new RuntimeException("Exception in close()");
       }

    public void work() throws Exception 
		{
         System.out.println("in work()");
          throw new Exception("Exception in work()");
      }
}


public class AutoCloseableTest 
	{

    public static void main(String[] args) 
		{
        try (AutoCloseableResource resource = new AutoCloseableResource()) 
			{
               resource.work();
            }
			catch (Exception e) 
			{
                 e.printStackTrace();
              }
           }
   } 

/*
Z:\>javap java.io.Closeable
Compiled from "Closeable.java"
public interface java.io.Closeable extends java.lang.AutoCloseable {
  public abstract void close() throws java.io.IOException;
}

Z:\>javap java.lang.AutoCloseable
Compiled from "AutoCloseable.java"
public interface java.lang.AutoCloseable {
  public abstract void close() throws java.lang.Exception;
}

*/