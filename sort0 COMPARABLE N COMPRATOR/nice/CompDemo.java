// Use a custom comparator. 
import java.util.*; 
// A reverse comparator for strings. 
class MyComp implements Comparator 
	{ 
public int compare(Object a, Object b) 
	{ 
String aStr, bStr; 
aStr = (String) a; 
bStr = (String) b; 
// reverse the comparison 
return bStr.compareTo(aStr); 
} 
// no need to override equals 
}

class CompDemo 
	{ 
public static void main(String args[]) { 
// Create a tree set 
TreeSet ts = new TreeSet(new MyComp()); 
// Add elements to the tree set 
ts.add("C"); 
ts.add("A"); 
ts.add("B"); 
ts.add("E"); 
ts.add("F"); 
ts.add("D"); 
// Get an iterator 
Iterator i = ts.iterator(); 
// Display elements 
while(i.hasNext()) { 
Object element = i.next(); 
System.out.print(element + " "); 
} 
System.out.println(); 
} 
}

/*

As the following output shows, the tree is now stored in reverse order:

F E D C B A

Look closely at the MyComp class, which implements Comparator and overrides compare( ). (As explained earlier, overriding equals( ) is neither necessary nor common.) Inside compare( ), the String method compareTo( ) compares the two strings. However, bStr-not aStr-invokes compareTo( ). This causes the outcome of the comparison to be reversed.

For a more practical example, the following program is an updated version of the TreeMap program from the previous section that stores account balances. In the previous version, the accounts were sorted by name, but the sorting began with the first name. The following program sorts the accounts by last name. To do so, it uses a comparator that compares the last name of each account. This results in the map being sorted by last name.

*/