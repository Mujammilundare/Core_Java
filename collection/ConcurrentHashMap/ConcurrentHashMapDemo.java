import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;

public class ConcurrentHashMapDemo 
	{

enum Days
	{
		Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
    }

public static void main(String args[])
	{
ConcurrentHashMap chm = new ConcurrentHashMap();
chm.put(1, "A");
chm.put(2, "B");
chm.put(3, "C");
chm.put(4, "D");
chm.put(5, "E");
System.out.println("Mappings are : "+chm);
Set s = chm.entrySet();
System.out.println("Set view of mappings = "+s);
Set s1 = chm.keySet();
System.out.println("Set view of keys = "+s1);
}
}
