public class Diff 
	{
  public static void main(String [] args) {
    String s1 = new String("Hello World");
    String s2 = new String("Hello World");
    System.out.println("s1.equals(s2):" + s1.equals(s2));
    StringBuffer sb1 = new StringBuffer("Hello World");
    StringBuffer sb2 = new StringBuffer("Hello World");
    System.out.println("sb1.equals(sb2):" + sb1.equals(sb2));
    StringBuilder sd1 = new StringBuilder("Hello World");
    StringBuilder sd2 = new StringBuilder("Hello World");
    System.out.println("sd1.equals(sd2):" + sd1.equals(sd2));
  }
}
