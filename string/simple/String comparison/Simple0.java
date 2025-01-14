/*
There are two ways to create String object: 
By string literal 
By new keyword 

*/

class Simple0
	{
 public static void main(String args[])
	 {
 
String s1="Welcome";
//String s2="Welcome";//no new object will be created

String s2=new String("Welcome");//creates two objects and one reference variable

System.out.println(s1==s2);
System.out.println(s1.equals(s2));



 }
}

