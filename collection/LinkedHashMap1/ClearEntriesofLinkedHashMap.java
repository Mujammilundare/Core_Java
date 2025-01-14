import java.util.*;

public class ClearEntriesofLinkedHashMap {
public static void main(String args[]) {
LinkedHashMap Lhm = new LinkedHashMap();
Lhm.put(1, "Gyan");
Lhm.put(6, "Ankit");
Lhm.put(5, "Arun");
Lhm.put(4, "Anand");
Lhm.put(3, "Ram");
System.out.println("The Size of LinkedHashMap are : " + Lhm.size());
Lhm.clear();
System.out.println("The size of map after removal : " + Lhm.size());
System.out.println("The LinkedHashMap entries is as follows : " + Lhm);
}
}