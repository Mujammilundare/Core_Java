class InterruptedDemo extends Thread
	{

public void run()
	{
	
				if(this.isInterrupted())
				{
  					System.out.println("if1"+Thread.currentThread().getName()+""+Thread.interrupted());
					}
				else
					{
					System.out.println("else"+Thread.currentThread().getName()+""+Thread.interrupted());
				}


}

public static void main(String args[]){

InterruptedDemo tom=new InterruptedDemo();
InterruptedDemo jerry=new InterruptedDemo();

tom.setName("tom");
jerry.setName("jerry");

tom.start();
tom.interrupt();
jerry.start();

}
}
