public class Box<T>
	{
  private T t;
  public void add(T t) 
	  {
         this.t = t;
      }
  public T get() 
	  {
	    return t;
	  }

-------------------------------------------------
 class TwoGen<T, V> 
	{
  T ob1;
  V ob2;

  TwoGen(T o1, V o2) 
	  {
    ob1 = o1;
    ob2 = o2;
    }


  T getob1() {
    return ob1;
  }

  V getob2() {
    return ob2;
  }

-------------------------------------------------

public static < E > void print( E[] arr )
   {
             for ( E element : arr )
				 {        
		            System.out.printf( "%s ", element );
				 }
    }