import java.lang.reflect.*;

 public class Field1 
	 {
      private double d;
      public static final int i = 37;
      String s = "testing";
        
      public static void main(String args[]) throws Exception
      {
            Class cls = Class.forName(args[0]);
       
            Field fieldlist[] = cls.getDeclaredFields();
            for (int i  = 0; i < fieldlist.length; i++) 
				{
               Field fld = fieldlist[i];
               System.out.println("name= " + fld.getName());
               System.out.println("decl class = " + fld.getDeclaringClass());
               System.out.println("type= " + fld.getType());
               int mod = fld.getModifiers();
               System.out.println("modifiers = " + Modifier.toString(mod));
               System.out.println("-----");
            }
       }  //end of main
   }
