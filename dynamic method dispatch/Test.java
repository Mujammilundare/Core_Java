class Animal
	{
        void eat()
			{
	       	System.out.println("animal is eating...");
			}
    }

class Dog extends Animal
	{
 void eat()
	 {
	    System.out.println("dog eats biscuits...");
	 }
   }

class Cat extends Animal
	{
 void eat()
	 {
	    System.out.println("cat drinks milk...");
	 }
   }


class Test
		{
 public static void main(String args[])
	 {
	 //super class handle can point to child
          Animal a = new Animal();
		  a.eat();

		  a=new Dog();
		  a.eat();
	
		  a=new Cat();
		  a.eat();

	}
}
