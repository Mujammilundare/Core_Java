class Demo 
{
int i;
void meth()
	{
	System.out.println("in meth..");
	}


	public static void main(String[] args) 
	{
        Demo ob1 = new Demo();
		System.out.println(ob1.i);
		ob1.meth();

	
        Demo ob2 = new Demo();
        ob2.i=5;
		System.out.println(ob2.i);
		ob2.meth();

	
	}
}
