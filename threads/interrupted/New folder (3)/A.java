class A extends Thread
	{  
public void run()
	{  
	try{  
		System.out.println("going to sleep..zzzz");  
		Thread.sleep(1000);  
		System.out.println("task");  
		}catch(InterruptedException e)	{  	throw new RuntimeException("Thread interrupted..."+e);  }  
  }  
  
public static void main(String args[])
	{  
A t1=new A();  
t1.start();  
try{  
	t1.interrupt();  
		}catch(Exception e){System.out.println("Exception handled "+e);}  
  			}  
}  