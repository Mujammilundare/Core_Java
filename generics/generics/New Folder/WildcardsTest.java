
import java.util.*;

class Animal
{	Animal()
	{
	System.out.println("Animal");
	}
}

class Cat extends Animal
{
	private String c;
	
	Cat(String c)
	{
		this.c = c;
	}
	public String toString()
	{
		return " Cat " +c;
	}
}
class Dog extends Animal
{
	private	String d;
	
	Dog( String d)
	{
		this.d = d;
	}
	public String toString()
	{
		return " Dog"+d;
	}
}

class Bird
{
	private	String b;
	
	Bird(String b)
	{
		this.b = b;
	}
	public String toString()
	{
		return " Bird " + b;
	}
}
////////////////////////////////////////////////////////

class CollectionDetails
{
	void printCollection(Collection<?> collect)
	{
		System.out.println("Inside printCollection() ");
		for (Object obj: collect)
	      System.out.println(obj.toString());
	}
	
}

/////////////////////////////////////////////////
class WildcardsTest
{
	public static void main(String[] args)
	{

		ArrayList<Bird> bird = new ArrayList<Bird>();
 
		bird.add(new Bird("sparow"));
		bird.add(new Bird("parot"));
		
		ArrayList<Cat> cat = new ArrayList<Cat>();
 
		cat.add(new Cat("Black"));
		cat.add(new Cat("White"));

		ArrayList<Dog> dog = new ArrayList<Dog>();
 
		dog.add(new Dog("moti"));
		dog.add(new Dog("sheru"));

		CollectionDetails obj1 = new CollectionDetails();

	
		System.out.println("Cat Details : ");
		obj1.printCollection(cat);

		System.out.println("Dog Details : ");
		obj1.printCollection(dog);

       System.out.println("Dog Details : ");
		obj1.printCollection(bird);

	
	}
}


/*

//test for super
		ArrayList<Animal> a = new ArrayList<>();
 
		 a.add(new Animal());
		 a.add(new Animal());
		
		
		CollectionDetails obj1 = new CollectionDetails();

	
		System.out.println(" Animal : ");
		obj1.printCollection(a);


		ArrayList<Object> a1 = new ArrayList<>();

		 a1.add(new Object());
		 a1.add(new Object());


	
		System.out.println(" Object : ");
		obj1.printCollection(a1);

*/


