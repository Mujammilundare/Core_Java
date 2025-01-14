class A 
{
	A()
	{
		System.out.println("in A ctr");
	}
	
}

class B extends A
{
	B()
	{
      System.out.println("in B ctr");
	}
}
class C extends B
{
	C()
	{
      System.out.println("in C ctr");
	}
}

class  CtrDemo
{
	public static void main(String[] args) 
	{
		C c=new C();
 	}
}
