public class DemoPassByReference
 {
 public static void main(String[] args)
 {
 // Part I - primitive data types
 int i = 25;
 System.out.println(i); // print it (1)
 iMethod(i);
 System.out.println(i); // print it (3)
 System.out.println("-----------------");

 // Part II - objects and object references
 StringBuffer sb = new StringBuffer("Hello, world");
 System.out.println(sb); // print it (4)
 sbMethod(sb);
 System.out.println(sb); // print it (6)
 System.out.println("-----------------");

 // Part III - strings
 String s = "Java is fun!";
 System.out.println(s); // print it (7)
 sMethod(s);
 System.out.println(s); // print it (9)
 }

 public static void iMethod(int i)
 {
 i = 9; // change it
 System.out.println(i); // print it (2)
 }

public static void sbMethod(StringBuffer sbTest)
 {
  sbTest = sbTest.insert(7, "junck "); // change it
  System.out.println(sbTest); // print it (5)
 }

 public static void sMethod(String sTest)
 {
 sTest = sTest.substring(8, 11); // change it
 System.out.println(sTest); // print it (8)
 }
}