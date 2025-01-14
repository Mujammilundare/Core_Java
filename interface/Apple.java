interface Fruit
{
   void taste();
}

interface Veg extends Fruit
{
	void eat();
}

class Apple extends Abc implements Veg//,Fruit
{
public void taste()
	{
      System.out.println(" an apple a day...");
	}

public void eat()
	{
      System.out.println(" vegitable contain vitamins...");
	}

public static void main(String args[])
	{
	    Apple	ob =new Apple();
		ob.taste();
		ob.eat();
	}
}

class Abc
{
}