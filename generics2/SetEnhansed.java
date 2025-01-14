import java.util.*;

class  SetEnhansed
{

	public static void main(String[] args) 
	{

Set<String> set = new HashSet<String>();

set.add("cow");
set.add("dog");
System.out.println(set);



Iterator<String> i = set.iterator();  //diamiond needed

while(i.hasNext())
	{
       System.out.println( i.next());
     }


for(String str : set) 
	{
    System.out.println(str);
    }


	}
}
