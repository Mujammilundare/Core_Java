import java.util.*;
 
class GarbageCollection
{
 public void finalize () throws Throwable 
	  {
        super.finalize();
       System.out.println("finalize");
    } 

   public static void main(String s[]) throws Exception
   {
      Runtime r =  Runtime.getRuntime();
 //      r.gc();


 System.out.println("Free memory in jvm (Java Virtual Machine) before Garbage Collection = "+r.freeMemory());
//      r.gc();
System.gc();
System.out.println("Free memory in jvm (Java Virtual Machine) after Garbage Collection = "+r.freeMemory());
   }
}