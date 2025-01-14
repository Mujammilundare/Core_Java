import java.util.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test0
	{

	public static void main(String[] args) 
		{

//Map hm=Collections.synchronizedMap(new HashMap());

//Map hm=new Hashtable(new HashMap());

ConcurrentHashMap hm=new ConcurrentHashMap();

hm.put(1, "Blue");
hm.put(2, "Green");
hm.put(3, "Yellow");

Iterator entries = hm.entrySet().iterator();

hm.put(4, "Red");
hm.put(5, "Orange");

while (entries.hasNext()) 
	{
			Map.Entry entry = (Map.Entry) entries.next();
			Integer key = (Integer)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println("Key = " + key + ", Value = " + value);
			
	}
	
	}
}
