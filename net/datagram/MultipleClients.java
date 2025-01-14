import java.net.*;
import java.io.*;

class MultiClientThread extends Thread 
	{
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	private static int counter = 0;
	private int id = counter++;  // id is now 1
	private static int threadcount = 0;  // now is 0

	public static int threadCount()
		{ 
			return threadcount; 
		}

	public MultiClientThread(InetAddress addr) 
		{
		System.out.println("Making client " + id);
		//threadcount++; //1 every time increase by one
		//		System.out.println("threadcount++" + threadcount++);

				try {
						socket = new Socket(addr, MultiClientServer.PORT);
					  }
				catch(IOException e) 
					{
						System.err.println("Arr..!! Socket failed");
					}
		try {    
				in = new BufferedReader( new InputStreamReader( socket.getInputStream()));
			    out = new PrintWriter( new BufferedWriter( new OutputStreamWriter( socket.getOutputStream())), true);
				start();
			}
		catch(IOException e) 
			{
					try 
						{
							socket.close();
						} 
					catch(IOException e2) 
						{
							System.err.println("Opps!!..Socket not closed");
						}
	    	}
	}

	public void run() 
		{
				try {
					for(int i = 0; i < 10; i++) 
						{
						out.println("Client " + id + ": " + i);  //send to server
						String str = in.readLine();   //read from server
						System.out.println("     "+str);  // display it 
						}
				out.println("END");
		}
		catch(IOException e) 
			{
				System.err.println("O God!! IO Exception");
			}
finally {
					try {
						socket.close();
						}
					catch(IOException e) 
						{
						System.err.println("Socket not closed");
						}
		  //  threadcount--; // Ending this thread
		//	System.out.println("threadcount--" + threadcount--);
		}
	}  // end of run
}

public class MultipleClients
	{
	static final int MAX_THREADS = 4;

	public static void main(String[] args) throws IOException, InterruptedException 
		{
	    InetAddress addr = InetAddress.getByName(null);
			while(true)
				{ // System.out.println("The god"+MultiClientThread.threadCount());  0<4
					if(MultiClientThread.threadCount() < MAX_THREADS)
					new MultiClientThread(addr);
					Thread.currentThread().sleep(1000);
				}
 		}
    }