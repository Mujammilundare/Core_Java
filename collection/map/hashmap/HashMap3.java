import java.util.*; 
class HashMap3{ 
public static void main(String args[]) 
	{ 

HashMap ht = new HashMap(); 

ht.put("oshita", new Double(3434.34)); 
ht.put("sita", new Double(123.22)); 
ht.put("geeta", new Double(1378.00)); 


Set set = ht.entrySet(); 
Iterator i = set.iterator(); 
while(i.hasNext()) 
	{ 
HashMap me = (HashMap)i.next(); 
//	System.out.print(me.getKey() + ": "); 
	//System.out.println(me.getValue()); 
  } 
System.out.println(); 
// Deposit 1000 into John Doe's account 
//double balance = ((Double)ht.get("John Doe")).doubleValue(); 
//ht.put("John Doe", new Double(balance + 1000)); 
//System.out.println("John Doe's new balance: " + ht.get("John Doe")); 
} 
}