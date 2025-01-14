/**
 * GroupingThreads.java
 * Copyright (c) 2003 by Dr. Herong Yang
 */
class GroupingThreads 
	{
   public static void main(String[] args) 
	   {
        printInfo();
    }

   public static void printInfo() 
	   {
      Thread t = Thread.currentThread();
      ThreadGroup g = t.getThreadGroup();
      g = g.getParent();
      printInfo(g,"");
      g.list();
   }

   public static void printInfo(ThreadGroup g, String p) 
	   {
      System.out.println(p+"ThreadGroup name = "+g.getName());
	  System.out.println(p+"   Has parent thread group = "+(g.getParent()!=null));
      int n = g.activeCount();

      System.out.println(p+"   # of active threads = "+n);

	  Thread[] l = new Thread[n];
      n = g.enumerate(l, false);
      for (int i=0; i<n; i++) 
		  {
             System.out.println(p+"   Thread name = "+l[i].getName());
         }  

      n = g.activeGroupCount();
      System.out.println(p+"   # of active sub thread groups = "+n);
      ThreadGroup[] s = new ThreadGroup[n];
      n = g.enumerate(s, false);
      for (int i=0; i<n; i++) 
		  {
         printInfo(s[i],"   "+p);
      }  
   }   
   
}
