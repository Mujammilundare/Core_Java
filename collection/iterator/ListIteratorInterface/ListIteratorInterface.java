import java.util.List;

import java.util.LinkedList;

import java.util.ListIterator;

public class ListIteratorInterface {

public static void main(String args[]) {

List llist = new LinkedList();
llist.add("C");
llist.add("C++");
llist.add("Java");
llist.add("DBMS");
llist.add("RDBMS");

// Implementation of ListIterator

ListIterator litr = llist.listIterator();

System.out.println("List has the elements in forward : "+ litr.hasNext());
while (litr.hasNext()) {
System.out.println(litr.next());
}

System.out.println("\nList has the elements in backward : "+ litr.hasPrevious());

while (litr.hasPrevious()) {
System.out.println(litr.previous());
}

}

}

