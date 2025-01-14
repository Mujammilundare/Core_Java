class Animal 
{
public void speak() {}
public String getType() 
	{
		return "Generic animal";
	}
}

public class Cat extends Animal 
	{

public void speak() 
	{ // This is a good override.
		System.out.println("Meow.");
	}
//	@Override
public String gettype() 
	{ 
	   return "Cat";
	}
}

