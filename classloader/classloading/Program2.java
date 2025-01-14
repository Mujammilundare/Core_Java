class AClass
	{
public AClass() 
	{
     System.out.println("AClass's Constructor");
     }
static
	{ 
       System.out.println("static block in AClass");
    }
}

public class Program2 
	{ 
public static void main(String[] args) 
	{
try { 
System.out.println("The first time calls forName:");
Class c = Class.forName("AClass"); 
AClass a = (AClass)c.newInstance();

System.out.println("The second time calls forName:");
Class c1 = Class.forName("AClass");

} catch (ClassNotFoundException e){}
   catch (InstantiationException e) {}
   catch (IllegalAccessException e) {}

}
}
