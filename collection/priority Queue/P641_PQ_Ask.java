import java.util.*;


public class P641_PQ_Ask 
	{   
    public static void main(String[] args) 
		{   
 PriorityQueue<String> pq = new PriorityQueue<String>();   
    //pq.add("2");   
   // pq.add("4");   
    //System.out.println("pq.peek()  " + pq.peek());  //Why output is 2 ?   
  
   // PriorityQueue<String> pq1 = new PriorityQueue<String>();   
    
    //System.out.println(pq);
	//System.out.println("pq.peek()  " + pq.peek());//Why output is 12 ?   
       
    // Q. Difference between offer() and add() ??   Also, What is the difference between offer() and add() ??.
	//I see both of them are adding to the Priority Queue
   
	pq.add("3"); 
	pq.add("12");   
    pq.add("4"); 
	pq.offer("80");
	pq.add("7"); 
	pq.add("6"); 

       System.out.println("pq.peek()  " + pq.peek());     
    System.out.println(pq);   
    }   
}      

/*

System.out.println("pq.peek()  " + pq.peek());     
//Why output is 2 - 2 comes before 4 in ASCII   
System.out.println("pq.peek()  " + pq1.peek());   
//Why output is 12- 12 has 2 characters 1 and 2.
When comparing- 12 and 2 it compares the first character   


*/
