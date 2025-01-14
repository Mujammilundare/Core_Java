class  Test1
{

static void meth() 
	{
	  int x=1;
      
	  assert (x>0):"what are u doing!!"; 
      System.out.println("greater than zero");   
      System.out.println("vvvvvvvvvv");   
   }

	public static void main(String[] args) 
	{
        meth();
    }

}

/*
C:\assertion>javac Test1.java

C:\assertion>java Test1
greater than zero

C:\assertion>java -ea Test1
Exception in thread "main" java.lang.AssertionError
        at Test1.meth(Test1.java:7)
        at Test1.main(Test1.java:13)
*/