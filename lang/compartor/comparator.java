When to use Comparator and Comparable Interface in java 
Difference between Comparator and Comparable in Java
1) Comparator in Java is defined in java.util package while Comparable interface in Java is defined in java.lang package.
2) Comparator interface in Java has method public int compare (Object o1, Object o2) which returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second. While Comparable interface has method public int compareTo(Object o) which returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
3) If you see then logical difference between these two is Comparator in Java compare two objects provided to him, while Comparable interface compares "this" reference with the object specified.
4) Comparable in Java is used to implement natural ordering of object. In Java API String, Date and wrapper classes implement Comparable interface.
5) If any class implement Comparable interface in Java then collection of that object either List or Array can be sorted automatically by using Collections.sort() or Array.sort() method and object will be sorted based on there natural order defined by CompareTo method.
6)Objects which implement Comparable in Java can be used as keys in a sorted map or elements in a sorted set for example TreeSet, without specifying any Comparator.

Also Please find below the examples for using the Comparator and Comparable Interface

1) There is class called Person, sort the Person based on person_id.
2) Sort the Person based on Name.

For a Person class sorting based on person_id can be treated as natural order sorting and sorting based on Name can be implemented using Comparator interface. To sort based on person_id we need to implement compareTo() method.


public class Person implements Comparable {
private int person_id;
private String name;

/**
* Compare current person with specified person
* return zero if person_id for both person is same 
* return negative if current person_id is less than specified one
* return positive if specified person_id is greater than specified one
*/
public int compareTo(Person o) {
return this.person_id - o.person_id ;
}
….
}

And for sorting based on person name we can implement compare (Object o1, Object o2) method of Comparator in Java or Java Comparator class.

public class PersonSortByPerson_ID implements Comparator{

public int compare(Person o1, Person o2) {
return o1.getPersonId() - o2.getPersonId();
}
