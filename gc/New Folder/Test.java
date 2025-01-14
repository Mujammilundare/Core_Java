class Test
{
public static void main(String arg[])
{
String s = new String("raju");
//Test s = new Test();
s = null;
System.gc();
System.out.println("end of main method");


}
public void finalize()
{
System.out.println("finalize method called");
}
}
