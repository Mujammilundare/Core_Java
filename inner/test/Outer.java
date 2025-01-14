class Outer 
{
static private int i=5;  

private  interface Inter
{
	 int i=100;
	 void intermeth();
}

Outer()
	{
		System.out.println("outer");
	}

	Outer(int i)
	{
		System.out.println("outer with parm");
	}
	void m()
	{
		System.out.println("M");
	}

class Inner extends Outer implements Inter
	{
	Inner()
		{ super(10);
           System.out.println("Inner"+i);
		}
public void intermeth()
		{
	System.out.println("intermeth Impl");
		}
	}

	public static void main(String[] args) 
	{

// Outer o =new Outer();
 //Inner in = o.new Inner();

new Outer().new Inner().intermeth();
	 
// Outer o1  = new Outer();
//Outer.Inner inn =  o1.new Inner();


	}
}
