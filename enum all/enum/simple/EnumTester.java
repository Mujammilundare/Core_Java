
public class EnumTester 
	{
    public static void main(String[] args) 
	{
      Person p1 = new Person ("Lalu Prasad", "Yadav");
      Person p2 = new Person ("Sonia", "Gandhi");

      p1.setGender(Gender.MALE);
      p2.setGender(Gender.FEMALE);

      System.out.println("Lalu's gender is: " +p1.getGender());
      System.out.println("Sonia's gender is: " +p2.getGender());


	  System.out.println(Gender.valueOf("MALE"));

       for (Gender g: Gender.values())
           // System.out.println(g);
	   System.out.println("Hello");


    }    
}