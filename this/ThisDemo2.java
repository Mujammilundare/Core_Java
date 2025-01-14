class A
{
	A()
	{
		System.out.println("empty");
	}
	A(int a)
	{  this();
		System.out.println(a);
	}

	A(int a ,int b)
	{
		this(a);
		System.out.println(a+"  "+b);
	}
   
}


class ThisDemo2 
{
	public static void main(String[] args) 
	{
               A ob=new A(10,20);
	}
}
