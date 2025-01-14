import java.io.*;
import java.net.*;

class ServeOneClient extends Thread 
	{
	
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	public ServeOneClient(Socket s) throws IOException 
		{
		socket = s;
		in = new BufferedReader( new InputStreamReader( socket.getInputStream()));
	    out = new PrintWriter( new BufferedWriter( new OutputStreamWriter( socket.getOutputStream())), true);
		start(); 
	   }

	public void run() 
		{
	    try {
			while (true) 
				{  
				String str = in.readLine();
				if (str.equals("END")) 
					break;
		        System.out.println("Echoing got from client: " + str);
				out.println(str);  // to the client
			     }
			System.out.println("closing...");
		      } //end of try
		catch(IOException e)
			{
			  System.err.println(" O God!! in server IO Exception");
	        } 
		finally {
							try {
								socket.close();
								  }
							catch(IOException e)
							   {
								System.err.println("Socket not closed");
								}
        		    } 
	  }  //end of run 
}

public class MultiClientServer 
	{
	
	public static final int PORT = 8080;
	
	public static void main(String[] args) throws IOException 
		{
		ServerSocket s = new ServerSocket(PORT);
		System.out.println("Server Started");
				
	    try {
			while(true) 
				{
		        Socket socket = s.accept();
			
        //System.out.println(socket);
					try {
						   new ServeOneClient(socket);
						 } 
					catch(IOException e)
						{
						  socket.close();
						}
				}
		}  //end of try 
		finally {
			       s.close();
		          }
	}  //end of main 
}