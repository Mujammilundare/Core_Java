 class Parent
	{
  private static String age = "50";
  private String hairColor = "grey";
  public void writeName() 
	  {
       System.out.println("Parent");
      }
}

public class Child extends Parent
	{
 private static String age = "20";
  private String hairColor = "brown";

  public void writeName() 
	  {  
	  System.out.println("Child");  
	  }

  public void writeName(String order) 
	  {
         System.out.println(order + " Child");
      }

  public static void main(String [] args) {
    Parent p = new Child();
    System.out.println("age: " + p.age);
    System.out.println("hairColor: " + p.hairColor);
    Child c = new Child();
    c.writeName("first");
 }
}



