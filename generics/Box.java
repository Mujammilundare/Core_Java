public class Box<T>
	{
  private T t;

  public void set(T t) 
	  {
          this.t = t;
      }

  public T get() 
	  {
           return t;
     }

  public static void main(String[] args)
	  {
     
	 Box<Integer> i = new Box<Integer>();
     Box<String> s = new Box<String>();
    
     i.set(new Integer(10));
     s.set(new String("Hello World"));

     System.out.printf("Integer Value :%d\n\n", i.get());
     System.out.printf("String Value :%s\n", s.get());
  }
}

