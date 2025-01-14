 
import java.util.StringTokenizer;
import java.util.*;
 
public class Demo0 
	{
 
  public static void main(String[] args) {
    
//    //create StringTokenizer object
    StringTokenizer st = new StringTokenizer("God -is great-and merfciful"  ,"-");
//        StringTokenizer st = new StringTokenizer("God is, great", ",");

    //iterate through tokens
	while(st.hasMoreTokens()) 
	{ 
			String key = st.nextToken(); 
          System.out.println(key);
  }

}
	}
 