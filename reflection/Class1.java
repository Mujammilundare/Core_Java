class Abc
{

}


class Class1 
{
	public static void main(String[] args)  throws Exception
	{
 Abc ob=new Abc();

System.out.println(ob.getClass().getName());

Class c2=Class.forName("Abc");
System.out.println(c2);

	}
}




















