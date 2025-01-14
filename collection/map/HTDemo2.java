import java.util.*; 

//java.util.Hashtable extends Dictionary and implements Map
//Hashtable does not directly support iterators	
//you can obtain a set-view of the keys and iterate through them. 
class HTDemo2 
	{ 
public static void main(String args[])
	{ 

Hashtable ht = new Hashtable(); 

ht.put("Tom", new Double(3434.34)); 
ht.put("jerry", new Double(123.22)); 
ht.put("micky ", new Double(1378.00)); 
// show all hts in hashtable 
Set set = ht.keySet(); // get set-view of keys 
// get iterator 
Iterator i = set.iterator(); 
while(i.hasNext()) { 
String str = (String) i.next(); 
System.out.println(str + ": " + 
ht.get(str)); 
} 
System.out.println(); 

// Deposit 1,000 into jerry's account 

double  bal = ((Double)ht.get("jerry")).doubleValue(); 
ht.put("jerry", new Double(bal+1000)); 
System.out.println("jerry's new ht: " +ht.get("jerry")); 
} 
}
