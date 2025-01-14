/*
*
The  program will compile just fine in pre-Java 5 compiler.
What about the Java 6 compiler ?

Note: Suppress.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

Java 6 has a much stronger type checking and as a result generates the above warning



*/
import java.util.*;
//@SuppressWarnings("unchecked")
public class Suppress 
	{
public static void main(String[] args) 
	{
Map <String,String> map  = new HashMap<String,String>();
for (String s : args) 
	{
       map.put(s, s);
     }
}
}