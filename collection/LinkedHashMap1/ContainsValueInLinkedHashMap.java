import java.util.*;

public class ContainsValueInLinkedHashMap
	{
public static void main(String args[]) 
	{
LinkedHashMap Lhm = new LinkedHashMap();
Lhm.put(1, "Gyan");
Lhm.put(6, "Ankit");
Lhm.put(5, "Arun");
Lhm.put(4, "Anand");
Lhm.put(3, "Ram");
boolean bool = Lhm.containsValue("Arun");
System.out.println("The Entries of LinkedHashMap are : " + Lhm);
System.out.println("Is Value Arun is exists in map : " + bool);
}
}
