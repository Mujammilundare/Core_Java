import java.util.*;

public class AddFirstAndAddLastElementDeque {

public static void main(String args[]) {

Deque queue = new ArrayDeque();

queue.add("A");
queue.add("B");
queue.add("C");
queue.add("D");
System.out.println("The Deque elements before addition are : " + queue);
queue.addFirst("1");
queue.addLast("5");
System.out.println("The Deque elements after addition are : " + queue);
}
}
