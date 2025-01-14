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
class Override2
{
	public static void main(String[] args) 
	{

Child c = new Child();
c.show();
	
	}
}
