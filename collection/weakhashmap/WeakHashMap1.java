import java.util.*;

public class WeakHashMap1
	{
public static void main(String args[]) {

WeakHashMap map = new WeakHashMap();
map.put(1, "A");
map.put(2, "B");
map.put(3, "C");
map.put(4, "D");
System.out.println("map elements are = " + map);
map.remove(3);
System.out.println("map = " + map);
}
}
