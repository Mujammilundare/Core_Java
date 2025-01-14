import java.util.*; 

//java.util.Hashtable extends Dictionary and implements Map
//Hashtable does not directly support iterators	
class HTDemo 
	{ 
public static void main(String args[])
	{ 

Hashtable ht = new Hashtable(); 

ht.put("Tom", new Double(3434.34)); 
ht.put("jerry", new Double(123.22)); 
ht.put("micky ", new Double(1378.00)); 

// Show all hts in hash table. 
Enumeration names = ht.keys(); 

while(names.hasMoreElements()) 
	{ 
       String str = (String) names.nextElement(); 
     System.out.println(str + ": " +ht.get(str)); 
     } 
System.out.println(); 
// Deposit 1,000 into John Doe's account 
double  bal = ((Double)ht.get("jerry")).doubleValue(); 
ht.put("jerry", new Double(bal+1000)); 
System.out.println("jerry's new ht: " +ht.get("jerry")); 
} 
}
