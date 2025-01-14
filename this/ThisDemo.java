class Demo
{
	int i;
	Demo(int i)
	{
     this.i=i;
	  System.out.println("local variable "+i);
	}
    void print()
	{
     System.out.println("print instance varaible"+i);
	}
}

class ThisDemo 
{
	public static void main(String[] args) 
	{

	Demo ob = new Demo(5);
        ob.print();
	}
}
