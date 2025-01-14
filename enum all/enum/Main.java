enum Car 
	{
   ferrari(900),
   tata(2),
   audi(50),
   fiat(15),
   honda(12);  //remember semicolon
 
 private int price;
   
   Car(int p) 
	   {
         price = p;
//		 System.out.println("ctr"+p);
      }

   int getPrice() 
	   {
      return price;
        }  
}

public class Main 
	{
   public static void main(String args[])
	   {
      System.out.println("All car prices:");
      for (Car c : Car.values())
      System.out.println(c + " costs "  + c.getPrice() + " thousand dollars.");
   }

   //Java compiler automatically generates static values() method for every enum in java.
   //Values() method returns array of enum constants in the same order.

}
