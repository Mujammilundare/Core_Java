 class Customer 
	{
int amount=0;
int flag=0;

public synchronized int withdraw(int amount)
	{
	System.out.println(Thread.currentThread().getName()+" is going to withdraw");
	
       if(flag==0)
		   {
        try{
		System.out.println("waiting....");
		wait();

	      }catch(Exception e)
			  {}
	}
	
	this.amount-=amount;
	System.out.println("withdraw completed");
	return amount;
}

public synchronized void deposit(int amount)
	{
	System.out.println(Thread.currentThread().getName()+" is going to  deposit");
	this.amount+=amount;
	
	notifyAll();
	System.out.println("deposit completed");
        flag=1;
	}


}

public class SynMethod 
	{
public static void main(String[] args) 
	{
	final Customer c=new Customer();
	Thread t2=new Thread()
		{
		public void run()
			{
			c.deposit(9000);
			System.out.println("After deposit amount is "+c.amount);
		}
	};



	Thread t1=new Thread()
		{
		public void run()
			{
			c.withdraw(5000);
			System.out.println("After withdraw amount is"+c.amount);
		   }
	};
	
		t1.start();

	t2.start();

	

	
}
}
