import java.util.*;

class  ListDemo
{
public static void main(String[] args) 
	{
List list = new ArrayList();
list.add("cow");  //try int
String s = (String) list.get(0);
System.out.println(s);

/*
		list.add(100);
Exception in thread "main" java.lang.ClassCastException: java.lang.Integer canno
t be cast to java.lang.String
        at ListDemo.main(ListDemo.java:9)
*/
List<String> list = new ArrayList<String>();  //in 7 <> e
list.add("hello");
String s = list.get(0);   // no cast
System.out.println(s);


	}
}
