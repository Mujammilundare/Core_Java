import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableCeilingMethod
	{
public static void main(String[] args) 
	{
Integer[] arr = { 3, 3, 5, 2,6,4 };

NavigableSet ns = new TreeSet();

System.out.println("Display least elemenmt(greater than or equal) :");
for (Integer i : arr)
ns.add(i);
//System.out.println(ns.ceiling(1));
System.out.println(ns);
}
} 
