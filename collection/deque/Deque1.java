/*The java.util.Deque interface is a subtype of the java.util.Queue interface.Deque is a linear collection that supports element insertion and removal at both ends. Thus, "Deque" is short for "Double Ended Queue" 
and is pronounced "deck", like a deck of cards
*/

import java.util.*;

public class Deque1 {
public static void main(String args[]) {
Deque queue = new ArrayDeque();

queue.add("A");
queue.add("B");
queue.add("C");
queue.add("D");

System.out.print("The Deque elements are : " + queue);
}
}

//Deque odeque = new LinkedList(); 
//Deque dequeo = new ArrayDeque();