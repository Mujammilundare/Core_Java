import java.lang.reflect.*;
 
   public class Method1 
	   {
      public static void main(String args[]) throws ClassNotFoundException
      {
            Class c = Class.forName(args[0]);

 

			Method ctr[] = c.getDeclaredMethods();
           for (int i = 0; i < ctr. length; i++)
   		   System.out.println(ctr[i].toString());



        }
   }
