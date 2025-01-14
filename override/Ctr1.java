class Parent
{
	Parent()
	{
		System.out.println("in Parent");
	}
	Parent(int i)
	{   this();
		System.out.println("in Parent"+i);
	}
}

class Child extends Parent
{
	Child(int i)
	{super(i);
		System.out.println("in Child1");
	}
}
class Ctr1
{
	public static void main(String[] args) 
	{
         Child c =new Child(2);
	}
}
