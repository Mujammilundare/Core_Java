import java.lang.annotation.*;
import java.lang.reflect.*;

// Specifying runtime retention policy
@Retention(RetentionPolicy.RUNTIME)

@interface MyAnnotation
{
    String author();    // Annotation member
    String date();      // Annotation member
}

                                                        
// Applying annotation to the class
@MyAnnotation(author="Rajiv",date="22/10/2012,23/10/2011")
public class Test
{
    // Applying annotation to the method
    @MyAnnotation(author="Rajiv",date="22/1/2011")
    public static void test()
    {
        System.out.println("in test");
    }
    public static void main(String args[])
    {
        test();
        show();
    }

public static void show()// Function to show annotation information
{
    Test test=new Test(); // Instantiating Test class
    try
    {
        Class c=test.getClass(); // Getting Class reference
        Method m=c.getMethod("test"); // Getting Method reference
        // Getting Class annotation
        MyAnnotation a1=(MyAnnotation)c.getAnnotation(MyAnnotation.class);
        // Getting Method annotation
     	MyAnnotation a2=m.getAnnotation(MyAnnotation.class);
		// Displaying annotation information
        System.out.println("Author of the class: "+a1.author());
        System.out.println("Date of Writing the class: "+a1.date());
        System.out.println("Author of the method: "+a2.author());
        System.out.println("Date of Writing the method: "+a2.date());
    }
    catch(NoSuchMethodException ex)
    {
        System.out.println("Invalid Method..."+ex.getMessage());
    }
}
}