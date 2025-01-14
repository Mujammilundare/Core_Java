enum TLight 
	{
   RED(30) 
	   {
          public TLight next() { return GREEN; }   // each instance provides its implementation to abstract method
        },
   AMBER(10) 
			{
				public TLight next() { return RED; }
           },
   GREEN(30) 
			{
				public TLight next() { return AMBER; }
			};
   public abstract TLight next();   // an abstract method
   
   private final int seconds;  // private variable

   TLight(int seconds) 
	   {       // constructor
			this.seconds = seconds;
		}
   int getSeconds() { return seconds; }  // getter
}
   
public class TLightTest 
	{
   public static void main(String[] args) 
	   {
      for (TLight light : TLight.values()) 
		  {
         System.out.printf("%s: %d seconds, next is %s\n", light, light.getSeconds(), light.next());
		}
   }
}