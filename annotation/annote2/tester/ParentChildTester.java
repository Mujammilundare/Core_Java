import java.io.*;

public class ParentChildTester 
	{
  public static void main(String[] args)
	  {
    
	try 
	{
      Child sub = new Child();
      sub.print(System.out);
    } 
	catch (Exception e) 
		{
			e.printStackTrace();
		}
  }
}

class Child extends Parent 
	{

  public void print(PrintStream out) throws IOException 
	  {
    out.println("Child printing...");
  }
}

@InProgress class Parent {

  public void print(PrintStream out) throws IOException {
    out.println("Parent printing...");
  }
}
           
         
