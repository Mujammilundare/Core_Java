class AClass 
	{ 
static 
	{ 
            System.out.println("static block in AClass");
      }
}

public class Program1 
	{ 
public static void main(String[] args) 
	{
try
	{ 
//A call to Class.forName("X") causes the class named X to 
//be dynamically loaded (at runtime). 

//A call to forName("X") causes the class named X to 
//be initialized (i.e., JVM executes all its static block after class loading). 

/*
	Class.forName("X") returns the Class object associated with the "X" class. The returned Class object is not an instance of the "x" class itself.

	*/
Class c = Class.forName("AClass"); 

   } catch (ClassNotFoundException e) 
	{ 
   System.out.println(e);
   }

    } //end of method
}
