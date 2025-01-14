import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo>
	{

String name;
ComparableDemo(String n)
	{
          this.name=n;
       }

public String getName()
	{
       return name;
    }

public int compareTo(ComparableDemo e) 
	{
             return (this.name).compareTo(e.name);
    }

public static void main(String[] args) 
	{

List<ComparableDemo> l = new ArrayList<ComparableDemo>();
System.out.println("Elements of list in a sorted order are =");
l.add(new ComparableDemo("Anger"));
l.add(new ComparableDemo("Tom"));
l.add(new ComparableDemo("Titanic"));
l.add(new ComparableDemo("Dummy"));
l.add(new ComparableDemo("Bipul"));
l.add(new ComparableDemo("Vinay"));
l.add(new ComparableDemo("Rajesh"));
l.add(new ComparableDemo("Ankit"));

Collections.sort(l);

for(ComparableDemo cd : l)
    System.out.println(cd.getName());
  } 
}
