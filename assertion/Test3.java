class  Test3
{
//	int assert;
	static String msg()
	{
		return "WoW !!What a Error!!";
	}

static void meth() 
	{
	  int x=-1;
     assert (x>0) : msg() ; 
    System.out.println("greater than zero");   
   }

	public static void main(String[] args) 
	{
        meth();
    }

}

/*

Test3.java:3: error: as of release 1.4, 'assert' is a keyword, and may not be us
ed as an identifier
        int assert;
            ^
C:\assertion>javac Test3.java

C:\assertion>java Test3
greater than zero

C:\assertion>java -ea Test3
Exception in thread "main" java.lang.AssertionError: WoW !!What a Error!!
        at Test2.meth(Test2.java:7)
        at Test2.main(Test2.java:13)
*/