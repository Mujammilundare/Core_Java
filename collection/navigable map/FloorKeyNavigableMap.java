import java.util.*;

public class FloorKeyNavigableMap {
public static void main(String[] args) {
NavigableMap<Integer, String> Nmap = new TreeMap<Integer, String>();
Nmap.put(2, "two");
Nmap.put(1, "one");
Nmap.put(3, "three");
Nmap.put(6, "six");
Nmap.put(5, "five");
System.out.println("The floor key of 4 is : " + Nmap.floorKey(4));
System.out.println("The floor key of 6 is : " + Nmap.floorKey(6));

}
}
