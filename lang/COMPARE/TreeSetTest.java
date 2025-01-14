import java.util.*;

public class TreeSetTest 
	{

private static Set<Person> s = new TreeSet<Person>();

public static void main(String a[])
	{
		s.add(new Person(20));
		s.add(new Person(30));
		s.add(new Person(10));
		s.add(new Person(50));
		System.out.println( s);
     }
}

class Person implements Comparable<Person> 
	{
		int i;
	Person(int i)
		{
		 this.i = i;
        }

public int compareTo(Person o) 
	{
			System.out.println("this.i :: " + this.i);
			int j = o.i;
			System.out.println("j :: " + j);

if (this.i < j) 
	{
		return -1;
	}
	else if (this.i == j) 
		{
			return 0;
		} 
		else 
			{
			   return 1;
			}
}

public String toString() 
	{
		return String.valueOf("Person " + i); 
	}
}

