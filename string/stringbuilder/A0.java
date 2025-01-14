/*
The StringBuilder class is used to create mutable (modifiable) string. The StringBuilder class is same as
StringBuffer class except that it is non-synchronized. It is available since JDK1.5.
*/
class A0{
public static void main(String args[]){

StringBuilder sb=new StringBuilder("Hello ");
sb.append("Java");//now original string is changed

System.out.println(sb);//prints Hello Java
}
}


