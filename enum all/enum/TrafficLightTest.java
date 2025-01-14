enum TrafficLight 
	{
   RED(100), AMBER(200), GREEN(300),REEN(300);
 
  TrafficLight(int i)
	{
		  System.out.println("lalu"+i);
	}
}
 
public class TrafficLightTest {
   public static void main(String[] args) 
	   {
    TrafficLight tl=TrafficLight.AMBER;
   System.out.println(tl);

      
   }
}