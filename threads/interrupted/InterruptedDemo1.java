
class InterruptedDemo1 extends Thread{

public void run()
	{
System.out.println(Thread.currentThread().getName()+"   entring");

for(int i=1;i<=2;i++)
	{
	if(Thread.interrupted())
		{
		System.out.println("code for interrupted thread"+Thread.currentThread().getName());
		}
        else{
		System.out.println("code for normal thread"+Thread.currentThread().getName());
    }

System.out.println(Thread.currentThread().getName()+"  exiting");
}//end of for loop
}

public static void main(String args[]){

InterruptedDemo1 tom=new InterruptedDemo1();
InterruptedDemo1 jerry=new InterruptedDemo1();

tom.setName("tom");
jerry.setName("jerry");

tom.start();
tom.interrupt();

jerry.start();

}
}

