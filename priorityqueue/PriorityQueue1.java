import java.util.*;

public class PriorityQueue1
	{

public static void main(String[] args)
	{
PriorityQueue  sq = new PriorityQueue();
		
sq.add("ab");
sq.add("abcd");
sq.add("abc");
sq.add("a");
sq.add(null);
	
//don't use iterator which may or may not 
//show the PriorityQueue's order so that u can see the order
while(sq.size() > 0)
       System.out.println(sq.remove());
				


}

//
//Priority queue elements have an additional element, priority, that changes the
	//principle of FIFO to First in, with the highest priority, first o

}
	
 
