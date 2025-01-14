interface MyInterface { }

class MyObject implements MyInterface
{
}

public class Program 
	{
  public static void main(String[] args) {  
    
	MyObject obj = new MyObject();
    
	String   s = "hello";  

    // false, but legal
    
	 System.out.println(obj instanceof MyInterface); 
     System.out.println(obj instanceof MyObject); 
     System.out.println(obj instanceof Object); 
  
	// compiler error, String is final class
//    System.out.println(s instanceof MyInterface);  
  }
}