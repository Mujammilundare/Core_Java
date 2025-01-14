import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsTester
	{

 @SuppressWarnings(value={"unchecked"})

 public void nonGenericsMethod() 
	  {
	    List list = new ArrayList();
		list.add("foo");
      }

	 public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

}
