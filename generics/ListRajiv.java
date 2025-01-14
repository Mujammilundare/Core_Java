import java.util.ArrayList;
import java.util.List;

public class ListRajiv
	{
  public static void main(String[] args) 
	  {
    List<Rajiv> list1 = new ArrayList<Rajiv>();
	
	list1.add(new Rajiv());
	list1.add(new Shiva());
    
	Rajiv r = list1.get(0);   // no cast
    System.out.println(r.i);
//	Shiva s = (Shiva)list1.get(0);   // no cast
  //  System.out.println(s.j);
  }
}

class Rajiv
{
	static int i=108;
}

class Shiva extends Rajiv
{
	static int j=8;
}