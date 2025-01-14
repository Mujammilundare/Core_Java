class  Gen1
{
	public static void main(String[] args) 
	{

Apple[] apples = new Apple[1];  
 Fruit[] fruits = apples;  
 fruits[0] = new Strawberry(); 
		System.out.println("Hello World!");
	}
}


class Fruit 
	{
	}

class Apple extends Fruit
	{
	}

class Strawberry extends Fruit
	{
	}

