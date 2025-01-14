/*
a Java Developer, I am sure that you must be aware of ConcurrentModificationException that comes when you want to modify the Collection object while using iterator to go through with all its element.

Java 1.5 has introduced java.util.concurrent package with Collection classes implementations that allow you to modify your collection object at runtime.

ConcurrentHashMap is the class that is similar to HashMap but works fine when you try to modify your map at runtime.



*/



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) 
		{

		//ConcurrentHashMap
		Map<String,String> myMap = new ConcurrentHashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		myMap.put("6", "1");

		System.out.println("ConcurrentHashMap before iterator: "+myMap);
		
		Iterator<String> it = myMap.keySet().iterator();
		while(it.hasNext())
			{
			String key = it.next();
			if(key.equals("3"))
				myMap.put(key+"new", "new3");
		   }
		System.out.println("ConcurrentHashMap after iterator: "+myMap);


		
		//HashMap
		myMap = new HashMap<String,String>();
		myMap.put("1", "1");
		myMap.put("2", "1");
		myMap.put("3", "1");
		myMap.put("4", "1");
		myMap.put("5", "1");
		myMap.put("6", "1");

		System.out.println("HashMap before iterator: "+myMap);
		Iterator<String> it1 = myMap.keySet().iterator();

		while(it1.hasNext())
			{
			String key = it1.next();
			if(key.equals("3")) 
				myMap.put(key+"new", "new3");
		}
		System.out.println("HashMap after iterator: "+myMap);
	}

}
