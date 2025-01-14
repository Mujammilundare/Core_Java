class Banana 
{
	void f(int i) { System.out.println("banana..."+this);} 
}


class  ThisDemo
{

ThisDemo()
	{
	Banana a = new Banana(), b = new Banana();  //se the style
	a.f(1);
	b.f(2);
	}

	public static void main(String[] args) 
	{
          new ThisDemo();
	}
}
