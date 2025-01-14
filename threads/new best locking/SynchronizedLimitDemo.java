import java.util.concurrent.locks.*;
/* 

class DummyClass 
	{
	 
private Integer age = 0;	 

public void display()
	{	 
      System.out.println(Thread.currentThread().getName() + ": " + age);	 
	}	 

public void edit(int n)
	{	 
     	age = n;	 
	}	 
	}	 
	*/
	 

class DummyClass { 

  private Integer age = 0; 
  private Lock dataLock = new ReentrantLock(); 

   public  void display()
	   { 
   System.out.println(Thread.currentThread().getName() + ": " + age); 
    dataLock.unlock(); 
   } 

    public  void edit(int n){ 
       dataLock.lock(); 
        age = n; 

    } 

 } 





public class SynchronizedLimitDemo 
	{	 
		public static void main(String[] args) 
	{	 
 
final DummyClass dcObj = new DummyClass();	 

Thread amit = new Thread(new Runnable()
	{	 

  public void run() {	 
 try{	 
 	dcObj.edit(27);	 
	Thread.sleep(1000);	 
	dcObj.display();	 
 
	}catch(InterruptedException ixp){	 
 
	System.out.println(ixp.getMessage());	 
	}	 
 
}	 
	},"Amit Thread");	 
  
		 
  
Thread arti = new Thread(new Runnable()
	{	 
  	public void run()
		{	 
  
	try{	 
			dcObj.edit(29);	 
			Thread.sleep(1000);	 
			dcObj.display();	 
		  
  	}catch(InterruptedException ixp)
		{	 
      	System.out.println(ixp.getMessage());	 
	   }	 
  } 
	},"Arti Thread");	 
  
		 
	amit.start();	 
     arti.start();	 
}	 
  
}	 
