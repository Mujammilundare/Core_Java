class A
{
	A()
	{
		System.out.println("empty");
	}
	A(int a)
	{
		System.out.println("A "+a);
	}
	A(int a, int b)
	{
		System.out.println("A "+a+""+b);
	}

}

class B extends A
{
	B(int i)
		{
		   super(10,20);
		System.out.println("in B ctr");
	    }
	
}


class  Demo
{
	public static void main(String[] args) 
	{
		B b=new B(10);
 	}
}
