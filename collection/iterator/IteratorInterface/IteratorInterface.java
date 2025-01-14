import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface 
	{
public static void main(String args[]) {
ArrayList alist = new ArrayList();
alist.add("RAJA");
alist.add("SURAJ");
alist.add("RAJAK");
// Implementation of Iterator
Iterator<String> itr = alist.iterator();
System.out.println("List has elements = "+itr.hasNext() );
System.out.println("Elements of list = ");
while(itr.hasNext())
{
System.out.println(itr.next());
}
itr.remove();
System.out.println("After removing element new list = "+alist); 
}
}
