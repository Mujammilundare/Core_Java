class  MainInn
{
	public static void main(String[] args) 
	{

Thread thread = new Thread(new Runnable() 
	{
@Override zpublic void run() 
	{
 System.out.println("child running");
    }
});

((Runnable) thread).run(); // THI00-EX0: Does not start a new thr

	}
}
