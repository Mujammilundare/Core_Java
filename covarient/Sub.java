//In other words, changing the return type while maintaining the rest of the method signature
//It's the return type that is covariant, not the method itself
class A 
	{
    }

class B// extends A 
	{
    }

class Super 
	{
  public A getObject() 
	  {
         System.out.println("Super::getObject");
         return new A();
      }
    }

class Sub extends Super 
	{
  public B getObject() 
	  {
       System.out.println("Sub::getObject");
        return new B();
      }

  public static void main(String[] args) 
	  {
       Super s = new Sub();
       s.getObject();
     }
   }
