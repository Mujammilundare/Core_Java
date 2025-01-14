
class Multi extends Thread
	{
 public void run()
	 {
  for(int i=1;i<5;i++)
	  {
		try{
			  Thread.sleep(500);
			  }
			catch(InterruptedException e)
				{
			    	System.out.println(e);
			   }
       System.out.println(i);
	          System.out.println(Thread.currentThread());
     }//end of for
 }

 public static void main(String args[])
	 {
  Multi t1=new Multi();  //here ti and t2 will be treated as normal object
  Multi t2=new Multi();
  t1.start();
  t2.start();
 }
}