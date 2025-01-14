//Before Java5, it was not possible to override any method by changing
//the return type
//if subclass overrides any method whose return type is 
//Non-Primitive but it changes its return type to subclass type

class A
	{
      A get()
	 	{
			 A a=new A();
		    return a;  //return type different
		}
  }

class B extends A
	{
     B get()
		 {
		     B b=new B();
		    return b;  //retu  //return type different
		 }

void message()
	{
	   System.out.println("welcome to covariant return type");
	}

public static void main(String args[])
	{
 //         new B().get().message();
B b=new B();
b.get();

}
}

