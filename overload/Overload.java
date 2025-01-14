class Demo
{
void show()
	{
		System.out.println("in show");
	}
void  show(int i)
	{
	  System.out.println("in show one param");
	  
	}
}

class Overload 
{
public static void main(String[] args) 
	{
         Demo d =new Demo();
		 d.show();
		 d.show(10);

	}
}
