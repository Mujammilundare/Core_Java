abstract class Parent
{
  abstract  void meth(); // abstract method
     void conc()  //concrete method as it has body
	{
	  System.out.println("Hello");

}

class  Child extends Parent
{

void meth()
	{
      System.out.println("in child:meth");
	}


	public static void main(String[] args) 
	{
		Parent p = new Parent();
	     Child c = new Child();
		 c.meth();
	}
}
