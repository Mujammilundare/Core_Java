import java.util.*;


class  Vector1
{
	public static void main(String[] args) 
	{
 
 Set v = new TreeSet();
      v.add("one");
//      v.add("two");
       v.add("two");
      v.add("three");
//System.out.println(v.size());
//System.out.println(v);

Iterator i=v.iterator();
while (i.hasNext())
{
	System.out.println(i.next());
}


}
}