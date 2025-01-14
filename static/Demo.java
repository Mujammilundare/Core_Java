class  Demo
{
static  int i=5;
static void fun()
	{
		System.out.println("in fun...");
	}

	public static void main(String[] args) 
	{
             //through object
	/*             //through object
Demo ob = new Demo();
System.out.println(ob.i);
ob.fun();
*/

	Demo.fun();  //Class.methodName
  System.out.println(Demo.i);     //class.varName

     fun();
	}
}


