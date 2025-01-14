class Demo 
{
	Demo()
	{
		System.out.println("in ctr.."+this);
	}

Abc meth()
	{
	System.out.println("in  meth..");
	return new Abc();
	}

}

class NestedDemo
	{
public static void main(String[] args) 
	{
        new Demo().meth().show();
		new Demo();
	}
}

class Abc
{
	void show()
	{
		System.out.println("in show..");
	}

}