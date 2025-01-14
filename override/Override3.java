 class Parent
{
 void show() 
	{
	System.out.println("in Parent");
	}
}

class Child  extends Parent
{
 void  show() 
	{  
 		System.out.println("in Child");
	}

}
class Override3
{
	public static void main(String[] args) 
	{
         Child c =new Child();
 			c.show();
  final			int i=5;
			i=6;
			System.out.println(i);
	}
}
