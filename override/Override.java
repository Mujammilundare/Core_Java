 
 class Parent
{
  void show( )
	{
	System.out.println("in Parent");
	}
}

class Child  extends Parent
{
	void show( )
	{
	System.out.println("in  Child");
	}

}

class Override
{

public static void main(String[] args) 
	{
             Child ob = new Child ();
			 ob.show();
	}


}
