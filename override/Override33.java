 class Parent
{
private void show() 
	{
	System.out.println("in Parent");
	}
}

class Child  extends Parent
{

public  void  show() 
	{  
 		System.out.println("in Child");
	}

}
class Override33
{
	public static void main(String[] args) 
	{
         Child c =new Child();
 			c.show();
	}
}
