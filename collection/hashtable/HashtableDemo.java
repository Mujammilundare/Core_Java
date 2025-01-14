import java.util.*;

public class HashtableDemo 
	{
public static void main(String args[]) 
	{
HashMap ht = new HashMap();
ht.put(1, "Singh");
ht.put(3, "Kumar");
ht.put(4, "Kumar");
ht.put(2, "Nagar");
ht.put(6, "Prakash");
ht.put(4, "l");
ht.put(null, "l");


System.out.println("The elements of Hashtable is : " + ht);

}
}