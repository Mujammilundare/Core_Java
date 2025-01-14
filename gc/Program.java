class MyObject 
	{ 
  public void finalize () throws Throwable 
	  {
        super.finalize();
       System.out.println("finalize");
    } 
}

class Program
	{
  public static void main(String[] args) throws Throwable {
    MyObject obj = new MyObject();
    obj.finalize();    //Line A
    obj.finalize();    //Line B
    System.out.println("Prepare GC...");
    obj = null;
    System.gc();
    
  }
}
