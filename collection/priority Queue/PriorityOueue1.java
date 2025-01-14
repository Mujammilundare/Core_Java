import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityOueue1 
	{
public static void main(String[] args) 
	{
PriorityQueue pq = new PriorityQueue();
pq.add("B");
pq.add("A");
pq.add(null); //error
pq.add("D");
pq.add("E");

Iterator iterator = pq.iterator();
System.out.println("Element of priority Queue.");
while (iterator.hasNext()) 
	{
System.out.println(iterator.next());
}
}
}
