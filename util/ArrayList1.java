import java.util.*;

class ArrayList1
	{
 public static void main(String args[])
	 {
List al=new ArrayList();
  al.add("atom");
  al.add("bjerry");
  al.add("dlalu");
  al.add("champu");

Comparator comp = Collections.reverseOrder();
  Collections.sort(al, comp);


  Iterator itr=al.iterator();
  while(itr.hasNext())
	  {
		System.out.println(itr.next());
	  }
 }
}
