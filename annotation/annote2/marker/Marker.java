
import java.lang.annotation.*; 
import java.lang.reflect.*; 
 

@Retention(RetentionPolicy.RUNTIME)  
@interface MyMarker { } 
 
public class Marker { 
 
  // Annotate a method using a marker. 
  // Notice that no ( ) is needed. 
  @MyMarker 
  public static void myMeth() 
	  { 
    Marker ob = new Marker(); 
 
    try { 
      Method m = ob.getClass().getMethod("myMeth"); 
 
      // Determine if the annotation is present. 
      if(m.isAnnotationPresent(MyMarker.class)) 
        System.out.println("MyMarker is present.");  
 
    } catch (NoSuchMethodException exc) { 
       System.out.println("Method Not Found."); 
    } 
  } 
 
  public static void main(String args[]) 
	  { 
			 myMeth(); 
       } 
}


