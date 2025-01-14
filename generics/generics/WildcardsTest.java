package generics;

//WildcardsTest.java

import java.util.*;

class Animal
{
}

class Cat extends Animal
{
	private int catNo;
	private	String catColor;
	
	Cat(int catNo, String catColor)
	{
		this.catNo = catNo;
		this.catColor = catColor;
	}
	public String toString()
	{
		return " Cat No: " + catNo + " & Cat Color" + catColor;
	}
}
class Dog extends Animal
{
	private int dogNo;
	private	String dogColor;
	
	Dog(int dogNo, String dogColor)
	{
		this.dogNo = dogNo;
		this.dogColor = dogColor;
	}
	public String toString()
	{
		return " Dog No: " + dogNo + " & Dog Color" + dogColor;
	}
}
////////////////////////////////////////////////////////
class Bird
{
	private int birdNo;
	private	String birdColor;
	
	Bird(int birdNo, String birdColor)
	{
		this.birdNo = birdNo;
		this.birdColor = birdColor;
	}
	public String toString()
	{
		return " Bird No: " + birdNo + " & Bird Color" + birdColor;
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
	
	void printDerivedCollection(Collection<? extends Animal> collect)
	{
			System.out.println("Inside printDerivedCollection() ");
		for (Object obj: collect)
	      System.out.println(obj.toString());
	}
}

/////////////////////////////////////////////////
class WildcardsTest
{
	public static void main(String[] args)
	{

		ArrayList<Bird> birdList = new ArrayList<Bird>();
 
		birdList.add(new Bird(10,"Blue"));
		birdList.add(new Bird(11,"Green"));
		
		ArrayList<Cat> catList = new ArrayList<Cat>();
 
		catList.add(new Cat(20,"Black"));
		catList.add(new Cat(21,"White"));

		ArrayList<Dog> dogList = new ArrayList<Dog>();
 
		dogList.add(new Dog(30,"Brown"));
		dogList.add(new Dog(31,"Light Brown"));

		CollectionDetails obj1 = new CollectionDetails();

		System.out.println("Bird Details : ");
		obj1.printCollection(birdList);

		System.out.println("Cat Details : ");
		obj1.printCollection(catList);

		System.out.println("Cat Details : ");
		obj1.printDerivedCollection(catList);

		System.out.println("Dog Details : ");
		obj1.printDerivedCollection(dogList);
	}
}



