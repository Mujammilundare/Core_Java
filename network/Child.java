class Parent
{
    public void print()		// I
    {
       System.out.println("Parent");
    }

	public void unknown()
	{
		System.out.println("unknow");
	}


}   
public class Child extends Parent
{
    public void print()		// II
    {
       System.out.println("Child");
    }

	public void show()
	{
		System.out.println("raj");
	}
    public static void main(String args[])
    {
       Parent p = new Parent();
       Child c = new Child();
 
       p.print();			// I
       c.print();			// II
//	   c.unknown();
 
//       p = c;             // subclass to super class, it is valid
  //     p = (Parent)c;  //         not needed
    //   p.print();			// II

   c=(Child)p;

//	   
	//p.show();
//       p.unknown();
 }
}