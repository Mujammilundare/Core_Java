class  Test2
{

static void meth() 
	{
     int x=-1;
     assert (x>0) : "X is" + x ; 
	 System.out.println("greater than zero");   
   }

	public static void main(String[] args) 
	{
        meth();
    }

}

/*

C:\assertion>javac Test2.java

C:\assertion>java Test2
greater than zero

C:\assertion>java -ea Test2
Exception in thread "main" java.lang.AssertionError: X is-1
        at Test2.meth(Test2.java:7)
        at Test2.main(Test2.java:13)
*/