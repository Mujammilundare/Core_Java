import java.lang.annotation.*; 
import java.lang.reflect.*; 
 
@Target(ElementType.METHOD)

@interface Test
{
	public String print();
}

public class TestAnnotations 
	{
@Test(print="Hello World !")

public void print() 
	{
		System.out.printf("testing target annotation....");
	}

public static void main(String arg[]) 
	{
			new TestAnnotations().print();
    }

}

