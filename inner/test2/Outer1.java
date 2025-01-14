class Outer1
{
Outer1()
	{
	System.out.println("Outer");
	}

static class Inner 
	{

	Inner()
		{
	        System.out.println("Inner:"+this);
		}
	}

	
	public static void main(String[] args) 
	{
	Inner in1 = new Inner();
	//	Inner in2 = new Inner();
////Outer1 out=	new Outer1();

//new Outer.new Inner();
	}

}
