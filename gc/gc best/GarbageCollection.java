/**
* GarbageCollection.java
* Copyright (c) 2003 by Dr. Herong Yang
*/
class GarbageCollection 
	{
   public static void main(String[] a) 
	   {
      int steps = 10000;
      int size = 32;
      Object[] queue = new Object[size];
      Runtime rt = Runtime.getRuntime();
      System.out.println("Memory: Maximum   Total   Free   Used");

      for (int m=0; m<steps; m++) 
		  {
         for (int n=0; n<size-1; n++) 
            queue[size-n-1] = queue[size-n-2];
		     queue[0] = getOneMega();

         System.out.println(m+"   "+rt.maxMemory()
            +"   "+rt.totalMemory()+"   "+rt.freeMemory()
            +"   "+(rt.totalMemory()-rt.freeMemory()));
         try {
            Thread.sleep(1000/10);
         } catch (InterruptedException e) {
            System.out.println("Interreupted...");
         }
      }
   }

   private static Object getOneMega() 
	   {
              return new long[1024*128]; // 1MB
       }
}
