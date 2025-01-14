class Outer 
{
	int i=500;
Outer()
	{
		System.out.println("outer");
	}

class Inner
	{ 
					Inner()
						{
						   System.out.println("Inner");
						}
				void m()
					{
						System.out.println(i);
				}

	}

}

class InnerTest
{
	public static void main(String[] args) 
	{

//Inner in = new Inner();
 //Outer o =new Outer();
//Inner in = o.new Inner();

new Outer().new Inner().m();
	 
//Outer o1  = new Outer();
//Outer.Inner inn =  o1.new Inner();

	}
}