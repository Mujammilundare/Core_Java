

class  Demo1
{

static int i=2;
static void meth()
	{
		System.out.println("msg");
	}

	public static void main(String[] args) 
	{
//		Demo1 ob = new Demo1();
//		ob.meth();
		Demo1.meth();//class.meth name
		System.out.println(Demo1.i);//class.variable name
	}
}
