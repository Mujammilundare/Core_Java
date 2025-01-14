class Shared 
	{
synchronized   void meth(String msg) 
	   {
		   System.out.println();
	  System.out.print("[" + msg);
      try {
		     Thread.sleep(500);
			}
			catch (InterruptedException e) 
				{
                     System.out.println("Interrupted");
              }
      System.out.println("]");

   }
}

// File Name : MyThread.java
class MyThread implements Runnable {
   String msg;
 // static 
	 Shared obj ;
      Thread t;
   public MyThread(Shared obj ,String s) 
	   {
        this.obj=obj;
		msg = s;

      t = new Thread(this);
      t.start();
   }
   
   // synchronize calls to call()
   public void run()
	   {

             obj.meth(msg);

   }
}
// File Name : Synch.java
class Synch {
   public static void main(String args[])
{
        Shared ob=new Shared();
       MyThread ob1 = new MyThread(ob,"Hello");
      MyThread ob2 = new MyThread(ob,"Synchronized");
      MyThread ob3 = new MyThread(ob,"World");
   
      // wait for threads to end
      try {
         ob1.t.join();
         ob2.t.join();
         ob3.t.join();
      } catch(InterruptedException e)
		  {
            System.out.println("Interrupted");
          }
   }
}
