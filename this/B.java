
class A
{
	A()
	{
				this.m();
		System.out.println("A---->"+this);

	}
	void m()
	{
		System.out.println("m");
	}

	
}

class B extends A
{
	B()
		{

		System.out.println("B---->"+this);
			
	    }


}


class  Demo
{
	public static void main(String[] args) 
	{
//		A a = new A();
		B b=new B();
 	}
}
