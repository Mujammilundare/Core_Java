The source code for java.lang.Override is as follows:

 package java.lang;
import java.lang.annotation.*;
   
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Override {
}
 
