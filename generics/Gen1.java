import java.util.ArrayList;
import java.util.List;

public class Gen1 
	{
  public static void main(String[] args) 
	  {
    List  list= new ArrayList();
    list.add("Java 5");
    list.add("with generics");

    String s1 = (String) list.get(0);
    System.out.println(s1.toUpperCase());
/*
Note: Gen1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
in jdk1.6 on wards

 to remove warning use

    List<Object>  list= new ArrayList<Object>();

	*/

  }
}