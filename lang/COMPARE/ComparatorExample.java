import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class ComparatorExample {

/**
* @param args
*/
public static void main(String[] args)
	{
List<ComparatorExample.Person> personList = new ArrayList<ComparatorExample.Person>();
ComparatorExample temp = new ComparatorExample();

personList.add(temp.new Person(1, "abc"));
personList.add(temp.new Person(5, "mno"));
personList.add(temp.new Person(3, "xyz"));

System.out.println("Person List Before sort ::: " + personList);

IntComparator comparator = new IntComparator();
Collections.sort(personList, comparator);
System.out.println("Person List after Integer sort ::: " + personList);

Collections.sort(personList, new StringComparator());
System.out.println("Pers on List after String sort ::: " + personList);
}

class Person
	{
private int index;
private String name;

Person(int index, String name) 
{
	this.index = index;	
	this.name = name;
}

public String toString() 
	{
		return " Name :: " + this.name + " Index :: " + this.index;
	}
}


static class IntComparator implements Comparator<Person> 
	{

public int compare(Person o1, Person o2) 
	{
int i = o1.index;
int j = o2.index;

if (i < j) {
return -1;
} else if (i == j) {
return 0;
} else {
return 1;
}
}

}

static class StringComparator implements Comparator<Person> {

public int compare(Person o1, Person o2) {
String name1 = o1.name;
String name2 = o2.name;

return name1.compareTo(name2);
}
}

}

/*
the objects have been sorted both based on the index and the name.


For the other question which you asked,


equals() method is for comparing "equality". compareTo is for ordering of objects within a collection.
Even if compareTo() returns 0, that does not necessarily mean they are "equal".
The concept of "equality" can be applied to all objects
(hence it's defined in the base Object class),
but not all objects can have the concept of "ordering" (where one object is "greater than" another). 
*/