import java.util.*;
public class QueueMethodsExample
	{
public static void main(String[] args) 
	{
Queue q=new PriorityQueue();

q.add("1");
q.add("2");
q.add("3");

q.add("4");
q.add("5");

System.out.println("Initial Size of Queue :"+q.size());

Iterator itr=q.iterator();
while(itr.hasNext())
{
String s=(String)itr.next();
System.out.println("Queue Next Value :"+s);
}

// get value and does not remove element from queue
System.out.println("Queue peek :"+q.peek());
System.out.println("Final Size of Queue :"+q.size());

// get first value and remove that object from queue
System.out.println("Queue poll :"+q.poll());

System.out.println("Final Size of Queue :"+q.size());
}
}
