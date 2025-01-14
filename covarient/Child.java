//In other words, changing the return type while maintaining the rest of the method signature
//It's the return type that is covariant, not the method itself

/*
What is co varient return type?
In Overriding the return type should be same but thier is a special case in which
Overriding methods can have different return types provided their return type have parent child realationship
*/


class Parent 
	{
  public Parent meth() 
	  {
         System.out.println("Parent::meth");
		Parent ob = new Parent();
		 return ob;
      }
    }

class Child extends Parent 
	{

  public Child meth() 
	  {

       System.out.println("Child::meth");
	   Child c= new Child();
        return c;
      }

  public static void main(String[] args) 
	  {
       Child c = new Child();
      c.meth();
     }
   }
