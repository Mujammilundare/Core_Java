
/** Preferred style for singletons. */

public enum SantaClaus
	{
  INSTANCE;
  
  /**Add some behavior to the object. */
  public void distributePresents()
	  {
System.out.println("cakes..");
     }
  
 public static void main(String... aArgs)
	  {
    SantaClaus fatGuy = SantaClaus.INSTANCE;
    fatGuy.distributePresents();
   
   
   //doesn't compile :SantaClaus: error: enum types may not be instantiated
    //SantaClaus fatGuy = new SantaClaus();
  }
} 

//It has no special needs for serialization, and is immune to clever attacks. 

